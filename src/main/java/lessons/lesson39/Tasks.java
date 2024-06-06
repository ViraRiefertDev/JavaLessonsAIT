package lessons.lesson39;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Tasks {
    private static final Logger LOGGER = LoggerFactory.getLogger(Tasks.class);
    public static void main(String[] args) {
        /*
         **Задача**: Создайте объект `LocalDate` для вашего дня рождения и выведите его на консоль в формате "гггг-мм-дд".
         */
        LocalDate localDate = LocalDate.of(1992,9,27);
        LOGGER.info(localDate.toString());

        /*
        Прибавление времени
        **Задача**: Используя текущее время, создайте объект `LocalTime` и добавьте к нему 90 минут.
        Выведите результат на консоль.
         */

        LocalTime localTime = LocalTime.now();
        LOGGER.info(localTime.toString());
        localTime = localTime.plusMinutes(90);
        LOGGER.info(localTime.toString());

        /*
        Разница между датами
        **Задача**: Создайте два объекта `LocalDate`: один для первого дня текущего года и другой для сегодняшнего дня.
        Используйте `Period`, чтобы вычислить разницу между этими датами в годах, месяцах и днях. Выведите результат на
        консоль.
         */
        System.out.println("------------------------------------------------");
        LocalDate localDateStart = LocalDate.of(2024,1,1);
        LOGGER.info(localDateStart.toString());
        LocalDate localDateNow = LocalDate.now();
        LOGGER.info(localDateNow.toString());
//        Period period = Period.between(localDate2,localDate1);
//        LOGGER.info(period.toString());
        long timeInYears = localDateNow.until(localDateStart, ChronoUnit.YEARS);
        LOGGER.info("Время в годах: " + timeInYears);
        long timeInMonth = localDateStart.until(localDateNow, ChronoUnit.MONTHS);
        LOGGER.info("Время в месяцах: " + timeInMonth);
        long timeInDays = localDateStart.until(localDateNow, ChronoUnit.DAYS);
        LOGGER.info("Время в днях: " + timeInDays);

        /*
        Форматирование даты
        **Задача**: Создайте объект `LocalDate` для случайной даты и отформатируйте его в виде строки в формате "дд.мм.гггг".
        Выведите эту строку на консоль.
         */
        System.out.println("---------------------------");
        LocalDate localDate1 = LocalDate.of(2023,4,12);
        //1 способ
        String format = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.GERMAN).format(localDate1);
        LOGGER.info(format);
        //2 способ
        format = DateTimeFormatter.ofPattern("dd+MM+yyyy").format(localDate1);
        LOGGER.info(format);
        //3 способ
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        format = localDate1.format(formatter);
        LOGGER.info(format);

        /*
        Создайте объект `ZonedDateTime` для текущего момента времени в часовом поясе GMT (Лондон). Преобразуйте его в
        часовой пояс EST (Нью-Йорк) и выведите оба объекта на консоль для сравнения.
         */

        System.out.println("-------------------------------------------");
        ZonedDateTime zonedDateTimeNowGMT = ZonedDateTime.now(ZoneId.of("GMT"));
        LOGGER.info(zonedDateTimeNowGMT.toString());
        zonedDateTimeNowGMT = ZonedDateTime.now(ZoneId.of("America/New_York"));
        LOGGER.info(zonedDateTimeNowGMT.toString());



    }
}
