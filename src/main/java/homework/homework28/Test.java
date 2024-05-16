package homework.homework28;

public class Test {
    public static void main(String[] args) {
        Employee salesManager = new Employee(1234,"Vasja", "Sales manager",3455.3);
        Employee commertialDirector = new Employee(24532,"Alexej", "Commertial Director", 4355.4);
        Employee hrDepartament = new Employee(64245,"Olena", "HR Departament", 2352);
        Employee itDepartament = new Employee(64324, "Artem", "IT Departament", 3235);

        //Dublicat id
        Employee itDepartamentDublicat = new Employee(64324, "Artemij", "IT Departament", 2455);

        //Добавляем сотрудников в список
        EmployeeManager manager = new EmployeeManager();
        manager.addEmployee(salesManager);
        manager.addEmployee(commertialDirector);
        manager.addEmployee(hrDepartament);
        manager.addEmployee(itDepartament);
        manager.addEmployee(itDepartamentDublicat);

        //выводим на экран данные сотрудника itDepartament
        itDepartament.displayInfo();

        //выводим список сотрудников на экран
        manager.displayAllEmployees();

        //обновляем данные сотрудника itDepartament
        manager.updateEmployee(64324, "Oleg","ITT",2222);
        itDepartament.displayInfo();

        //пытаемся обновить данные сотрудника с несуществующим ID
        manager.updateEmployee(9999, "Oleg","ITT",2222);

        //удаляем сотрудника по ID
        manager.removeEmployee(64324);

        //удаляем сотрудника по несуществующему ID
        manager.removeEmployee(999999);

        //выводим список сотрудников на экран
        manager.displayAllEmployees();

        //возвращаем сотрудника по его ID
        System.out.println("Поиск сотрудника: ");
        Employee employee = manager.findEmployeeById(1234);
        employee.displayInfo();
    }
}
