package no.hvl.mat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;


public class trinnSkatt {

	public static void main(String[] args) {
		int bruttoInn = parseInt(showInputDialog("Her skal du få ut din trinnskatt\n"
				+ "Skriv inn din bruttolønn:"));
	
		double trinn1 = bruttoInn * 0.0093;	
		double trinn2 = bruttoInn * 0.0241;
		double trinn3 = bruttoInn * 0.1152;
		double trinn4 = bruttoInn * 0.1452;
		String utTxt = "Din trinnskatt er: ";
		
		if((bruttoInn >= 164101) && (bruttoInn <= 230950))
			utTxt += trinn1 + " og du er på trinn 1 med sats 0,93%";
			
        else if((bruttoInn >= 230951) && (bruttoInn <= 580650))
        	utTxt += trinn2 + " og du er på trinn 2 med sats 2,41%";
		
        else if((bruttoInn >= 580651) && (bruttoInn <= 934050))
        	utTxt += trinn3 + " og du er på trinn 3 med sats 11,52%";
		
        else if(bruttoInn > 934051)
        	utTxt += trinn4 + " og du er på trinn 4 med sats 14,52%";
		
        else
        	utTxt += "0. Du trenger ikke betale trinnskatt!";
		
		showMessageDialog(null, utTxt);
        
	}
	
}
