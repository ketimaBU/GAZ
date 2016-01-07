package relever;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import brancher.Abonne;
import brancher.Compteur;


public class Consommations  {

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
	        System.out.println("Hello World");
	    }

	/**
	 * Create the frame.
	 */
	public Consommations() {
		 
	}

}
