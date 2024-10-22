package fr.efrei.pokemon.repositories;



import fr.efrei.pokemon.models.Arene;
import fr.efrei.pokemon.models.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface AreneRepository extends JpaRepository<Arene, String> {
}
