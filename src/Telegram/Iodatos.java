package Telegram;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Iodatos {
private File f;
private FileReader fr;
private Scanner leer;
private FileWriter fw;
private PrintWriter pw;
public Iodatos() {
	this.f = f;
	this.fr = fr;
	this.leer = leer;
	this.fw = fw;
	this.pw = pw;
}
public Mensaje[] cargarMensajesVector (String nombreFichero) {
	Mensaje vMensajes[] = new Mensaje[10];
	f = new File(nombreFichero);
	if(!f.exists()) {
		try {
			f.createNewFile();
			}catch (Exception e) {
			e.printStackTrace();
			}
		
		
	}
	
	try {
		fr = new FileReader(f);
		leer= new Scanner (fr);
		while(leer.hasNext())
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	return vMensajes;
}
}
