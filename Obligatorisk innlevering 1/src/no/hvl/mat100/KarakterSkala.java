package no.hvl.mat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class KarakterSkala {

	public static void main(String[] args) {
		
		int poeng;
		  
		for(int stud = 0; stud <= 10; stud++) {
				do {
				poeng = parseInt(showInputDialog("Skriv inn poengsum: "));
				if(poeng < 0 || poeng > 100)
					showMessageDialog(null, "Feilmelding!\n Poeng kan bare være 0-100");
				
				}while(poeng < 0 || poeng >100);
				String utTxt = "Med " + poeng + " poeng får du karakteren ";
				
				if((poeng <=39) && (poeng >= 0))
						utTxt += "F";
		
				else if((poeng >= 40) && (poeng <= 49))
						utTxt += "E";
		
				else if((poeng >= 50) && (poeng <= 59))
						utTxt += "D";
		
				else if((poeng >= 60) && (poeng <= 79))
						utTxt += "C";
		
				else if((poeng >= 80) && (poeng <= 89))
						utTxt += "B";
		
				else if((poeng >= 90) && (poeng <= 100))
						utTxt += "A";
		
				else if((poeng >= 50) && (poeng <= 59))
					utTxt += "D";
		
				showMessageDialog(null, utTxt);
			}
			
		
	}

}
