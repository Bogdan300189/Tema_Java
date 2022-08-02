package org.fasttrackit.course4.statement;

import org.fasttrackit.course4.CarTypeEnum;

import java.time.DayOfWeek;

public class SwitchStatement {
    public static void main(String[] args) {
        //printSomeThingsDependingOnCarTypeWithIfElse(CarTypeEnum.SUV);
        //printSomeThingsDependingOnCarTypeWithIfElse(CarTypeEnum.HATCHBACK);
        //printSomeThingsDependingOnCarTypeWithIfElse(CarTypeEnum.BREAK);
        //printSomeThingsDependingOnCarTypeWithIfElse(CarTypeEnum.SUBMARINE);
        //printSomeThingsDependingOnCarTypeWithIfElse(null);
        printSomeThingsDependingOnCarTypeWithSwitch(CarTypeEnum.BREAK);
        printMoodOnDayOfWeek(DayOfWeek.WEDNESDAY);
    }
    private static void printSomeThingsDependingOnCarTypeWithSwitch(CarTypeEnum carType){
        switch(carType){// We can use in the switch: Enums, Strings, Whole numbers(short,byte,int,long)
            case BREAK:
            case HATCHBACK:
                System.out.println("Mi-a luat masina medie");
                break;// If this is missing it will continue to the next case automatically
            case SUV:
                System.out.println("Mi-am luam masina mare");
                break;
            default:
                System.out.println("Nu mi-am luat nicio masina");
                break;
        }
    }


    private static void printSomeThingsDependingOnCarTypeWithIfElse(CarTypeEnum carType) {
        if (carType == CarTypeEnum.BREAK) {
            System.out.println("Mi-am luat masina mica");
        } else if (carType == CarTypeEnum.SUV) {
            System.out.println("Mi-am luat masina mare!");
        } else if (carType == CarTypeEnum.ELECTRIC) {
            System.out.println("Mi-am luat masina nepoluanta!");
        } else if (carType == CarTypeEnum.HATCHBACK) {
            System.out.println("Mi-am luat masina sport!");
        } else {
            System.out.println("Nu mi-am luat nicio masina!");
        }
    }
    private static void printMoodOnDayOfWeek(DayOfWeek dayOfWeek){
        switch (dayOfWeek){
            case MONDAY:
            case TUESDAY:
                System.out.println("of viata mea");
                break;
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Merge munca");
                break;
            case FRIDAY:
            case SATURDAY:
            case SUNDAY:
                System.out.println("Ura ,weekend");
                break;
        }
    }
}
