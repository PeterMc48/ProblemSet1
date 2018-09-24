import javax.swing.*;

public class problem7 {
    public static void main(String[] args) {
       String numAsString = JOptionPane.showInputDialog("Please enter a number:");


       while(!numAsString.equals("-1"))
       {
           int num = Integer.parseInt(numAsString);

           isEven(num);

           if(isEven(num) == true)
           {
               JOptionPane.showMessageDialog(null,num+ " is even");
           }
           else
               JOptionPane.showMessageDialog(null,num+ " is odd");

           numAsString = JOptionPane.showInputDialog("please enter another number(-1 to exit");
       }
    }
    public static boolean isEven(int n){

        boolean valid;
        valid = (n%2 == 0);

        if(!valid)
        {

                return false;

        }
        else
            return  true;

    }
}
