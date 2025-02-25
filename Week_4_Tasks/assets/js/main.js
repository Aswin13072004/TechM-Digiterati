document.addEventListener('DOMContentLoaded', () => {
    const addExerciseButton = document.getElementById('add-exercise');
    const exercisesContainer = document.getElementById('exercises-container');
    const routinesList = document.getElementById('routines-list');

    addExerciseButton.addEventListener('click', () => {
        const exerciseDiv = document.createElement('div');
        exerciseDiv.classList.add('mb-2', 'p-2', 'border', 'rounded');
        exerciseDiv.innerHTML = `
            <input type="text" class="form-control mb-2" placeholder="Exercise Name" required>
            <input type="number" class="form-control mb-2" placeholder="Duration (minutes)" required>
            <input type="number" class="form-control mb-2" placeholder="Rest Period (seconds)" required>
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
        displayRoutines(); // Refresh routines list
    });

    function saveRoutine(name, exercises) {
        const routines = JSON.parse(localStorage.getItem('routines')) || [];
        routines.push({ name, exercises });
        localStorage.setItem('routines', JSON.stringify(routines));
    }

    function displayRoutines() {
        routinesList.innerHTML = '';
        const routines = JSON.parse(localStorage.getItem('routines')) || [];
        
        routines.forEach((routine, index) => {
            const routineDiv = document.createElement('div');
            routineDiv.classList.add('col-md-6', 'mb-3');
            routineDiv.innerHTML = `
                <div class="card p-3 shadow-sm">
                    <h4 style="text-align: center;" >${routine.name}</h4>
                    <br>
                    <ul class="list-unstyled">
                        ${routine.exercises.map(exercise => `
                            <li style="text-align: center;" >${exercise.name} - ${exercise.duration} min, Rest: ${exercise.restPeriod} sec</li>
                        `).join('')}
                    </ul>
                    <br>
                   <div class="d-flex justify-content-between">
    <button class="btn btn-outline-danger btn-sm" onclick="deleteRoutine(${index})">Delete</button>
    <button class="btn btn-outline-success btn-sm" onclick="completeRoutine('${routine.name}')">Complete</button>
</div>

                </div>
            `;
            routinesList.appendChild(routineDiv);
        });
    }
    

    window.deleteRoutine = (index) => {
        let routines = JSON.parse(localStorage.getItem('routines')) || [];
        routines.splice(index, 1);
        localStorage.setItem('routines', JSON.stringify(routines));
        displayRoutines();
    };

    displayRoutines(); // Load routines on page load
});
