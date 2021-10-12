public class multiplicationstable {
    public static void main(String[] args) {
     
        for (int i = 1; i<=12; i++) {
            int left = i; //prob a wasted line
            for (int j = 1; j<=12; j++) {
                int right = j; // prob a wasted line
                System.out.print( left*right + "\t"); 
            }
            System.out.println();
        }

    }

}