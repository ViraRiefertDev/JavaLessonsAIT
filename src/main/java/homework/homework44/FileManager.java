package homework.homework44;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileManager<T> {
    private static final Logger LOGGER = LoggerFactory.getLogger(FileManager.class);
    private List<T> objects;
    private Class<T> type;

    public FileManager(Class<T> type) {
        this.objects = new ArrayList<>();
        this.type = type;
    }

    //метод считывает информацию с файла и преобразовывает ее в Лист объектов заданного типа
    public List<T> ArrayOfStringsInListOfObjects(File file) {
        List<T> listOfObjects = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] dataArray = line.split(",");
                /**
                 *я хотела использовать instansOf чтоб сравнить типы T и Country, но  информация о типах стирается во время
                 *компиляции из-за механизма, известного как стирание типов (type erasure). Поэтому создала переменную
                 * private Class<T> type  и передала в констуктор класс T.
                 */
                if (type.equals(Country.class)) {
                    listOfObjects.add((T) new Country(dataArray[0], dataArray[1], Integer.parseInt(dataArray[2]), Integer.parseInt(dataArray[3])));
                } else if (type.equals(User.class)) {
                    UserRole role;
                    if(dataArray[2].equalsIgnoreCase("admin")){
                        role = UserRole.ADMIN;
                    }else{
                        role = UserRole.USER;
                    }
                    listOfObjects.add((T) new User(dataArray[0], dataArray[1], role));
                } else {
                    System.out.println("No such type exist!");
                }

            }

        } catch (FileNotFoundException exception) {
            LOGGER.error(exception.getMessage());

        } catch (NumberFormatException exception) {
            LOGGER.error(exception.getMessage());

        } catch (IOException exception) {
            LOGGER.error(exception.getMessage());
        }
        return listOfObjects;
    }

    //метод берет лист объектов заданного типа и преобазовывает его в массив строк и сохраняет в соответсвующий файл

    public void ListOfObjectsInArrayOfStringsAndSafeInFile(List<T> listOfObjectsToSafe, File file) {
        //append чтобы очистить файл от старых записей, потом изменяется на true
        boolean append = false;
        for (T t : listOfObjectsToSafe) {
            String data = "";
            if (type.equals(Country.class)) {
                Country country = (Country) t;
                data = country.getCountryName() + "," + country.getCapital() + "," + country.getPopulation() + "," + country.getPopulation();
            } else if (type.equals(User.class)) {
                User user = (User) t;
                data = user.getUserName() + "," + user.getPassword() + "," + user.getRole();
            }
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, append))) {
                append = true;
                bufferedWriter.write(data);
                bufferedWriter.newLine();
            } catch (FileNotFoundException exception) {
                LOGGER.error(exception.getMessage());

            } catch (IOException exception) {
                LOGGER.error(exception.getMessage());
            }

        }

    }

}
