public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();

        task1_1();
        task1_2();
        task1_3();
        task1_4();
        task2_1();
        task2_2();
        task2_3();
        task3_1();
        task3_2();
    }

    public static void task1_1 () {
        for (int i = 1; i <= 10; i++) {
        System.out.println("Итерация " + i);

    }
        System.out.println();

}
    public static void task1_2 () {
        for (int i = 10; i >= 1; i--) {
            System.out.println("Итерация " + i);
        }
        System.out.println();
    }
    public static void task1_3 () {
        for (int i = 0; i < 17; i += 2) {
            System.out.println("Итерация " + i);
        }
        System.out.println();
    }
    public static void task1_4 () {
        for (int i = 10; i >= -10; i--) {
            System.out.println("Итерация " + i);
        }
        System.out.println();
    }
    public static void task2_1 () {
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println();
    }
    public static void task2_2 () {
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
        System.out.println();
    }
    public static void task2_3 () {
         for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
         System.out.println();
    }
    public static void task3_1 () {
        int accumulation = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + accumulation;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();
    }
    public static void task3_2 () {
        int accumulation = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + total / 100;
            total = total + accumulation;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();
    }
}
