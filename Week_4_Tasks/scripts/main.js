document.addEventListener('DOMContentLoaded', () => {
    const addExerciseButton = document.getElementById('add-exercise');
    const exercisesContainer = document.getElementById('exercises-container');

    addExerciseButton.addEventListener('click', () => {
        const exerciseDiv = document.createElement('div');
        exerciseDiv.innerHTML = `
            <input type="text" placeholder="Exercise Name" required>
            <input type="number" placeholder="Duration (minutes)" required>
            <input type="number" placeholder="Rest Period (seconds)" required>
        `;
        exercisesContainer.appendChild(exerciseDiv);
    });

    const routineForm = document.getElementById('routine-form');
    routineForm.addEventListener('submit', (e) => {
        e.preventDefault();
        const routineName = document.getElementById('routine-name').value;
        const exercises = Array.from(exercisesContainer.children).map(exerciseDiv => {
            const inputs = exerciseDiv.querySelectorAll('input');
            return {
                name: inputs[0].value,
                duration: inputs[1].value,
                restPeriod: inputs[2].value
            };
        });

        saveRoutine(routineName, exercises);
        alert('Routine saved successfully!');
        routineForm.reset();
        exercisesContainer.innerHTML = '';
    });
});

function saveRoutine(name, exercises) {
    const routines = JSON.parse(localStorage.getItem('routines')) || [];
    routines.push({ name, exercises });
    localStorage.setItem('routines', JSON.stringify(routines));
}