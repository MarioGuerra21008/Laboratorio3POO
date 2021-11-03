import java.util.Scanner;
import java.io.IOException;

/**
* Clase Imagen para enviar archivos como imágenes, videos, audios, etcétera en publicaciones o comentarios.
* @author Mario Guerra
* @version 2/11/2021
* @see Imagen
*/

class Imagen extends Mensajes{
	/**
	* Constructor para la clase Imagen.
	*/
	Scanner scan = new Scanner(System.in);
	String archivo = this.Message;
	int op = 0;
	/**
	* Fin del constructor de la clase Imagen.
	*/
	
	/**
	* Método Image
	* @param archivo - Variable que guardará los nombres y especificaciones de cada archivo que será enviado.
	*/
	public void Image(){
		System.out.println("Desea agregar un archivo de texto, audio o video?\n1. Texto.\n2. Audio.\n3. Video.\n4. Imagen.\n"); //Opciones para enviar archivo.
		op = scan.nextInt();
		if (op == 1){
			System.out.println("Ingrese la URL del archivo de texto que desea cargar:\n"); //Eligió enviar un archivo de texto.
			archivo = scan.next();
			System.out.println("Texto "+ archivo +".txt mostrandose."); //Mensaje del archivo de texto enviado.
		}
		else if (op == 2){
			System.out.println("Ingrese la URL del audio que quiere reproducir."); //Eligió enviar un audio.
			archivo = scan.next();
			System.out.println("Audio "+ archivo +".mp3 con 44.1 KHz de sample rate y 16 de bit depth siendo reproducido en estos momentos."); //Mensaje del audio enviado.
		}
		else if (op == 3){
			System.out.println("Ingrese la URL del video que quiere reproducir."); //Eligió enviar un video.
			archivo = scan.next();
			System.out.println("Video "+ archivo +".mp4 con 30 fps siendo mostrado ahora mismo."); //Mensaje del video enviado.
		}
		else if (op == 4){
			System.out.println("Ingrese la URL del video que quiere reproducir."); //Eligió enviar una imagen.
			archivo = scan.next();
			System.out.println("Imagen "+ archivo +".jpg con 5 megapixeles siendo mostrada ahora mismo."); //Mensaje de la imagen enviada.
		}
	}
}

