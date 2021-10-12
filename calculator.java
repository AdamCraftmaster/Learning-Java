import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        //scanner
        Scanner scanner = new Scanner(System.in);

        //recive numbers
        System.out.print("Please input the first number: ");
        double firstnum = scanner.nextDouble();
        System.out.println("First number = " + firstnum);
        System.out.print("Please input the second number: ");
        double secondnum = scanner.nextDouble();
        System.out.println("Second number = " + secondnum);

/*ignoreme
        String poopyshoes;
        poopyshoes = scanner.next();
        System.out.println(poopyshoes);
        System.out.println(poopyshoes.length());
        System.exit(0);
*/

        //recive operation
        boolean validprompt = false;
        String operation = "DEBUG";
        while (!validprompt) {
            System.out.print("Please input the operation (+,-,*,/) ");
            String i = scanner.next();
            switch (i) {
                case "+":
                    operation = "+";
                    validprompt=true;
                    System.out.println("You chose " + operation);   
                    break;
                case "-":
                    operation = "-";
                    validprompt=true;
                    System.out.println("You chose " + operation);
                    break;
                case "*":
                    operation = "*";
                    validprompt=true;
                    System.out.println("You chose " + operation);
                    break;
                case "/":
                    operation = "/";
                    validprompt=true;
                    System.out.println("You chose " + operation);
                    break;
                default:
                    System.out.println("Try again.");
                    break;
            }
        }


        scanner.close();

        //run calculator
        System.out.println(firstnum + " " + operation + " " + secondnum + " = " + calculate(firstnum, secondnum, operation));
    

    }

    public static double calculate(double num1, double num2, String operator) {

        switch (operator) {
            case "+": return num1+num2;
            case "-": return num1-num2;
            case "*": return num1*num2;
            case "/": return num1/num2;
            default:
                System.exit(1);
                return -1;
        }

 
    }

}