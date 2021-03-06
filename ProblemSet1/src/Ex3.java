import javax.swing.*;
import java.awt.*;

public class Ex3 {
    public static void main(String[] args)
    {
        String name, lengthAS, widthAS, costPMAS;
        float length, width, area, cost, totalCost;

        name = JOptionPane.showInputDialog("Enter your name: ");
        lengthAS = JOptionPane.showInputDialog("Enter room length in metres: ");
        widthAS = JOptionPane.showInputDialog("Enter room width in metres: ");
        costPMAS = JOptionPane.showInputDialog("Enter the cost per square metre of the carpet: ");

        length = Float.parseFloat(lengthAS);
        width = Float.parseFloat(widthAS);
        cost = Float.parseFloat(costPMAS);

        area = (length * width);
        totalCost = (area * cost);

        JTextArea textArea = new JTextArea(10,40);
        Font f = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(f);
        textArea.setText(String.format("%s\n\n","QUOTATION FOR " + name + "\n\n"));


        JOptionPane.showMessageDialog(null,"Length of Room: " + length + "\n" +
                "Width of room: " + width + "m\n" +
                "Total area of room: " + area + "m\n" +
                "Cost per square metre of carpet: " + cost + " Euro\n" +
                "Total cost of carpet: " + totalCost + " Euro","Final Summary",JOptionPane.INFORMATION_MESSAGE);
    }
}
