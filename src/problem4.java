import javax.swing.*;

public class problem4 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Please enter your name:");

        int length = getLength(name);
        char initial = getInitial(name);
        String Upper = getUpperCase(name);
        String LastName = getLastName(name);
        JOptionPane.showMessageDialog(null,"your name is "+name+"\nThe length is "+length+
                                                                    "\nThe first Initial was "+initial+
                                                                    "\nThe name in upper case "+ Upper+
                                                                    "\nYour last Name is "+ LastName);


    }
    public static int getLength(String n){

        return n.length();
    }
    public static char getInitial(String n) {

        return n.charAt(0);

    }
    public static String getUpperCase(String n){

         return n.toUpperCase();
    }
    public static String getLastName(String n){

        int index = n.indexOf(' ');
        String FirstName = n.substring(0,index);
        String SecondName = n.substring(index + 1);
        return SecondName;
    }

}
