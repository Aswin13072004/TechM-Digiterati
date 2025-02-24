document.addEventListener('DOMContentLoaded', () => {
    const progressChart = document.getElementById('progress-chart');
    const routines = JSON.parse(localStorage.getItem('routines')) || [];

    if (routines.length > 0) {
        const chartData = routines.map(routine => ({
            name: routine.name,
            totalDuration: routine.exercises.reduce((sum, exercise) => sum + parseInt(exercise.duration), 0)
        }));

        // Example: Using Chart.js for visualization
        const ctx = document.createElement('canvas');
        progressChart.appendChild(ctx);

        new Chart(ctx, {
            type: 'bar',
            data: {
                labels: chartData.map(data => data.name),
                datasets: [{
                    label: 'Total Duration (minutes)',
                    data: chartData.map(data => data.totalDuration),
                    backgroundColor: 'rgba(75, 192, 192, 0.2)',
                    borderColor: 'rgba(75, 192, 192, 1)',
                    borderWidth: 1
                }]
            },
            options: {
                scales: {
                    y: {
                        beginAtZero: true
                    }
                }
            }
        });
    } else {
        progressChart.innerHTML = '<p>No routines found. Start creating your routines!</p>';
    }
});