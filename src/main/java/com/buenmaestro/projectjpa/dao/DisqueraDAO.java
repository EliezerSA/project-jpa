/**
 * 
 */
package com.buenmaestro.projectjpa.dao;

import java.util.List;

import com.buenmaestro.projectjpa.entity.Disquera;

/**
 * @author Eliezer
 * Interface que genera  el DAO para las transacciones del CRUD a la tabla de disquera
 *
 */
public interface DisqueraDAO {
	
	void guardar(Disquera disquera);
	
	void actualizar(Disquera disquera);
	
	void eliminar(long id);
	
	List<Disquera> consultar();
	
	Disquera consultarById(Long id);
	

}
