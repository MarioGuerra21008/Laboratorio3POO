import java.util.Scanner;
import java.io.IOException;

/**
* Clase Texto para crear y comentar publicaciones con límite de 20 caracteres.
* @author Mario Guerra
* @version 2/11/2021
* @see Texto
*/

class Texto extends Mensajes{
	/**
	* Constructor para la clase Texto.
	*/
	Scanner scan = new Scanner(System.in);
	String texto = this.Message;
	/**
	* Fin del constructor de la clase Texto.
	*/
	
	/**
	* Método Text
	* @param texto - Variable que guardará las entradas de texto para publicaciones y comentarios en la red social.
	*/
	public void Text(){
		System.out.println("Escriba su texto aqui: (Tome nota de que no se permiten mas de 20 caracteres en su mensaje.)\n");
		texto = scan.next();
		int tamano = texto.length();
		
		if (tamano <= 20){
			System.out.println("Su post ha sido publicado exitosamente!");
		}
		else{
			System.out.println("Limite de caracteres alcanzado, escriba nuevamente el mensaje.");
		}
	}
}