package no.hvl.mat100;

import static javax.swing.JOptionPane.*;


public class nFakultet {

	public static void main(String[] args) {

		int nFakultet = 1;
		int helTall = Integer.parseInt(showInputDialog("Programmet beregner n!(n fakultet)\n" 
				+ "Skriv inn et heltall: "));
		
		
		if(helTall <= 0)
			showMessageDialog(null, "Feilmelding!\n" + "Tallet kan ikke være 0 eller mindre");
		
			else {
			
				for(int i = helTall; i >= 1; i--) 
					nFakultet = nFakultet * i; 
				
				
				showMessageDialog(null, "Svaret blir: " + nFakultet);
				
		
			}
				}
			}
