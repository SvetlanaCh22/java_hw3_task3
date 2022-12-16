// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

// Чубченко Светлана

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class main {

    public static void main(String[] args) {
        // создаем ArrayList
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 300, 345, 676, 826, 501));
        // выводим минимальное значение
        System.out.println("Min: " + Collections.min(list));
        // выводим максимальное значение
        System.out.println("Max: " + Collections.max(list));
        // выводим среднеарифметическое значение
        // (как я поняла из чата - нужно именно это)
        System.out.println("Average: " + average(list));
    }

    static double average(ArrayList<Integer> list) {
        double sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum / list.size();
    }
}
