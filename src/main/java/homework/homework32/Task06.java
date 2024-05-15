package homework.homework32;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task06 {
    //Сравнение массивов: Напишите тест, который проверяет метод, возвращающий массив после его сортировки.
    // Используйте assertArrayEquals для сравнения ожидаемого и фактического массива.
    public int[] arraySort(int[] array){
        Arrays.sort(array);
       return array;
    }

}
