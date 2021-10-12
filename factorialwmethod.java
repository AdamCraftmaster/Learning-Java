public class factorialwmethod {

    public static void main(String[] args) {
                //1*2*3*4

        for (double i = 0; i < 30; i++) {

            System.out.println("Factorial for " + i + " is " + factoring(i)); //the answer
        }

    }

    public static double factoring(double i) {

        double factorial = 1;
        for (double k = i; k > 0; k--) {

            //System.out.println("PRE DEBUG: Factorial = " + factorial + "k = " + k);

            factorial=factorial*k; //the actuall factorial thingy

            //System.out.println("POST DEBUG: Factorial = " + factorial);

        }

        return(factorial);


    }

    
}
