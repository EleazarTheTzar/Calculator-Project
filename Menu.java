import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu implements ActionListener{

	Menu(Calculator calc){
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
	    System.out.println("Selected: " + e.getActionCommand());
	    
	  }
	}


