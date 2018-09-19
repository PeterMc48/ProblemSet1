import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        float length,breadth,cost;

        System.out.print("What is your name?");
        name = input.nextLine();
        System.out.print("What is the length of the room?");
        length = input.nextFloat();
        System.out.print("What is the breadth of the room?");
        breadth = input.nextFloat();
        System.out.print("What is the cost per square metre?");
        cost = input.nextFloat();


        getTextArea(name,length,breadth,cost);


    }
    public static void getTextArea(String n,float l, float b, float c)
    {
        float totalCost,totalArea=l*b;
        String text="";
        totalCost = totalArea* c;

        JTextArea textArea = new JTextArea(20 ,30);
        Font font = new Font("monospaced", Font.PLAIN, 12 );
        textArea.setFont(font);

        text = String.format("%-20s%.2f m. \n %-20s%.2f m. \n %-20s%.2f m. \n %-20s%.2f m. \n %-20s%.2f m.",
                "length",l,"breadth",b,"Total Area",totalArea,"cost per square metre",c,"Total Cost", totalCost);
        textArea.append(text);


        JOptionPane.showMessageDialog(null,"Quotation for "+n+ "\n" +text);


    }
}
