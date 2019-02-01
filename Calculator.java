import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9129280542397368057L;
	private CalcPanel panel;
	private JPanel panel2;
	// private JPanel panel3;
	// private JButton addButton;
	private JTextField resultField;
	private JTextField bitField;
	Integer result = 0, a = 0, b = 0;
	boolean answer=false,answer2=false,answer3=false,plus=false,minus=false,mult=false,div=false,mod=false,negA=false,negB=false;
	String operator = "";
	int base = 10;
	// private GroupLayout layout;
	// private JTextArea resultField;
	// JButton num1 = new JButton("1");
	// num = new NumPanel(this);
   
	
	
	public Calculator() {

		// num1.setBounds(60,60,60,60);
		// setLayout(new BorderLayout(1,1));
		panel2 = new JPanel();
		// panel2.setBackground(Color.);
		//bitField = new JTextField(42);
		bitField = new JTextField(42);
		bitField.setPreferredSize(new Dimension(600, 60));
		bitField.setHorizontalAlignment(SwingConstants.RIGHT);
		resultField = new JTextField(42);
		resultField.setPreferredSize(new Dimension(600, 60));
		resultField.setBackground(Color.white);
		resultField.setEditable(false);
		
		bitField.setEditable(false);
		
		//bitField.setBackground(Color.lightGray);
		resultField.setHorizontalAlignment(SwingConstants.RIGHT);
		panel = new CalcPanel(this);
		createmenu();
		//bitField.setText(bitField.setText("0") + bitField.setText("0"));
		resultField.setText("0");
		bitField.setText("0");
		bitField.setText(Integer.toBinaryString((int) Math.pow(2, 64)));
		// RadioPanel radiopanel = new RadioPanel(hexpanel,numpanel);

		add(panel, BorderLayout.SOUTH);

		Font font1 = new Font("Consolas", Font.LAYOUT_RIGHT_TO_LEFT, 20);
		//Font font2 = new Font("Consolas", Font.LAYOUT_RIGHT_TO_LEFT, 14);
		resultField.setFont(font1);
		//bitField.setFont(font2);

		panel2.add(resultField);
		panel2.add(bitField);

		add(panel2, BorderLayout.CENTER);

	}

	
	
	private void createmenu() {
		JMenuBar menubar = new JMenuBar();
		JMenu view = new JMenu("view");
		JMenu help = new JMenu("help");
		JMenu edit = new JMenu("edit");
		JMenuItem hide = new JMenuItem("hide");
		view.add(hide);
		view.setMnemonic(KeyEvent.VK_F);
		menubar.add(view);
		menubar.add(edit);
		menubar.add(help);
		setJMenuBar(menubar);
		//hide.addActionListener(new ActionListener());
		//frame.setState(Frame.ICONIFIED);
		//menubar.add(view);


	
		

	}

	public void actionPerformed(ActionEvent e) {
		int x = 1;
		
		String buttonPressed = e.getActionCommand();

		answer2 = false;
		answer3 = false;
		if (!resultField.equals(null)) {

			if (buttonPressed.equals("hex")) {
				
				result = Integer.valueOf(resultField.getText(), base);
				base = 16;
				resultField.setText("" + Integer.toString(result, base).toUpperCase());
			} else if (buttonPressed.equals("dec")) {
				// result = Integer.valueOf(resultField.getText(),base);
				base = 10;
				resultField.setText("" + Integer.toString(result, base).toUpperCase());
			} else if (buttonPressed.equals("oct")) {
				result = Integer.valueOf(resultField.getText(), base);
				base = 8;
				resultField.setText("" + Integer.toString(result, base).toUpperCase());
			} else if (buttonPressed.equals("bin")) {
				result = Integer.valueOf(resultField.getText(), base);
				base = 2;
				resultField.setText("" + Integer.toString(result, base).toUpperCase());
			}
		}

		if (buttonPressed.equals("0") || buttonPressed.equals("1") || buttonPressed.equals("2")
				|| buttonPressed.equals("3") || buttonPressed.equals("4") || buttonPressed.equals("5")
				|| buttonPressed.equals("6") || buttonPressed.equals("7") || buttonPressed.equals("8")
				|| buttonPressed.equals("9") || buttonPressed.equals("a") || buttonPressed.equals("b")
				|| buttonPressed.equals("c") || buttonPressed.equals("d") || buttonPressed.equals("e")
				|| buttonPressed.equals("f")) {
			
			//c=Integer.valueOf(resultField.getText(), base);
			//bitField.setText("" + Integer.toBinaryString(c));
			if(answer){
				resultField.setText("0");
				answer=false;
				
			}
			
				
			
			if(resultField.getText().charAt(0)=='0'){
				resultField.setText(buttonPressed.toUpperCase());
			}else{
			    resultField.setText(resultField.getText() + buttonPressed.toUpperCase());
			     }
			
		} else if (buttonPressed.equals("+") && plus == false) {
			a = Integer.valueOf(resultField.getText(), base);
			//bitField.setText("" + Integer.toBinaryString(a));
			operator = "+";
			plus=true;
			resultField.setText("0");
		} else if (buttonPressed.equals("-") && minus == false) {
			if(minus == false)
			a = Integer.valueOf(resultField.getText(), base);
			operator = "-";
			resultField.setText("0");
			minus = true;
			
			//resultField.setText(null);
		} else if (buttonPressed.equals("*") && mult == false) {
			a = Integer.valueOf(resultField.getText(), base);
			operator = "*";
			mult = true;
			
			resultField.setText("0");
		} else if (buttonPressed.equals("/") && div == false) {
			a = Integer.valueOf(resultField.getText(), base);
			operator = "/";
			div = true;
			
			resultField.setText("0");
		} else if (buttonPressed.equals("Mod") && mod == false) {
			a = Integer.valueOf(resultField.getText(), base);
			operator = "Mod";
			mod = true;
			
			resultField.setText("0");
		} else if (buttonPressed.equals("\u00B1")) {
			//operator = "\u00B1";// plus minus button
			//operator="plusMinus";
			if(operator == "")
			{
				a = Integer.valueOf(resultField.getText(), base);
				negANum(a); a*=-1;
			}
			else 
			{
				b = Integer.valueOf(resultField.getText(), base);
				negANum(b); b*=-1;

				x++;
			}
			//negA=true;
			
		}else if (buttonPressed.equals("=")) {
			boolean flag = false;
			if(x<2)
			{
				b=Integer.valueOf(resultField.getText(), base);
				x=1;
			}
			//System.out.println(b+" ");
			
			//b*=x>2?-1:1;
			
			switch (operator) {
			case "+":
				result = a + b;
				plus = false;
				break;
			case "/":
				
				if(b == 0){
					resultField.setText("cannot divide by zero");
					answer = true;
					flag = true;
				}else{
					 result = a/b;
					 }
				
				div = false;
				break;
			case "-":
				result = a - b;
				minus = false;
				break;
			case "*":
				result = a * b;
				mult = false;
				break;
			case "Mod":
				result = a % b;
				mod = false;
				break;
			//case "plusMinus":
				////operator="+";
				//neg=true;
				//break;

			}

			// put result in resultField
			if(!flag){
			System.out.println(a+" "+operator+" "+b);
			resultField.setText("" + Integer.toString(result, base).toUpperCase());
			bitField.setText("" + Integer.toBinaryString(result));
			answer = true;
			}
		}else if (buttonPressed.equals("backspace")) {
			String value = resultField.getText();
			if(value.charAt(0) != '0'){
				resultField.setText(value.substring(0, value.length() - 1));
			}
			
		}
		
		if (buttonPressed.equals("C")) {
			answer2 = true;
		}
		if (buttonPressed.equals("CE")) {
			answer3 = true;
		}
		if (answer2) {
			operator = "";
			resultField.setText("0");
		}
		if (answer3) {
			if (!(operator == "")) {
				b = 0;
				resultField.setText("0");
			} else if(operator == ""){
				a = 0;
				resultField.setText("0");
			}
				
		}

	}
	public void negANum(int a){
		
		a = a * -1;
		resultField.setText(Integer.toString(a, base));
		
	}
public void negBNum(int b){
		
		b = b * -1;
		resultField.setText(Integer.toString(b, base));
		negA=false;
		negB=false;
		
	}
}