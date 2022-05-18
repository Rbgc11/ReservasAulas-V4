package org.iesalandalus.programacion.reservasaulas.mvc.vista;

import org.iesalandalus.programacion.reservasaulas.mvc.controlador.IControlador;

public interface IVista {

	//Método que setea el controlador cuando se instancie
	void setControlador(IControlador controlador);

	//Método comenzar, que muestra el menú, nos da a elegir una opción
	void comenzar();

	//Método que llama al método terminar del controlador y da el mensaje de despedida
	void salir();



}