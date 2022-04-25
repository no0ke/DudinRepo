package lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class One {
    static void swapObj(Object[] array, int firstIndex, int secondIndex) {
        Object oneVal = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = oneVal;
    }
    static <T> ArrayList<T> convertToList(T[] array) {
        return new ArrayList<T>(Arrays.asList(array));
    }
    }
