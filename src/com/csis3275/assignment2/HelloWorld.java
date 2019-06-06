package com.csis3275.assignment2;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JTextPane;

public class HelloWorld {
	private JFrame frame;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloWorld window = new HelloWorld();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		//String aman = "Amanpreet Singh";


		//String kulbir = "Kulbir Kaur";

				
		//String nafiza = "Nafiza Mann";
		
		int amanID = 300278627;
	
		
	}
	
	/**
	 * Create the application.
	 */
	public HelloWorld() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 468, 394);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Group 6");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 22, 101, 30);
		frame.getContentPane().add(lblNewLabel);
		
		String[] data = {"Nafiza Mann", "Kulbir Kaur", "Amanpreet Singh"}; 
		
		JList list = new JList(data);
		list.setSelectedIndex(1);
		list.setBounds(10, 79, 177, 115);
		frame.getContentPane().add(list);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(210, 79, 177, 115);
		frame.getContentPane().add(textPane);
		
		
		
		list.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				if(e.getValueIsAdjusting() == true) {
					if(list.getSelectedIndex() == 0) {
						textPane.setText("I am looking forward to start and lead the project.");
					}else if(list.getSelectedIndex() == 1) {
						textPane.setText("I am very excited to learn github.");
						}else {
							textPane.setText("I am curious to learn about java swing");
					}
				}
			}
			
		});
	}
}
