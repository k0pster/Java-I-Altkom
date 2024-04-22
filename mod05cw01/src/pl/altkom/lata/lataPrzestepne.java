package pl.altkom.lata;

public class lataPrzestepne {
//    public static boolean isLeapYear(int year) {
//        if (year % 400 == 0) return true;
//        if (year % 100 == 0) return false;
//        return year % 4 == 0;
//    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || year % 100 != 0 && year% 4 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2000)); //true
        System.out.println(isLeapYear(2100)); //false
        System.out.println(isLeapYear(2024)); //true
        System.out.println(isLeapYear(2025)); //false

    }
}
