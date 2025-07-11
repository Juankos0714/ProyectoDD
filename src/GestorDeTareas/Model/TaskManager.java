package GestorDeTareas.Model;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks);
    }

    public Task getTaskById(int id) {
        return tasks.stream()
                .filter(task -> task.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public boolean completeTask(int id) {
        Task task = getTaskById(id);
        if (task != null && !task.isPerformed()) {
            task.setPerformed(true);
            return true;
        }
        return false;
    }

    public boolean removeTask(int id) {
        Task task = getTaskById(id);
        if (task != null) {
            tasks.remove(task);
            return true;
        }
        return false;
    }

    public int getTaskCount() {
        return tasks.size();
    }

    public int getCompletedTaskCount() {
        return (int) tasks.stream().filter(Task::isPerformed).count();
    }

    public int getPendingTaskCount() {
        return (int) tasks.stream().filter(task -> !task.isPerformed()).count();
    }
}