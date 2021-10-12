import java.util.Scanner;

public class makingchange {
    public static void main(String[] args) {
        //step 1
        boolean moreItems = true;
        double cost = 0;
        Scanner scanner = new Scanner(System.in);
        double i = 0;
        while(moreItems) {
            System.out.println("Please enter below how much the current item costs, or enter 0 if done.");
            i = scanner.nextDouble();
            if (i == 0.0) moreItems=false;
            else cost = cost+i;
        }
        System.out.println("The total cost is: " + cost);
        //scanner.close();
        //step 2
        double customerGive = 0;
        System.out.println("Please input the amount that the customer has given: ");
        customerGive =scanner.nextDouble();
        scanner.close();

        //step 3
        double change = customerGive-cost;
        System.out.println("The change needed is: " + change);
        //0.01,0.05,0.1,0.25,1,5,10,20,50,100
        if (change > 0) change = changeConvert(change, 100);
        if (change > 0) change = changeConvert(change, 50);
        if (change > 0) change = changeConvert(change, 20);
        if (change > 0) change = changeConvert(change, 10);
        if (change > 0) change = changeConvert(change, 5);
        if (change > 0) change = changeConvert(change, 1);
        if (change > 0) change = changeConvert(change, 0.25);
        if (change > 0) change = changeConvert(change, 0.10);
        if (change > 0) change = changeConvert(change, 0.05);
        if (change > 0) change = changeConvert(change, 0.01);



    }
    public static double changeConvert(double changeamt, double changebill) {
        //convert changeamt to pennies
        int changeinpennies = (int)(changeamt*100);
        //System.out.println(changeamt + " change in pennies is " + changeinpennies);
        int changebillinpennies = (int)(changebill*100);
        //System.out.println(changebill + " bills in pennies is " + changebillinpennies);
        //check if changebill/changeamt is 1 or more
        if (changeinpennies/changebillinpennies<1) return changeamt;
        //(double)(changeinpennies)/100.0
        //convert and send back remaining change
        if (changebillinpennies>=100) {

            System.out.println("Give the customer " + changeinpennies/changebillinpennies + " x " + (int)changebill + " dollar bills.");
            
        } else {

            System.out.println("Give the customer " + changeinpennies/changebillinpennies + " x " + (int)(changebill*100) + " cent coins.");
            
        }
        double i = (changeinpennies%changebillinpennies)/100.0;
        //System.out.println("remaining change: " + i);
        return i;

        //

    }
}