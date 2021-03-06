package lesson5;

import java.io.*;

public class Homework3 {
    public static void main(String[] args) throws IOException {
        //Базовый уровень (для зачета нужно сделать хотя бы 2 из 3)
        //Задача №1
        //Дано: у нас есть две модели машин - жигули и toyota. Каждая из этих машин умеет: начинать движение,
        //останавливаться, включать фары. У жигули есть особенность: она ломается. У Toyota особенность: включает музыку
        //Необходимо:
        // 1.Создать абстрактный класс, который будет описывать общие действия этих машин (методы будут не абстрактные)
        // 2.Создать два класса, которые будут наследоваться от абстрактного класса, и реализовывать особенности этих машин
        // Методы должны просто печатать на экран действия машин (начал движение, включил музыку и тд.)

        // 2. Создать 20 тойот, 20 жигулей с помощью CarFactory, положить их в один массив.
        // 3. Пройтись по массиву, проверить к какому классу принадлежит машина, привести тип к классу машины
        // и вызвать характерные для нее методы.

        Lada lada1 = new Lada();
        Toyota toyota1 = new Toyota();

//        Закоментил легкое задание
        lada1.move();
        lada1.broke();
        lada1.stop();
        lada1.turnOnLight();
        toyota1.music();

//        // Массив для перебора 20
//
//        String myArray[] = new String[20];
//        for (String carArray : myArray) {
//
//            lada1.createLada();
//            lada1.stop();
//            lada1.move();
//            lada1.turnOnLight();
//            lada1.broke();
//            toyota1.createToyota();
//            toyota1.music();
//        }

        //Задача №2
        //Необходимо:
        // 1. Создать папку resource, пометить ее как папку Resourсe root.
        // 2. Создать в ней файл "my_first_file.txt". На первой строке написать: "Моя бабушка", на второй: "читает газету жизнь"
        // 3. Прочитать файл, и вывести на экран все слова файла в одну строку
        // Ожидаемый результат: "Моя бабушка читает газету жизнь"

        // Сделал без цикла, т.к усложняется всё(

        BufferedReader bufferedReader = new BufferedReader
                (new FileReader("D:\\repos\\my_first_project\\resource\\my_first_file.txt"));
        String string1 = bufferedReader.readLine();
        string1.substring(0, 11);
        String string2 = bufferedReader.readLine();
        System.out.println(string1 + " " + string2);

//                Не работает!
//        FileReader fileReader = new FileReader("resource/my_first_file.txt");
//        String result = "";
//        while (fileReader.ready()) {
//            int read = fileReader.read();
//            result += (char) read;
//
//        }
//        fileReader.close();
//        System.out.println(result.replace('\n', ' '));

        //Задача №3
        //Необходимо:
        // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
        // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
        // 3. Создать объект этого класса прямо здесь (class Homework3, метод main), с доходами 500, расходами 300
        // 4. Записать в файл "report.txt" данные из объекта класса.C
        // Ожидаемый результат: в файле report.txt - одна строка: доходы = 500, расходы 300

        FinancialRecord worker = new FinancialRecord(500, 300);
        String incomesWorker = worker.getComes();

//        System.out.println(incomesWorker);
        String workerIncomes = String.valueOf(worker.getIncomes());
        String workerOutcomes = String.valueOf(worker.outIncomes);

        FileWriter fileWriter = new FileWriter("resource/report.txt", true);
        fileWriter.write("доходы = " + workerIncomes + " " + "расходы = " + workerOutcomes + "\n");
        fileWriter.close();


        //Продвинутый уровень
        //Задача №1
        // Сделать задачу №1 из базовой.
        // 1. Создать класс CarFactory, у которого есть два статических методы: создать жигули, создать toyota.
        // 2. Создать 20 тойот, 20 жигулей с помощью CarFactory, положить их в один массив.
        // 3. Пройтись по массиву, проверить к какому классу принадлежит машина, привести тип к классу машины
        // и вызвать характерные для нее методы.

        //Задача №2
        // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
        // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
        // 3. Создать 10 отчетов, с разными доходами и расходами (Смотри класс new Random(1).nextInt() )
        // 4. Записать в файл "report.txt" все данные из отчетов.
        // 5. Прочитать файл report.txt, просуммировать все доходы и вывести на экран, тоже самое с расходами
        // Ожидаемый результат: общие доходы - (какое то число), общие расходы - (какое то число)

    }


}
