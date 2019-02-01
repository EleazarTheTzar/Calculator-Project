import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
public class NumPanel extends JPanel implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8196485917275957401L;
	private GroupLayout layout;
	boolean notDec = true;;
	JButton num0Button;
	JButton num1Button;
	JButton num2Button;
	JButton num3Button;
	JButton num4Button;
	JButton num5Button;
	JButton num6Button;
	JButton num7Button;
	JButton num8Button;
	JButton num9Button;
	
	public NumPanel(Calculator calc){
	layout = new GroupLayout(this);
	
	num0Button = new JButton("0");
	num1Button = new JButton("1");
	num2Button = new JButton("2");
	num3Button = new JButton("3");
	num4Button = new JButton("4");
	num5Button = new JButton("5");
    num6Button = new JButton("6");
	num7Button = new JButton("7");
    num8Button = new JButton("8");
	num9Button = new JButton("9");
	JButton decButton = new JButton(".");
	
	decButton.setEnabled(false);
	num0Button.setMargin(new Insets(2,0,2,0));
	
	layout.linkSize(SwingConstants.HORIZONTAL, num1Button, num2Button, num3Button, num4Button, num5Button, num6Button, num7Button, decButton, num8Button, num9Button);
	
	this.setLayout(layout);
	layout.setAutoCreateGaps(true);
	layout.setAutoCreateContainerGaps(false);
	layout.setHorizontalGroup(
			   layout.createSequentialGroup()
			   .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					   .addGroup( layout.createSequentialGroup()
							   .addComponent(num7Button)
							      .addComponent(num8Button))
					   .addGroup( layout.createSequentialGroup()
							   .addComponent(num4Button)
							      .addComponent(num5Button))
					   .addGroup( layout.createSequentialGroup()
							   .addComponent(num1Button)
							      .addComponent(num2Button))
					   .addComponent(num0Button))
			      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			      .addComponent(num9Button)
			      .addComponent(num6Button)
			      .addComponent(num3Button)
			      .addComponent(decButton))
			);
			layout.setVerticalGroup(
			   layout.createSequentialGroup()
			      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
			           .addComponent(num7Button)
			           .addComponent(num8Button)
			           .addComponent(num9Button))
			      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				           .addComponent(num4Button)
				           .addComponent(num5Button)
				           .addComponent(num6Button))
			      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				           .addComponent(num1Button)
				           .addComponent(num2Button)
				           .addComponent(num3Button))
			      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				           .addComponent(num0Button)
				           .addComponent(decButton))
			      
			);
			
			Dimension zeroDimension = num1Button.getSize();
			//double width = 2*zeroDimension.getWidth();
			//zeroDimension.
			System.out.println("width" + zeroDimension.width);
			System.out.println("height" + zeroDimension.height);
			num0Button.setPreferredSize(new Dimension(89,30));
			layout.linkSize(SwingConstants.CENTER, num0Button);
			
			
			
			num0Button.addActionListener(calc);
			num0Button.setActionCommand("0");
			num1Button.addActionListener(calc);
			num1Button.setActionCommand("1");
			num2Button.addActionListener(calc);
			num2Button.setActionCommand("2");
			num3Button.addActionListener(calc);
			num3Button.setActionCommand("3");
			num4Button.addActionListener(calc);
			num4Button.setActionCommand("4");
			num5Button.addActionListener(calc);
			num5Button.setActionCommand("5");
			num6Button.addActionListener(calc);
			num6Button.setActionCommand("6");
			num7Button.addActionListener(calc);
			num7Button.setActionCommand("7");
			num8Button.addActionListener(calc);
			num8Button.setActionCommand("8");
			num9Button.addActionListener(calc);
			num9Button.setActionCommand("9");
			decButton.addActionListener(calc);
			decButton.setActionCommand(".");
			
			
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String buttonPressed = e.getActionCommand();
		
		if(buttonPressed.equals("bin")){
			num2Button.setEnabled(false);
			num3Button.setEnabled(false);
			num4Button.setEnabled(false);
			num5Button.setEnabled(false);
			num6Button.setEnabled(false);
			num7Button.setEnabled(false);
			num8Button.setEnabled(false);
			num9Button.setEnabled(false);
		}else if(buttonPressed.equals("oct")){
			num2Button.setEnabled(true);
			num3Button.setEnabled(true);
			num4Button.setEnabled(true);
			num5Button.setEnabled(true);
			num6Button.setEnabled(true);
			num7Button.setEnabled(true);
			num8Button.setEnabled(false);
			num9Button.setEnabled(false);
		}else if(buttonPressed.equals("dec") || buttonPressed.equals("hex")){
			num2Button.setEnabled(true);
			num3Button.setEnabled(true);
			num4Button.setEnabled(true);
			num5Button.setEnabled(true);
			num6Button.setEnabled(true);
			num7Button.setEnabled(true);
			num8Button.setEnabled(true);
			num9Button.setEnabled(true);
			
		}
	}
	
}
