public class methods1 {
    public static void main(String[] args) {

        int highscore = calcualteScore1(true, 800, 5, 100);
        System.out.println("your final score was" + highscore);

        int highscore1 = calcualteScore1(true, 10000, 8, 200);
        System.out.println("your final score was" + highscore1);

    }


    public static int calcualteScore1(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver == true) {
            int finalscore = score + (levelCompleted * bonus);

            return finalscore;
        }
        return -1;

    }


}
