import java.util.ArrayList;

public class LoModel {
	private ArrayList<Boolean> I=new ArrayList<Boolean>();
	
	LoModel(){
		for(int i=0;i<25;i++){
			I.add(false);
		}
	}
	
	public void init (){
		for(int i=0;i<25;i++){
			I.add(false);
		}
		I.set(1&5&8&16&20&22&24,true);
	}
	public ArrayList<Boolean> click(int x){
		if(x<=6||x==10||x==11||x==15||x==16||x==20||x==21||x==22||x==23||x==24||x==25){
		if(x==1){
			I.set(x,!I.get(x));
			I.set(x+1,!I.get(x+1));
			I.set(x+5,!I.get(x+5));
		}
		if(x==6||x==11||x==16){
			I.set(x,!I.get(x));
			I.set(x+1,!I.get(x+1));
			I.set(x+5,!I.get(x+5));
			I.set(x-5,!I.get(x-5));
		}
		if(x==21){
			I.set(x,!I.get(x));
			I.set(x+1,!I.get(x+1));
			I.set(x-5,!I.get(x-5));
		}
		if(x==2||x==3||x==4){
			I.set(x,!I.get(x));
			I.set(x-1,!I.get(x-1));
			I.set(x+1,!I.get(x+1));
			I.set(x+5,!I.get(x+5));
		}
		if(x==22||x==23||x==24){
			I.set(x,!I.get(x));
			I.set(x-1,!I.get(x-1));
			I.set(x+1,!I.get(x+1));
			I.set(x-5,!I.get(x-5));
		}
		if(x==10||x==15||x==20){
			I.set(x,!I.get(x));
			I.set(x-1,!I.get(x-1));
			I.set(x+5,!I.get(x+5));
			I.set(x-5,!I.get(x-5));
		}
		if(x==25){
			I.set(x,!I.get(x));
			I.set(x-1,!I.get(x-1));
			I.set(x-5,!I.get(x-5));
		}
		if(x==5){
			I.set(x,!I.get(x));
			I.set(x-1,!I.get(x-1));
			I.set(x+5,!I.get(x+5));
		}
		
	}else{
		I.set(x,!I.get(x));
		I.set(x-1,!I.get(x-1));
		I.set(x-5,!I.get(x-5));
		I.set(x+1,!I.get(x+1));
		I.set(x+5,!I.get(x+5));
	}
      return I;
	}
	public ArrayList<Boolean> getI() {
		return I;
	}
}
