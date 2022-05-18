package org.iesalandalus.programacion.reservasaulas;

import org.iesalandalus.programacion.reservasaulas.mvc.controlador.Controlador;
import org.iesalandalus.programacion.reservasaulas.mvc.controlador.IControlador;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.FactoriaFuenteDatos;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.IFuenteDatos;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.IModelo;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.Modelo;
import org.iesalandalus.programacion.reservasaulas.mvc.vista.IVista;
import org.iesalandalus.programacion.reservasaulas.mvc.vista.Vista;
import org.iesalandalus.programacion.utilidades.Entrada;


public class MainApp {

	public static void main(String[] args) {
		int opcion=0;
		IModelo modelo=null;
		IVista vista=null;
		IControlador controlador=null;
		System.out.println("Programa para la gestión de reservas de espacios del IES Al-Ándalus. Introduce lo que prefieras");
		do {
			System.out.println("1: Memoria");
			System.out.println("2: Ficheros");
			opcion=Entrada.entero();
		} while (opcion != 1 && opcion != 2);
		
		switch(opcion) {
		case 1:
			modelo=new Modelo(FactoriaFuenteDatos.MEMORIA.crear());
			vista=new Vista();
			controlador=new Controlador(modelo,vista);
			controlador.comenzar();	
			break;
		case 2:
			modelo=new Modelo(FactoriaFuenteDatos.FICHEROS.crear());
			vista=new Vista();
			controlador=new Controlador(modelo,vista);
			controlador.comenzar();	
			break;
		}
} 
}
