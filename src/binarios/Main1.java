package binarios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main1 {
	public static void main(String[] args) {
		
		File fichero =new File("datos.dat");
		if(!fichero.exists()) {
			try {
				File f = new File("datos.dat");
			} catch (Exception e) {
				System.out.println("No se ha podido crear el fichero");
			}
		}
		//escritura
		try {
			FileOutputStream fo = new FileOutputStream(fichero);
			DataOutputStream escribe=new DataOutputStream(fo);
			escribe.writeInt(1);
			escribe.writeUTF("Si");
			escribe.writeChar(7);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		//lectura
		try {
			FileInputStream fi = new FileInputStream(fichero);
			DataInputStream leer = new DataInputStream(fi);
			while(true) {	System.out.println(leer.readInt());
			System.out.println(leer.readUTF());
			System.out.println(leer.readChar());
			}
		
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
