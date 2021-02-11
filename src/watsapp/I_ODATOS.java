package watsapp;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class I_ODATOS {
	private File f;
	private FileReader fr;
	private Scanner leer;
	private FileWriter fw;
	private PrintWriter pw;
	
	
	public I_ODATOS() {
	
		this.f = null;
		this.fr = null;
		this.leer = null;
		this.fw = null;
		this.pw = null;
	}
	
	public Mensaje[] cargarDatos () {
		Mensaje vMensaje[] = new Mensaje[10];
		
		f = new File (fichero);
		
		
		
		return vMensaje;
	}
	
	
}
