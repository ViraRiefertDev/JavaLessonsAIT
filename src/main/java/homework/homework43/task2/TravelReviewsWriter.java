package homework.homework43.task2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 2. Запись отзывов о путешествиях
 * Описание задачи:
 * Пользователь вводит данные через консоль, которые затем записываются в файл reviews.txt.
 *
 * Требования к программе:
 * Записать данные в следующем формате: имя путешественника, страна посещения, отзыв, дата посещения.
 * Создать объект Review с полями:
 * String travelerName - имя путешественника.
 * String country - страна посещения.
 * String reviewText - текст отзыва.
 * String visitDate - дата посещения.
 * После ввода каждой записи спросить пользователя, желает ли он добавить ещё отзывы.
 */

public class TravelReviewsWriter {
    private static final Logger LOGGER = LoggerFactory.getLogger(TravelReviewsWriter.class);
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        File file = Path.of("src", "main", "resources", "reviews.txt").toFile();
        String answer = "";
        List<Review> reviewsArray = new ArrayList<>();
        do {
            System.out.println("Имя путешетсвенника: ");
            String name = scanner.nextLine();
            System.out.println("Страна посещения:");
            String country = scanner.nextLine();
            System.out.println("Отзыв: ");
            String reviewText = scanner.nextLine();
            System.out.println("Дата посещения: ");
            String visitDate = scanner.nextLine();


            reviewsArray.add(new Review(name,country,reviewText,visitDate));
            String data = name + ", " + country + ", " + reviewText + ", " + visitDate;
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true))) {
                bufferedWriter.write(data);
                bufferedWriter.newLine();
                System.out.println("Еще будут записи?(Y/N)");
                answer = scanner.nextLine();
            } catch (FileNotFoundException exception) {
                LOGGER.error(exception.getMessage());

            } catch (IOException exception) {
                LOGGER.error(exception.getMessage());
            }


        } while (answer.equalsIgnoreCase("y"));

        for (Review review : reviewsArray) {
            System.out.println(review);
        }

    }
}
