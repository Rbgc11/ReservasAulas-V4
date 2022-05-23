package org.iesalandalus.programacion.reservasaulas.mvc.vista.grafica.controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.iesalandalus.programacion.reservasaulas.mvc.controlador.IControlador;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.dominio.Aula;
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
import modelo.*;
import utilidades.Dialogos;

public class ControladorAnadirAula {
	

	private ObservableList<Aula> obsAulas;
	
	@FXML
    private Button btnAnadir;
	
	@FXML
    private Button btnCancelar;
	
	
	@FXML
    private TextField tfPuestos;

    @FXML
    private TextField tfNombreAula;


	
	public void cargaDatosAula(Aula aula)
	{
		tfNombreAula.setText(aula.getNombre());
        tfPuestos.setText(aula.getPuestos());
        
        
	}
	
	public void inicializaCampos() 
	{
		//Habilitamos los campos
		tfNombreAula.setDisable(false);
        tfPuestos.setDisable(false);
        
	}
	

	@FXML
    void anadirClick(ActionEvent event) 
	{
		try
        {
            Aula aula=new Aula(tfNombreAula.getText(),tfPuestos.getText());
        
            obsAulas.add(aula);
            
       
			Stage escenario = (Stage) ((Node) event.getSource()).getScene().getWindow();
	    	escenario.close();
        }
        catch (IllegalArgumentException | NullPointerException e)
        {
            /*System.out.println("Se ha producido algún error al añadir el profesor");
            System.out.println(e.getMessage());*/
            //VentanaAlerta.mostrar("ERROR", e.getMessage());
            Dialogos.mostrarDialogoError("ERROR AÑADIR AULA", e.getMessage());
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

	public void setControladorMVC(IControlador controladorMVC) {
		// TODO Auto-generated method stub
		
	}

	public void setControladorVentanaPrincipal(ControladorVentanaPrincipal controladorVentanaPrincipal) {
		// TODO Auto-generated method stub
		
	}

}
