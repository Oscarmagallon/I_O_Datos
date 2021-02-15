package binarios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//leer fichero binarios
		
		File fichero = new File("datos.dat");
		if(!fichero.exists()) {
			try {
				fichero.createNewFile();
			} catch (Exception e) {
				System.out.println("No se ha podido crear el fichero");
			}
		}
		//Estructura ficheros binarios
		try (FileOutputStream fo = new FileOutputStream(fichero);
				DataOutputStream escribir = new DataOutputStream(fo);){
			escribir.writeInt(10);
			escribir.writeUTF("Juanfran");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		//leer fichero 
		
		try(FileInputStream fi = new FileInputStream(fichero);
				DataInputStream leer = new DataInputStream(fi);) {
				while(true) {
					System.out.println(leer.readInt());
					System.out.println(leer.readUTF());
				}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e1) {
			System.out.println("Fin de la lectura");
		}

	}

}
