package modelo;

public class Cliente {
private String dni;
private String nombre;
private String apellidos;
public Cliente(String dni, String nombre, String apellidos) {
	super();
	this.dni = dni;
	this.nombre = nombre;
	this.apellidos = apellidos;
}
private String getDni() {
	return dni;
}
private String getNombre() {
	return nombre;
}
private String getApellidos() {
	return apellidos;
}

}
