//5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean
//(високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого
//100-го, при этом каждый 400-й – високосный.
//1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1,
//0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
//2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
//значениями 1 2 3 4 5 6 7 8 … 100;
//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
//умножить на 2;
//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов
//одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
//(можно только одну из диагоналей, если обе сложно). Определить элементы одной из
//диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0],
//[1][1], [2][2], …, [n][n];
//5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий
//одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

package org.example;

public class mainApp {

    public static void main(String[] args) {
        System.out.println("Задание №5* из второго урока");
        yearCheck();
        System.out.println(yearCheck());
        System.out.println();
        System.out.println("Задание №1");
        reverseNumbers();
        System.out.println();
        System.out.println("Задание №2");
        massive();
        System.out.println();
        System.out.println("Задание №3");
        doubleLessSix();
        System.out.println();
        System.out.println("Задание №4");
        fillDiagonal();
        System.out.println();
        System.out.println("Задание №5");
        printArrayInConsole(returnArrLen(10, 5));
        System.out.println();
        System.out.println("Задание №6");


    }

    public static boolean yearCheck() {
        int year = 2024;
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

    public static void reverseNumbers() {
        int[] arr1 = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1) {
                System.out.print(0);
            } else {
                System.out.print(1);
            }
        }
    }

    public static void massive() {
        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
            System.out.print(arr2[i] + " ");
        }
    }

    public static void doubleLessSix() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6)
                arr3[i] *= 2;
            {
                System.out.print(arr3[i] + " ");
            }
        }
    }

    public static void fillDiagonal() {
        int[][] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - i - 1] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[] returnArrLen(int len, int initialValue) {
        int arr5[] = new int[len];
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = initialValue;
        }
        return arr5;
    }
    public static void printArrayInConsole(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }

}