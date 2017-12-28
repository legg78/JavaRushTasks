package com.javarush.task.task01.task0140;



import java.util.Scanner;

import static java.lang.Math.pow;

/*
Выводим квадрат числа
*/

public class Solution {
    public static void main(String[] args) {
        int a;
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        a=scanner.nextInt();
        System.out.println(pow(a,2));
    }
}
