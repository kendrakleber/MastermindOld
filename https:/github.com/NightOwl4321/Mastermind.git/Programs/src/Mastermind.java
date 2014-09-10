

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Mastermind implements ActionListener {

	JButton bR = new JButton();
	JButton bY = new JButton();
	JButton bG = new JButton();
	JButton bB = new JButton();
	JButton bP = new JButton();

	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	
	JButton b5 = new JButton();
	JButton b6 = new JButton();
	JButton b7 = new JButton();
	JButton b8 = new JButton();
	
	JButton b9 = new JButton();
	JButton b10 = new JButton();
	JButton b11 = new JButton();
	JButton b12 = new JButton();

	JButton a1 = new JButton();
	JButton a2 = new JButton();
	JButton a3 = new JButton();
	JButton a4 = new JButton();
	JButton cover = new JButton();

	JButton enter = new JButton("Enter");

	boolean red = false;
	boolean yellow = false;
	boolean green = false;
	boolean blue = false;
	boolean purple = false;

	int guesses = 0;
	int points = 0;
	int x = 0;
	
	int bg1;
	int bg2;
	int bg3;
	int bg4;
	
	int c1;
	int c2;
	int c3;
	int c4;
	
	boolean end = false;
	
	int p1 = new Random().nextInt(5);
	int p2 = new Random().nextInt(5);
	int p3 = new Random().nextInt(5);
	int p4 = new Random().nextInt(5);

	public static void main(String[] args) {
		Mastermind m = new Mastermind();
		m.makeButtons();
	}

	private void makeButtons() {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel();

		label.setText("Mastermind");

		panel.setLayout(null);

		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);

		panel.add(bR);
		panel.add(bY);
		panel.add(bG);
		panel.add(bB);
		panel.add(bP);

		panel.add(enter);

		panel.add(a1);
		panel.add(a2);
		panel.add(a3);
		panel.add(a4);
		panel.add(cover);
		
		a1.setVisible(end);
		a2.setVisible(end);
		a3.setVisible(end);
		a4.setVisible(end);

		b1.setSize(50, 30);
		b2.setSize(50, 30);
		b3.setSize(50, 30);
		b4.setSize(50, 30);
		bR.setSize(50, 30);
		bY.setSize(50, 30);
		bG.setSize(50, 30);
		bB.setSize(50, 30);
		bP.setSize(50, 30);
		enter.setSize(50, 20);
		a1.setSize(50, 30);
		a2.setSize(50, 30);
		a3.setSize(50, 30);
		a4.setSize(50, 30);
		cover.setSize(300, 100);

		b1.setLocation(x, 400);
		b2.setLocation(x + 50, 400);
		b3.setLocation(x + 100, 400);
		b4.setLocation(x + 150, 400);
		enter.setLocation(x + 220, 400 - guesses * 50);

		bR.setLocation(x, 450);
		bY.setLocation(x + 50, 450);
		bG.setLocation(x + 100, 450);
		bB.setLocation(x + 150, 450);
		bP.setLocation(x + 200, 450);
		
		a1.setLocation(0, 0);
		a2.setLocation(50, 0);
		a3.setLocation(100, 0);
		a4.setLocation(150, 0);
		cover.setLocation(0, 0);

		bR.setOpaque(true);
		bY.setOpaque(true);
		bG.setOpaque(true);
		bB.setOpaque(true);
		bP.setOpaque(true);

		b1.setOpaque(true);
		b2.setOpaque(true);
		b3.setOpaque(true);
		b4.setOpaque(true);

		a1.setOpaque(true);
		a2.setOpaque(true);
		a3.setOpaque(true);
		a4.setOpaque(true);

		cover.setOpaque(true);

		bR.setBackground(Color.RED);
		bY.setBackground(Color.YELLOW);
		bG.setBackground(Color.GREEN);
		bB.setBackground(Color.BLUE);
		bP.setBackground(Color.magenta);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

		bR.addActionListener(this);
		bY.addActionListener(this);
		bG.addActionListener(this);
		bB.addActionListener(this);
		bP.addActionListener(this);

		enter.addActionListener(this);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(label);
		frame.add(panel);
		frame.setSize(300, 500);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == bR) {
			red = true;
			yellow = false;
			green = false;
			blue = false;
			purple = false;
		} else if (arg0.getSource() == bY) {
			red = false;
			yellow = true;
			green = false;
			blue = false;
			purple = false;
		} else if (arg0.getSource() == bG) {
			red = false;
			yellow = false;
			green = true;
			blue = false;
			purple = false;
		} else if (arg0.getSource() == bB) {
			red = false;
			yellow = false;
			green = false;
			blue = true;
			purple = false;
		} else if (arg0.getSource() == bP) {
			red = false;
			yellow = false;
			green = false;
			blue = false;
			purple = true;
		}

		else if (arg0.getSource() == b1) {
			if (red == true) {
				b1.setBackground(Color.RED);
			} else if (yellow == true) {
				b1.setBackground(Color.YELLOW);
			} else if (green == true) {
				b1.setBackground(Color.GREEN);
			} else if (blue == true) {
				b1.setBackground(Color.BLUE);
			} else if (purple == true) {
				b1.setBackground(Color.MAGENTA);
			}
		} else if (arg0.getSource() == b2) {
			if (red == true) {
				b2.setBackground(Color.RED);
			} else if (yellow == true) {
				b2.setBackground(Color.YELLOW);
			} else if (green == true) {
				b2.setBackground(Color.GREEN);
			} else if (blue == true) {
				b2.setBackground(Color.BLUE);
			} else if (purple == true) {
				b2.setBackground(Color.MAGENTA);
			}
		} else if (arg0.getSource() == b3) {
			if (red == true) {
				b3.setBackground(Color.RED);
			} else if (yellow == true) {
				b3.setBackground(Color.YELLOW);
			} else if (green == true) {
				b3.setBackground(Color.GREEN);
			} else if (blue == true) {
				b3.setBackground(Color.BLUE);
			} else if (purple == true) {
				b3.setBackground(Color.MAGENTA);
			}
		} else if (arg0.getSource() == b4) {
			if (red == true) {
				b4.setBackground(Color.RED);
			} else if (yellow == true) {
				b4.setBackground(Color.YELLOW);
			} else if (green == true) {
				b4.setBackground(Color.GREEN);
			} else if (blue == true) {
				b4.setBackground(Color.BLUE);
			} else if (purple == true) {
				b4.setBackground(Color.MAGENTA);
			}
		}
		
		else if(arg0.getSource() == enter) {
			
			if(p1 == 0){
				a1.setBackground(Color.RED);
			} else if(p1 == 1) {
				a1.setBackground(Color.YELLOW);
			} else if(p1 == 2) {
				a1.setBackground(Color.GREEN);
			} else if(p1 == 3) {
				a1.setBackground(Color.BLUE);
			} else if(p1 == 4) {
				a1.setBackground(Color.MAGENTA);
			}
			
			if(p2 == 0){
				a2.setBackground(Color.RED);
			} else if(p2 == 1) {
				a2.setBackground(Color.YELLOW);
			} else if(p2 == 2) {
				a2.setBackground(Color.GREEN);
			} else if(p2 == 3) {
				a2.setBackground(Color.BLUE);
			} else if(p2 == 4) {
				a2.setBackground(Color.MAGENTA);
			}
			
			if(p3 == 0){
				a3.setBackground(Color.RED);
			} else if(p3 == 1) {
				a3.setBackground(Color.YELLOW);
			} else if(p3 == 2) {
				a3.setBackground(Color.GREEN);
			} else if(p3 == 3) {
				a3.setBackground(Color.BLUE);
			} else if(p3 == 4) {
				a3.setBackground(Color.MAGENTA);
			}
			
			if(p4 == 0){
				a4.setBackground(Color.RED);
			} else if(p4 == 1) {
				a4.setBackground(Color.YELLOW);
			} else if(p4 == 2) {
				a4.setBackground(Color.GREEN);
			} else if(p4 == 3) {
				a4.setBackground(Color.BLUE);
			} else if(p4 == 4) {
				a4.setBackground(Color.MAGENTA);
			}
			
			if(b1.getBackground()==Color.RED) {
				bg1 = 0;
			} else if(b1.getBackground()==Color.YELLOW) {
				bg1 = 1;
			} else if(b1.getBackground()==Color.GREEN) {
				bg1 = 2;
			} else if(b1.getBackground()==Color.BLUE) {
				bg1 = 3;
			} else if(b1.getBackground()==Color.MAGENTA) {
				bg1 = 4;
			} 
			
			if(b2.getBackground()==Color.RED) {
				bg2 = 0;
			} else if(b2.getBackground()==Color.YELLOW) {
				bg2 = 1;
			} else if(b2.getBackground()==Color.GREEN) {
				bg2 = 2;
			} else if(b2.getBackground()==Color.BLUE) {
				bg2 = 3;
			} else if(b2.getBackground()==Color.MAGENTA) {
				bg2 = 4;
			}
			
			if(b3.getBackground()==Color.RED) {
				bg3 = 0;
			} else if(b3.getBackground()==Color.YELLOW) {
				bg3 = 1;
			} else if(b3.getBackground()==Color.GREEN) {
				bg3 = 2;
			} else if(b3.getBackground()==Color.BLUE) {
				bg3 = 3;
			} else if(b3.getBackground()==Color.MAGENTA) {
				bg3 = 4;
			}
			
			if(b4.getBackground()==Color.RED) {
				bg4 = 0;
			} else if(b4.getBackground()==Color.YELLOW) {
				bg4 = 1;
			} else if(b4.getBackground()==Color.GREEN) {
				bg4 = 2;
			} else if(b4.getBackground()==Color.BLUE) {
				bg4 = 3;
			} else if(b4.getBackground()==Color.MAGENTA) {
				bg4 = 4;
			}
			
			if(bg1 == p1){
				c1 = 1;
			} else {
				c1 = 0;
			}
			if(bg2 == p2){
				c2 = 1;
			} else {
				c2 = 0;
			}
			if(bg3 == p3){
				c3 = 1;
			} else {
				c3 = 0;
			}
			if(bg4 == p4){
				c4 = 1;
			} else {
				c4 = 0;
			}
			
			JOptionPane.showMessageDialog(null, c1 + " " + c2+" "+c3+" "+c4);
		}

	}
}