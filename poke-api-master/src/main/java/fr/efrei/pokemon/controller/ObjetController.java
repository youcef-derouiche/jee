package fr.efrei.pokemon.controller;
import fr.efrei.pokemon.models.Objet;
import fr.efrei.pokemon.models.Pokemon;
import fr.efrei.pokemon.services.ObjetService;
import fr.efrei.pokemon.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/objets")
public class ObjetController {

    @Autowired
    private ObjetService objetService;

    @GetMapping
    public List<Objet> getAllObjets() {
        return objetService.getAllObjets();
    }

    @GetMapping("/{id}")
    public Objet getObjetById(@PathVariable String id) {
        return objetService.getObjetById(id);
    }

    @PostMapping
    public Objet createObjet(@RequestBody Objet objet) {
        return objetService.createObjet(objet);
    }

    @PutMapping("/{id}")
    public Objet updateObjet(@PathVariable String id, @RequestBody Objet objet) {
        return objetService.updateObjet(id, objet);
    }

    @DeleteMapping("/{id}")
    public void deleteObjet(@PathVariable String id) {
        objetService.deleteObjet(id);
    }
}
