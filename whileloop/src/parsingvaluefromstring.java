public class parsingvaluefromstring {

    public static void main(String[] args) {
        String numberasString="2018";
        System.out.println(numberasString);

        double number=Double.parseDouble(numberasString);
        System.out.println(number);

        numberasString+=1;
        number+=1;
        System.out.println(numberasString);
        System.out.println(number);
    }
}
