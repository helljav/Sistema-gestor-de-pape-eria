package mx.uam.ayd.sgp.persistencia;


import java.sql.Connection;
import java.sql.Statement;

public class CreadorBaseDeDatos {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		try
		{
			Connection connection = ManejadorBD.dameConnection();

			Statement statement = connection.createStatement();
			statement.execute("create table Usuarios(idempleado varchar(20) PRIMARY KEY,usuario varchar(40), contrase�a varchar(40),tipoCuenta varchar(20),nombre varchar(40),apellidos varchar(100),telefono varchar(40))");// , CONSTRAINT primary_key PRIMARY KEY (autorId)
			System.out.println("Tabla de Usuarios creada exitosamente");
			statement.execute("insert into Usuarios values('" +"1245"+"','"+ "admin" + "','" + "123"+ "','" + "ADMINISTRADOR" +"','"+"Hernan"+"','"+"Dominguez"+"','"+"5959571482"+ "')");
			statement.execute("insert into Usuarios values('"+"1996"+"','" + "empleado" + "','" + "321"+ "','" + "EMPLEADO" +"','"+"eduardo"+"','"+"oseguera"+"','"+"5568971845"+ "')");
			
			
			statement.execute("create table Productos(nombre varchar(40), precio double precision,descripcion varchar(50),cantidad int, descuento double precision, fecha varchar(12), tipoAlmacen varchar(40))");
			System.out.println("locura creada");
			statement.execute("insert into Productos values('" + "prit" + "'," + 23 + ",'" + "pega de locuraaaaaa" + "' ," + 20 + "," + 50 + "," +"'2018-12-07'" +",'" + "Almacen general" + "')");
			
			ManejadorBD.termina();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}




	}

}
