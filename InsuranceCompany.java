import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class InsuranceCompany extends JFrame {

	
	public InsuranceCompany(){
		
		
		setSize(400,400);
		
		JPanel panel = new JPanel();
		JTextField box1 = new JTextField("Name");
		JTextField box2 = new JTextField("Address");
		JTextField box3 = new JTextField("House Value");
		JTextField box4 = new JTextField("House Size");
		JTextField premiumBox = new JTextField("Premium");
		
		
		JButton button = new JButton("Calculate Premium");
		
		button.addActionListener(new ActionListener(){
			public void ActionPerformed(ActionEvent e){
				int intSize = 0;
				int intValue = 0;
				String name = box1.getText();
				String address = box2.getText();
				String value = box3.getText();
				String size = box4.getText();
				
				
				try{
				//turn Strings into ints
				 intValue = Integer.parseInt(value);
				 intSize = Integer.parseInt(size);
				}
				catch(NumberFormatException exception){
				JOptionPane.showMessageDialog(null, "Number not entered correctly");	
				}
				
				
				//calculate premium
				double premium = 150;
				if(address.contains("Dublin")){
					premium = premium + (premium/2);
					}
				premium = premium + (intSize * 50);
				premium = premium + (premium /5);
				
				Policy policy = new Policy(101, intValue, intSize, premium);
				Customer customer = new Customer(name, address, policy);
				
				premiumBox.setText("Premium = " + premium);
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		panel.add(box1);
		panel.add(box2);
		panel.add(box3);
		panel.add(box4);
		panel.add(button);
		panel.add(premiumBox);
		
		
		setSize(400,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container container = getContentPane();//must do this
		container.add(panel);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args){
		
		new InsuranceCompany();
	}
	
}
