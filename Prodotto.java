package esercitazione2;

public class Prodotto {

	String descrizione;
	String marca;
	double prezzo;
	String categoria;
	
	public Prodotto(String d, String m, double p, String c) {
		this.categoria = c;
		this.descrizione = d;
		this.marca = m;
		this.prezzo = p;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	@Override
	public String toString() {
		return "Descrizione : " + descrizione + "\nMarca : " + marca + "\nPrezzo : " + prezzo + "\nCategoria : " + categoria;
	}
	
}