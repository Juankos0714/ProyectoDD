package GestorDeTareas.Controller;

import GestorDeTareas.Model.Task;
import GestorDeTareas.Model.TaskManager;
import GestorDeTareas.View.TaskView;

public class TaskController {
    private TaskManager taskManager;
    private TaskView taskView;

    public TaskController(TaskManager taskManager, TaskView taskView) {
        this.taskManager = taskManager;
        this.taskView = taskView;
    }

    public void run() {
        boolean running = true;

        taskView.showMessage("¡Bienvenido al Gestor de Tareas!");

        while (running) {
            taskView.showMenu();
            int choice = taskView.getUserChoice();

            switch (choice) {
                case 1:
                    createTask();
                    break;
                case 2:
                    completeTask();
                    break;
                case 3:
                    listTasks();
                    break;
                case 4:
                    running = false;
                    taskView.showMessage("¡Gracias por usar el Gestor de Tareas!");
                    break;
                default:
                    taskView.showError("Opción inválida. Por favor, seleccione una opción del 1 al 4.");
                    break;
            }
        }

        taskView.closeScanner();
    }

    private void createTask() {
        try {
            Task newTask = taskView.getTaskInput();
            taskManager.addTask(newTask);
            taskView.showSuccess("Tarea creada exitosamente con ID: " + newTask.getId());
        } catch (Exception e) {
            taskView.showError("Error al crear la tarea: " + e.getMessage());
        }
    }

    private void completeTask() {
        if (taskManager.getTaskCount() == 0) {
            taskView.showError("No hay tareas para completar.");
            return;
        }

        taskView.showMessage("\n--- COMPLETAR TAREA ---");
        taskView.showTasks(taskManager.getAllTasks());

        int taskId = taskView.getTaskIdInput();

        if (taskId == -1) {
            taskView.showError("ID inválido. Por favor, ingrese un número válido.");
            return;
        }

        Task task = taskManager.getTaskById(taskId);

        if (task == null) {
            taskView.showError("No se encontró una tarea con el ID: " + taskId);
        } else if (task.isPerformed()) {
            taskView.showError("La tarea ya está completada.");
        } else {
            taskManager.completeTask(taskId);
            taskView.showSuccess("Tarea completada exitosamente: " + task.getTitle());
        }
    }

    private void listTasks() {
        taskView.showTasks(taskManager.getAllTasks());
        taskView.showTaskStats(
                taskManager.getTaskCount(),
                taskManager.getCompletedTaskCount(),
                taskManager.getPendingTaskCount()
        );
    }
}
