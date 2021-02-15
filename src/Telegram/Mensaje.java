package Telegram;

public class Mensaje {
private String nombre;
private String mensaje;
public Mensaje(String nombre, String mensaje) {
	super();
	this.nombre = nombre;
	this.mensaje = mensaje;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getMensaje() {
	return mensaje;
}
public void setMensaje(String mensaje) {
	this.mensaje = mensaje;
}
public Mensaje(String linea) {
	int pos = linea.indexOf(":");
	this.nombre = linea.substring(pos+1);
	this.mensaje= linea.substring(0,pos-1);
}
@Override
public String toString() {
	return mensaje + nombre; 
}


}
