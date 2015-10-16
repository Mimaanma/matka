package fi.matkahuolto.kuljetus;

public class Juna extends Kulkuneuvo {
	String veturi;
	int vaunumaara;
	int paikat;
	
	public String getVeturi() {
		return veturi;
	}
	public void setVeturi(String veturi) {
		this.veturi = veturi;
	}
	public int getVaunumaara() {
		return vaunumaara;
	}
	public void setVaunumaara(int vaunumaara) {
		this.vaunumaara = vaunumaara;
	}
	public int getPaikat() {
		return paikat;
	}
	public void setPaikat(int paikat) {
		this.paikat = paikat;
	}

}
