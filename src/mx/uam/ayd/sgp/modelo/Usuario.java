package mx.uam.ayd.sgp.modelo;

public class Usuario {
	private String usuario;
	private String contrase�a;
	private String tipoCuenta;
	private String nombre;
	private String apellidos;
	private String telefono;
	private int idEmpleado;
	
	
	public Usuario(String usuario, String contrase�a, String tipoCuenta, String nombre, String apellidos, String telefono, int idEmpleado){
		this.contrase�a = contrase�a;
		this.usuario = usuario;
		this.tipoCuenta = tipoCuenta;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.telefono=telefono;
		this.idEmpleado=idEmpleado;
	}
	
	public String getUsuario(){
		return usuario;
	}
	public String getContrase�a(){
		return contrase�a;
	}
	public String getTipoCuenta() {
		return tipoCuenta;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getApellidos() {
		return this.apellidos;
	}
	public String getTelefono() {
		return this.telefono;
	}
	public String getIdEmpleado() {
		return Integer.toString(this.idEmpleado);
	}
	
	
	public String getNombreC() {
		return this.nombre + this.apellidos;
	}
	
	

}
