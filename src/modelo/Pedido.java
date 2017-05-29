package modelo;

public class Pedido {
private int identificador;
private Cliente cliente;
private LineaDePedido[] lineasDePedido;
public Pedido(int identificador, Cliente cliente, LineaDePedido[] lineasDePedido) {
	super();
	this.identificador = identificador;
	this.cliente = cliente;
	this.lineasDePedido = lineasDePedido;
}
private int getIdentificador() {
	return identificador;
}
private void setIdentificador(int identificador) {
	this.identificador = identificador;
}
private Cliente getCliente() {
	return cliente;
}
private void setCliente(Cliente cliente) {
	this.cliente = cliente;
}
private LineaDePedido[] getLineasDePedido() {
	return lineasDePedido;
}
private void setLineasDePedido(LineaDePedido[] lineasDePedido) {
	this.lineasDePedido = lineasDePedido;
}
}
