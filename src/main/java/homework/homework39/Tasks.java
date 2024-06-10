package homework.homework39;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Tasks {
    private static final Logger LOGGER = LoggerFactory.getLogger(Tasks.class);
    public static void main(String[] args) {
        /*
        Задание 1: Создание дат
        Задача: Напишите программу, которая создает объект LocalDate для сегодняшней даты, а затем создает другой объект
        LocalDate для даты вашего следующего дня рождения. Выведите обе даты на консоль.
         */
        System.out.println("-------Task01------------");
        LocalDate localDateNow = LocalDate.now();
        LOGGER.info("Date now: " + localDateNow);
        LocalDate localDateOfMyNextBitrhday  = LocalDate.of(2024,9,27);
        LOGGER.info("Date of my next BirthDay: " + localDateOfMyNextBitrhday);

        /*
        Задание 2: Сравнение времени
        Задача: Создайте два объекта LocalTime: один для времени "07:30" утра, а другой для "08:45" вечера.
        Используйте методы isBefore и isAfter, чтобы определить, какое время раньше или позже, и выведите результат
        на консоль.
         */
        System.out.println("-------Task02------------");
        LocalTime localTimeMorning = LocalTime.of(7,30);
        LocalTime localTimeEvening = LocalTime.of(20,45);
        if(localTimeMorning.isBefore(localTimeEvening)){
            LOGGER.info("Утро раньше вечера");
        }
        if(localTimeEvening.isAfter(localTimeMorning)){
            LOGGER.info("Вечер позже утра");
        }

        /*
        Задание 3: Разница между двумя датами
        Задача: Используя класс Period, рассчитайте разницу в днях, месяцах и годах между текущей датой и датой вашего
        последнего дня рождения. Выведите эту информацию на консоль.
         */
        System.out.println("-------Task03------------");
        long timeInYears = localDateNow.until(localDateOfMyNextBitrhday, ChronoUnit.YEARS);
        LOGGER.info("Время в годах: " + timeInYears);
        long timeInMonths = localDateNow.until(localDateOfMyNextBitrhday, ChronoUnit.MONTHS);
        LOGGER.info("Время в месяцах: " + timeInMonths);
        long timeInDays = localDateNow.until(localDateOfMyNextBitrhday, ChronoUnit.DAYS);
        LOGGER.info("Время в днях: " + timeInDays);

        Period period = Period.between(localDateOfMyNextBitrhday,localDateNow);
        LOGGER.info("Period: " + period);

        /*
        Задание 4: Форматирование даты и времени
        Задача: Создайте объект LocalDateTime для "2024-12-31T23:59". Используйте класс DateTimeFormatter для
        форматирования этой даты и времени в формате "dd/MM/yyyy HH:mm:ss". Выведите отформатированную строку
        на консоль.
         */
        System.out.println("-------Task04------------");
        LocalDateTime localDateTime1 = LocalDateTime.parse("2024-12-31T23:59");
        LOGGER.info("localDateTime1: " + localDateTime1);
        String formattedLocalDateTime1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").format(localDateTime1);
        LOGGER.info("formattedLocalDateTime1: " + formattedLocalDateTime1);

        /*
        Задание 5: Вычисление времени до нового года
        Задача: Напишите программу, которая вычисляет, сколько дней, часов и минут осталось до следующего Нового Года
        от текущей даты и времени.
         */
        System.out.println("-------Task05------------");
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        LocalDateTime localDateTimeNewYear = LocalDateTime.of(2025,1,1,0,0);
        long daysUntilTheNewYear = localDateTimeNow.until(localDateTimeNewYear, ChronoUnit.DAYS);
        LOGGER.info("Days left until the new year: " + daysUntilTheNewYear);


        /*
        Задание 6: Определение дня недели
        Задача: Напишите программу, которая определяет день недели для вашего следующего дня рождения.
        Используйте LocalDate и метод getDayOfWeek(). Выведите результат на консоль.
         */
        System.out.println("-------Task06------------");
        DayOfWeek dayOfWeek = localDateOfMyNextBitrhday.getDayOfWeek();
        LOGGER.info("Day of the week for my next birthday: " + dayOfWeek.toString());

        /*
        Задание 7: Изменение времени с учетом часового пояса
        Задача: Создайте объект ZonedDateTime для текущей даты и времени в вашем локальном часовом поясе.
        Затем измените этот объект, чтобы он отражал время в часовом поясе Токио. Выведите оба значения
        времени на консоль.
         */
        System.out.println("-------Task07------------");
        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
        LOGGER.info("zonedDateTimeNow" + zonedDateTimeNow);
        ZonedDateTime zonedDateTimeTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        LOGGER.info("zonedDateTimeTokyo" + zonedDateTimeTokyo);

    }

    public static long differenceDays(LocalDate lastBirthday, LocalDate today) {
        if(lastBirthday == null||today == null){
            throw new IllegalArgumentException("Wrong Parameter");
        }
        long until = lastBirthday.until(today, ChronoUnit.DAYS);
        LOGGER.info("The difference in days between the current date and your last birthday -> {} DAYS", until);
        return until;
    }
}
