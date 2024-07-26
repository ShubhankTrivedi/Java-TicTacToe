package tictactoe;

import javax.swing.*;

import java.awt.Font;

import java.awt.event.*;


class helper extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static int move = 0;
	static int arr[][] = {{-1,-2,-3},{-4,-5,-6},{-7,-8,-9}};
	static boolean chance = true;
	JButton b11,b12,b13,b21,b22,b23,b31,b32,b33,reset;
	JLabel winner;
	helper() {
		setTitle("TIcTacToe");
		setSize(500,650);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel l1 = new JLabel("Player 1: X");
		l1.setBounds(40,60,200,30);
		l1.setFont(new Font("Arial",Font.BOLD,20));
		add(l1);
		
		JLabel l2 = new JLabel("Player 2: O");
		l2.setBounds(300,60,200,30);
		l2.setFont(new Font("Arial",Font.BOLD,20));
		add(l2);
		
		winner = new JLabel();
		winner.setBounds(40,100,200,30);
		winner.setFont(new Font("Arial",Font.BOLD,20));
		add(winner);
		
		b11 = new JButton("");
		b11.setBounds(40,140,125,125);
		b11.setFont(new Font("Arial",Font.BOLD,20));
		add(b11);
		
		b12 = new JButton("");
		b12.setBounds(180,140,125,125);
		b12.setFont(new Font("Arial",Font.BOLD,20));
		add(b12);
		
		b13 = new JButton("");
		b13.setBounds(320,140,125,125);
		b13.setFont(new Font("Arial",Font.BOLD,20));
		add(b13);
		
		b21 = new JButton("");
		b21.setBounds(40,280,125,125);
		b21.setFont(new Font("Arial",Font.BOLD,20));
		add(b21);
		
		b22 = new JButton("");
		b22.setBounds(180,280,125,125);
		b22.setFont(new Font("Arial",Font.BOLD,20));
		add(b22);
		
		b23 = new JButton("");
		b23.setBounds(320,280,125,125);
		b23.setFont(new Font("Arial",Font.BOLD,20));
		add(b23);
		
		b31 = new JButton("");
		b31.setBounds(40,420,125,125);
		b31.setFont(new Font("Arial",Font.BOLD,20));
		add(b31);
		
		b32 = new JButton("");
		b32.setBounds(180,420,125,125);
		b32.setFont(new Font("Arial",Font.BOLD,20));
		add(b32);
		
		b33 = new JButton("");
		b33.setBounds(320,420,125,125);
		b33.setFont(new Font("Arial",Font.BOLD,20));
		add(b33);
		
		reset = new JButton("Reset");
		reset.setBounds(180,560,125,60);
		add(reset);
		
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		
		b21.addActionListener(this);
		b22.addActionListener(this);
		b23.addActionListener(this);
		
		b31.addActionListener(this);
		b32.addActionListener(this);
		b33.addActionListener(this);
		
		reset.addActionListener(this);
		
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == b11) {
			if(chance) {
				arr[0][0] = 1;
				b11.setText("X");
			}
			else {
				arr[0][0] = 2;
				b11.setText("O");
			}
			move++;
			chance = !chance;
		}
		else if(e.getSource() == b12) {
			if(chance) {
				arr[0][1] = 1;
				b12.setText("X");
			}
			else {
				arr[0][1] = 2;
				b12.setText("O");
			}
			chance = !chance;
			move++;
		}
		else if(e.getSource() == b13) {
			if(chance) {
				arr[0][2] = 1;
				b13.setText("X");
			}
			else {
				arr[0][2] = 2;
				b13.setText("O");
			}
			chance = !chance;
			move++;
		}
		else if(e.getSource() == b21) {
			if(chance) {
				arr[1][0] = 1;
				b21.setText("X");
			}
			else {
				arr[1][0] = 2;
				b21.setText("O");
			}
			chance = !chance;
			move++;
		}
		else if(e.getSource() == b22) {
			if(chance) {
				arr[1][1] = 1;
				b22.setText("X");
			}
			else {
				arr[1][1] = 2;
				b22.setText("O");
			}
			chance = !chance;
			move++;
		}
		else if(e.getSource() == b23) {
			if(chance) {
				arr[1][2] = 1;
				b23.setText("X");
			}
			else {
				arr[1][2] = 2;
				b23.setText("O");
			}
			chance = !chance;
			move++;
		}
		else if(e.getSource() == b31) {
			if(chance) {
				arr[2][0] = 1;
				b31.setText("X");
			}
			else {
				arr[2][0] = 2;
				b31.setText("O");
			}
			chance = !chance;
			move++;
		}
		else if(e.getSource() == b32) {
			if(chance) {
				arr[2][1] = 1;
				b32.setText("X");
			}
			else {
				arr[2][1] = 2;
				b32.setText("O");
			}
			chance = !chance;
			move++;
		}
		else if(e.getSource() == b33) {
			if(chance) {
				arr[2][2] = 1;
				b33.setText("X");
			}
			else {
				arr[2][2] = 2;
				b33.setText("O");
			}
			chance = !chance;
			move++;
		}
		else if(e.getSource() == reset) {
			arr[0][0] = -1;
			arr[0][1] = -2;
			arr[0][2] = -3;
			
			arr[1][0] = -4;
			arr[1][1] = -5;
			arr[1][2] = -6;
			
			arr[2][0] = -7;
			arr[2][1] = -8;
			arr[2][2] = -9;
			
			move = 0;
			chance = true;
			
			b11.setText("");
			b12.setText("");
			b13.setText("");
			
			b21.setText("");
			b22.setText("");
			b23.setText("");
			
			b31.setText("");
			b32.setText("");
			b33.setText("");
			
			b11.addActionListener(this);
			b12.addActionListener(this);
			b13.addActionListener(this);
			
			b21.addActionListener(this);
			b22.addActionListener(this);
			b23.addActionListener(this);
			
			b31.addActionListener(this);
			b32.addActionListener(this);
			b33.addActionListener(this);
			
			winner.setText("");
		}
		if(!chance) {
		if((arr[0][0]==arr[0][1]&&arr[0][2]==arr[0][0])||(arr[0][0]==arr[1][1]&&arr[2][2]==arr[0][0])||(arr[0][0]==arr[1][0]&&arr[0][0]==arr[2][0]) ||(arr[0][1]==arr[1][1]&&arr[0][1]==arr[2][1])||(arr[1][0]==arr[1][1]&&arr[1][0]==arr[1][2]) ||(arr[2][0]==arr[2][1]&&arr[2][0]==arr[2][2]) ||(arr[2][0]==arr[1][1]&&arr[2][0]==arr[0][2])||(arr[0][2]==arr[1][2]&&arr[0][2]==arr[2][2]) ) {
			winner.setText("Player 1 wins");
			b11.removeActionListener(this);
			b12.removeActionListener(this);
			b13.removeActionListener(this);
			
			b21.removeActionListener(this);
			b22.removeActionListener(this);
			b23.removeActionListener(this);
			
			b31.removeActionListener(this);
			b32.removeActionListener(this);
			b33.removeActionListener(this);
		}
		}
		else {
			if((arr[0][0]==arr[0][1]&&arr[0][2]==arr[0][0])||(arr[0][0]==arr[1][1]&&arr[2][2]==arr[0][0])||(arr[0][0]==arr[1][0]&&arr[0][0]==arr[2][0]) ||(arr[0][1]==arr[1][1]&&arr[0][1]==arr[2][1])||(arr[1][0]==arr[1][1]&&arr[1][0]==arr[1][2]) ||(arr[2][0]==arr[2][1]&&arr[2][0]==arr[2][2]) ||(arr[2][0]==arr[1][1]&&arr[2][0]==arr[0][2])||(arr[0][2]==arr[1][2]&&arr[0][2]==arr[2][2]) ) {
				winner.setText("Player 2 wins");
				b11.removeActionListener(this);
				b12.removeActionListener(this);
				b13.removeActionListener(this);
				
				b21.removeActionListener(this);
				b22.removeActionListener(this);
				b23.removeActionListener(this);
				
				b31.removeActionListener(this);
				b32.removeActionListener(this);
				b33.removeActionListener(this);
			}
			
		}
		if(move == 9 && !(winner.getText().equals("Player 1 wins") || winner.getText().equals("Player 2 wins"))) {
			winner.setText("Match Draw");
			b11.removeActionListener(this);
			b12.removeActionListener(this);
			b13.removeActionListener(this);
			
			b21.removeActionListener(this);
			b22.removeActionListener(this);
			b23.removeActionListener(this);
			
			b31.removeActionListener(this);
			b32.removeActionListener(this);
			b33.removeActionListener(this);
		}
       }
	
}
public class tictactoe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new helper();
	}

}
