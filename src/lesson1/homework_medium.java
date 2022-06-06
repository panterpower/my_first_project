package lesson1;

public class homework_medium {
    public static <string> void main(String[] args) {

        //Продвинутый уровень
        //Задача №1
        //Произвести преобразование "234" в число типа int и прибавить к этому числу длину строки "some_text"

        String myTextNumber = "234";
        int myIntNumber = Integer.parseInt(myTextNumber);
        int lenght = myTextNumber.length();

        System.out.println(myIntNumber + lenght);

        //Задача №2
        //Посчитать (a+b)^2 = ?, при a=3, b=5
        int a = 3;
        int b = 5;

//      Убрал в println
//      int result = (int) Math.pow(a+b,2);

        System.out.println((int) Math.pow(a+b,2));


        //Задача №3
        //Создать два массив чисел:
        // 1,2,5,7,10
        // 2,3,2,17,15
        // Создать массив чисел, в котором будут: все числа из этих двух массивов,
        // и результат умножения чисел с одинаковым порядковым номером
        //
        //Ожидаемый результат:
        //1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
        //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
        //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)

        сhar[] myArray1 = new char[5];
//        сhar[] myArray2 = new char[5];

        myArray1[0] = '1';
        myArray1[1] = '2';
        myArray1[2] = '5';
        myArray1[3] = '7';
        myArray1[4] = "10";

//        myArray2[0] = '2';
//        myArray2[1] = '3';
//        myArray2[2] = '2';
//        myArray2[3] = '17';
//        myArray2[4] = '15';


        System.out.println(myArray1);


//        myArray[3] = 'h';
//        System.out.println(myArray);

        //Задача №4
        //В слове "Hello world!" заменить все l на r, сделать все буквы заглавными, выбрать первые 8 символов



//        //Базовый уровень
//        //Задача №1
//        //Дано (их менять нельзя)
//        String hi = "                Hello ";
//        String world = " WoRld!";
//        char newLine = '\n';
//
//        //Создать из трех переменных единую строку,
//
//        String myString = hi + world + newLine;
//        System.out.println(myString);
//
//        //Привести к правильному виду (Ниже)
//        //затроить (Можно вызвать тольку одну команду System.out.print())
//
//        System.out.print((hi.trim() + world.toLowerCase() + newLine).repeat(3));
//
//        //Результат вывода на экран:
//        //Hello world!
//        //Hello world!
//        //Hello world!
//
//
//        //Задача №2
//        //Создать переменные с ростом, весом.
//        float growth = 1.91f;
//        float weight = 100f;
//
//        //Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
//
//        float index = weight / (growth * growth);
//        String result = String.format("%.1f",index);
//
//        //Пример результата вывода на экран:
//        System.out.println(result);
//
//        //21.0
//
//        //Задача №3
//        //Создать из массива букв a,b,c,d,e, строку,вывести на экран , поменять в массиве 4 букву по счету на h,
//        //и снова создать строку, вывести на экран
//


    }

}
