package homework.homework42;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MedicalAnalysisWriter {
    /**
     * 2. Запись результатов медицинских анализов
     * Цель:
     * Создать приложение для ввода и сохранения результатов медицинских анализов пациентов в файл.
     *
     * Описание задачи:
     * Формат ввода: Пользователь вводит данные через консоль: ФИО пациента, тип анализа, значение анализа, дата проведения.
     * Требования к программе:
     * Записывать введённые данные в конец существующего файла, не удаляя предыдущую информацию.
     * Обеспечить возможность добавления нескольких записей подряд.
     * Используемые технологии:
     * FileWriter для записи данных в файл.
     * BufferedWriter для оптимизации процесса записи.
     * Проверка наличия файла и создание файла, если он не существует.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(MedicalAnalysisWriter.class);
    private static final String FILE_PATH = "src/main/resources/analysis_database.txt";
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String answer = "";
        do {
            System.out.println("ФИО пациента: ");
            String name = scanner.nextLine();
            System.out.println("тип анализа: ");
            String analyseType = scanner.nextLine();
            System.out.println("значение анализа: ");
            String analyseResult = scanner.nextLine();
            System.out.println("дата проведения анализа: ");
            String analyseData = scanner.nextLine();

            String data = name + ", " + analyseType + ", " + analyseResult + ", " + analyseData;
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_PATH))) {
                bufferedWriter.write(data);
                bufferedWriter.newLine();
                System.out.println("Еще будут записи?(Y/N)");
                answer = scanner.nextLine();


            } catch (FileNotFoundException exception) {
                LOGGER.error(exception.getMessage());

            } catch (IOException exception) {
                LOGGER.error(exception.getMessage());
            }
        }
        while (answer.equalsIgnoreCase("y"));
    }
}
