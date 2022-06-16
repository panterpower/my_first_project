package lesson3;

public class homework_low_4 {

    public static void main(String[] args) {

        // Задание №4
        // Создать два класса, которые описывают какое либо животное (имеют два атрибута).
        // Написать к ним конструктор, сеттеры, геттеры.


        Animal cat = new Animal("Barsik","cat");
        Animal dog = new Animal("Sharik", "dog");

        String catName = cat.getInfo();
        String dogName = dog.getInfo();

        System.out.println(catName);
        System.out.println(dogName);

        // Не понял задание про два класса, поэтому написал отдельный класс для возраста с сеттером и геттером

        Age ageToday = new Age(2);

        ageToday.setAnimalAge(3);
        String newAge = ageToday.getAge();
        System.out.println(newAge);


    }


}
