package fi.matkahuolto.lippupalvelu;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Lippu {
	Double hinta;
	String lähtöPaikka;
	Date lähtöAika;
	Date SaapumisAika;
	String menoPaikka;
	Double kesto;
	
	public Date getLähtöAika() {
		return lähtöAika;
	}

	public void setLähtöAika(Date lähtöAika) {
		this.lähtöAika = lähtöAika;
	}

	public Date getSaapumisAika() {
		return SaapumisAika;
	}

	public void setSaapumisAika(Date saapumisAika) {
		SaapumisAika = saapumisAika;
	}

	public Double getHinta() {
		return hinta;
	}

	public void setHinta(Double hinta) {
		this.hinta = hinta;
	}

	public String getLähtöPaikka() {
		return lähtöPaikka;
	}

	public void setLähtöPaikka(String lähtöPaikka) {
		this.lähtöPaikka = lähtöPaikka;
	}


	public String getMenoPaikka() {
		return menoPaikka;
	}
	
	public void setMenoPaikka(String menoPaikka) {
		this.menoPaikka = menoPaikka;
	}
	
}

