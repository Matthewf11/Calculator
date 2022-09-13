import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        Scanner scanString = new Scanner(System.in);

        System.out.print("input two numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int sum =0;
        System.out.println("input operator");
        String operator = "+";
        operator = scanString.nextLine();

        switch (operator) {
            case "+":
                sum=num1+num2;
                System.out.println(sum);
                break;
            case "-":
                sum=num1-num2;
                System.out.println(sum);
                break;
            default:
                System.out.println("ERROR ERROR");

        }
         /*int num1 = 0;
        int num2 = 0;

        Scanner scan = new Scanner(System.in);
        num1 = scan.nextInt();
        num2 = scan.nextInt();

        if (num1>num2)
            System.out.println(num1);
        else
            System.out.println(num2);

        int num3 = scan.nextInt();
        if (num3%2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");

        String colour = scan.nextLine();
        if (colour == "green")
            System.out.println("Go");
        else
            System.out.println("Stop");


        Scanner scan = new Scanner(System.in);
        System.out.println("Input number between 1 and 12");
        int number = scan.nextInt();

        switch (number) {

            case 12,1,2 -> System.out.println("Winter");
            case 3,4,5 -> System.out.println("Spring");
            case 6,7,8 -> System.out.println("Summer");
            case 9,10,11 -> System.out.println("Autumn");
            default -> System.out.println("INPUT NUMBER BETWEEN 1 and 12");



        }
        */

    }
}
