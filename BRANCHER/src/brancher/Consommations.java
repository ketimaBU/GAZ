package brancher;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class Consommations extends JFrame {

	private JPanel contentPane;

	Abonne abonne=new Abonne();
	Compteur cmpt=new Compteur();
	
	int conso=0;
	public int Fraiconso()
	{
		
		switch (conso) {
        case 1:  conso =conso*2;
                 break;
        case 2:  conso = conso*4;
                 break;
        case 3:  conso = conso*8;
                 break;
        case 4:  conso =conso*10;
                 break;
      
        
    }
		return conso;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consommations frame = new Consommations();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Consommations() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
