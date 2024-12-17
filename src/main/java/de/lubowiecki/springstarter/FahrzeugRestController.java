package de.lubowiecki.springstarter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/api/v1")
@RestController
public class FahrzeugRestController {

    // http://localhost:8080/
    @RequestMapping("")
    public String getButterbrot() {
        return "Smöre-Bröd...";
    }

    // http://localhost:8080/gurken
    @RequestMapping("/gurken")
    public String getGurkensalat() {
        return "Hymmm.... lecker Gurken!";
    }

    @RequestMapping("/brote")
    public Iterable<String> getBrotListe() {
        List<String> liste = new ArrayList<>();
        liste.add("Dinkel-Brot");
        liste.add("Schwarz-Brot");
        liste.add("Roggen-Brot");
        liste.add("Weizen-Brot");
        return liste;
    }

    @RequestMapping("/fahrzeuge")
    public Iterable<Fahrzeug> getFahrzeugListe() {
        List<Fahrzeug> liste = new ArrayList<>();
        liste.add(new Fahrzeug("HH:AB123", "Ford", "Fiesta", 2005, Zustand.INSPEKTION));
        liste.add(new Fahrzeug("HH:CD2200", "Renault", "Zoe", 2021, Zustand.NEU));
        liste.add(new Fahrzeug("HB:XY191", "Mercedes", "E-Klasse", 2022, Zustand.REPARATUR));
        return liste;
    }
}
