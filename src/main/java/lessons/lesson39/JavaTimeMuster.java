package lessons.lesson39;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class JavaTimeMuster {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2024,05,20);
        System.out.println(localDate);
        System.out.println(LocalDate.now());

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalTime localTime1New = LocalTime.of(13,45,34,23535);
        System.out.println(localTime1New);

        LocalDateTime localDateTime = LocalDateTime.of(2024,9,12,20,00,39);
        LocalDateTime localDateTimeNew = LocalDateTime.of(localDate,localTime);
        System.out.println(localDateTime);
        System.out.println(localDateTimeNew);

        //Часовые пояса
        LocalDateTime localDateTime2 = LocalDateTime.of(2024,1,1,12,45);
        ZoneOffset zoneOffset = ZoneOffset.of("+02:00");
        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime2,zoneOffset);

        System.out.println(localDateTime2);
        System.out.println(offsetDateTime);

        //Зональное время
        System.out.println("------------------------------------------");
        LocalDateTime localDateTime3 = LocalDateTime.of(2024,6,4,20,30,39);
        ZoneId zoneId = ZoneId.of("Asia/Tokyo");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime3,zoneId);

        System.out.println(localDateTime3);
        System.out.println(zonedDateTime);

        //Переменные года, месяца, года И месяца
        Year year = Year.of(2024);
        Month month = Month.of(4);
        YearMonth yearMonth = YearMonth.of(2024, Month.APRIL);
        MonthDay monthDay = MonthDay.of(Month.APRIL, 20);

        System.out.println(year);
        System.out.println(month);
        System.out.println(yearMonth);
        System.out.println(monthDay);

        System.out.println("---------------------------------------------");
        //Будем менять данные
        //Скидка на товар действительна 24 дня с момента объявления
        //надо добавить в дате 24 дня
        LocalDate localDate4 = LocalDate.of(2024,01,01);
        System.out.println(localDate4);
        localDate4 = localDate4.plusDays(24);
        localDate4 = localDate4.plusDays(36);
        System.out.println(localDate4);
        localDate4 = localDate4.minusDays(20);
        System.out.println(localDate4);

        //Сравнение двух дат
        System.out.println("------------------------------------------------");
        if(LocalDate.now().isAfter(localDate4)){
            System.out.println("is after now");
        }
        else{
            System.out.println("is not after now");
        }

        // из стринга собрать дату
        LocalDate date = LocalDate.parse("2924-02-02");
        System.out.println(date);

        //парсинг LocalDateTime
        LocalDateTime localDateTimeToParse = LocalDateTime.parse("2024-02-02T12:30:23");
        System.out.println(localDateTimeToParse);

        //Отформатировать данные, чтобы были понятны пользователю
        String format = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.GERMAN)
                .format(LocalDate.of(2024,04,01));
        System.out.println(format);

        //Как считать разницу между датами
        System.out.println("------------------------------------------");
        LocalDate startLocalDate = LocalDate.parse("2024-02-02");
        LocalDate endLocalDate = LocalDate.parse("2024-12-02");

        long until = startLocalDate.until(endLocalDate, ChronoUnit.MONTHS);
        System.out.println(until);
        


    }
}
