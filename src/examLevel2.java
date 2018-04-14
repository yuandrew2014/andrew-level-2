import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class examLevel2 implements ActionListener {
public static void main(String[] args)  {
	examLevel2 e1 = new examLevel2();
	e1.colors();
}
JButton b1 = new JButton();
JButton b2 = new JButton();
JButton b3 = new JButton();
JButton b4 = new JButton();
void colors() {
JFrame f1 = new JFrame() ;
f1.setTitle("Color Teacher");
f1.setVisible(true);
JPanel p1 = new JPanel() ;
p1.setVisible(true);


b1.setVisible(true);
b1.setBackground(Color.YELLOW);
b1.setOpaque(true);
b1.addActionListener(this);


b2.setVisible(true);
b2.setBackground(Color.BLUE);
b2.setOpaque(true);
b2.addActionListener(this);


b3.setVisible(true);
b3.setBackground(Color.GREEN);
b3.setOpaque(true);
b3.addActionListener(this);


b4.setVisible(true);
b4.setBackground(Color.ORANGE);
b4.setOpaque(true);
b4.addActionListener(this);

f1.add(p1);
p1.add(b1);
p1.add(b2);
p1.add(b3);
p1.add(b4);
f1.pack();
}
void speak(String words) {
	try {
		Runtime.getRuntime().exec("say " + words);
	} catch (IOException e) {
		e.printStackTrace();
	}
}
@Override
public void actionPerformed(ActionEvent e ){
	// TODO Auto-generated method stub
	
	if(e.getSource().equals(b1)) {
		speak("yellow");
	}
	if(e.getSource().equals(b2)) {
		speak("blue");
	}
	if(e.getSource().equals(b3)) {
		speak("green");
	}
	if(e.getSource().equals(b4)) {
		speak("orange");
	}
}
}

