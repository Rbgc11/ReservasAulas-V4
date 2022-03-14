package org.iesalandalus.programacion.reservasaulas.mvc.controlador;

import java.util.List;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.reservasaulas.mvc.modelo.IModelo;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.dominio.Aula;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.dominio.Permanencia;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.dominio.Profesor;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.dominio.Reserva;
import org.iesalandalus.programacion.reservasaulas.mvc.vista.IVista;

public class Controlador implements IControlador{

	 private IModelo Imodelo;
	 private IVista Ivista;

	public Controlador(IModelo modelo, IVista vista) 
	{
		if (modelo == null) {
			throw new NullPointerException(" El modelo no puede ser nulo.");
		}
		
		if (vista == null) {
			throw new NullPointerException(" La vista no puede ser nula.");
		}
		
		this.Imodelo = modelo;
		this.Ivista = vista;
		this.Ivista.setControlador(this);
	}

	// Método comenzar
		@Override
		public void comenzar()  {
			Imodelo.comenzar();
			Ivista.comenzar();
		}

		// Método terminar
		@Override
		public void terminar() {
			Imodelo.terminar();
			Ivista.salir();
		}

		// Método insertarAula
		public void insertarAula(Aula aula) throws OperationNotSupportedException {
			Imodelo.insertarAula(aula);
		}
		
		// Método insertarProfesor
		public void insertarProfesor(Profesor profesor) throws OperationNotSupportedException {
			Imodelo.insertarProfesor(profesor);
		}
		
		// Método borrarAula
		public void borrarAula(Aula aula) throws OperationNotSupportedException {
			Imodelo.borrarAula(aula);
		}
		
		// Método borrarProfesor
		public void borrarProfesor(Profesor profesor) throws OperationNotSupportedException {
			Imodelo.borrarProfesor(profesor);
		}
		
		// Método buscarAula
		public Aula buscarAula(Aula aula) {
			return Imodelo.buscarAula(aula);
		}
		
		// Método buscarProfesor
		public Profesor buscarProfesor(Profesor profesor) {
			return Imodelo.buscarProfesor(profesor);
		}

		// Método representarAulas
		public List<String> representarAulas() {
			return Imodelo.representarAulas();
		}

		// Método representarProfesores
		public List<String> representarProfesores() {
			return Imodelo.representarProfesores();
		}

		// Método representarReservas
		public List<String>representarReservas() {
			return Imodelo.representarReservas();
		}
		
		// Método realizarReservas
		public void realizarReserva(Reserva reserva) throws OperationNotSupportedException {
			Imodelo.realizarReserva(reserva);
		}

		// Método anularReservas
		public void anularReserva(Reserva reserva) throws OperationNotSupportedException {
			Imodelo.anularReserva(reserva);

		}

		// Método getReservasProfesor(Profesor)
		public List<Reserva> getReservasProfesor(Profesor profesor) {
			return Imodelo.getReservasProfesor(profesor);
		}

		// Método getReservasAula(Aula)
		public List<Reserva> getReservasAula(Aula aula) {
			return Imodelo.getReservasAula(aula);
		}

		// Método getReservasPermanencia(Permanencia)
		public List<Reserva> getReservasPermanencia(Permanencia permanencia) {
			return Imodelo.getReservasPermanencia(permanencia);
		}

		// Método consultarDisponibilidad(Aula,Permanencia)
		public boolean consultarDisponibilidad(Aula aula, Permanencia permanencia) {
			return Imodelo.consultarDisponibilidad(aula, permanencia);
		}
	}