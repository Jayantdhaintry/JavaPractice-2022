public class SUm3and5Challenge {
    public static void main(String[] args) {
        int sum=0;
        int count=0;
        for(int i=1;i<=1000;i++){
            if(i%3==0 && i%5==0){
                System.out.println("The number that divides both 3 and 5 is "+i);
                count++;
                sum+=i;
                if(count==5){
                    System.out.println("exiting the loop");
                    break;
                }
            }


        }
        System.out.println("The sum of numbers ="+sum);

    }

}
