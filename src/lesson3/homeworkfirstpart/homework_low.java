package lesson3.homeworkfirstpart;

import javax.swing.*;
import java.util.Arrays;

public class homework_low {

    // Домашка
    // Базовый уровень

    public static void main(String[] args) {
        // Задание №1 - Написать цикл, который выводит через пробел 100 чисел с приставкой "a".
        // Ожидаемый результат: 1а 2а 3а .. 100а
        System.out.println("1 задание");
        for (int i = 1; i < 101; i++) {
            System.out.print(i + "a" + " ");
        }

        // Новая строка
        System.out.println("");

        // Задание №2
        // Дано:
        System.out.println("2 задание");
        int ageChildren = 10;

        // Задача: Написать условную конструкцию, которая в зависимости от возраста ребенка, отправляет его в учебное заведение
        // если ребенку до 6 лет то в сад, если до 11 лет в младшую школу, если до 17 лет в среднюю школу, иначе в университет
        // Отправляет - имеется в виду, печатает на экран: "пошел с сад", "пошел в младшую школу" и т.д.
        // Проверьте работоспособность условий, через изменение значения переменной.

        if (ageChildren < 6) {
            System.out.println("Пошёл в сад");
        } else if (ageChildren < 11) {
            System.out.println("Пошёл в младшую школу");
        } else if (ageChildren < 17) {
            System.out.println("Пошёл в старшие классы");
        } else
            System.out.println("Пошёл в Университет");

        // Задание №3
        System.out.println("3 задание");
        // Дано:
        boolean chicken = true;
        boolean vegetables = false;
        boolean sour = true;
        boolean toast = true;
        boolean sausage = true;
        boolean eggs = true;
        // Задача: Повара попросили сделать салат.

        // Если у повара есть все ингредиенты для "Цезаря" (курица, овощи, соус и гренки), то лучше сделать "Цезарь".
        // Если для "Цезаря" ингредиентов не нашлось, то сделать Оливье (овощи, колбаса или курица, яйца).
        // Если и для Оливье не нашлось ингредиентов, то сделать Овощной салат (нужны только овощи).
        // Если ингредиентов нет, то повар объявляет: У меня ничего нет
        // Написать набор условий, приготовления салатов, по приоритету (от Цезаря к овощному). Либо объявить о невозможности сделать салат.
        // Ожидаемый результат: вывод на экран сделанного салата или объявление о том, что ничего нет.
        // Проверьте работоспособность условий, через изменение значения переменных.

        System.out.println("Повар: ");
        if (vegetables == true) {
            if (chicken || sausage == true) {
                if (chicken == true) {
                    if (toast & sour == true) {
                        System.out.println("Цезарь");
                    } else if (eggs == true) {
                        System.out.println("Оливье");
                    } else
                        System.out.println("Овощной салат");

                } else if (eggs == true) {
                    System.out.println("Оливье");
                } else
                    System.out.println("Овощной салат");

            } else
                System.out.println("Овощной салат");
        } else
            System.out.println("У меня ничего нет");

    }


}
