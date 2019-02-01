//import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
//import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class HexPanel extends JPanel implements ActionListener{

	boolean notHex = false;

	/**
	 * 
	 */
	private static final long serialVersionUID = 5593664994324860481L;
	private GroupLayout layout;
	JButton aButton;
	JButton bButton;
	JButton cButton;
	JButton dButton;
	JButton eButton;
	JButton fButton;
	
	public HexPanel(Calculator calc){
	layout = new GroupLayout(this);
	
	aButton = new JButton("A");
    bButton = new JButton("B");
	cButton = new JButton("C");
	dButton = new JButton("D");
	eButton = new JButton("E");
	fButton = new JButton("F");
	JButton quotButton = new JButton("Quot");
	JButton modButton = new JButton("Mod");
	JButton blk0Button = new JButton(" ");
	JButton blk1Button = new JButton(" ");
	JButton blk2Button = new JButton(" ");
	
	JButton blk3Button = new JButton(" ");
	JButton blk4Button = new JButton(" ");
	JButton blk5Button = new JButton(" ");
	JButton blk6Button = new JButton(" ");
	
	JButton blk7Button = new JButton(" ");
	JButton blk8Button = new JButton(" ");
	JButton blk9Button = new JButton(" ");
	

	blk0Button.setEnabled(false);
	blk1Button.setEnabled(false);
	blk2Button.setEnabled(false);
	blk3Button.setEnabled(false);
	blk4Button.setEnabled(false);
	blk5Button.setEnabled(false);
	blk6Button.setEnabled(false);
	blk7Button.setEnabled(false);
	blk8Button.setEnabled(false);
	blk9Button.setEnabled(false);
	quotButton.setEnabled(false);
	
	
   // calc.add(quotButton);
	modButton.setMargin(new Insets(3,5,3,5));
	quotButton.setMargin(new Insets(3,5,3,5));
	//modButton.setPreferredSize(new Dimension(25,25));
	//quotButton.setPreferredSize(new Dimension(25,25));
	
	modButton.setFont(new Font(Font.SANS_SERIF,Font.BOLD, 10));
	quotButton.setFont(new Font(Font.SANS_SERIF,Font.BOLD, 10));
	
	this.setLayout(layout);
	layout.setAutoCreateGaps(true);
	layout.setAutoCreateContainerGaps(false);
	//setMinimumSize();
	//group.addComponent(quotButton, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE
	layout.linkSize(SwingConstants.HORIZONTAL, aButton, bButton, cButton, dButton, eButton, fButton, blk0Button, modButton, quotButton, blk1Button, 
					blk2Button, blk3Button, blk4Button, blk5Button, blk6Button, blk7Button, blk8Button, blk9Button
					);
	layout.setHorizontalGroup(
			   layout.createSequentialGroup()
			   .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					   .addComponent(quotButton)
					   .addComponent(blk0Button)
					   .addComponent(blk1Button)
					   .addComponent(blk2Button)
					   .addComponent(blk3Button)
					   .addComponent(blk4Button)
					   )
			   .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					   .addComponent(modButton)
					   .addComponent(blk5Button)
					   .addComponent(blk6Button)
					   .addComponent(blk7Button)
					   .addComponent(blk8Button)
					   .addComponent(blk9Button)
					   ) 
			   .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			      .addComponent(aButton)
			      .addComponent(bButton)
			      .addComponent(cButton)
			      .addComponent(dButton)
		           .addComponent(eButton)
		           .addComponent(fButton))
			);
			layout.setVerticalGroup(
			   layout.createSequentialGroup()
			      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
			           .addComponent(aButton)
			           .addComponent(quotButton)
			           .addComponent(modButton)
			           )
			      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				           .addComponent(bButton)
				           .addComponent(blk0Button)
				           .addComponent(blk5Button)
				         )
			      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				           .addComponent(cButton)
				           .addComponent(blk1Button)
				           .addComponent(blk6Button)
				        )
			      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				           .addComponent(dButton)
				           .addComponent(blk2Button)
				           .addComponent(blk7Button)
				        )
			      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				           .addComponent(eButton)
				           .addComponent(blk3Button)
				           .addComponent(blk8Button)
				        )
			      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				           .addComponent(fButton)
				           .addComponent(blk4Button)
				           .addComponent(blk9Button)
				        )
			);
			
			aButton.addActionListener(calc);
			aButton.setActionCommand("a");
			bButton.addActionListener(calc);
			bButton.setActionCommand("b");
			cButton.addActionListener(calc);
			cButton.setActionCommand("c");
			dButton.addActionListener(calc);
			dButton.setActionCommand("d");
			eButton.addActionListener(calc);
			eButton.setActionCommand("e");
			fButton.addActionListener(calc);
			fButton.setActionCommand("f");
			quotButton.addActionListener(calc);
			quotButton.setActionCommand("Quot");
			modButton.addActionListener(calc);
			modButton.setActionCommand("Mod");
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String buttonPressed = e.getActionCommand();
		
		if(buttonPressed.equals("bin") || buttonPressed.equals("dec") || buttonPressed.equals("oct")){
			notHex = true;
		}
		if(buttonPressed.equals("hex")){
			notHex = false;
		}
		if(notHex){
			aButton.setEnabled(false);
			bButton.setEnabled(false);
			cButton.setEnabled(false);
			dButton.setEnabled(false);
			eButton.setEnabled(false);
			fButton.setEnabled(false);
			
		}else{
			aButton.setEnabled(true);
			bButton.setEnabled(true);
			cButton.setEnabled(true);
			dButton.setEnabled(true);
			eButton.setEnabled(true);
			fButton.setEnabled(true);			
		}
	}
	
}
