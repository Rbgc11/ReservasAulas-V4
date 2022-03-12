package org.iesalandalus.programacion.reservasaulas.mvc.modelo;

import org.iesalandalus.programacion.reservasaulas.mvc.modelo.negocio.memoria.FactoriaFuentesDatosMemoria;


public enum FactoriaFuenteDatos {
	MEMORIA {
		public IFuenteDatos crear() {
			IFuenteDatos memoria=new FactoriaFuentesDatosMemoria();
			return memoria;
		}
	};
	

	public abstract IFuenteDatos crear();
}