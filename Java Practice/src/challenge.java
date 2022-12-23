public class challenge {
    public static void main(String[] args) {
        double a1=20.00;
        double a2=80.00;
        double result=a1+a2*100.00;
        System.out.println("the Result="+result);
        double remaindeer=result%40.00;
        if(remaindeer==0){
            boolean assign=true;
            System.out.println(assign);
        }
        if(remaindeer!=0){
            boolean assign=false;
            System.out.println(assign);
        }
        if(remaindeer!=0){
            System.out.println("got some remainfer");

        }

    }
}
