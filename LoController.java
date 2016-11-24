import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class LoController  {
	
	 private LoView v;
	 private LoModel m;
	 LoController() {
	        v = new LoView();
	        m = new LoModel();
	        v.setActionListner(new MyAction());
	        for (int i = 0; i < v.getJ().size(); i++) {
			v.getJ().get(i).setSelected(m.getI().get(i));
	        }
	    }
	
		
		
	
 private class MyAction implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==v.getReset()){
			m.init();
			v.repaint();
		}
		for(int i=0;i<v.getJ().size();i++){
				if(e.getSource()==v.getJ().get(i)){
					m.click(i);
			        v.getJ().get(i).setSelected(m.getI().get(i));
			        v.repaint();
					
			} }
		}
		}
		
		
	


public static void main(String[] args) {
	LoController c=new LoController();
}
}

