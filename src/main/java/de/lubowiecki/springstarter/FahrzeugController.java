package de.lubowiecki.springstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FahrzeugController {

    // Spring erzeugt das Repository-Objekt und weist es dieser Variable zu
    @Autowired
    private FahrzeugRepository repository;

    @RequestMapping("")
    public String index(Model ui) {
        // Text wird an das Template geschickt
        ui.addAttribute("headline", "Herzlich Willkommen");

        // Insert
        Fahrzeug f = new Fahrzeug("HH:AB123", "Vw", "Polo", 2000, Zustand.INSPEKTION);
        repository.save(f);

        return "standard";
    }

    @RequestMapping("/services")
    public String services(Model ui) {
        ui.addAttribute("headline", "Usere Services");

        List<String> services = new ArrayList<>();
        services.add("Autovermietung");
        services.add("Autoverkauf");
        services.add("Beratung");
        services.add("Reparatur");

        ui.addAttribute("services", services);
        return "standard";
    }

    @RequestMapping("/about")
    public String about(Model ui) {
        ui.addAttribute("headline", "Bisschen was über uns!");
        return "standard";
    }

    @RequestMapping("/contact")
    public String contact(Model ui) {
        ui.addAttribute("headline", "Schreiben Sie uns.");
        return "standard";
    }
}
