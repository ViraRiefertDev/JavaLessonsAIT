package homework.homework28;

import java.util.HashMap;

public class EmployeeManager{
    //список всех сотрудников
    private HashMap<Integer,Employee> employees;

    //--Конструктор--------------------------------------
    public EmployeeManager() {
        employees = new HashMap<>();
    }
    //---------------------------------------------------

    //-Метод добавляет нового сотрудника в систему, при этом проверяет, что сотрудник с таким ID еще не зарегестрирован
    public void addEmployee(Employee employee){
        if(!employees.containsKey(employee.getEmployeeId())){
           employees.put(employee.getEmployeeId(),employee);
           if(employees.containsKey(employee.getEmployeeId())){
               System.out.println("Сотрудник успешно добавлен в список!");
           }
           else{
               System.out.println("ERROR! Ошибка при добавлении сотрудника!");
           }
        }
        else{
            System.out.println("Сотрудник с ID: " + employee.getEmployeeId() + " уже зарегестрирован.");
        }
    }

    //Метод обновления данных сотрудника
    public void updateEmployee(int employeeId, String name, String department, double salary){
        if(employees.containsKey(employeeId)){
            Employee employeeToChange = employees.get(employeeId);
            employeeToChange.setName(name);
            employeeToChange.setDepartment(department);
            employeeToChange.setSalary(salary);
            System.out.println("Данные сотрудника были успешно обновлены!");
        }
        else{
            System.out.println("Сотрудник с ID: " + employeeId + " не найден!");
        }
    }

    // Метод удаления сотрудника по ID
    public void removeEmployee(int employeeId){
        if(employees.containsKey(employeeId)){
            employees.remove(employeeId);
            System.out.println("Сотрудник с Id: " + employeeId + " был успешно удален!");
        }
        else{
            System.out.println("Сотрудник с ID:" + employeeId + " не найден!");
        }
    }

    //Метод возвращает сотрудника по его Id
    public Employee findEmployeeById(int employeeId){
        if(employees.containsKey(employeeId)){
            return employees.get(employeeId);
        }
        else{
            System.out.println("Сотрудник с ID:" + employeeId + " не найден!");
            return null;
        }
    }

    //метод выводит информацию о всех сотрудниках
    public void displayAllEmployees(){
        for(Employee employee:employees.values()){
           employee.displayInfo();
        }
    }


}
