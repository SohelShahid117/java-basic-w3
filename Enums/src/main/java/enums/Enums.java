/*
1.In Java, Enums (short for Enumerations) are a special data type that enables you to define a fixed set of constants.
They are commonly used when you have a variable that can only take one out of a small set of possible values — like days of the week,
directions, or states in a workflow.
2.Enums--->values() – returns an array of all enum constants
valueOf(String name) – returns the enum constant with the given name
ordinal() – returns the index of the enum constant

3.Java enums are important because they provide a clean, safe, and powerful way to represent a fixed set of constant values
4.in enums all value are constant

 */
package enums;

enum Day { //this is a class
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY; //by default all are object
}

public class Enums {

    /*
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }
     */
    enum Status {
        Running, Pending, Failed, Success;
    }

    public static void main(String[] args) {
        System.out.println("Enjoy Java Enums");

//        Day today = Day.FRIDAY;
        Day today = Day.SATURDAY;
        System.out.println(today);

        if (today == Day.SATURDAY) {
            System.out.println("Start of the week");
        }

        switch (today) {
            case SATURDAY:
                System.out.println("Back to work!");
                break;
            case THURSDAY:
                System.out.println("Weekend is coming!");
                break;
            default:
                System.out.println("Midweek");
        }
        System.out.println(Day.valueOf("SATURDAY"));
        System.out.println(Day.values());
        System.out.println(Day.values().toString());

        for (Day d : Day.values()) {
            System.out.println(d + " is at index " + d.ordinal());
        }
        Day d1 = null;
        System.out.println(d1);
        System.out.println(Day.values());
//         System.out.println(Day.ordinal());

        int i = 5;
        Status s = Status.Success;
        System.out.println(s);
        System.out.println(s.Failed);
        System.out.println(s.Running);
        System.out.println(s.ordinal());
        System.out.println(s.toString());
        System.out.println(s);
        for (Status a : Status.values()) {
            System.out.println(a + " is at index " + a.ordinal());

        }
        Status[] ss = Status.values();
//        ss = Status.valueOf("Running");
        System.out.println(ss[0]);
        System.out.println(ss[2]);

        System.out.println("enums is one kind of type:");
        for (Status s3 : ss) {
            System.out.println(s3 + " " + s3.ordinal());
        }

    }
}
