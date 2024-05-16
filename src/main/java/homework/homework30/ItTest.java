package homework.homework30;

public class ItTest {
    public static void main(String[] args) {
        Project project = new Project(32,"HelloWorldProject");

        Employee vasya = new Employee(1,"Vasya","Frontend Developer");
        Employee tomas = new Employee(2,"Tomas", "Backend Developer");
        Employee sem = new Employee(3, "Sem", "Tester");


        Task task11 = new Task("#11","develop the project architecture");
        Task task22 = new Task("#22","draw a website prototype");
        Task task33 = new Task("#33","Learn the new Unit bibliothek");

        //Добавляем сотрудников в проект
        project.addNewEmployeeInProject(vasya);
        project.addNewEmployeeInProject(tomas);
        project.addNewEmployeeInProject(sem);


        //Добавляем задачу в проект
        project.addNewTaskForEmployee(vasya.getId(),task11);
        project.addNewTaskForEmployee(tomas.getId(),task22);
        project.addNewTaskForEmployee(sem.getId(),task33);

//        System.out.println("+++++++++++++++++++++++++++++++");
//        project.displayInfoAboutProject();

        //Проверяем метод удаления Сотрутника из проекта
        project.removeEmployeeFromProject(sem);

//        System.out.println("+++++++++++++++++++++++++++++++");
//        project.displayInfoAboutProject();

        //проверяем метод удаления задачи из проекта
        project.removeTaskFromTheLists("#11");

        System.out.println("+++++++++++++++++++++++++++++++");
        project.displayInfoAboutProject();

        //Метод изменения статуса задачи
        task22.changeTaskStatus(TiketStatus.INWORK);

        //Метод установки дэдлайна
        task22.setDeadline("22.7.2024");

        System.out.println("+++++++++++++++++++++++++++++++");
        project.displayInfoAboutProject();




    }
}
