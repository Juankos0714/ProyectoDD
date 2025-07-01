package GestorDeTareas;

import GestorDeTareas.Controller.TaskController;
import GestorDeTareas.Model.TaskManager;
import GestorDeTareas.View.TaskView;

public class GestorDeTareas {

        public static void main(String[] args) {
            TaskManager taskManager = new TaskManager();
            TaskView taskView = new TaskView();
            TaskController taskController = new TaskController(taskManager, taskView);

            taskController.run();
        }

}
