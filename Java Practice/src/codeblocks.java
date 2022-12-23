public class codeblocks {
    public static void main(String[] args) {
        boolean game = true;
        int score = 800;
        int levelcompleted = 5;
        int bonus = 100;

//      /*  if(score==5000){
//            System.out.println("score was 5000 ");
//        }*/
//        if(score<=5000 && score >1000){
//            System.out.println("score was 5000 ");
//        } else if (score<1000) {
//            System.out.println("your score was less than 1000");
//        } else{
//            System.out.println("got here");
//
//        }

        if (game == true) {
            int finalscore = score + (levelcompleted * bonus);
            System.out.println("ypur final scorew was" + finalscore);
        }
//        boolean newGame = true;
//        int newScore = 10000;
//        int newLevelcompleted = 8;
//        int newBonus = 200;
//        if (newGame == true) {
//            int finalscore = newScore+ (newLevelcompleted * newBonus);
//            System.out.println("ypur final scorew was" + finalscore);
//        }


        }
    }
