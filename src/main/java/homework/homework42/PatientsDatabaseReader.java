package homework.homework42;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PatientsDatabaseReader {
    private static final String FILE_PATH = "src/main/resources/patients_database.txt";
    private static final Logger LOGGER = LoggerFactory.getLogger(PatientsDatabaseReader.class);
    public static void main(String[] args) {
        /**
         * 1. Чтение медицинских записей
         * Цель:
         * Разработать программу на Java для чтения данных о пациентах из текстового файла и вывода этой информации на экран.
         * Описание задачи:
         * Формат данных в файле: Каждая строка файла содержит данные одного пациента, разделённые запятыми: ФИО, возраст, диагноз, дата последнего визита.
         * Требования к программе:
         * Прочитать данные из файла.
         * Отобразить данные в консоли в удобочитаемом формате.
         * Обработать возможные ошибки при чтении файла, например, если файл не найден или повреждён.
         * Используемые технологии:
         * FileReader для построчного чтения файла.
         * BufferedReader для буферизации данных, что ускоряет чтение.
         * Обработка исключений IOException и FileNotFoundException.
         */

        try(BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))){
            String line;
            //ФИО пациента, тип анализа, значение анализа, дата проведения.
            while((line = br.readLine())!=null){
               String[] patientDataArray =  line.split(", ");
               LOGGER.info("ФИО: {}, возраст {}, диагноз {}, дата последнего посещения {}",patientDataArray[0],
                       patientDataArray[1],patientDataArray[2],patientDataArray[3]);

            }
        }catch (FileNotFoundException exception){
            LOGGER.error(exception.getMessage());

        }catch (IOException exception){
            LOGGER.error(exception.getMessage());
        }

    }
}
