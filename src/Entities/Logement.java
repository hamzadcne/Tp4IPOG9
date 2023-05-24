package Entities;

public abstract class Logement {
	private String adresse;
	private double superficie;
	private int npiece;
	
	public int getNpiece() {
		return npiece;
	}

	public void setNpiece(int npiece) {
		this.npiece = npiece;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	
	public void afficherInfo() {
		System.out.println("Adresse: "+this.adresse+
				", Superficie: "+this.superficie);
	}
	
	public abstract void vendre();
	public abstract void louer();
}
