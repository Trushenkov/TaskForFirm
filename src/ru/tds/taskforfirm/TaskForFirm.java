package ru.tds.taskforfirm;

import java.util.Arrays;
import java.util.Collections;

/**
 * Класс, в котором реализована программа с карточки "Разминка".
 *
 * @author Трушенков Дмитрий 15ИТ18
 */
public class TaskForFirm {

    public static void main(String[] args) {

        int time = 3;
        Integer[] arrayOFOrders = {2, 5, 8, 6, 10};

        Arrays.sort(arrayOFOrders, Collections.reverseOrder());

        System.out.println("Количество единиц времени = " + time + "\nМаксимальная заработанная сумма денег, " +
        "которую можно получить в пределах доступного времени = " + maxMoneyForTime(time, arrayOFOrders));
    }

    /**
     * Метод для нахождения максимальной заработанной суммы денег,
     * которую можно получить в пределах доступного времени за выполнение
     * фирмой самых ценных заказов из предложенных.
     *
     * @param time            время, которое имеется в распоряжении фирмы.
     * @param arrayWithOrders массив, который содержит значения стоимости заказов.
     * @return максимальная заработанная сумма денег, которую можно получить в пределах доступного времени.
     */
    private static int maxMoneyForTime(int time, Integer[] arrayWithOrders) {

        int result = 0;

        for (int i = 0; i < time; i++) {
            result += arrayWithOrders[i];
        }

        return result;
    }

}

