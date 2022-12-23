public class secondsandminutes {
    public static void main(String[] args) {
            getDurationString(180,45);
            getDurationString(2000);
    }
    public static String getDurationString(int minutes, int seconds){
        if(minutes<0 ||(seconds<0)||(seconds>59)){
            return "Invalid value";
        }
        int hours=minutes/60;
        int remainingmintues=minutes%60;
        return hours+"h"+remainingmintues+"m"+seconds+"seconds";

    }
    public static String getDurationString(int seconds){
        if(seconds<0){
            return "invalid value";
        }
        int minutes=seconds/60;
        int remainingseconds=seconds%60;
        return getDurationString(minutes,remainingseconds);

    }
}
