package EFEmilyValenzuela.Service;

import java.util.List;

import EFEmilyValenzuela.Model.Pizzeria;



public interface PizzeriaService {
	

	List<Pizzeria> listar();
	Pizzeria ObtenerId(Integer id);	
	void guardar(Pizzeria pizzeria);
	void eliminar(Integer id);
	void actualizar(Pizzeria pizzeria);
	
	void asignarPizzaAPizzeria();

}
