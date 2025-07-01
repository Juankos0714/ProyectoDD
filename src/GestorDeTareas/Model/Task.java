package GestorDeTareas.Model;

public class Task {
    private static int nextId = 1;
    private int id;
    private String title;
    private String description;
    private boolean performed;

    public Task(String title, String description) {
        this.id = nextId++;
        this.title = title;
        this.description = description;
        this.performed = false;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPerformed() {
        return performed;
    }

    public void setPerformed(boolean performed) {
        this.performed = performed;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Título: %s | Descripción: %s | Estado: %s",
                id, title, description, performed ? "Completada" : "Pendiente");
    }
}
