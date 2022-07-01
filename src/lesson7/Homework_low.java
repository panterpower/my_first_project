package lesson7;

public class Homework_low {
    public static void main(String[] args) {
        //Базовый уровень
        //Задача №1
        //1. Создать два класса, которые умеют летать: самолет и утка. +
        // Атрибут утки: isInjured (ранен),атрибут самолета: countPassengers. +
        //2. Создать интерфейс, который объединяет эти два класса.
        //3. Имплементировать его в двух классах
        //4. Реализовать метод летать:
        // Для утки:
        // Метод летать будет выкидывать ошибку FlyException (создать такой класс), если утка подстрелена,
        // иначе печатать на экран "утка летит"
        // Для самолета:
        // Метод летать будет выкидывать ошибку FlyException, если количество пассажиров меньше нуля.
        // Иначе печать "самолет летит"
        //5. Создать 1 утку не раненую, 1 утку раненую, 1 самолет с 10 пассажирами, 1 самолет с -1 пассажиром.
        //6. Вызвать у них метод летать
        // Перехватить исключения: вывести на экран message ошибки
        // Ожидание:

        Duck healthDuck = new Duck(false);
        Duck injuredDuck = new Duck(true);
        Airplan airplaneFull = new Airplan(10);
        Airplan badAirlane = new Airplan(-1);

        // утка летит
        try {
            healthDuck.Fly();
        } catch (FlyException e) {
            System.out.println(e.getMessage());
        }

        // Ошибка: утка ранена
        try {
            injuredDuck.Fly();
        } catch (FlyException e) {
            System.out.println(e.getMessage());
        }

        // самолет летит
        try {
            airplaneFull.Fly();
        } catch (FlyException e) {
            System.out.println(e.getMessage());
        }

        // Ошибка: пассажиров в самолете меньше 0
        try {
            badAirlane.Fly();
        } catch (FlyException e) {
            System.out.println(e.getMessage());
        }
    }
}

