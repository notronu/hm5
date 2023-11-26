// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int clientOs = 1;
        if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        System.out.println("Задача 2");
        int clientOc = 0;
        int clientDeviceYear = 2015;
        if (clientOc == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOc == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
            if (clientOc == 0 && clientDeviceYear > 2015);
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOc == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        System.out.println("Задача 3");
        int year = 2024;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("год является високосным");
        } else {
            System.out.println("год не является високосным");
        }

        System.out.println("Задача 4");
        int daysDelivery = 1;
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + daysDelivery);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней " + (daysDelivery + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней " + (daysDelivery + 2));
        } else {
            System.out.println("Доставки нет");
        }

        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 3:
                System.out.println("Зима");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Весна");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Лето");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }




    }
}