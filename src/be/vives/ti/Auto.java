package be.vives.ti;

import java.util.Objects;

public class Auto {
    private final String nummerplaat;
    private final String merk;
    private final String kleur;
    private final int euroNorm;
    private final Brandstof brandstof;

    public Auto(String nummerplaat, String merk, String kleur, int euroNorm, Brandstof brandstof) {
        this.nummerplaat = nummerplaat;
        this.merk = merk;
        this.kleur = kleur;
        this.euroNorm = euroNorm;
        this.brandstof = brandstof;
    }

    public String getNummerplaat() {
        return nummerplaat;
    }

    public String getMerk() {
        return merk;
    }

    public String getKleur() {
        return kleur;
    }

    public int getEuroNorm() {
        return euroNorm;
    }

    public Brandstof getBrandstof() {
        return brandstof;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "nummerplaat='" + nummerplaat + '\'' +
                ", merk='" + merk + '\'' +
                ", kleur='" + kleur + '\'' +
                ", brandstof='" + brandstof + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Auto)) return false;
        Auto auto = (Auto) o;
        return nummerplaat.equals(auto.nummerplaat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nummerplaat);
    }
}
