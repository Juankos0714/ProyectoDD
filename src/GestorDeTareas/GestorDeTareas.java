package GestorDeTareas;

import GestorDeTareas.Controller.TaskController;
import GestorDeTareas.Model.TaskManager;
import GestorDeTareas.View.TaskView;
import GestorDeTareas.View.ViewSwing;

import javax.swing.*;
import java.util.Scanner;

public class GestorDeTareas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("╔═══════════════════════════════════════╗");
        System.out.println("║         GESTOR DE TAREAS              ║");
        System.out.println("╠═══════════════════════════════════════╣");
        System.out.println("║ Seleccione el tipo de interfaz:       ║");
        System.out.println("║ 1. Interfaz de Consola                ║");
        System.out.println("║ 2. Interfaz Gráfica (Swing)           ║");
        System.out.println("╚═══════════════════════════════════════╝");
        System.out.print("➤ Ingrese su opción (1 o 2): ");

        try {
            int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("\n🖥️ Iniciando interfaz de consola...\n");
                    TaskManager taskManager = new TaskManager();
                    TaskView taskView = new TaskView();
                    TaskController taskController = new TaskController(taskManager, taskView);
                    taskController.run();
                    break;

                case 2:
                    System.out.println("\n🖼️ Iniciando interfaz gráfica...");
                    SwingUtilities.invokeLater(() -> {
                        new ViewSwing().setVisible(true);
                    });
                    break;

                default:
                    System.out.println("\n❌ Opción inválida. Cerrando aplicación...");
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("\n❌ Por favor, ingrese un número válido. Cerrando aplicación...");
        }

        scanner.close();
    }
}