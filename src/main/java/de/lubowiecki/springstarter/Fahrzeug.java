package de.lubowiecki.springstarter;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Fahrzeug {

    private String kennzeichen;
    private String marke;
    private String modell;
    private int baujahr;
    private Zustand zustand;

    public Fahrzeug() {
    }

    public Fahrzeug(String kennzeichen, String marke, String modell, int baujahr, Zustand zustand) {
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.zustand = zustand;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    @JsonIgnore // Diese Eigenschaft wird beim Ausgeben als JSON nicht angezeigt
    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public Zustand getZustand() {
        return zustand;
    }

    public void setZustand(Zustand zustand) {
        this.zustand = zustand;
    }
}
