package progetto_teatro;

import java.util.*;
public class GestioneTeatro {

	Scanner input = new Scanner(System.in);
	private Posto[] posti;
	private static int disponibilità = 50;
	
	public GestioneTeatro() {
		
		posti = new Posto[50];
		
		
	}
	
	public void prenotaPosto(int quantita) {
		int ultimaPos = 0;
		if (quantita < disponibilità) {
			disponibilità = disponibilità - quantita;
			//System.out.println("Sono disponibili " + disponibilità + " posti");
			for (int i = 0; i < posti.length; i++) {
				posti[i] = new Posto();
				
				if (!posti[i].getDisponibilita()) {
					System.out.println("Inserisci il nominativo della persona:");
					String nominativo = input.nextLine();
					posti[i].setPoltrona(nominativo);
					if (quantita == i+1) {
						ultimaPos = quantita;
						System.out.println("posti assegnati");
						break;
					}
				}
			}
		}
		else System.out.println("Errore! La disponibilità attuale è di " + disponibilità);
		
		for (int i= ultimaPos-(quantita); i<ultimaPos; i++) {
			System.out.println("Il posto numero: " + i);
			System.out.println(posti[i]);
		}
		
	}
	
	public int getPrenotazione(String nome) {
		
		for (int i=0; i<posti.length; i++) {
			posti[i] = new Posto();
			if (posti[i].getDisponibilita()) //true se occupato
				if(posti[i].getPersona().equals(nome))
					return i;
					//System.out.println("Il numero del posto è " + i);
				//else System.out.println("La persona non è presente");
			//else System.out.println("I posti sono ancora tutti liberi");			
		}
		return -1;
	}
	
	public void getDisponibilità() {
		int posLibera = 0;
		for(int i=0; i<posti.length; i++) {
			posti[i] = new Posto();
			do {
				posLibera = i;
			} while(posti[i].getDisponibilita());
		}
		System.out.println("I posti ancora disponibili sono " + disponibilità );
	}
	
	public void setCancellazione(String nome) {
		/*System.out.println(posti[0].getPersona());
		System.out.println(posti[1].getPersona());
		System.out.println(posti[2].getPersona());*/
		System.out.println("LA PRENOTAZIONE DA CANCELLARE A NOME DI " + nome);
		for(int i= 0; i<posti.length; i++) {
			if(posti[i].getPersona().equals(nome)) {
				posti[i].unsetPoltrona();
				disponibilità = disponibilità + 1;
				System.out.println("La prenotazione è stata cancellata");
				break;
			}
		}
		
	}
	
	
	
	
	
}
