import java.util.Scanner;

public class problem1 {

    public static void main(String[] args) {

        float euro,gb;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the amount of euros you wish to convet: ");
        euro = input.nextFloat();
        System.out.print("how much would you get for 1 euro:");
        gb = input.nextFloat();

        while(euro != 0)
        {
            float pound = euro * gb;


            System.out.println(String.format("%.2f",euro)+" euros is "+String.format("%.2f",pound)+" pounds");

            System.out.println("Would you like to do another (0 to exit):");
            euro = input.nextFloat();

        }


    }


}
