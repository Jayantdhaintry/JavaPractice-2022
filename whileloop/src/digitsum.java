public class digitsum {
    public static void main(String[] args) {

        System.out.println(sumDigits(125));
    }

   public static int sumDigits(int number) {

     if(number<10){
           return -1;
       }
       int sum=0;
       while (number>0){
           int n=number%10;

           sum+=n;
           number=number/10;
       }
       return sum;





   }
}
