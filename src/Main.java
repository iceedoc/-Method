import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        printTask(1);
        int year = 2010;
        checkLeapYear(year);
        checkLeapYear(2012);

        printTask(2);
        suggestAppVersion(1, 2000);
        suggestAppVersion(0, 2010);
        suggestAppVersion(-1, 2025);
        suggestAppVersion(0, 2030);

        printTask(3);
        int calculateDeliveryDays = calculateDeliveryDays(40);
        System.out.println(calculateDeliveryDays);

    }

    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void suggestAppVersion(int osType, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (osType == 0 && deviceYear < currentYear) {
            System.out.println("Установить облегченную версию приложения для IOS по ссылке");
        } else if (osType == 0 && deviceYear == currentYear) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (osType == 1 && deviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (osType == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Нет таких данных");
        }
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }


    public static void printTask(int number) {
        System.out.println("\nЗадача" + number);
    }
}

