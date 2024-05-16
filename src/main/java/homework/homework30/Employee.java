package homework.homework30;

import java.util.HashMap;
import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private String position;
    private HashMap<String, Task> tasksList = new HashMap<>();

    public Employee(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public HashMap<String, Task> getTasksList() {
        return tasksList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    //добавление задачи в лист
    public void addNewTask(Task task) {
        if (tasksList.containsKey(task.getIdentifier())) {
            System.out.println("A task with such ticket " + task.getIdentifier() + " is already in the list!");
        } else {
            tasksList.put(task.getIdentifier(), task);
            task.setExecutorId(id);
            System.out.println("The task " + task.getTaskDescription() + " was successfully added to the task list");
        }
    }

    //удаление задачи из листа
    public void removeTask(String tiket) {
        if (!tasksList.containsKey(tiket)) {
            System.out.println("A task with such ticket " + tiket + " was not found in the list");
        } else {
            System.out.println("The task " + tasksList.get(tiket).getTaskDescription() + " was successfully removed from the list");
            tasksList.remove(tiket);

        }
    }

    //вывод информации о сотруднике
    public void printInfoAboutEmployee() {
        System.out.println("Name: " + name + "\nId: " + id + "\nPosition: " + position);
        System.out.println("Employee task list");
        System.out.println("--------------------------");
        if (tasksList.isEmpty()) {
            System.out.println("No tasks yet");
            System.out.println("-------------------------------");
        } else {
            for (Task task : tasksList.values()) {
                System.out.println(task);
                System.out.println("-------------------------------");
            }

        }


    }


}
