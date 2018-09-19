import javax.swing.*;

public class problem4 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Please enter your name:");

        int length = getLength(name);
        char initial = getInitial(name);
        JOptionPane.showMessageDialog(null,"your name is "+name+"\nThe length is "+length+
                                                                    "\ntThe first Initial was "+initial);


    }
    public static int getLength(String n){

        return n.length();
    }
    public static char getInitial(String n) {

        return n.charAt(0);

    }

}
