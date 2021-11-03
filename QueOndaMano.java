import java.util.Scanner;
import java.io.IOException;

/**
* Clase QueOndaMano utilizada para proporcionar la vista del programa al usuario.
* @author Mario Guerra
* @version 2/11/2021
* @see QueOndaMano
*/

class QueOndaMano{
	public static void main(String[] args){
		/**
		* Constructor para la clase de QueOndaMano.
		*/
		Scanner scan = new Scanner(System.in);
		String fecha;
		String hora;
		String filtro;
		int opcion = 0;
		InicioSesion ini = new InicioSesion();
		Texto te = new Texto();
		Imagen ima = new Imagen();
		Emoticon emo = new Emoticon();
		/**
		* Fin del constructor de la clase QueOndaMano.
		*/
		try{
			System.out.println("Bienvenido a Que Onda Mano! Inicie sesion para acceder a su cuenta o registrese si no tiene cuenta.\n1. Iniciar Sesion.\n2. Crear cuenta.");
			opcion = scan.nextInt(); //Con esta opcion puede decidir si usar una sesión ya iniciada o crear una cuenta.
			if (opcion == 1){
				ini.Iniciar(); //Método para iniciar sesión.
			}
			else if (opcion == 2){
				ini.Crear(); //Método para crear cuenta.
			}
			else{
				System.out.println("Ingrese una opcion que sea de las que aparecen en pantalla");
			}
			//Feed de la aplicación.
			System.out.println("Johanna, 31/10/2021 17:20 Likes: 5.\n Aqui con mi disfraz :-)\n halloween.jpg\n 2.4 MB. 5 megapixeles.\n");
			System.out.println("Pixie13, 30/10/2021 11:52 Likes: 0.\n Sin nada que hacer\n");
			System.out.println("Paulo Calcu, 1/11/2021 21:30 Likes: 1.\n #programacion\n pseucodigo.txt\n 8 KB.\n");
			System.out.println("Momazos Diego, 23/10/2021 12:23 Likes: 34.\n Me paso XD\n tencuidadosportacus.jpg\n 0.78 MB. 5 megapixeles.\n");
			System.out.println("JohnJohnson1, 31/10/2021 13:09 Likes: 0.\n #aburrido \n unknown.mp4\n 5.98 MB. 30 FPS.\n");
			//Opciones para el usuario sobre si publicar un nuevo mensaje o comentar los de sus amigos.
			System.out.println("Que desea hacer?");
			System.out.println("1. Publicar.\n2. Comentar");
			opcion = scan.nextInt();
			if (opcion == 1){
				Publicar(); //Método para publicar un nuevo mensaje.
			}
			if (opcion == 2){
				Interactuar(); //Opciones múltiples para interactuar con sus seguidores.
			}
			else{
				System.out.println("Elija una de las alternativas, por favor.");
			}
		}
		catch(Exception e){
			System.out.println("Intente nuevamente.");
		}
	}
	/**
	* Método Publicar
	*/
	public static void Publicar(){
		Scanner scan = new Scanner(System.in); //Constructor del método.
		int opcion = 0;
		Texto te = new Texto();
		Imagen ima = new Imagen();
		Emoticon emo = new Emoticon();
		te.Text(); //Método para una entrada de texto.
		System.out.println("Desea agregar un archivo?\n1. Si.\n2. No"); //Decision sobre si quiere agregar un archivo.
		opcion = scan.nextInt();
		if (opcion == 1){
			ima.Image(); //Método para añadir imagen.
			System.out.println("Desea agregar un emoticon?\n1. Si.\n2. No");  //Decisión sobre si quiere agregar un emoticon.
			opcion = scan.nextInt();
			if (opcion == 1){
				emo.Emotes(); //Método para añadir imagen.
				System.out.println("Gracias por usar nuestra red!");
			}
			if (opcion == 2){
				System.out.println("Gracias por usar nuestra red!");
			}
		}
		if (opcion == 2){
			System.out.println("Gracias por usar nuestra red!");
		}
	}
	/**
	* Método Interactuar
	*/
	public static void Interactuar(){
		Scanner scan = new Scanner(System.in); //Constructor del método.
		int opcion = 0;
		String usuario;
		Texto te = new Texto();
		Imagen ima = new Imagen();
		Emoticon emo = new Emoticon();
		System.out.println("A quien desea comentar?"); //Escribir el nombre del usuario al que desea mencionar.
		usuario = scan.next();
		System.out.println("Entendido, que quiere escribirle a "+ usuario +"?\n1. Texto.\n2. Enviar archivo. \n3. Enviar emoticon.\n"); //Menú de opciones para interactuar.
		opcion = scan.nextInt();
		if (opcion == 1){
			te.Text(); //Método para enviarle un comentario.
		}
		if (opcion == 2){
			ima.Image(); //Método para enviarle un archivo.
		}
		if (opcion == 3){
			emo.Emotes(); //Método para enviarle un emote.
		}
	}
}