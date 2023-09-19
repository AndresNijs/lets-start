package be.vives.ti;

import java.util.HashMap;

public class LezChecker {

    private HashMap<String, Auto> ingeschrevenAutos;

    public LezChecker() {
        this.ingeschrevenAutos = new HashMap<>();
    }

    public void inschrijvenAuto(Auto auto) {
        ingeschrevenAutos.put(auto.getNummerplaat(), auto);
    }

    public void uitschrijvenAuto(String nummerplaat) {
        ingeschrevenAutos.remove(nummerplaat);
    }

    public LezCode controleerLezAntwerpen(String nummerplaat) {
        Auto auto = ingeschrevenAutos.get(nummerplaat);
        if (auto != null) {
            if (Brandstof.DIESEL.equals(auto.getBrandstof())) {
                if (auto.getEuroNorm() >= 5 ) {
                    return LezCode.GROEN;
                } else if (auto.getEuroNorm() == 4) {
                    return LezCode.ORANJE;
                } else {
                    return LezCode.ROOD;
                }
            } else if (Brandstof.BENZINE.equals(auto.getBrandstof())) {
                if (auto.getEuroNorm() > 1) {
                    return LezCode.GROEN;
                } else {
                    return LezCode.ROOD;
                }
            } else {
                return LezCode.GROEN;
            }
        } else {
            return LezCode.ONBEKEND;
        }
    }


}
