public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("«Установите версию приложения для iOS по ссылке»");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println(" ");
        System.out.println("Задание 2");
        int clientDeviceYear = 2014;
        if (clientDeviceYear >= 2015) {
            if (clientOS == 0) {
                System.out.println("«Установите версию приложения для iOS по ссылке»");
            }
            if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }

        System.out.println(" ");
        System.out.println("Задание 3");
        int year = 0;
        if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 100 == 0) {
            System.out.println(year + "  год не является високосным");
        } else if (year % 4 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println(" ");
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int deliveryTime;
        if (deliveryDistance < 20) {
            deliveryTime = 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            deliveryTime = 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime = 3;
            System.out.println("Потребуется дней: " + deliveryTime);
        }

        System.out.println(" ");
        System.out.println("Задание 5");
        int monthNumber = 15;
        if (monthNumber >= 1 && monthNumber <= 12) {
            switch (monthNumber) {
                case 1:
                    System.out.println("Winter");
                    break;
                case 2:
                    System.out.println("Winter");
                    break;
                case 3:
                    System.out.println("Spring");
                    break;
                case 4:
                    System.out.println("Spring");
                    break;
                case 5:
                    System.out.println("Spring");
                    break;
                case 6:
                    System.out.println("Summer");
                    break;
                case 7:
                    System.out.println("Summer");
                    break;
                case 8:
                    System.out.println("Summer");
                    break;
                case 9:
                    System.out.println("Fall");
                    break;
                case 10:
                    System.out.println("Fall");
                    break;
                case 11:
                    System.out.println("Fall");
                    break;
                case 12:
                    System.out.println("Winter");
            }
        }
    }
}