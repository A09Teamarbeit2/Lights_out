import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.*;

public class LoView extends JFrame {
	private GridLayout LoButtons =new GridLayout(5,5);
	private ArrayList<JToggleButton> J = new ArrayList<JToggleButton>();
	private JMenuItem reset =new JMenuItem("Reset Game");
	
	public LoView(){
		super();
		JMenuBar bar = new JMenuBar();
		JMenu menu = new JMenu("Spieleinstellungen");
		menu.add(reset);
		
		bar.add(menu);
		JPanel p1=new JPanel();
		p1.setLayout(new BorderLayout());
		JPanel p=new JPanel();
		p.setSize(300, 300);
		p.setLayout(LoButtons);
		
        for(int i=0;i<25;i++){
        	J.add(new JToggleButton());
        }  for(int i=0;i<J.size();i++){
        	J.get(i).setSize(50, 50);
        	p.add(J.get(i));
        }
        p1.add(p,BorderLayout.CENTER);
        p1.add(bar,BorderLayout.NORTH);
		setContentPane(p1);
		setSize(600, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void setActionListner(ActionListener a) {
		reset.addActionListener(a);
		for(int i=0;i<J.size();i++){
			J.get(i).addActionListener(a);
		}
	}
	public JMenuItem getReset() {
		return reset;
	}
	
	public ArrayList<JToggleButton> getJ() {
		return J;
	}

}
