import javax.swing.*;
import java.awt.event.*;
public class TemperatureConverter {
 public static void main(String[] args) {
 JFrame f = new JFrame("Temperature Converter");
 JLabel l1 = new JLabel("Enter Temperature:");
 JTextField tf = new JTextField();
 JButton cToF = new JButton("C to F");
 JButton fToC = new JButton("F to C");
 JLabel result = new JLabel("");
 l1.setBounds(50, 50, 150, 20);
 tf.setBounds(200, 50, 100, 20);
 cToF.setBounds(50, 100, 100, 30);
 fToC.setBounds(170, 100, 100, 30);
 result.setBounds(50, 150, 200, 30);
 f.add(l1); f.add(tf); f.add(cToF); f.add(fToC); f.add(result);
 f.setSize(400, 250);
 f.setLayout(null);
 f.setVisible(true);
 cToF.addActionListener(e -> {
 double c = Double.parseDouble(tf.getText());
 double fTemp = (c * 9 / 5) + 32;
 result.setText("Fahrenheit: " + fTemp);
 });
 fToC.addActionListener(e -> {
 double fVal = Double.parseDouble(tf.getText());
 double cTemp = (fVal - 32) * 5 / 9;
 result.setText("Celsius: " + cTemp);
 });
 }
}