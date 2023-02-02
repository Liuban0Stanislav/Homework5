public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    private static void task1() {
        System.out.println("Задача 1");

        byte clientOS = 0;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Ввод некорректен. Введите 0 — iOS, 1 — Android");
        }
        System.out.println();
    }

    private static void task2() {
        System.out.println("Задача 2");

        byte clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();
    }

    private static void task3() {
        System.out.println("Задача 3");

        int year = 2140;
        int proverka1 = year % 4;
        int proverka2 = year % 100;
        int proverka3 = year % 400;

        if (proverka1 == 0 || proverka3 == 0) {
            System.out.println("Год високосный");
        } else if (proverka2 == 0) {
            System.out.println("Год не високосный");
        } else {
            System.out.println("Год не високосный");
        }
        System.out.println();
    }

    private static void task4() {
        System.out.println("Задача 4");

        int deliveryDistance = 120;
        int deliveryDay = 0;

        if (deliveryDistance <= 20) {
            deliveryDay = 1;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDay = 2;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100 ) {
            deliveryDay = 3;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }
        System.out.println();
    }

    private static void task5() {
        System.out.println("Задача 5");

        int monthNumber = 5;

        if (monthNumber < 13) {
            switch (monthNumber){
                case 1:
                    System.out.println("зима");
                    break;
                case 2:
                    System.out.println("зима");
                    break;
                case 3:
                    System.out.println("весна");
                    break;
                case 4:
                    System.out.println("весна");
                    break;
                case 5:
                    System.out.println("весна");
                    break;
                case 6:
                    System.out.println("лето");
                    break;
                case 7:
                    System.out.println("лето");
                    break;
                case 8:
                    System.out.println("лето");
                    break;
                case 9:
                    System.out.println("осень");
                    break;
                case 10:
                    System.out.println("осень");
                    break;
                case 11:
                    System.out.println("осень");
                    break;
                case 12:
                    System.out.println("зима");
                    break;
            }
        } else {
            System.out.println("введите число от 1 - 12");
        }
        System.out.println();
    }
}