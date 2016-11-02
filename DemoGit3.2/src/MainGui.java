import java.awt.Dimension;

import javax.swing.JFrame;


	/**
	 * @param args
	 */
	
public class MainGui extends JFrame {
	public MainGui(){
		setTitle("git Demo");
		setPreferredSize(new  Dimension(500,500));
		pack();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainGui f = new MainGui();
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);	
	}

}
