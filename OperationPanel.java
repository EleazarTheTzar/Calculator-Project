import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class OperationPanel extends JPanel{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2544186437191547656L;
	private GroupLayout layout;
	
	public OperationPanel (Calculator calc){
		
		
		layout = new GroupLayout(this);
		
		
		JButton blk0Button = new JButton(" ");
		JButton blk1Button = new JButton(" ");
		JButton pmButton = new JButton("\u00B1");
		JButton minusButton = new JButton("-");
		JButton multButton = new JButton("*");
		JButton divButton = new JButton("/");
		JButton addButton = new JButton("+");
		JButton modButton = new JButton("%");
		JButton eqButton = new JButton("=");
		JButton sqrtButton = new JButton("\u221A");
		JButton recButton = new JButton("1/x");
		
		
		sqrtButton.setEnabled(false);
		modButton.setEnabled(false);
		recButton.setEnabled(false);
		blk0Button.setEnabled(false);
		blk1Button.setEnabled(false);
		
		
		this.setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(false);
	  
		
		recButton.setFont(new Font(Font.SANS_SERIF,Font.ITALIC, 10));
		recButton.setMargin(new Insets(3,0,3,0));
		eqButton.setPreferredSize(new Dimension(60,59));
		layout.linkSize(SwingConstants.CENTER, blk0Button, blk1Button, pmButton, minusButton,multButton,divButton,addButton,modButton
				,recButton,sqrtButton);
		layout.linkSize(SwingConstants.VERTICAL, eqButton);
		
		layout.setHorizontalGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(blk0Button)
						.addComponent(pmButton)
						.addComponent(divButton)
						.addComponent(multButton)
						.addComponent(minusButton)
						.addComponent(addButton))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(blk1Button)
						.addComponent(sqrtButton)
						.addComponent(modButton)
						.addComponent(recButton)
						.addComponent(eqButton)
						)
		);
		layout.setVerticalGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(blk0Button)
						.addComponent(blk1Button))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(pmButton)
						.addComponent(sqrtButton))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(divButton)
						.addComponent(modButton))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(multButton)
						.addComponent(recButton))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addGroup(layout.createSequentialGroup()
						.addComponent(minusButton)
						.addComponent(addButton))
						.addComponent(eqButton))
						
				);
		
		
		pmButton.addActionListener(calc);
		pmButton.setActionCommand("\u00B1");
		minusButton.addActionListener(calc);
		minusButton.setActionCommand("-");
		multButton.addActionListener(calc);
		multButton.setActionCommand("*");
		divButton.addActionListener(calc);
		divButton.setActionCommand("/");
		addButton.addActionListener(calc);
		addButton.setActionCommand("+");
		modButton.addActionListener(calc);
		modButton.setActionCommand("%");
		eqButton.addActionListener(calc);
		eqButton.setActionCommand("=");
		sqrtButton.addActionListener(calc);
		sqrtButton.setActionCommand("\u221A");
		recButton.addActionListener(calc);
		recButton.setActionCommand("1/x");
		
	}
}
