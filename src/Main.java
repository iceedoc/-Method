import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        printTask(1);
        int year = 2010;
        checkLeapYear(year);
        checkLeapYear(2012);

        suggestAppVersion(0, 2010);
        suggestAppVersion(1, 2015);
        suggestAppVersion(0, 2028);


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
        String osName;
        if (osType == 0) {
            osName = "iOS";
        } else if (osType == 1) {
            osName = "Android";
        } else {
            System.out.println("Нет данных.");
            return;
        }
        if (deviceYear < currentYear) {
            if (deviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для " + osName + " по ссылке.");
            } else {
                System.out.println("Установите обычную версию приложения для " + osName + " по ссылке.");
            }
        } else {
            System.out.println("Нет данных.");
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

