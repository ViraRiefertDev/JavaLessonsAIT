package lessons.exceptionsHandling;

import lessons.lesson27.Animal;
import lessons.logging.UserInteraction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ErrorCalculator {
    private static final Logger LOGGER = LoggerFactory.getLogger(ErrorCalculator.class);

    static Animal animal = null;
    public static void main(String[] args) {
        divide(10,10);
       // badMehtod();


    }

    static void badMehtod(){
        LOGGER.info("I'm bad method");
        badMehtod();
    }
    public static void divide(int a, int b){
        int result = 0;
        try{
            result = a/b;
            //animal.getName();

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
