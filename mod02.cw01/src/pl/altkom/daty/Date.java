package pl.altkom.daty;

import java.util.Scanner;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    private Date(String date,String separator){
        Scanner sc = new Scanner(date);
        sc.useDelimiter(separator);
        this.year = sc.nextInt();
        this.month = sc.nextInt();
        this.day = sc.nextInt();
        sc.close();
    }

    public static Date fromString(String date, String separator) {
        return new Date(date, separator);
    }

    @Override
    public String toString() {
       // return year + "-" + month +"-"+day;

        //lepsze rozwiązanie z miesiacem zerem jeśli nie ma 2 cyfr
        return String.format("%4d-%02d-%02d",year,month,day);
    }
    public void printInfo() {
        System.out.println(String.format("%4d-%02d-%02d",year,month,day));
    }

}
