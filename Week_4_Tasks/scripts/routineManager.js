document.addEventListener('DOMContentLoaded', () => {
    const routinesList = document.getElementById('routines-list');
    const routines = JSON.parse(localStorage.getItem('routines')) || [];

    routines.forEach(routine => {
        const routineDiv = document.createElement('div');
        routineDiv.innerHTML = `
            <h3>${routine.name}</h3>
            <ul>
                ${routine.exercises.map(exercise => `
                    <li>${exercise.name} - ${exercise.duration} mins (Rest: ${exercise.restPeriod} secs)</li>
                `).join('')}
            </ul>
        `;
        routinesList.appendChild(routineDiv);
    });
});