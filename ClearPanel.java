import java.awt.Insets;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ClearPanel extends JPanel{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4166376367876618481L;
	private GroupLayout layout;
	
	public ClearPanel(Calculator calc){
		
	  layout = new GroupLayout(this);
	  JButton clrButton = new JButton("C");
	  JButton backSpcButton = new JButton("\u2190");
	  JButton clrEButton = new JButton("CE");
	  JButton blk0Button = new JButton(" ");
	  JButton blk1Button = new JButton(" ");
	  JButton blk2Button = new JButton(" ");
	  
	  blk0Button.setEnabled(false);
	  blk1Button.setEnabled(false);
	  blk2Button.setEnabled(false);
	  
	  
	  backSpcButton.setMargin(new Insets(0,0,0,0));
	  clrEButton.setMargin(new Insets(0,0,0,0));
	  
	  
	  layout.linkSize(clrButton, blk0Button, clrEButton, backSpcButton, blk1Button, blk2Button);
	  
		this.setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(false);
	  
		layout.setHorizontalGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(blk0Button)
				.addComponent(backSpcButton))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(blk1Button)
				.addComponent(clrEButton))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(blk2Button)
				.addComponent(clrButton))
			
		);
		layout.setVerticalGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				.addComponent(blk0Button)
				.addComponent(blk1Button)
				.addComponent(blk2Button))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				.addComponent(backSpcButton)
				.addComponent(clrEButton)
				.addComponent(clrButton))
				
		);
	  
		
		clrButton.addActionListener(calc);
		clrButton.setActionCommand("C");
		clrEButton.addActionListener(calc);
		clrEButton.setActionCommand("CE");
		backSpcButton.addActionListener(calc);
		backSpcButton.setActionCommand("backspace");
		
	}
	
}
