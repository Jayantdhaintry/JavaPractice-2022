public class speedconverterexercise {
    public static void main(String[] args) {
        printConversion(56);
    }
    public static long toMilesPerHour(double kilometersPerHour){

        if(kilometersPerHour<0){
             return -1;
         }
         else {
            long milesPerHour=Math.round(kilometersPerHour/1.609);
            return  milesPerHour;
         }

    }

    public  static void printConversion(double KilometersPerHour) {
        if (KilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long value = toMilesPerHour(KilometersPerHour);
            System.out.println(KilometersPerHour + " km/h = " + value + " mi/h ");
        }
    }
}
