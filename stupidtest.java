public class stupidtest
{
    public static void main(String args[])
    {
        // made by my dad as a simplified version of what i made
/*
        System.out.println("n strategy");
        for (int i = 0; i <=100; i++) {
            int n = i;
            boolean buzz = (i % 3 == 0);
            while(!buzz && n > 0) {
                if (n % 10 == 3) buzz = true;
                n = n/10;
            }
            if (buzz) System.out.println("Buzz (" + i + ")");
            else System.out.println(i);
        
        }
*/

        // made by me
        //System.out.println("j strategy");

        for (int i = 0; i <=100; i++) { // simple for loop
            
            int j = 0; //temp var that shows what digit we are looking at
            boolean buzz = false; // init buzz
            if (i % 3 == 0) buzz = true; //checks if the entire number is divisible by 3 and has no remainder
            while (((i / (int)Math.pow(10,j)) > 0) && !buzz) { //ensure its not looking at a non existant digit
                if ((i / (int)Math.pow(10,j)) % 10 == 3) { //if the digit is divisible by 3 by leaving a remainder of 3 when divinging by 10 (to remove other digit)
                    buzz=true;
//                    System.out.println("j = " + j + " and hit Buzz"); //debug
                }
//                else System.out.println("j = " + j); //debug
                j++; //next digit
            }
            if (buzz) System.out.println("Buzz (" + i + ")"); //say buzz and number
            else System.out.println(i); //say number
        }
    }
}

// i / (int)Math.pow(10,j) because it is an integer, decimals are deleted, thus allowing you to place any digit you want in the 1s place and then use %10 to isolate that digit


// (i/(10^j)) % 10 (before i learned about Math.pow)

/*
for (int i = 1234; i <=1250; i++) {
    int n = i;
    boolean buzz = (i % 3 == 0);
    while(!buzz && n > 0) {
        if (n % 10 == 3) buzz = true;
        n = n/10;
    }

}
*/