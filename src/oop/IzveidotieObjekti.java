package oop;
import java.util.ArrayList;
public class IzveidotieObjekti {
	static String izvadit(ArrayList<Centrs> centruSaraksts) {
		String str = "";
		for (int i=0; i<centruSaraksts.size(); i++) {
		str += (i+1)+". objekta "+centruSaraksts.get(i).izvaditKoord()+"\n";
		}
		
		return str;
	}
	static String izvaditCetr(ArrayList<Cetrsturis> cetrSaraksts) {
		String str = "";
		for (int i=0; i<cetrSaraksts.size(); i++) {
		str += (i+1)+". objekta "+cetrSaraksts.get(i).izvaditCetrsturaInfo()+"\n";
		}
		
		return str;
	
}
	static String izvaditApl(ArrayList<Aplis> aplSaraksts) {
		String str = "";
		for (int i=0; i<aplSaraksts.size(); i++) {
		str += (i+1)+". objekta "+aplSaraksts.get(i).izvaditAplaInfo()+"\n";
		}
		
		return str;
	
}
	static String izvaditTrij(ArrayList<Trijsturis> trijSaraksts) {
		String str = "";
		for (int i=0; i<trijSaraksts.size(); i++) {
		str += (i+1)+". objekta "+trijSaraksts.get(i).izvaditTrijsturaInfo()+"\n";
		}
		
		return str;
	
}
}
