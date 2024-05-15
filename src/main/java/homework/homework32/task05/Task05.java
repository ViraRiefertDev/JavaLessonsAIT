package homework.homework32.task05;

import java.util.HashSet;

//Тестирование работы с коллекциями
public class Task05 {

    //Метод, который принимает список студентов и возвращает список студентов с оценкой выше 75.
    //Тест должен проверять правильность работы метода на списке с разными данными

    public HashSet<Student> highGradesFilter(HashSet<Student> students){
        HashSet<Student>studentsWithHighGrades = new HashSet<>();
        for(Student student:students){
            if(student.getGrade()>=75){
                studentsWithHighGrades.add(student);
            }
        }
        return studentsWithHighGrades;
    }
}
