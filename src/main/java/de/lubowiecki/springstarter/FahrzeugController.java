package de.lubowiecki.springstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
        return "standard";
    }

    // Http-Methoden: GET, POST, PUT, DELETE, HEAD

    // http://localhost:8080/vehicles/add
    @GetMapping("/vehicles/add")
    public String fahrzeugForm(Model ui) {
        ui.addAttribute("headline", "Neues Fahrzeug");
        return "vehicles-form";
    }

    @PostMapping("/vehicles/save")
    public String saveFahrzeug(Fahrzeug fahrzeug, Model ui) {
        repository.save(fahrzeug);
        return "redirect:/vehicles/list";
    }

    @GetMapping("/vehicles/list")
    public String fahrzeugList(Model ui) {
        ui.addAttribute("headline", "Unsere Fahrzeuge");
        return "standard";
    }

    @GetMapping("/services")
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

    @GetMapping("/about")
    public String about(Model ui) {
        ui.addAttribute("headline", "Bisschen was über uns!");
        return "standard";
    }

    @GetMapping("/contact")
    public String contact(Model ui) {
        ui.addAttribute("headline", "Schreiben Sie uns.");
        return "standard";
    }
}
