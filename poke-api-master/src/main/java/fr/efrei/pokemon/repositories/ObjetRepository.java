package fr.efrei.pokemon.repositories;

import fr.efrei.pokemon.models.Arene;
import fr.efrei.pokemon.models.Objet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ObjetRepository extends JpaRepository<Objet, String> {
}
