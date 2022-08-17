package EFEmilyValenzuela.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EFEmilyValenzuela.Model.Pizzeria;

@Repository
public interface PizzeriaRepository extends JpaRepository<Pizzeria, Integer> {

}
