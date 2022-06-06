package lesson1;

public class homework_low {
    public static <string> void main(String[] args) {

        //Базовый уровень
        //Задача №1
        //Дано (их менять нельзя)
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';

        //Создать из трех переменных единую строку,

        String myString = hi + world + newLine;
        System.out.println(myString);

        //Привести к правильному виду (Ниже)
        //затроить (Можно вызвать тольку одну команду System.out.print())

        System.out.print((hi.trim() + world.toLowerCase() + newLine).repeat(3));

        //Результат вывода на экран:
        //Hello world!
        //Hello world!
        //Hello world!


        //Задача №2
        //Создать переменные с ростом, весом.
        float growth = 1.91f;
        float weight = 100f;

        //Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран

        float index = weight / (growth * growth);
        String result = String.format("%.1f",index);

        //Пример результата вывода на экран:
        System.out.println(result);

        //21.0

        //Задача №3
        //Создать из массива букв a,b,c,d,e, строку,вывести на экран , поменять в массиве 4 букву по счету на h,
        //и снова создать строку, вывести на экран

        char[] myArray = new char[5];
        myArray[0] = 'a';
        myArray[1] = 'b';
        myArray[2] = 'c';
        myArray[3] = 'd';
        myArray[4] = 'e';
        System.out.println(myArray);

        myArray[3] = 'h';
        System.out.println(myArray);

    }

}
