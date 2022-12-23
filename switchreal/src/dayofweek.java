public class dayofweek {
    public static void main(String[] args) {
        printDayOfTheWeek(1);
    }
    public static void printDayOfTheWeek(int day){
        int switchValue=day;
        switch(switchValue){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2: case 3: case 4: case 5: case 6:
                System.out.println(switchValue);
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
