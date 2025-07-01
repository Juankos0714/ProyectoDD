package GestorDeTareas.View;

// TaskView.java (View)
import GestorDeTareas.Model.Task;

import java.util.List;
import java.util.Scanner;

public class TaskView {
    private Scanner scanner;

    public TaskView() {
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() {
        String menu = """
                ╔═══════════════════════════════════════╗
                ║            GESTOR DE TAREAS           ║
                ╠═══════════════════════════════════════╣
                ║ 1. Crear tarea                        ║
                ║ 2. Completar tarea                    ║
                ║ 3. Listar tareas                      ║
                ║ 4. Salir                              ║
                ╚═══════════════════════════════════════╝
                ➤ Seleccione una opción: """;
        System.out.print(menu);
    }

    public int getUserChoice() {
        try {
            int choice = Integer.parseInt(scanner.nextLine());
            return choice;
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public Task getTaskInput() {

        System.out.println("           CREAR NUEVA TAREA           ");
        System.out.print(" Ingrese el título de la tarea: ");
        String title = scanner.nextLine();

        System.out.print(" Ingrese la descripción de la tarea: ");
        String description = scanner.nextLine();

        return new Task(title, description);
    }

    public int getTaskIdInput() {
        System.out.print("Ingrese el ID de la tarea a completar: ");
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public void showTasks(List<Task> tasks) {
        System.out.println("\n╔═══════════════════════════════════════╗");
        System.out.println("║             LISTA DE TAREAS           ║");
        System.out.println("╠═══════════════════════════════════════╣");

        if (tasks.isEmpty()) {
            System.out.println("║ No hay tareas registradas.            ║");
        } else {
            for (Task task : tasks) {
                System.out.println("║ " + task.toString().replace("\n", "\n║ "));
                System.out.println("╠═══════════════════════════════════════╣");
            }
        }
        System.out.println("╚═══════════════════════════════════════╝");
    }

    public void showTaskStats(int total, int completed, int pending) {
        String stats = String.format("""
                ╔═══════════════════════════════════════╗
                ║             ESTADÍSTICAS              ║
                ╠═══════════════════════════════════════╣
                ║ Total de tareas: %-20d ║
                ║ Tareas completadas: %-17d ║
                ║ Tareas pendientes: %-18d ║
                ╚═══════════════════════════════════════╝""", total, completed, pending);
        System.out.println(stats);
    }

    public void showMessage(String message) {
        System.out.println("\n✉ " + message);
    }

    public void showError(String error) {
        System.out.println("\n× ERROR: " + error);
    }

    public void showSuccess(String message) {
        System.out.println("\n» " + message);
    }

    public void closeScanner() {
        scanner.close();
    }
}