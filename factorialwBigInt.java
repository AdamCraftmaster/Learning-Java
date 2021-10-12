import java.math.BigInteger;

public class factorialwBigInt {
    public static void main(String[] args) {
        //1*2*3*4

        for (int i = 0; i < 30; i++) {

            System.out.println("Factorial for " + i + " is " + factoring(i)); //the answer
        }

    }

    public static BigInteger factoring(int i) {

        BigInteger factorial = new BigInteger("1");
        for (int k = i; k > 0; k--) {

            factorial=factorial.multiply(BigInteger.valueOf(k));

        }

        return(factorial);

    }


}
