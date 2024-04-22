package pl.altkom.daty;

import pl.altkom.daty.Date;

public class Test {
    public static void main(String[] args) {
        Date start = new Date(2019,7,23);
        Date end = new Date(2020, 5,19);
        System.out.println(start);
        System.out.println(end);
        //Obiekt musi byc zainicjowany
        Date today;
        today = start;
        System.out.println(today);
        //zmiana wartości za pomoca innej referencji
        //today.year = 2021;
        //today.day = 5;
        System.out.println(today);
        System.out.println(start);
        end=today;
        System.out.println(end);


    }
}
