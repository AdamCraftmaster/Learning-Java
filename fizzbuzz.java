public class fizzbuzz
{
    public static void main(String args[])
    {
        for (int i = 1; i <=100; i++) { 
            
            int j = 0; 
            boolean buzz = false;
            boolean fizz = false;

            if (i % 3 == 0) buzz = true; 
            while (((i / (int)Math.pow(10,j)) > 0) && !buzz) { 
                if ((i / (int)Math.pow(10,j)) % 10 == 3) { 
                    buzz=true;
                }
                j++; //next digit
            }
            if (i % 5 == 0) fizz = true; 
            while (((i / (int)Math.pow(10,j)) > 0) && !fizz) { 
                if ((i / (int)Math.pow(10,j)) % 10 == 5) { 
                    fizz=true;
                }
                j++; //next digit
            }
            if (fizz&&buzz) System.out.println("Fizz Buzz (" + i + ")");
            else {
                if (buzz) System.out.println("Buzz (" + i + ")"); 
                if (fizz) System.out.println("Fizz (" + i + ")");                 
            }
            
            if (!buzz && !fizz) System.out.println(i); 
        }
    }
}