public class forloop {
    public static void main(String[] args) {
       int count=0;
        for(int i=0;i<=50;i++){
            if(isPrime(i)==true){
                System.out.println(i+" Is a prime");
                count++;
                if(count==3){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

    }
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }

        }
        return true;
    }
}
