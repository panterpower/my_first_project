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

//        Car car1 = new Car();
//        Car cat3 = new Cat();
//        Car dog2 = new Dog();
//        Car dog3 = new Dog();


//        Car[] ladaCar = {lada1, lada2};
//        for (Car car : ladaCar) {
//            car.move();
//            car.stop();
//            car.turnOnLight();
//            if (car instanceof Lada) {
//                Car myLada = (Lada) car;
////                myLada.broke;
//            }
//        }


        Lada lada1 = new Lada();
        Toyota toyota1 = new Toyota();

        lada1.move();
        lada1.broke();
        lada1.stop();
        lada1.turnOnLight();

        toyota1.music();


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

        Financial_record worker = new Financial_record(500, 300);
        String incomesWorker = worker.getComes();

//        System.out.println(incomesWorker);
        String workerIncomes = String.valueOf(worker.getIncomes());
        String workerOutcomes = String.valueOf(worker.outIncomes);

        FileWriter fileWriter = new FileWriter("resource/report.txt", true);
        fileWriter.write(workerIncomes);
        fileWriter.write("\n");
        fileWriter.write(workerOutcomes);
        fileWriter.write("\n");
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

        //Экспертный уровень
        // Дано: папка, внутри которой находятся файлы, следующего именования - report_01_2012.txt, где 01 - месяц, 2012 - год
        // Внутри файла следующий формат:
        // pyterochka;122300.20;100312.10;20/01/2012
        // pyterochka;299922.00;323333.02;21/01/2012
        // perekrestok;9920.20;28200.01;21/01/2012
        // Где pyterochka - название магазина; 122300.20 - доход; 100312.10 - расход, 20/01/2012 - дата операции

        // Задача №1
        // Необходимо составить отчет о итоговой прибыли за каждый месяц по магазину pyterochka
        // Формат ожидаемого результат:
        // Прибыль по магазину pyterochka по месяцам
        // 01.2012: 20000.00
        // 02.2012: -100332.00
        // и тд


        // Задача №2
        // Необходим составить отчет о расходах всех магазинов за весь период по магазинам (т.е. прочитать все файлы внутри папки)
        // Формат ожидаемого результат:
        // Расходы pyterochka за весь период: 20032220.00
        // Расходы perekrestok за весь период: 1734220.00
        // .. и тд
    }


}
