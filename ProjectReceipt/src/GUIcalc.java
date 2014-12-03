
/*Elohe Yonas
 * csc200
 * ProjectReceipt
 * 
 */
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GUIcalc extends JFrame implements ActionListener {
	/*have GUI class use Jframe options 
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField [] jtxtapples = new JTextField[1];
	JTextField [] jtxtbanana = new JTextField[1];
	JButton jbtnCalScore = new JButton("Calcuate Score");
	JPanel jpanelScore = new JPanel(); 
	JTextField jtxtDisplay = new JTextField();
	/*
	 * implement text panels and has placeholders for apples and bananas.
	 */
	
	int [] apples = new int [1];
	int [] banana = new int [1];
	public GUIcalc() {
		for(int i=0; i<jtxtapples.length; i++) {
			jtxtapples[i] = new JTextField(6);
			jtxtbanana[i] = new JTextField(6);
			jpanelScore.add(jtxtapples[i]);
			jpanelScore.add(jtxtbanana[i]);
		}
		/*
		 * set I in JText to input numbers.
		 */
		jbtnCalScore.addActionListener(this);
		add(jtxtDisplay, BorderLayout.NORTH);
		add(jpanelScore);
		add(jbtnCalScore, BorderLayout.SOUTH);
		setVisible(true);
		pack();
		/*seperate display and and calscore to north and south borders
		 * setting the display to being visible
		 */
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		for(int i=0; i<apples.length; i++) {
			apples[i] = Integer.parseInt(jtxtapples[i].getText());
			banana[i] = Integer.parseInt(jtxtbanana[i].getText());
		}
		jtxtDisplay.setText(Calculate.calscore(apples, banana)+"");
		/*
		 * have txtdisplay output the results
		 */
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculate();
	}
/*
 * implement GUI into Class Calculate
 */
}