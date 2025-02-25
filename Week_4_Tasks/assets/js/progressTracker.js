document.addEventListener('DOMContentLoaded', () => {
    const progressChartContainer = document.getElementById('progress-chart');
    const progressData = JSON.parse(localStorage.getItem('progress')) || [];
    const routines = JSON.parse(localStorage.getItem('routines')) || [];

    function logProgress(routineName) {
        const date = new Date().toLocaleDateString();
        const existingEntry = progressData.find(entry => entry.date === date);

        if (existingEntry) {
            existingEntry.routines.push(routineName);
        } else {
            progressData.push({ date, routines: [routineName] });
        }

        localStorage.setItem('progress', JSON.stringify(progressData));
        renderProgressChart();
    }

    function renderProgressChart() {
        progressChartContainer.innerHTML = '';

        if (routines.length === 0) {
            progressChartContainer.innerHTML = '<p class="text-center">No routines available.</p>';
            return;
        }

        const completedCount = progressData.reduce((count, entry) => count + entry.routines.length, 0);
        const notCompletedCount = routines.length - completedCount;

        const canvas = document.createElement('canvas');
        canvas.style.maxWidth = '1000px';
        canvas.style.maxHeight = '1000px';
        canvas.style.width = '100%';
        canvas.style.height = '300px';
        progressChartContainer.appendChild(canvas);
        const ctx = canvas.getContext('2d');

        new Chart(ctx, {
            type: 'doughnut',
            data: {
                labels: ['Completed', 'Not Completed'],
                datasets: [{
                    data: [completedCount, notCompletedCount > 0 ? notCompletedCount : 0],
                    backgroundColor: ['#4CAF50', '#FF5733'],
                    borderColor: ['#388E3C', '#C70039'],
                    borderWidth: 1
                }]
            },
            options: {
                responsive: true,
                maintainAspectRatio: false,
                plugins: {
                    legend: {
                        position: 'bottom'
                    }
                }
            }
        });
    }

    window.completeRoutine = (routineName) => {
        logProgress(routineName);
        alert(`Routine "${routineName}" marked as completed!`);
    };

    renderProgressChart();
});