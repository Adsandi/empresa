package modelo;

public class Articulo {
private String identificador;
private String nombre;
private String precio;
private String descripci�n;
public Articulo(String identificador, String nombre, String precio, String descripci�n) {
	super();
	this.identificador = identificador;
	this.nombre = nombre;
	this.precio = precio;
	this.descripci�n = descripci�n;
}
private String getIdentificador() {
	return identificador;
}
private String getNombre() {
	return nombre;
}
private String getPrecio() {
	return precio;
}
private String getDescripci�n() {
	return descripci�n;
}

}
