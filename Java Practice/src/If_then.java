public class If_then {
    public static void main(String[] args) {

        boolean isalien=false;
        if(isalien==false) {
            System.out.println("not alien");
        }
        int score=80;
        if(score==100){
            System.out.println("high score");
        }
        int secondd=60;
        if(score>secondd && secondd<100){
            System.out.println("great than top score less than 100");
        }
        if(score>60 ||secondd>60){
            System.out.println("print result");
        }
    }
}