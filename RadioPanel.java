



import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8076206714897983420L;
	
	JRadioButton dec;
	JRadioButton oct;
	JRadioButton bin;
	JRadioButton hex;
	
	
	
	public RadioPanel(HexPanel hexpanel,NumPanel numpanel,Calculator calc){
		
		hex = new JRadioButton("Hex");
		dec = new JRadioButton("Dec");
		oct = new JRadioButton("Oct");
		bin = new JRadioButton("Bin");
		JRadioButton qword = new JRadioButton("Qword");
		JRadioButton dword = new JRadioButton("Dword");
		JRadioButton word = new JRadioButton("Word");
		JRadioButton byte1 = new JRadioButton("Byte");
		
		
		GroupLayout layout = new GroupLayout(this);
		
		qword.setEnabled(false);
		dword.setEnabled(false);
		word.setEnabled(false);
		byte1.setEnabled(false);
		
		
		ButtonGroup group = new ButtonGroup();
	    group.add(hex);
	    group.add(dec);
	    group.add(oct);
	    group.add(bin);
	    
	    //dec.setSelected(true);

		this.setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(false);
	  
		layout.setHorizontalGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(hex)
				.addComponent(dec)
				.addComponent(oct)
				.addComponent(bin)
				.addComponent(qword)
				.addComponent(dword)
				.addComponent(word)
				.addComponent(byte1)
			)
			
		);
		layout.setVerticalGroup(layout.createSequentialGroup()
				.addComponent(hex)
				.addComponent(dec)
				.addComponent(oct)
				.addComponent(bin)
				.addComponent(qword)
				.addComponent(dword)
				.addComponent(word)
				.addComponent(byte1)
			
		);
	  
		hex.addActionListener(hexpanel);
		hex.addActionListener(numpanel);
		hex.addActionListener(calc);
		hex.setActionCommand("hex");
		bin.addActionListener(hexpanel);
		bin.addActionListener(numpanel);
		bin.addActionListener(calc);
		bin.setActionCommand("bin");
		dec.addActionListener(hexpanel);
		dec.addActionListener(numpanel);
		dec.addActionListener(calc);
		dec.setActionCommand("dec");
		oct.addActionListener(hexpanel);
		oct.addActionListener(numpanel);
		oct.addActionListener(calc);
		oct.setActionCommand("oct");
						
	    
		
	 
	 
	}
	


	
}
