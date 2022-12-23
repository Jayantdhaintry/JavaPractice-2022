public class methodchallange {
    public static void main(String[] args) {

    int position=    calculateHighScorePosition(1000);
    displayHighscorePosition("jayant ",position);
    }
    public  static void displayHighscorePosition(String name,int position){
        System.out.println(name+"managed to get into position"+position+" on the high score table");
    }
    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore>=1000){
//            return  1;
//        } else if (playerScore>=500 ) {
//            return 2;
//
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//        return 4;
//    }
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100); {
            position = 3;
        }
        return position;
    }
}
