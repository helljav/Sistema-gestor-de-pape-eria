package mx.uam.ayd.sgp.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import mx.uam.ayd.sgp.modelo.Usuario;



public class DAOUsuario {
	
	/**
	 * Accede a la base de datos para identificar al usuario y la contrase�a
	 * @param usuario
	 * @param contrase�a
	 * @return
	 */
	
	public Usuario Autentifica(String usuario, String contrase�a) {
		System.out.println("holi");
		
		Usuario user = null;
		try {
			
			// Crea el statement
			Statement statement = ManejadorBD.dameConnection().createStatement();
			// Recibe los resutados
			ResultSet rs = statement.executeQuery(
					"SELECT * FROM Usuarios WHERE usuario='" + usuario + "'	AND contrase�a='" + contrase�a + "'");
			if (rs.next()) {
				
				// Crea una nueva instancia del objeto
				user = new Usuario(rs.getString("usuario"), rs.getString("contrase�a"), rs.getString("tipoCuenta")
						,rs.getString("nombre"),rs.getString("apellidos"),rs.getString("telefono"),
						Integer.valueOf(rs.getString("idempleado")));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return user;
	}
	public boolean agregaUsuario(Usuario user) {
		try {
			Statement statement=ManejadorBD.dameConnection().createStatement();
			
			String idempleado=user.getIdEmpleado();
			String usuario=user.getUsuario();
			String pass=user.getContrase�a();
			String cargo=user.getTipoCuenta();
			String nombre=user.getNombre();
			String apellidos=user.getApellidos();
			String telefono=user.getTelefono();
			
			statement.execute("insert into Usuarios values('" +idempleado+"','"+usuario + "','" +pass+ "','" +cargo +"','"+nombre+"','"+apellidos+"','"+telefono+ "')");
			return true;
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		
		return false;
	}
	
	
}
