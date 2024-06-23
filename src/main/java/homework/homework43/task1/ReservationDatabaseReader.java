package homework.homework43.task1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * 1. Управление записями бронирования отелей
 * Описание задачи:
 * Каждая строка файла bookings.txt содержит информацию о бронировании, разделённую запятыми в следующем порядке: имя клиента, номер отеля, тип номера, дата заезда, дата выезда.
 *
 * Требования к программе:
 * Программа должна прочитать данные из файла bookings.txt.
 * Для каждой записи создать объект Booking, содержащий следующие поля:
 * String customerName - имя клиента.
 * int hotelNumber - номер отеля.
 * String roomType - тип номера.
 * String checkInDate - дата заезда.
 * String checkOutDate - дата выезда.
 * Вывести данные в консоль в формате: "Клиент [имя клиента], Отель №[номер отеля], Тип номера: [тип номера], Заезд: [дата заезда], Выезд: [дата выезда]".
 * Исключения:
 * Обработать FileNotFoundException для случаев, когда файл не найден.
 * Обработать IOException для других ошибок ввода/вывода.
 */

public class ReservationDatabaseReader {
    private static final Logger LOGGER = LoggerFactory.getLogger(ReservationDatabaseReader.class);

    public static void main(String[] args) {
        File file = Path.of("src", "main", "resources", "booking.txt").toFile();

        try(BufferedReader br = new BufferedReader(new FileReader(file))){

            List<Booking> reservationBookingArray = new ArrayList<>();
            String line;
            while((line = br.readLine())!=null){
                String[] reservationDataArray =  line.split(",");

                reservationBookingArray.add(new Booking(reservationDataArray[0],Integer.parseInt(reservationDataArray[1]),
                        reservationDataArray[2],reservationDataArray[3],reservationDataArray[4]));

            }
            for (Booking booking : reservationBookingArray) {
                System.out.println(booking);
            }

        }catch (FileNotFoundException exception){
            LOGGER.error(exception.getMessage());

        }catch (IOException exception){
            LOGGER.error(exception.getMessage());
        }catch (NumberFormatException exception){
            LOGGER.error("Format of age is wrong, it must be a number! " + exception.getMessage());
        }


    }
}
