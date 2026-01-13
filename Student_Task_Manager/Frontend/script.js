const API_URL = "http://localhost:8080/api/tasks";


function loadTasks() {
    fetch(API_URL)
        .then(res => res.json())
        .then(data => {
            const list = document.getElementById("taskList");
            list.innerHTML = "";

            data.forEach(task => {
                const li = document.createElement("li");

                li.innerHTML = `
                    <input value="${task.title}" id="input-${task.id}" />
                    <button onclick="updateTask(${task.id})">Update</button>
                    <button onclick="deleteTask(${task.id})">Delete</button>
                `;

                list.appendChild(li);
            });
        });
}

function addTask() {
    const title = document.getElementById("taskInput").value;

    fetch(API_URL, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({ title })
    }).then(() => {
        document.getElementById("taskInput").value = "";
        loadTasks();
    });
}

function deleteTask(id) {
    fetch(`${API_URL}/${id}`, {
        method: "DELETE"
    }).then(() => loadTasks());
}

function updateTask(id) {
    const newTitle = document.getElementById(`input-${id}`).value;

    fetch(`${API_URL}/${id}`, {
        method: "PUT",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({ title: newTitle })
    }).then(() => loadTasks());
}

loadTasks();
