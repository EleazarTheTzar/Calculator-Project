

import javax.swing.JFrame;


public class CalculatorTesting {
	public static void main(String[] args) {
		Calculator window = new Calculator();
		
		 
	        window.setSize(525,400);
	        window.setVisible(true);
	        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        window.setTitle("My first calculator");
	       // window.setMaximizedBounds(new Rectangle(525,360));
	        window.setResizable(false);
	}

}
