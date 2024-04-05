package lessons.lesson24;

import java.util.HashMap;
import java.util.Map;

public class HashMapTask {
    public static void main(String[] args) {
   /*
    Создайте HashMap, который будет хранить имена студентов
    (тип String) и их оценки (тип Integer).
    Добавьте в HashMap данные трех студентов:
    Иван (оценка 5), Светлана (оценка 4) и Алексей (оценка 3).
     */

        HashMap<String,Integer> StudentGrades = new HashMap<>();
        StudentGrades.put("Иван", 5);
        StudentGrades.put("Светлана", 4);
        StudentGrades.put("Алексей", 3);

        /*
        Используя HashMap из предыдущего упражнения, получите и напечатайте оценку Светланы.
         */
        System.out.println("Оценка Светланы" + StudentGrades.get("Светлана"));

        /*
        Проверьте, содержится ли в вашем HashMap студент с именем Антон. Выведите соответствующее сообщение
        в зависимости от результата.
         */

        if(StudentGrades.containsKey("Anton")){
            System.out.println("Антон есть в списке!");
        }
        else{
            System.out.println("Антон в списке отсутсвует!");
        }

        /*
        Удалите из HashMap запись для студента Алексей. Выведите содержимое HashMap после удаления.
         */

//        StudentGrades.remove("Алексей");
//        for(String name:StudentGrades.keySet()){
//            System.out.println(name + ":" + StudentGrades.get(name));
//        }

        /*
        Напечатайте имена и оценки всех студентов из HashMap. Используйте для этого метод `entrySet()` и
        расширенный цикл `for`.
         */
        for(Map.Entry<String,Integer> entry : StudentGrades.entrySet()){
            System.out.println("Студент: " + entry.getKey() + " | Оценка: " + entry.getValue());
        }

        /*
        Измените оценку Светланы на 5 в вашем HashMap. Проверьте, была ли оценка изменена, и выведите содержимое
        HashMap после изменения.
         */
        StudentGrades.put("Светлана", 5);
        if(StudentGrades.get("Светлана")==5){
            System.out.println("Оценка Светланы успешно изменена на 5.");
        } else {
            System.out.println("Не удалось изменить оценку Светланы.");
        }
        for(Map.Entry<String,Integer> entry: StudentGrades.entrySet()){
            System.out.println("Студент: " + entry.getKey() + " | Оценка: " + entry.getValue());
        }

        StudentGrades.replace("Светлана", 5);
        System.out.println(StudentGrades);

        /*
        Напечатайте имена всех студентов, у которых оценка равна 5, используя HashMap `studentGrades`.
         */

        for(String name: StudentGrades.keySet()){
            if(StudentGrades.get(name)==5){
                System.out.println(name + " : " + StudentGrades.get(name));
            }
        }

        /*
        Очистите HashMap `studentGrades` от всех записей. Проверьте, пуст ли он после этого,
        и выведите соответствующее сообщение.
         */

        StudentGrades.clear();
        if(StudentGrades.isEmpty()){
            System.out.println("Список успешно очистился!");
        }
        else {
            System.out.println("Список не пуст!");
        }
}}
