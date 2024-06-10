package homework.homework40;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task02 {
    private static final Logger LOGGER = LoggerFactory.getLogger(Task02.class);

    public static void main(String[] args) {
        /*
        Задание 2: Сравнение содержимого двух файлов
        Цель задания: Написать программу на Java, которая сравнивает содержимое двух файлов на идентичность, используя FileInputStream.
        Описание задания:
        1. Создайте два текстовых файла. Первый файл заполните некоторым текстом, а второй файл создайте как копию
           первого, возможно, с небольшими изменениями.
        2. Напишите программу, которая открывает оба файла с помощью FileInputStream и сравнивает их содержимое.
        3. Программа должна выводить сообщение, указывающее, идентичны ли файлы или нет.
        4. Если файлы не идентичны, программа должна указать первую позицию, в которой файлы различаются.
        5. Убедитесь, что программа корректно обрабатывает все возможные исключения.
         */

        try(FileInputStream text1 = new FileInputStream("src/main/resources/text1ForComparation");
        FileInputStream text2 = new FileInputStream("src/main/resources/text2ForComparation")){
//            if(text1.available()==text2.available()) {
                int data1, data2;
                int position = 0;

                while ((data1 = text1.read()) !=-1){
                    position++;
                    data2 = text2.read();
                    if(data1 != data2){
                        System.out.println("Files are differten at position: " + position);
                        return;
                    }
                }
                System.out.println("Files are identical.");

//            }
//            else{
//                System.out.println("Files are differnt, they have diffetent length!");
//            }

        }catch (FileNotFoundException exception){
            System.out.println("File was not finding: " + exception.getMessage());
        }catch (IOException exception){
            System.out.println("Error reading file" + exception.getMessage());
        }


    }
}
