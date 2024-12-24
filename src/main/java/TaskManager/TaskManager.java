package TaskManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Управляет списком задач.
 */
public class TaskManager {
    private List<Task> tasks; // Список задач

    /**
     * Создает новый менеджер задач.
     */
    public TaskManager() {
        tasks = new ArrayList<>();
    }

    /**
     * Добавляет задачу в менеджер.
     *
     * @param task задача для добавления
     */
    public void addTask(Task task) {
        tasks.add(task);
    }

    /**
     * Получает все задачи.
     *
     * @return список задач
     */
    public List<Task> getTasks() {
        return tasks;
    }
}
