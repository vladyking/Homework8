package Task;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        System.out.println("Ответ на задание №1:");
        int year = 2022;
        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " год является високосным годом\n");
        } else if (year % 4 == 0 && year % 100 > 0) {
            System.out.println(year + " год является високосным годом\n");
        } else if (year % 100 == 0) {
            System.out.println(year + " год НЕ является високосным годом\n");
        } else {
            System.out.println(year + " год НЕ является високосным годом\n");
        }
    }

    private static void task2() {
        System.out.println("Ответ на задание №2:");
        int clientOS = 1; //0 - iOS, 1- Android
        int clientDeviceYear = 2018; //clientDeviceYear >= 2015 - new smartfone

        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке\n");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке\n");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке\n");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке\n");
        }
    }

    private static void task3() {
        System.out.println("Ответ на задание №3:");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        int deliveryStartInterval = 20;
        int deliveryInterval = 40;
        if (deliveryDistance <= deliveryStartInterval) {
            deliveryDays = 1;
        } else {
            deliveryDays = deliveryDays + (int) Math.ceil((deliveryDistance - deliveryStartInterval) / (double) deliveryInterval);
        }
        System.out.println("Потребуется для доставки дней: " + deliveryDays);
    }
}