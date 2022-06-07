package lesson1;

import java.util.Arrays;

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


        int[] myArray1 = new int[5];
        myArray1[0] = 1;
        myArray1[1] = 2;
        myArray1[2] = 5;
        myArray1[3] = 7;
        myArray1[4] = 10;

        int[] myArray2 = new int[5];
        myArray2[0] = 2;
        myArray2[1] = 3;
        myArray2[2] = 2;
        myArray2[3] = 17;
        myArray2[4] = 15;

        // Здесь знаний не хватает и сделал тупо, но эффективно
        int[] myArrayConglutination = new int[15];
        myArrayConglutination[0] = myArray1[0];
        myArrayConglutination[1] = myArray1[1];
        myArrayConglutination[2] = myArray1[2];
        myArrayConglutination[3] = myArray1[3];
        myArrayConglutination[4] = myArray1[4];
        myArrayConglutination[5] = myArray2[0];
        myArrayConglutination[6] = myArray2[1];
        myArrayConglutination[7] = myArray2[2];
        myArrayConglutination[8] = myArray2[3];
        myArrayConglutination[9] = myArray2[4];
        myArrayConglutination[10] = myArray1[0] * myArray2[0];
        myArrayConglutination[11] = myArray1[1] * myArray2[1];
        myArrayConglutination[12] = myArray1[2] * myArray2[2];
        myArrayConglutination[13] = myArray1[3] * myArray2[3];
        myArrayConglutination[14] = myArray1[4] * myArray2[4];

        System.out.println(Arrays.toString(myArrayConglutination));

        //Ожидаемый результат:
        //1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
        //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
        //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)

        //Задача №4
        //В слове "Hello world!" заменить все l на r, сделать все буквы заглавными, выбрать первые 8 символов
        String wordHello = "Hello world!";
        String replaced = wordHello.replaceAll("l", "r");
        String big = replaced.toUpperCase();
        String firstEight = big.substring(0,8);

        System.out.println(firstEight);

    }

}
