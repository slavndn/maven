package TaskManager;

/**
 * Представляет задачу с описанием и статусом.
 */
public class Task { // Убедитесь, что класс объявлен как public
    private String description; // Описание задачи
    private boolean isCompleted; // Статус завершения

    /**
     * Создает новую задачу с заданным описанием.
     *
     * @param description описание задачи
     */
    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    /**
     * Помечает задачу как завершенную.
     */
    public void complete() {
        isCompleted = true;
    }

    /**
     * Возвращает описание задачи.
     *
     * @return описание
     */
    public String getDescription() {
        return description;
    }

    /**
     * Проверяет, завершена ли задача.
     *
     * @return true, если завершена; false в противном случае
     */
    public boolean isCompleted() {
        return isCompleted;
    }
}
