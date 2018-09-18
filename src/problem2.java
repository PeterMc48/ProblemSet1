import javax.swing.*;
import java.awt.*;

public class problem2 {


    public static void main(String[] args) {
        JTextArea table = new JTextArea(25 ,26);
        Font font = new Font("monospaced", Font.PLAIN ,10);
        table.setFont(font);

        String text = "";
        int i;

        text+= "\n" + String.format("%-15s%-15s","Yards","Inches");
        text+= "\n" +String.format("%-15s%-15s","-----","------");

        for(i = 1;i<11;i++)
        {
            text += "\n" + String.format("%-15d%-15d", i,i*36);
        }
        table.append(text);

        JOptionPane.showMessageDialog(null,table);
    }
}
