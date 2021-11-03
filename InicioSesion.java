import java.util.Scanner;
import java.io.IOException;

/**
* Clase InicioSesion para acceder al feed de la red social.
* @author Mario Guerra
* @version 2/11/2021
* @see InicioSesion
*/

class InicioSesion{
	/**
	* Constructor para la clase de InicioSesion.
	*/
	Scanner scan = new Scanner(System.in);
	String correo;
	String usuario;
	String contrasena;
	/**
	* Fin del constructor de la clase de InicioSesion.
	*/
	
	/**
	* Método Iniciar
	*/
	public void Iniciar(){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese su usuario en este espacio:\n"); //Escriba su nombre de usuario.
		usuario = scan.next();
		System.out.println("Ingrese su contrasena en este espacio:\n"); //Escriba su contraseña.
		contrasena = scan.next();
		System.out.println("Inicio de sesion completado exitosamente. Bienvenido de vuelta."); //Mensaje de confirmación.
	}
	
	/**
	* Método Crear
	*/
	public void Crear(){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese su direccion de correo electronico aqui:\n"); //Escriba su correo electrónico.
		correo = scan.next();
		System.out.println("Ingrese el nombre de usuario que desea utilizar:\n"); //Escriba el nuevo nombre de usuario.
		usuario = scan.next();
		System.out.println("Ingrese la contrasena para su nueva cuenta:\n"); //Escriba su contraseña.
		contrasena = scan.next();
		System.out.println("Creacion de cuenta nueva realizada con exito, disfrute su estadia!"); //Mensaje de confirmación.
	}
}