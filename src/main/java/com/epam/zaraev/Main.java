package com.epam.zaraev;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;





public class Main {
    public static void main(String[] args) {
        // System.out.println("tutorial->https://docs.oracle.com/javase/tutorial/");
        /*Message msg = new Message();
        for (String str : args) {
            System.out.printf("Argument--> %s%n", str);
            msg.printMessage(str);
        }*/
        /*int x;
        /*Взаимодействие с консолью с помощью потока (объекта класса) System.in
        представляет собой один из простейших способов ввода*/
        /*try {
            System.out.println("Введите значение x : ");
            x = System.in.read();
            char c = (char)x;
            System.out.println("Character Code: " + c + " =" + x);
        }
        catch (IOException e) {
            System.err.println("io error " + e);
        }*/
        /**/
        //1. Приветствовать любого пользователя при вводе его имени через командную строку.
        /*System.out.println("Enter name and press <Enter>:");
        Scanner scan = new (System.in);
        String name = scan.next();
        System.out.println("hello, " + name);
        scan.close();
         */
        //2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
        // Помним, что нумерация массива начинается с нуля
        /* System.out.printf("length--> %s%n",args.length);
        for (int i = args.length; i > 0; i--) {
            System.out.printf("Argument %s --> %s%n",i, args[i-1]);
        }*/


        /*3. Вывести заданное количество случайных чисел с переходом и без перехода
        на новую строку.*/
        /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of random numbers and press <Enter>:");
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("amount of random numbers: " + number);
            String str = "";
            for (int i = 0; i < number; i++) {
                Double dbl = Math.random();
                System.out.printf("random numbers --> %s%n",dbl);
                str = str + "" +  dbl;
            }
            System.out.printf(str);
        } else {
            System.out.println("it's not a number!");
        }
        sc.close()*/

        /*4. Ввести пароль из командной строки и сравнить его со строкой-образцом.*/
        /*String SAMPLE = "SAMPLE";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password and press <Enter>:");
        if (sc.hasNext()) {
            String str = sc.next();
            System.out.println("Password entered: " + str);
            System.out.println("Comparison of values: " + str.equals(SAMPLE));
            System.out.println("Comparison of references: " + (str == SAMPLE));
            str = SAMPLE;
            System.out.println("Comparison of references: " + (str == SAMPLE));
        }
        sc.close();*/
        /*5. Ввести целые числа как аргументы командной строки, подсчитать их суммы и произведения. Вывести результат на консоль.*/

        /*int amount = 0;
        int numberProduct = 1;
        for (int i = 0; i < args.length; i++) {
            if (args[i].matches("[-+]?\\d+") ) {
                 System.out.printf("argument--> %s%n",args[i]);
                 amount = amount + Integer.parseInt(args[i]);
                 numberProduct = numberProduct * Integer.parseInt(args[i]);
            } else {
                System.out.println("This is not a number: " + args[i]);
            }
        }
        System.out.printf("amount--> %s%n",amount);
        System.out.printf("numberProduct--> %s%n",numberProduct);*/
        /*6. Вывести фамилию разработчика, дату и время получения задания, а также
        дату и время сдачи задания.*/
        /*DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");


        String timeOfReceivingTheTask = LocalDateTime.parse("2025-04-15 13:35",dtf ).toString();
        String completionTime = dtf.format( LocalDateTime.now() );
        System.out.println("FIO X X X \n" + "timeOfReceivingTheTask: " + timeOfReceivingTheTask + "\ncompletionTime: " + completionTime);
         */
        /*Вариант B
        Ввести с консоли n целых чисел. На консоль вывести:
        1. Четные и нечетные числа.
        2. Наибольшее и наименьшее число.
        3. Числа, которые делятся на 3 или на 9.
        4. Числа, которые делятся на 5 и на 7.
        5. Все трехзначные числа, в десятичной записи которых нет одинаковых
        цифр.
        6. Простые числа.
        7. Отсортированные числа в порядке возрастания и убывания.
        8. Числа в порядке убывания частоты встречаемости чисел.
        9. «Счастливые» числа.
        10. Числа-палиндромы, значения которых в прямом и обратном порядке совпа-
                дают.
        11. Элементы, которые равны полусумме соседних элементов
*/

      /*  String evenNumbers = ""; //четные числа
        String notEvenNumbers = "";  //нечетные числа
        String maximumNumber =  "";
        String minimumNumber =  "";
        Integer maxX = null;
        Integer minX = null;
        for (int i = 0; i < args.length; i++) {
            if (args[i].matches("[-+]?\\d+") ) {
                int x = Integer.parseInt(args[i]);
                if (x%2==0) {
                    evenNumbers = evenNumbers + ' ' + x ;
                } else {
                    notEvenNumbers = notEvenNumbers + ' ' + x ;
                }

                if (maxX == null) {
                    maxX = x;
                }
                if (minX == null) {
                    minX = x;
                }

                if (x > maxX) {
                    maxX = x;
                }

                if (x < minX) {
                    minX = x;
                }
            } else {
                System.out.println("This is not a number: " + args[i]);
            }
        }
        System.out.println("evenNumbers: " + evenNumbers);
        System.out.println("notEvenNumbers: " + notEvenNumbers);
        System.out.println("maxX: " + maxX);
        System.out.println("minX: " + minX);

*/



    }
}


