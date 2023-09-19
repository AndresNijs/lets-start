package be.vives.ti;

public enum LezCode {

    GROEN("Toegang", "/groen"),
    ORANJE("Toegang na betaling", "/betaling"),
    ROOD("Toegang met LEZ-dagpas", "/dagpas"),
    ONBEKEND("Geen informatie bekend over de wagen", null);

    private String omschrijving;
    private String url;

    LezCode(String omschrijving, String url){
        this.omschrijving = omschrijving;
        this.url = url;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public String getUrl() {
        return url;
    }

    public String toString() {
        return omschrijving + " -> " + url;
    }
}
