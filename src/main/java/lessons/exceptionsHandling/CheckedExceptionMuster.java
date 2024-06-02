package lessons.exceptionsHandling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionMuster {
    private static final Logger LOGGER = LoggerFactory.getLogger(CheckedExceptionMuster.class);
    //Проверяемые ошибки не зависят от программиста!
    //Проверяемую ошибку/исключение можно не обрабатывать а выкинуть наверх, но тут обязаны обозначить тогда throws FileNotFoundException
    //Лучше такие ошибки обрабатывать на месте
    public static void main(String[] args) throws FileNotFoundException {
       // try {
            File file = new File("testfile.txt");
            FileReader fileReader = new FileReader(file);
//        }catch (FileNotFoundException exception){
//            LOGGER.error(exception.getMessage());
//        }

    }

}
