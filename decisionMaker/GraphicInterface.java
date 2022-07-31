package decisionMaker;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.*;

public class GraphicInterface extends JFrame implements ActionListener{

	JPanel unten;
	String s;

	public GraphicInterface() {
		super();

		this.setTitle("Activity Randomiser");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel content = this.initContent();
		this.getContentPane().add(initContent());

		;

		this.setLocation(300, 200);
		this.setSize(400, 250);
		this.setVisible(true);
	}

	public JPanel initContent()
	{
		JPanel main = new JPanel();
		main.setLayout(new BorderLayout(40, 30));
		main.setBackground(Color.BLUE);

		JPanel cnt = new JPanel();
		cnt.setLayout(new BorderLayout(40, 30));
		main.add(cnt, BorderLayout.CENTER);

		JPanel oben = new JPanel();
		oben.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 40));
		oben.setBackground(Color.BLUE);
		cnt.add(oben, BorderLayout.CENTER);


		JLabel desrb = new JLabel("hobby randomiser");
		desrb.setForeground(Color.WHITE);
		cnt.add(desrb);

		JPanel mitte = new JPanel();
		mitte.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 50));
		main.add(mitte, BorderLayout.CENTER);

		JLabel lab1 = new JLabel("Click to play: ");
		mitte.add(lab1, BorderLayout.NORTH);
		JButton btn = new JButton("Click me!");
		mitte.add(btn, BorderLayout.CENTER);
		
		//JPanel unten = new JPanel();
		//main.add(unten, BorderLayout.SOUTH);

		btn.addActionListener(this);

		return main;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicInterface();
	}



	public String random() {

		Random r=new Random();
		int f=r.nextInt(5);

		switch (f) {
		default:  s = "Free";
		break;
		case 1:  s = "Study";
		break;
		case 2:  s = "Read";
		break;
		case 3:  s = "Music";
		break;
		case 4:  s = "Create";
		break;

		}
		return s;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src=e.getSource();

		if(src instanceof JButton) {	
			this.random();
			JOptionPane.showMessageDialog(rootPane, this.s);
		}
	}

}
