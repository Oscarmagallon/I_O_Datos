package password;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Password vPassword[] = new Password[10];
		vPassword[0] = new Password("Juan", 1, false);
		vPassword[1] = new Password("Pepe", 2, true);
		vPassword[2] = new Password("Adelin", 3, true);
		vPassword[3] = new Password("Jordi", 4, false);
		*/
		Scanner leer = new Scanner(System.in);
		boolean segura= false; 
		
		Password[] vPassword = IODatos.cargarDatos("pass.dat");
		
		for (Password password : vPassword) {
			if (password!=null) {
				System.out.println(password);
			}
		}
		
		System.out.println("¿Quien eres?");
		String usuario = leer.next();
		System.out.println("¿Que contraseña quieres?");
		int pass = leer.nextInt();
		System.out.println("¿Es segura?");
		String sino = leer.next();
		if (sino.equalsIgnoreCase("si")) {
			segura =true;
		}else {
			segura = false;
		}
		
		
		
		Password pa = new Password(usuario, pass, segura);
		for(int i = 0; i<vPassword.length;i++) {
			if (vPassword[i]== null) {
				vPassword[i] =pa;
				break;
			}
		}
		
		
		
		IODatos.guardarDatos("pass.dat", vPassword);
		
		
	}

}
