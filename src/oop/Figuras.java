package oop;

import javax.swing.JOptionPane;

import java.awt.JobAttributes;
import java.util.ArrayList;
public class Figuras {
	
	static ArrayList<Centrs> centraObjekti = new ArrayList<>();
	static ArrayList<Cetrsturis> cetrsturaObjekti = new ArrayList<>();
	static ArrayList<Aplis> aplaObjekti = new ArrayList<>();
	static ArrayList<Trijsturis> trijsturaObjekti = new ArrayList<>();

	static String[] objPogas = {"Centrs", "Četrstūris", "Aplis", "Trujstūris", "Atgriezties"};
	
	public static void main(String[]args) {
		// izveido Centrs objektu
		/*
		Centrs centraP1 = new Centrs(-10, 12);
		System.out.println(centraP1.izvaditKoord());
		centraP1.parvietot(5, -1);
		System.out.println(centraP1.izvaditKoord());
		
		*/
	
		// izveido Cetrsturis objektu
		/*
		Cetrsturis cetrsturis1 = new Cetrsturis();
		System.out.println(cetrsturis1.izvaditCetrsturaInfo());
		// izvadīt šī četrstūra atrašanās vietu
		System.out.println(cetrsturis1.punkts.izvaditKoord());
		
		Cetrsturis cetrsturis2 = new Cetrsturis();
		System.out.println(cetrsturis2.izvaditCetrsturaInfo()+
				"\n"+cetrsturis2.punkts.izvaditKoord()+
				"\ns = "+cetrsturis2.cLaukums());
		
		Centrs punkts2 = new Centrs (5,23);
		Aplis aplis1 = new Aplis(punkts2, 5);
		System.out.println(aplis1.izvaditAplaInfo()+"\ns = "+aplis1.rLaukums()+"cm2.\nc = "+aplis1.rLinija()+" cm.");
	*/

		int izvele, poga;
		String izv;
		
		
		do {
			izv = JOptionPane.showInputDialog(null, "Ko vēlies darīt?\n0 - Apturēt.\n1 - Izveidot objektu\n"
					+"2 - Aplūkot objektus\n3- Izsaukt medoti");
			izvele = Integer.parseInt(izv);
			if(izvele == -1) izvele = 0;
			switch(izvele) {
			
			case 0: JOptionPane.showMessageDialog(null, "Programma ir beigta!"); System.exit(0); break;
			case 1: OIzveide.izveidotObjektu(); break;
			
			case 2: 
				poga = JOptionPane.showOptionDialog(null, "Kuras figūras aplūkot?", "Izvēle", JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.INFORMATION_MESSAGE,null, objPogas, objPogas[0]); 
				
					switch(poga) {
					case 4: break;
					case 0: 
						if(centraObjekti.size()<1) {
							JOptionPane.showMessageDialog(null, "~Nav neviens centra punkts~", "Kļūda!", JOptionPane.WARNING_MESSAGE); break; }
						JOptionPane.showMessageDialog(null, IzveidotieObjekti.izvadit(centraObjekti), "Centra punkti~", JOptionPane.PLAIN_MESSAGE); break;
					case 1:
						if(cetrsturaObjekti.size()<1) {
							JOptionPane.showMessageDialog(null, "~Nav neviens četrstūris~", "Kļūda!", JOptionPane.WARNING_MESSAGE); break; }
						JOptionPane.showMessageDialog(null, IzveidotieObjekti.izvaditCetr(cetrsturaObjekti), "Četrstūri~", JOptionPane.PLAIN_MESSAGE); break;
					case 2:
						if(cetrsturaObjekti.size()<1) {
							JOptionPane.showMessageDialog(null, "~Nav neviens aplis~", "Kļūda!", JOptionPane.WARNING_MESSAGE); break; }
						JOptionPane.showMessageDialog(null, IzveidotieObjekti.izvaditApl(aplaObjekti), "Āpļi~", JOptionPane.PLAIN_MESSAGE); break;
					case 3:
						if(cetrsturaObjekti.size()<1) {
							JOptionPane.showMessageDialog(null, "~Nav neviens trijstūris~", "Kļūda!", JOptionPane.WARNING_MESSAGE); break; }
						JOptionPane.showMessageDialog(null, IzveidotieObjekti.izvaditTrij(trijsturaObjekti), "Trijstūri~", JOptionPane.PLAIN_MESSAGE); break;
					}
					break;
			}
		}while(izvele != 0);
		
	}
	
}
