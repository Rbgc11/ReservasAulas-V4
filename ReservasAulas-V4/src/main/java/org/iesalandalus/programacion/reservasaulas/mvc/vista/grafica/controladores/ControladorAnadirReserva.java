package org.iesalandalus.programacion.reservasaulas.mvc.vista.grafica.controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.iesalandalus.programacion.reservasaulas.mvc.controlador.IControlador;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.dominio.Aula;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.dominio.Profesor;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.dominio.Reserva;
import org.iesalandalus.programacion.reservasaulas.mvc.vista.grafica.utilidades.Dialogos;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControladorAnadirReserva {

	private ObservableList<Reserva> obsReservas;
	
	@FXML
    private Button btnAnadir;
	
	@FXML
    private Button btnCancelar;
	
	
	@FXML
    private TextField tfCorreo;

    @FXML
    private TextField tfNombre;


    @FXML
    private TextField tfNombreAula;

    @FXML
    private TextField tfTelefono;
    

	@FXML
    private TextField tfPuestos;

	
	public void cargaDatosReserva(Profesor p, Aula a)
	{
		tfNombre.setText(p.getNombre());
        tfTelefono.setText(p.getTelefono());
        tfCorreo.setText(p.getCorreo());        
        tfPuestos.setText(a.getPuestos());
        tfNombreAula.setText(a.getNombre());     
        
	}
	
	public void inicializaCampos() 
	{
		//Habilitamos los campos
		tfNombre.setDisable(false);
        tfTelefono.setDisable(false);
        tfCorreo.setDisable(false);
        tfPuestos.setDisable(false);
        tfNombreAula.setDisable(false);

	}
	

	@FXML
    void anadirClick(ActionEvent event) 
	{
		try
        {
            Reserva r=new Reserva(tfNombre.getText(),tfCorreo.getText(),tfTelefono.getText(),tfPuestos.getText(),tfNombreAula.getText());
        
            //Se obtienen todos los profesores de la tabla 
            obsReservas.add(r);
           
			Stage escenario = (Stage) ((Node) event.getSource()).getScene().getWindow();
	    	escenario.close();
        }
        catch (IllegalArgumentException | NullPointerException e)
        {
 
            Dialogos.mostrarDialogoError("ERROR AÑADIR RESERVA", e.getMessage());
        }
		

    }

    @FXML
    void cerrar(ActionEvent event) 
    {
    	Stage escenario = (Stage) ((Node) event.getSource()).getScene().getWindow();
    	escenario.close();
    }
    
    public void ocultaBotones()
    {
    	btnAnadir.setVisible(false);
    	btnCancelar.setVisible(false);
    }


	public void setControladorVentanaPrincipal(ControladorVentanaPrincipal controladorVentanaPrincipal) {
		// TODO Auto-generated method stub
		
	}

	public void setControladorMVC(IControlador controladorMVC) {
		// TODO Auto-generated method stub
		
	}

}
