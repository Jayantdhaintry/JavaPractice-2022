import java.util.Scanner;

public class minmaxchallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int max=0;
        int min=0;

        while (true) {
            System.out.println("Enter number: ");

            boolean isAnint = scanner.hasNextInt();

            if (isAnint == false) {
                break;
            }

            {

                int num1 = scanner.nextInt();

                int num2 = scanner.nextInt();

                if (num1 > num2) {
                    max = num1;
                    min = num2;
                    System.out.println("maximum : " + max);
                    System.out.println("minimum: " + min);
                } else if (num2 > num1) {
                    max = num2;
                    min = num1;
                    System.out.println("maximum : " + max);
                    System.out.println("minimum: " + min);

                }

            }
            scanner.nextLine();

        }
        System.out.println(max);
        System.out.println(min);

        scanner.close();


    }
}








