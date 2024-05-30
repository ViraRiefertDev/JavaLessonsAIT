package lessons.exceptionsHandling;

import lessons.lesson27.Animal;
import lessons.logging.UserInteraction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ErrorCalculator {
    private static final Logger LOGGER = LoggerFactory.getLogger(ErrorCalculator.class);

    static Animal animal = null;
    public static void main(String[] args) {
        //badMehtod();
        try {
           int a = divideNumbers(10, 0);
        }
        catch (ArithmeticException exception){
            LOGGER.error(exception.getMessage());
        }

    }

    static void badMehtod(){
        LOGGER.info("I'm bad method");
        badMehtod();
    }

    //пробрасываем ошибку наверх
    //и пусть тот кто вызвал этом метод эту ошибку обрабатывает
    //если уберем throws ArithmeticException ничего не поменяется, но это как флаг что может вылезти такая ошибка
//    public static int divideNumbers(int a, int b) throws  ArithmeticException{
//        return a/b;
//    }

    //Второй вариант, не ждем когда выскочит ошибка/исключение, а сразу выбрасываем на верх ошибку
    public static int divideNumbers(int a, int b){
        if(b==0){
            throw new ArithmeticException("Не дели на ноль!!!");
        }
        return a/b;
    }

    public static void divide(int a, int b){
        int result = 0;
        try{
            result = a/b;
            animal.getName();

        }
        //multiple catch
        //обработка нескольких исключений одним кодом
        //catch(ArithmeticException | NullPointerException exception){
        catch(ArithmeticException exception){
            LOGGER.error("Divide by zero");
            LOGGER.error(exception.getLocalizedMessage());
        }
        catch (NullPointerException exception){
            LOGGER.error("Animal is null");
            LOGGER.error(exception.getLocalizedMessage());
        }
        //Будем ловить все возможные ошибки, которые не прописаны выше
        catch (Exception exception){
            LOGGER.error("An unknown exception occurred");
            LOGGER.error(exception.getLocalizedMessage());
        }
        finally {
            LOGGER.info("a= {}, b = {} Result: {}",a,b,result);
            LOGGER.info("Divide was finished");
        }


    }
}
