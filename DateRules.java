package universitystudy;

public class DateRules {
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        return false;
    }

    public static int daysInMonth(int year, int month) {
        if (month >= 1 && month <= 12) {
            if (isLeapYear(year)) {
                if (month <= 7 && month % 2 == 1) {
                    return 31;
                } else if (month <= 7 && month % 2 == 0 && month != 2) {
                    return 30;
                } else if (month >= 7 && month % 2 == 1) {
                    return 30;
                } else if (month >= 7 && month % 2 == 0) {
                    return 31;
                } else
                    return 29;
            } else if (!isLeapYear(year)) {
                if (month <= 7 && month % 2 == 1) {
                    return 31;
                } else if (month <= 7 && month % 2 == 0 && month != 2) {
                    return 30;
                } else if (month >= 7 && month % 2 == 1) {
                    return 30;
                } else if (month >= 7 && month % 2 == 0) {
                    return 31;
                } else
                    return 28;
            } else
                return 0;
        } else
            return 0;
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year >= 1900 && year <= 2100) {
            if (day <= daysInMonth(year, month)) {
                return true;
            } else
                return false;
        } else
            return false;

    }

    public static int dayOfYear(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            int days = 0;
            for (int i = 1; i < month; i++) {
                days += daysInMonth(year, i);
            }
            days = days + day;
            return days;
        } else
            return -1;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(1900));
        System.out.println(daysInMonth(2026, 21));
        System.out.println(isValidDate(2026, 5, 32));
        System.out.println(dayOfYear(2024, 3, 32));
    }
}
