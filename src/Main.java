import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {
        task();

    }

    public static boolean checkLeapYear(int year) {
        boolean a = true;
        if (year >= 1584 && (year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            a = true;
        } else {
            a = false;
        }
        return a;
    }

    public static void checkAppVersion(int deviceYear, int clientOs) {
        int currentYear = LocalDate.now().getYear();
        if (clientOs == 0 && deviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs == 0 && deviceYear == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOs == 1 && deviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs == 1 && deviceYear == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void checkDeliveryTime(int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется 1 день.");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется 2 дня.");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется 3 дня.");
        } else
            System.out.println("Доставка невозможна.");
    }

    public static void task() {
        System.out.println("\nЗадание 1\n");
        int year = 2024;
        if (checkLeapYear(year)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
        System.out.println("\nЗадание 2\n");
        int clientOs = 0;
        int deviceYear = 2024;
        checkAppVersion(deviceYear, clientOs);

        System.out.println("\nЗадание 3\n");
        int deliveryDistance = 95;
        checkDeliveryTime(deliveryDistance);

    }
}


