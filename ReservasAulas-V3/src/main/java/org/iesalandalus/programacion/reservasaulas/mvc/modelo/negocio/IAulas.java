package org.iesalandalus.programacion.reservasaulas.mvc.modelo.negocio;

import java.util.List;
import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.reservasaulas.mvc.modelo.dominio.Aula;

public interface IAulas {

	List<Aula> getAulas();

	//Método getNumAulas
	int getNumAulas();

	//Método insertar Aula 
	void insertar(Aula aula) throws OperationNotSupportedException;

	//Método buscar Aula
	Aula buscar(Aula aula);

	//Método borrar Aula
	void borrar(Aula aula) throws OperationNotSupportedException;

	//Método representar 
	List<String> representar();

}