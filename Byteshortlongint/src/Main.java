public class Main {
    public static void main(String[] args) {

      /*  int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        System.out.println(min);
        System.out.println(max);


     byte minvalue=Byte.MIN_VALUE;
        byte maxvalue=Byte.MAX_VALUE;
        System.out.println("Min:"+minvalue);
        System.out.println("Max:"+maxvalue);


        Short minshort=Short.MIN_VALUE;
        Short maxshort=Short.MAX_VALUE;
        System.out.println(" Short Min:"+minshort);
        System.out.println(" Short Max:"+maxshort);

        Long minLong=Long.MIN_VALUE;
        Long maxLong=Long.MAX_VALUE;
        System.out.println(" Long Min:"+minLong);
        System.out.println(" Long Max:"+maxLong);

        int mytotal= minvalue/2;
        short myshort=(short) (minshort/2);
        byte mybyte=(byte) (minvalue/2);*/

        byte mybyte=10;
        short myshort=20;
        int myint=50;
        long mylong=50000l+10l*(mybyte+myshort+myint);
        System.out.println(mylong);


    }
}