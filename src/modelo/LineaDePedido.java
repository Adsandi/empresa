package modelo;

public class LineaDePedido {
private Articulo articulo;
private int numeroDeLinea;
private int cantidad;
public LineaDePedido(Articulo articulo, int numeroDeLinea, int cantidad) {
	super();
	this.articulo = articulo;
	this.numeroDeLinea = numeroDeLinea;
	this.cantidad = cantidad;
}
private Articulo getArticulo() {
	return articulo;
}
private int getNumeroDeLinea() {
	return numeroDeLinea;
}
private int getCantidad() {
	return cantidad;
}

}
