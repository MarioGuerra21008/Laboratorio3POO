import java.util.Scanner;
import java.io.IOException;

/**
* Clase Emoticon para añadir emoticones a los mensajes y publicaciones.
* @author Mario Guerra
* @version 2/11/2021
* @see Emoticon
*/

class Emoticon extends Mensajes{
	/**
	* Constructor para la clase Emoticon.
	*/
	Scanner scan = new Scanner(System.in);
	String emote = this.Message;
	int op = 0;
	String[] Emoticones = {":-)",":-(",">:-(",">:-)","XD",">.<","UwU",":'(","<3","UnU"};
	/**
	* Fin del constructor de la clase Emoticon.
	*/
	
	/**
	* Método Emotes
	* @param emote - Variable que contendrá los emoticones que el usuario vaya a utilizar.
	*/
	public void Emotes(){
		String Feliz = Emoticones[0]; //Declaración de variables para los elementos del Array.
		String Triste = Emoticones[1];
		String Enojo = Emoticones[2];
		String Felienojado = Emoticones[3];
		String Risas = Emoticones[4];
		String Desesperacion = Emoticones[5];
		String uwu = Emoticones[6];
		String Lloro = Emoticones[7];
		String Corazon = Emoticones[8];
		String unu = Emoticones[9];
		System.out.println("Que emoticon quiere agregar a su publicacion?"); //Listado de emojis disponibles.
		System.out.println("1. "+ Feliz +"\n2. "+ Triste +"\n3. "+ Enojo +"\n4. "+ Felienojado +"\n5. "+ Risas +"\n6. "+ Desesperacion +"7. "+ uwu +"8. "+ Lloro +"9. "+ Corazon +"10. "+ unu +"\n ");
		op = scan.nextInt();
		if (op == 1){ //Eligió un emoji feliz.
			System.out.println(Feliz);
		}
		else if (op == 2){ //Eligió un emoji triste.
			System.out.println(Triste);
		}
		else if (op == 3){ //Eligió un emoji enojado.
			System.out.println(Enojo);
		}
		else if (op == 4){ //Eligió un emoji felienojado.
			System.out.println(Felienojado);
		}
		else if (op == 5){ //Eligió un emoji con risitas.
			System.out.println(Risas);
		}
		else if (op == 6){ //Eligió un emoji desesperado.
			System.out.println(Desesperacion);
		}
		else if (op == 7){ //Eligió un uwu.
			System.out.println(uwu);
		}
		else if (op == 8){ //Eligió un emoji llorón.
			System.out.println(Lloro);
		}
		else if (op == 9){ //Eligió un corazón.
			System.out.println(Corazon);
		}
		else if (op == 10){ //Eligió un unu.
			System.out.println(unu);
		}
		else{ //Elija un emoji válido, por favor.
			System.out.println("Ingrese un emoji valido");
		}
	}
}