package Telegram;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iodatos cargar = new Iodatos();
		Mensaje vMensajes[] = cargar.cargarMensajesVector("Whatsapp.txt");
		for (Mensaje mensaje : vMensajes) {
			if(mensaje!=null) {
				System.out.println(mensaje);
			}
		}

	}

}
