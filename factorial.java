public class factorial {

    public static void main(String[] args) {
                //1*2*3*4

        for (double i = 0; i < 30; i++) {
            double j = i; //overcomplicated lol
            double factorial = 1; //double = more stuff in var = no break :)
            for (double k = j; k > 0; k--) {

                //System.out.println("PRE DEBUG: Factorial = " + factorial + "k = " + k);

                factorial=factorial*k; //the actuall factorial thingy

                //System.out.println("POST DEBUG: Factorial = " + factorial);

            }

            System.out.println("Factorial for " + i + " is " + factorial); //the answer

    }

        
    }
    
}
