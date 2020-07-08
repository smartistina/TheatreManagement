package progetto_teatro;

public class Posto {
	
	private String persona = "";
	private boolean occupato = false;
	
	public void setPoltrona(String nominativo) {
		this.persona = nominativo;
		occupato = true;
	}
	public void unsetPoltrona() {
		this.persona = "";
		occupato = false;
		
	}
	
	public boolean getDisponibilita() {
		return occupato; //true se è occupato
	}
	
	public String getPersona() {
		return persona;
	}
	
	public String toString() {
		String o = "";
		if(occupato) {
			o = "OCCUPATO";
			return "Lo stato della postazione è " + o + " dalla persona: " + persona;
		}
		else o = "LIBERO";
		return "Lo stato della postazione è " + o ;
	}
	
}
