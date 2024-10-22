package fr.efrei.pokemon.services;
import fr.efrei.pokemon.models.Arene;
import fr.efrei.pokemon.models.Pokemon;
import fr.efrei.pokemon.repositories.AreneRepository;
import fr.efrei.pokemon.repositories.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreneService {
    @Autowired
    private AreneRepository areneRepository;

    public List<Arene> getAllArenes() {
        return areneRepository.findAll();
    }

    public Arene getAreneById(String id) {
        return areneRepository.findById(id).orElse(null);
    }

    public Arene createArene(Arene arene) {
        return areneRepository.save(arene);
    }

    public Arene updateArene(String id, Arene areneDetails) {
        Arene arene = areneRepository.findById(id).orElse(null);
        if (arene != null) {
            arene.setNom(areneDetails.getNom());
            arene.setLocalisation(areneDetails.getLocalisation());
            return areneRepository.save(arene);
        }
        return null;
    }

    public void deleteArene(String id) {
        areneRepository.deleteById(id);
    }
}
