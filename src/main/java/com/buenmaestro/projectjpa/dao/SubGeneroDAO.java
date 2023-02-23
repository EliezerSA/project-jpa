/**
 * 
 */
package com.buenmaestro.projectjpa.dao;

import java.util.List;

import com.buenmaestro.projectjpa.entity.SubGenero;

/**
 * @author Eliezer
 * Interface DAO que realiza el CRUD con JPA para la tabla SubGenero
 *
 */
public interface SubGeneroDAO {
	/**
	 * Metodo que permite guardar un subgenero
	 * @param subGenero {@link long} identificador  del subgenero a guardar
	 *
	 */

	void guardar(SubGenero subGenero);
	
	/**
	 * Metodo que permite actualizar un subgenero
	 * @param subGenero {@link subGenero} objeto a acatualizar
	 *
	 */

	void actualizar(SubGenero subGenero);
	
	/**
	 * Metodo que permite eliminar un subgenero por su identificador
	 * @param id {@link long} identificador  del subgenero a eliminar
	 *
	 */

	void eliminar(long id);
	
	/**
	 * Metodo que permite consultar la lista de subgeneros
	 * @return  {@link list} lista de subgeneros consultados
	 *
	 */

	List<SubGenero> consultar();
	/**
	 * Metodo que permite consultar un subgenero a partir de su identificador
	 * @param id {@link long} identificador  del subgenero a consultar
	 * @return {@link subgenero} un objeto subgenero consultado
	 *
	 */

	SubGenero consultarById(Long id);

}
