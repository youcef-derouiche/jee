package fr.efrei.pokemon.services;

import fr.efrei.pokemon.models.Objet;
import fr.efrei.pokemon.models.Pokemon;
import fr.efrei.pokemon.repositories.ObjetRepository;
import fr.efrei.pokemon.repositories.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObjetService {

    @Autowired
    private ObjetRepository objetRepository;

    public List<Objet> getAllObjets() {
        return objetRepository.findAll();
    }

    public Objet getObjetById(String id) {
        return objetRepository.findById(id).orElse(null);
    }

    public Objet createObjet(Objet objet) {
        return objetRepository.save(objet);
    }

    public Objet updateObjet(String id, Objet objetDetails) {
        Objet objet = objetRepository.findById(id).orElse(null);
        if (objet != null) {
            objet.setNom(objetDetails.getNom());
            objet.setDescription(objetDetails.getDescription());
            return objetRepository.save(objet);
        }
        return null;
    }

    public void deleteObjet(String id) {
        objetRepository.deleteById(id);
    }
}
