import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] num = new int[10];

        for(int i =0;i<num.length;i++)
        {
            System.out.print("Please enter a number: ");
            num[i] = input.nextInt();
        }

        System.out.print("The first value in the array is " + num[0]);
        System.out.print("\nThe 5th number in the array is " + num[4]);


    }
}
