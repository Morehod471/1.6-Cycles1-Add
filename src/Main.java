public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int a = 1000;
        for (int i = 0; i < 5; i++) {
            System.out.printf(a + " ");
            a = a + 4;

        }
        System.out.println(" ");
    }

    private static void task2() {
        System.out.println("Задача 2");
        int number = 1;
        int step = 2;
        int count = 10;
        for (int i = 0; i < count; i++) {
            System.out.printf(number + " ");
            number += step;
        }
        System.out.println();
    }

    private static void task3() {
        System.out.println("Задача 3");
        int number = 90;
        int step = 5;
        while (number >= 0) {
            System.out.printf(number + " ");
            number -= step;
        }
        System.out.println();
    }

    private static void task4() {
        System.out.println("Задача 4");
        int number = 2;
        int step = 2;
        int count = 10;
        for (int i = 0; i < count; i++) {
            System.out.printf(number + " ");
            number *= step;
        }
        System.out.println();
    }

    private static void task5() {
        System.out.println("Задача 5");
        int currentSaturday = 1;
        int daysInMonth = 31;
        while (currentSaturday <= daysInMonth) {
            int currentSunday = currentSaturday + 1;
            System.out.printf(currentSaturday + " " + currentSunday + " ");
            currentSaturday = currentSunday + 6;
        }
        System.out.println();
    }

    private static void task6() {
        System.out.println("Задача 6");
        int number = 1;
        int count = 0;
        int maxNumber = 999999;
        for (int i = 1; i <= maxNumber; i++) {
            if (number % 1000000 / 100000 + number % 100000 / 10000 + number % 10000 / 1000 == number % 1000 / 100 + number % 100 / 10 + number % 10) {
                count = count + 1;
            }
            number = number + 1;
        }
        System.out.println(count);
    }

    private static void task7() {
        System.out.println("Задача 6 Версия 2");
        int result = 0;
        int first = 1;
        int last = 999_999;
        for (int current = first; current <= last; current++) {
            int firstPart = current / 1000;
            int lastPart = current % 1000;
            if (firstPart == 0 || lastPart == 0) {
                continue;
            }
            int firstSum = calculateSumOfDigits(firstPart);
            int lastSum = calculateSumOfDigits(lastPart);
            if (firstSum == lastSum) {
                result++;
            }
        }
        System.out.println(result);
    }

    private static int calculateSumOfDigits(int num) {
        int result = 0;

        while (num > 0) {
            result += num % 10;
            num /= 10;
        }

        return result;
    }

}
