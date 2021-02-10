package kakuro;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelDescription extends JPanel {
	private JLabel label1 = new JLabel("Le but du jeu est de remplir la grille(c'est-�-dire toutes les cases blanches)");
	private JLabel label2 = new JLabel("en respectant les r�gles suivantes :                                                                         ");
	private JLabel label3 = new JLabel("- Les nombres inscrits correspondent � la somme des chiffres de la ligne ");
	private JLabel label4 = new JLabel("ou de la colonne compos�e par les cases blanches suivantes.                ");
	private JLabel label5 = new JLabel("- Un nombre en haut � droite d'une case noire correspond � la somme    ");
	private JLabel label6 = new JLabel("des chiffres de la ligne.                                                                                         ");
	private JLabel label7 = new JLabel("- Un nombre en bas � gauche d'une case noire correspond � la somme      ");
	private JLabel label8 = new JLabel("des chiffres de la colonnes.                                                                                   ");
	private JLabel label9 = new JLabel("- Dans une m�me ligne ou colonne (d�limit�e par la cases noires), on peut");
	private JLabel label10 = new JLabel(" mettre uniquement des chiffres entre 1 et 9 sans utiliser deux fois le       ");
	private JLabel label11 = new JLabel("m�me chiffre.                                                                                                          ");
	private JLabel labelEspace1 = new JLabel("                                                                                                                       ");
	private JLabel labelEspace2 = new JLabel("                                                                                                                       ");
	private JLabel labelEspace3 = new JLabel("                                                                                                                       ");
	private JLabel labelEspace4 = new JLabel("                                                                                                                       ");
	private JLabel labelEspace5 = new JLabel("                                                                                                                       ");
	private JLabel labelEspace6 = new JLabel("                                                                                                                       ");
	private JLabel labelAide = new JLabel("                                            *** AIDE ***                                                  ");
	private JLabel labelIndice1 = new JLabel("*** Soyez rapide! Votre score d�pendra du temps �coul�. ***" );
	private JLabel labelIndice2 = new JLabel("*** Si vous �tes bloqu�, utilisez le boutton indice. ***"  );
	private JLabel labelIndice3 = new JLabel("*** Si vous �tes incapable de finir le jeu, utilisez le boutton solveur. ***"  );
	
	public PanelDescription()
	{
		this.setPreferredSize(new Dimension(430, 460));
		
		add(labelAide);
		add(labelEspace1);
		add(label1);
		add(label2);
		add(labelEspace2);
		add(label3);
		add(label4);
		add(labelEspace3);
		add(label5);
		add(label6);
		add(labelEspace4);
		add(label7);
		add(label8);
		add(labelEspace5);
		add(label9);
		add(label10);
		add(label11);
		add(labelEspace6);
		add(labelIndice2);
		add(labelIndice1);
		add(labelIndice3);
		
	
	}
	

}
