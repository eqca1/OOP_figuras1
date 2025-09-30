package oop;

import javax.swing.JOptionPane;

public class OIzveide {
	
	static int cPIzvele() {
		
		if( Figuras.centraObjekti.size() < 1)
		return -1;
		
		String izvele = JOptionPane.showInputDialog(null, IzveidotieObjekti.izvadit(Figuras.centraObjekti));
		if (izvele == null) return -1;
		
		return Integer.parseInt(izvele);
	}
	
	static void izveidotObjektu() {
		
		int x,y,cPNr, izvele; double p, a; int mala1, mala2, mala3;
		
		izvele = JOptionPane.showOptionDialog(null, "~Kuru objektu veidot?~", "Izvēle", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
				null, Figuras.objPogas, Figuras.objPogas[0]);
		if(izvele == -1) izvele = 0;
		switch(izvele) {
		case 4: JOptionPane.showMessageDialog(null, "~Atgriežas uz galveno izvēlni~", "Paziņojums", JOptionPane.INFORMATION_MESSAGE); break;
		
		case 0: 
			String xiev;
			do {
			xiev = JOptionPane.showInputDialog(null, "~Ievadi centra punkta x koordinātas ( -100 -- 100 )~");
			x = Integer.parseInt(xiev);
			
			}while(x < -100 || x > 100);
			
			
			
			String yiev;
			do {
			yiev = JOptionPane.showInputDialog(null, "~Ievadi centra punkta y koordinātas ( -100 -- 100 )~");
			y = Integer.parseInt(yiev);
			
			}while(y < -100 || y > 100);
			
			if((x == -1 || y == -1) && (xiev == null || yiev == null)) {
				JOptionPane.showMessageDialog(null, "Centra punkts netika izveidots!", "Kļūda!", JOptionPane.ERROR_MESSAGE);
				break;
			}
			
			Figuras.centraObjekti.add(new Centrs(x, y));
			
			JOptionPane.showMessageDialog(null, "Centra punkts izveidots!", "Paziņojums", JOptionPane.INFORMATION_MESSAGE);
			break;
			
			case 1:
				String[] ceIzvelesVeids = {"Noklusējuma", "Centra punkts un malas"};
				String veids = (String)JOptionPane.showInputDialog(null, "Izvēlies, kuru konstruktoru izsaukt", "Četrstūra izveide",
						JOptionPane.QUESTION_MESSAGE, null, ceIzvelesVeids, ceIzvelesVeids[0]);
				if(veids == null)
					veids = ceIzvelesVeids[0];
				
				switch (veids) {
				case "Noklusējuma":
					JOptionPane.showMessageDialog(null, "Noklusējuma četrstūris izveidots!", "Paziņojums", JOptionPane.INFORMATION_MESSAGE);
					Figuras.cetrsturaObjekti.add(new Cetrsturis());
					break;
				case "Centra punkts un malas":
					cPNr = cPIzvele();
					if (cPNr == -1) {
						JOptionPane.showMessageDialog(null, "Nav centra punkts ko izvēlēties!", "Kļūda", JOptionPane.ERROR_MESSAGE); break; }
					String piev;
				
					do {
					piev = JOptionPane.showInputDialog(null, "~Ievadi platumu ( 1 - 100 )~");
					p = Integer.parseInt(piev);

					}while(p < 1 || p > 100);
					String aiev;
					do {
					aiev = JOptionPane.showInputDialog(null, "~Ievadi augstumu ( 1 - 100 )~");
					a = Integer.parseInt(piev);
					}while(a < 1 || a > 100);
					JOptionPane.showMessageDialog(null, "Četrstūris izveidots!", "Paziņojums", JOptionPane.INFORMATION_MESSAGE);
					
					if (p == -1 || a == -1) JOptionPane.showMessageDialog(null, "Četrstūris netika izveidots",
							"Kļūda!", JOptionPane.ERROR_MESSAGE);
					Figuras.cetrsturaObjekti.add(new Cetrsturis(Figuras.centraObjekti.get(cPNr),p, a ));
					
					break;
				}
				break;
			case 2: 
				cPNr = cPIzvele();
				if (cPNr == -1) {
					JOptionPane.showMessageDialog(null, "Nav centra punkts ko izvēlēties!", "Kļūda", JOptionPane.ERROR_MESSAGE); break; }
				int r;
				String riev;
				do {
				riev = JOptionPane.showInputDialog(null, "~Ievadi apļa raduisu ( 1 - 100 )~");
				r = Integer.parseInt(riev);

				}while(r < 1 || r > 100);
				JOptionPane.showMessageDialog(null, "Aplis izveidots!", "Paziņojums", JOptionPane.INFORMATION_MESSAGE);

				Figuras.aplaObjekti.add(new Aplis(Figuras.centraObjekti.get(cPNr), r));
				break;
			case 3:
			// Realizēt trijstūra izveidi	
				cPNr = cPIzvele();
				if (cPNr == -1) {
					JOptionPane.showMessageDialog(null, "Nav centra punkts ko izvēlēties!", "Kļūda", JOptionPane.ERROR_MESSAGE); break; }
				String m1iev;
				do {
				m1iev = JOptionPane.showInputDialog(null, "~Ievadi 1. malas garumu ( 1 - 100 )~");
				mala1 = Integer.parseInt(m1iev);
				}while(mala1 < 1 || mala1 > 100);
				String m2iev;
				do {
				m2iev = JOptionPane.showInputDialog(null, "~Ievadi 2. malas garumu ( 1 - 100 )~");
				mala2 = Integer.parseInt(m2iev);
				}while(mala2 < 1 || mala2 > 100);
				String m3iev;
				do {
				m3iev = JOptionPane.showInputDialog(null, "~Ievadi 3. malas garumu ( 1 - 100 )~");
				mala3 = Integer.parseInt(m3iev);
				}while(mala3 < 1 || mala3 > 100);
				if(mala1 == -1 || mala2 == -1 || mala3 == -1) break;
				
				JOptionPane.showMessageDialog(null, "Trijstūris izveidots!", "Paziņojums", JOptionPane.INFORMATION_MESSAGE);
				Figuras.trijsturaObjekti.add(new Trijsturis(Figuras.centraObjekti.get(cPNr),mala1, mala2, mala3 ));

			break;
		}
		
		
		
	}
}
