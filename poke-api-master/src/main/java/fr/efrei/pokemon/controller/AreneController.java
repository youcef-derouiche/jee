package fr.efrei.pokemon.controller;

import fr.efrei.pokemon.models.Arene;
import fr.efrei.pokemon.models.Pokemon;
import fr.efrei.pokemon.repositories.AreneRepository;
import fr.efrei.pokemon.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/arenes")
public class AreneController {

    @Autowired
    private AreneRepository areneRepository;

    @GetMapping
    public List<Arene> getAllArenes() {
        return areneRepository.findAll();
    }

    @PostMapping
    public Arene createArene(@RequestBody Arene arene) {
        return areneRepository.save(arene);
    }

    @PutMapping("/{id}")
    public Arene updateArene(@PathVariable String id, @RequestBody Arene areneDetails) {
        Arene arene = areneRepository.findById(id).orElse(null);
        if (arene != null) {
            arene.setNom(areneDetails.getNom());
            arene.setLocalisation(areneDetails.getLocalisation());
            return areneRepository.save(arene);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteArene(@PathVariable String id) {
        areneRepository.deleteById(id);
    }
}
