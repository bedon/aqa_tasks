package lesson5;

public class Task10 {

    public static void main(String[] args) {
        day day1 = day.FRIDAY;

        switch (day1) {
            case SUNDAY:
                System.out.println(1);
                break;
            case MONDAY:
                System.out.println(2);
                break;
            case TUESDAY:
                System.out.println(3);
                break;
            case WEDNESDAY:
                System.out.println(4);
                break;
            case THURSDAY:
                System.out.println(5);
                break;
            case FRIDAY:
                System.out.println(6);
                break;
            case SATURDAY:
                System.out.println(7);
                break;
        }
    }


}
enum day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}