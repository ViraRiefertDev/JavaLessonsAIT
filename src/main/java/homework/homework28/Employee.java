package homework.homework28;

import java.util.Objects;

public class Employee {
    //уникальный идентификатор сотрудника
    final private int employeeId;
    //имя сотрудника
    private String name;
    //отдел, в котором работает сотрудник
    private String department;
    //зарплата сотрудника
    private double salary;


    //--Конструктор-------------------------------------
    public Employee(int employeeId, String name, String department, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    //--------------------------------------------------

    //----Геттеры и сеттеры-------------------------------
    public int getEmployeeId() {
        return employeeId;
    }
    //Сеттер для employeeId отсутствует, так мы предотвратим изменение ID
    //после его первоначальной установки через конструктор + эта переменная final, чтоб наверняка))

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //-------------------------------------------------------

    //--equals and hashCode------------------------------
    //проверяем на уникальность только ID сотрудника
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId);
    }
    //---------------------------------------------------


    //--Метод выводит информацию о сотруднике----------------
    public void displayInfo(){
        System.out.println("---------------------");
        System.out.println("Имя: " + name);
        System.out.println("ID: " + employeeId);
        System.out.println("Отдел: " + department);
        System.out.println("Зарплата: " + salary);
        System.out.println("---------------------");
    }

}
