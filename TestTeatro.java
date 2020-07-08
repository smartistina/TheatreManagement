package progetto_teatro;
import java.util.*;


public class TestTeatro {
	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cmd;
		
		GestioneTeatro gt = new GestioneTeatro();
		
		do {
			System.out.println(" [1] Prenotare una postazione ");
			System.out.println(" [2] Cancella una postazione");
			System.out.println(" [3] Visualizza disponibilità");
			System.out.println(" [4] EXIT");
			cmd = input.nextInt();
			input.nextLine();
			switch(cmd) {
				
				case 1:
					
						System.out.println("Inserisci il numero di posti da prenotare");
						int posti = input.nextInt();
						gt.prenotaPosto(posti);
					
						break;
				
				case 2:
					
						System.out.println("Inserisci il nominativo della prenotazione");
						String nome = input.nextLine();
						gt.setCancellazione(nome);
						
					
						break;
				
				case 3:
					
						gt.getDisponibilità();
						
						break;
				case 4:
						
						System.out.println("USCITA");;
						
						break;
				
				default: System.out.println("Comando non disponibile"); break;
					
			
			}
			
		} while(cmd!=4);
		
		System.out.println("Grazie e arrivederci");

	}

}