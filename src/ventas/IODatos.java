package ventas;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODatos {
	public static void cargarDatos(String fichero, Ventas vVentas[]){
	File f = new File(fichero);
	
	if(!f.exists()) {
		try {
			f.createNewFile();
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
	}
	try (FileOutputStream fi=new FileOutputStream(f);
			DataOutputStream escribir = new DataOutputStream(fi)){
		for (Ventas ventas : vVentas) {
			if(ventas != null) {
				escribir.writeUTF(ventas.getCliente());
				escribir.writeInt(ventas.getProducto());
				escribir.writeInt(ventas.getCantidad());
				escribir.writeDouble(ventas.getPrecioUnitario());
				
			}
		}
	} catch (Exception e) {
		// TODO: handle exception
	}

	
	}
	public static void leerDatos(String fichero){
		File f = new File(fichero);
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (Exception e) {
				// TODO: handle exception
				e.getStackTrace();
			}
		}
		try (FileInputStream fi = new FileInputStream(f);
				DataInputStream leer = new DataInputStream(fi)){
			while(true) {
				leer.readUTF();
				leer.read();
				leer.read();
				leer.readDouble();
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Lectura terminada");
		}
	}
	
}
