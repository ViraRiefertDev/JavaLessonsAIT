package homework.homework30;

import java.util.Objects;

public class Task {
    //идентификатор задачи
    private String identifier;
    private String taskDescription;
    private TiketStatus status;
    private String deadline;

    private int executorId;

    public Task(String identifier, String tiketDescription) {
        this.identifier = identifier;
        this.taskDescription = tiketDescription;
        this.status = TiketStatus.NEW;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public int getExecutorId() {
        return executorId;
    }

    public void setExecutorId(int executorId) {
        this.executorId = executorId;
    }

    public TiketStatus getStatus() {
        return status;
    }

    public String getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        String taskInfo = "---------\nTask ticket:" + identifier + "\nDescription: " + taskDescription + "\nStatus: " + status + "\nDeadline: " + deadline+"\nExecutorId " + executorId;
        return taskInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(identifier, task.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier);
    }

    //метод изменения статуса задачи
    public void changeTaskStatus(TiketStatus status){
        System.out.println("Status: " + this.status + "has been changed to: " + status);
        this.status = status;
    }

    //установка срока выполнения
    public void setDeadline(String deadline) {
        this.deadline = deadline;
        System.out.println("deadline setted: " + deadline);
    }
}
