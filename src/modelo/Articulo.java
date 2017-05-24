package modelo;

public class Articulo {
private String identificador;
private String nombre;
private String precio;
private String descripción;
public Articulo(String identificador, String nombre, String precio, String descripción) {
	super();
	this.identificador = identificador;
	this.nombre = nombre;
	this.precio = precio;
	this.descripción = descripción;
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
private String getDescripción() {
	return descripción;
}

}
