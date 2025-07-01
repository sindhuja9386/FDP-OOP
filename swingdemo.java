

	import java.awt.*;

	import java.awt.event.*;

	import javax.swing.*;



	public class swingdemo implements ActionListener {



	    JFrame f;

	    JTextField t1, t2;

	    JButton b1;



	    public swingdemo() {

	        f = new JFrame("New Frame");

	        f.setSize(400, 400);

	        f.setLayout(new FlowLayout());

	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



	        JLabel l1 = new JLabel("Name");

	        t1 = new JTextField(20);



	        JLabel l2 = new JLabel("Password");

	        t2 = new JTextField(20);



	        b1 = new JButton("Submit");

	        b1.addActionListener(this);  // Very important



	        f.add(l1);

	        f.add(t1);

	        f.add(l2);

	        f.add(t2);

	        f.add(b1);



	        f.setVisible(true);  // Must be after components are added

	    }



	    public void actionPerformed(ActionEvent e) {

	        System.out.println("Button clicked");  // Debug

	        String name = t1.getText();

	        String password = t2.getText();

	        JOptionPane.showMessageDialog(f, "Name: " + name + "\nPassword: " + password);

	    }



	    public static void main(String[] args) {

	        new swingdemo();

	    }

	}

