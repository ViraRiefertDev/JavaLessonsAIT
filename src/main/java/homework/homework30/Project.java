package homework.homework30;

import java.util.HashMap;

public class Project {
    private int projectId;
    private String name;
    private HashMap<String, Task> listOfTasks = new HashMap<>();
    private HashMap<Integer, Employee> listOfEmployee = new HashMap<>();

    public Project(int projectId, String name) {
        this.projectId = projectId;
        this.name = name;
    }

    //Метод вывода общей инфы о проекте
    public void displayInfoAboutProject() {
        System.out.println("Project Name: " + name);
        System.out.println("------------EmployeeList-------------");
        for (Employee employee : listOfEmployee.values()) {
            employee.printInfoAboutEmployee();
        }
        System.out.println("-------------------------");
        System.out.println("------------TasksList-------------");
        if (listOfTasks.isEmpty()) {
            System.out.println("No tasks yet!");
        } else {
            for (Task task : listOfTasks.values()) {
                System.out.println(task.toString());
            }
        }

    }

    //метод добавления задачи сотруднику и в общий лист
    public void addNewTaskForEmployee(int employeeId, Task task) {
        if (listOfEmployee.containsKey(employeeId)) {
            if (!listOfEmployee.containsKey(task.getIdentifier())) {
                listOfEmployee.get(employeeId).addNewTask(task);
                task.setExecutorId(employeeId);
                listOfTasks.put(task.getIdentifier(), task);
                System.out.println("Task " + task.getTaskDescription() + "was successfull added into the list");
            } else {
                System.out.println("A task with such ticket " + task.getIdentifier() + " is already in the list!");
            }


        } else {
            System.out.println("Employee with id: " + employeeId + "was not found!");
        }
    }

    //метод удаления задачи и у сотудника в списке и основном списке
    public void removeTaskFromTheLists(String tiket) {
        if (listOfTasks.containsKey(tiket)) {
            System.out.println("The task " + listOfTasks.get(tiket).getTaskDescription() + " has been removed from the main tasklist!");
            listOfTasks.remove(tiket);
            boolean tiketIsFound = false;
            for (Employee employee : listOfEmployee.values()) {

                if (employee.getTasksList().containsKey(tiket)) {
                    employee.removeTask(tiket);
                    tiketIsFound = true;
                    System.out.println("The task has been removed from the employee's name: " + employee.getName() + " list!");
                    break;
                }
            }
            if (!tiketIsFound) {
                System.out.println("This task with tiket: " + tiket + "was no found for any of the employees!");
            }
        }

    }

    //метод добавления сотрудника
    public void addNewEmployeeInProject(Employee employee) {
        if (listOfEmployee.containsKey(employee.getId())) {
            System.out.println("Employee with such id" + employee.getId() + " is already existiert into the list");
        } else {
            listOfEmployee.put(employee.getId(), employee);
            System.out.println("Employee with such id " + employee.getId() + " was successful added into the list!");
        }
    }

    //метод удаления сотрудника
    public void removeEmployeeFromProject(Employee employee) {
        if (listOfEmployee.containsKey(employee.getId())) {
            listOfEmployee.remove(employee.getId());
            System.out.println("Employee" + employee.getName() + " ID: " + employee.getId() + " was successful removed from project");
            for (Task task : listOfTasks.values()) {
                if (task.getExecutorId() == employee.getId()) {
                    task.setExecutorId(0);
                }
            }
        } else {
            System.out.println("Employee" + employee.getName() + " ID: " + employee.getId() + " was not found in list");
        }
    }

}
