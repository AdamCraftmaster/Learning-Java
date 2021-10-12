import java.util.Scanner;

public class abcprogram {
    public static void main(String[] args) {
        boolean cont = true;
        while (cont) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("a ");
            int a = (int)(scanner.nextInt());
            System.out.println("");
            System.out.print("b ");
            int b = (int)(scanner.nextInt());
            scanner.close();
            System.out.println("");
            int c = minFunction(a, b);
            System.out.println("Minimum Value = " + c);
            System.out.println("Would you like to repeat? Answer y/n");
            if (scanner.nextLine() == "y") {
                cont = true;
            } else {

                cont = false;
                
            }
     
        }
    }

    public static int minFunction(int n1, int n2) {
        int min;
        if (n1 > n2) min = n2;
        else min = n1;
        return min;
    }
}