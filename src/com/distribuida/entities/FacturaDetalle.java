package com.distribuida.entities;

public class FacturaDetalle {
	
	private int idFacturaDetealle;
	private int cantidad;
	private Double subtotal;
	
	private Factura factura;
	private Libro libro;
	
	public FacturaDetalle() {}

	public int getIdFacturaDetealle() {
		return idFacturaDetealle;
	}

	public void setIdFacturaDetealle(int idFacturaDetealle) {
		this.idFacturaDetealle = idFacturaDetealle;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	@Override
	public String toString() {
		return "FacturaDetalle [idFacturaDetealle=" + idFacturaDetealle + ", cantidad=" + cantidad + ", subtotal="
				+ subtotal + ", factura=" + factura + ", libro=" + libro + "]";
	}
	
	
	
	
	
	
	

}
