package oop;

import javax.swing.JOptionPane;

public class OIzveide {
	static void izveidotObjektu() {
		
		int x,y,cPNr, izvele; double p, a;
		
		izvele = JOptionPane.showOptionDialog(null, "~Kuru objektu veidot?~", "Izvēle", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
				null, Figuras.objPogas, Figuras.objPogas[0]);
		if(izvele == -1) izvele = 0;
		switch(izvele) {
		case 4: JOptionPane.showMessageDialog(null, "~Atgriežas uz galveno izvēlni~", "Paziņojums", JOptionPane.INFORMATION_MESSAGE); break;
		
		case 0: 
			String xiev;
			do {
			xiev = JOptionPane.showInputDialog(null, "~Ievadi centra punkta x koordinātas ( -100 - 100 )~");
			x = Integer.parseInt(xiev);
			if (x >= -100 && x <= -100) {
			} else {
			    JOptionPane.showMessageDialog(null, "Skaitlim jābūt starp -100 un 100!");
			}
			}while(x < -100 || x > 100);
			String yiev;
			do {
			yiev = JOptionPane.showInputDialog(null, "~Ievadi centra punkta y koordinātas ( -100 - 100 )~");
			y = Integer.parseInt(yiev);
			if (y >= -100 && y <= -100) {
			} else {
			    JOptionPane.showMessageDialog(null, "Skaitlim jābūt starp -100 un 100!");
			}
			}while(y < -100 || y > 100);
			
			Figuras.centraObjekti.add(new Centrs(x, y));
			break;
			
			case 1:
				String[] ceIzvelesVeids = {"Noklusējuma", "Centra punkts un malas"};
				String veids = (String)JOptionPane.showInputDialog(null, "Izvēlies, kuru konstruktoru izsaukt", "Četrstūra izveide",
						JOptionPane.QUESTION_MESSAGE, null, ceIzvelesVeids, ceIzvelesVeids[0]);
				if(veids == null)
					veids = ceIzvelesVeids[0];
				
				switch (veids) {
				case "Noklusējuma":
					Figuras.cetrsturaObjekti.add(new Cetrsturis());
					break;
				case "Centra punkts un malas":
					//cPNr = cPIzvele();
					cPNr = -0;
					String piev;
					do {
					piev = JOptionPane.showInputDialog(null, "~Ievadi platumu ( 1 - 100 )~");
					p = Integer.parseInt(piev);
					if (p >= 1 && p <= 100) {
					} else {
					    JOptionPane.showMessageDialog(null, "Skaitlim jābūt starp 1 un 100!");
					}
					}while(p < 1 || p > 100);
					String aiev;
					do {
					aiev = JOptionPane.showInputDialog(null, "~Ievadi augstumu ( 1 - 100 )~");
					a = Integer.parseInt(piev);
					if (a >= 1 && a <= 100) {
					} else {
					    JOptionPane.showMessageDialog(null, "Skaitlim jābūt starp 1 un 100!");
					}
					}while(a < 1 || a > 100);
					
					Figuras.cetrsturaObjekti.add(new Cetrsturis(Figuras.centraObjekti.get(cPNr),p, a ));
					
					break;
				}
		}
		
		
		
	}
}
