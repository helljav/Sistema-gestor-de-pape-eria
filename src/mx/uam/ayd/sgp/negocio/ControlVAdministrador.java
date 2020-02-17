package mx.uam.ayd.sgp.negocio;

import mx.uam.ayd.sgp.persistencia.DAOProducto;
import mx.uam.ayd.sgp.presentacion.VentanaCRUDAlmacen;
import mx.uam.ayd.sgp.presentacion.VentanaIniciarSesion;
import mx.uam.ayd.sgp.presentacion.VentanaPrincipalAdministrador;

public class ControlVAdministrador {

	private ControlAlmacen ctrlAlmacen;
	private ControlAdminUsuario ctrlUsuarios;
	private DAOProducto dao;

	ControlVAdministrador() {
		ctrlAlmacen = new ControlAlmacen();
		ctrlUsuarios = new ControlAdminUsuario();
	}

	public void inicia() {
		VentanaPrincipalAdministrador GUI = new VentanaPrincipalAdministrador(this);
		GUI.setVisible(true);
		GUI.setLocationRelativeTo(null);
	}

	public void DespliegaVSeleccion() {
		ctrlAlmacen.iniciaSeleccionDeAlmacen();
	}

	public void DespliegaVCRUDAdminUsuario() {
		ctrlUsuarios.ventanaCRUDAdminUsuarios();

	}

}
