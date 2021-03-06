package com.im.puntoventa.datos;

public class DatosFiltroProductos {
	
	public DatosFiltroProductos(String codigoProducto,
			String descripcionProducto, String marcaProducto,
			double precioProducto, String disponible, String bodegaProducto,
			String backOrder, String fechaespera, String transito,
			String familiaProducto, String referenciaProducto) {
		
		this.setCodigoProducto(codigoProducto);
		this.setDescripcionProducto(descripcionProducto);
		this.setMarcaProducto(marcaProducto);
		this.setPrecioProducto(precioProducto);
		this.setDisponible(disponible);
		this.setBodegaProducto(bodegaProducto);
		this.setBackOrder(backOrder);
		this.setFechaespera(fechaespera);
		this.setTransito(transito);
		this.setFamiliaProducto(familiaProducto);
		this.setReferenciaProducto(referenciaProducto);
	}
	
	public DatosFiltroProductos(){}
	//campos busqueda
	private String lista;
	private String codigoPago;
	private String codigoBodegaLocal;
	private String buscaMarca;
	private String buscaFamilia;
	private String buscaReferencia;
	private String buscaDescripcion;
	
	private String codigoProducto;
	private String descripcionProducto;
	private String marcaProducto;
	private double precioProducto;
	private String disponible;
	private String bodegaProducto;
	private String backOrder;
	private String fechaespera;
	private String transito;
	private String familiaProducto;
	private String referenciaProducto;
	public String getLista() {
		return lista;
	}
	public void setLista(String lista) {
		this.lista = lista;
	}
	public String getCodigoPago() {
		return codigoPago;
	}
	public void setCodigoPago(String codigoPago) {
		this.codigoPago = codigoPago;
	}
	public String getCodigoBodegaLocal() {
		return codigoBodegaLocal;
	}
	public void setCodigoBodegaLocal(String codigoBodegaLocal) {
		this.codigoBodegaLocal = codigoBodegaLocal;
	}
	public String getBuscaMarca() {
		return buscaMarca;
	}
	public void setBuscaMarca(String buscaMarca) {
		this.buscaMarca = buscaMarca;
	}
	public String getBuscaFamilia() {
		return buscaFamilia;
	}
	public void setBuscaFamilia(String buscaFamilia) {
		this.buscaFamilia = buscaFamilia;
	}
	public String getBuscaReferencia() {
		return buscaReferencia;
	}
	public void setBuscaReferencia(String buscaReferencia) {
		this.buscaReferencia = buscaReferencia;
	}
	public String getBuscaDescripcion() {
		return buscaDescripcion;
	}
	public void setBuscaDescripcion(String buscaDescripcion) {
		this.buscaDescripcion = buscaDescripcion;
	}
	public String getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public String getDescripcionProducto() {
		return descripcionProducto;
	}
	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}
	public String getMarcaProducto() {
		return marcaProducto;
	}
	public void setMarcaProducto(String marcaProducto) {
		this.marcaProducto = marcaProducto;
	}
	public double getPrecioProducto() {
		return precioProducto;
	}
	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}
	public String getDisponible() {
		return disponible;
	}
	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}
	public String getBodegaProducto() {
		return bodegaProducto;
	}
	public void setBodegaProducto(String bodegaProducto) {
		this.bodegaProducto = bodegaProducto;
	}
	public String getBackOrder() {
		return backOrder;
	}
	public void setBackOrder(String backOrder) {
		this.backOrder = backOrder;
	}
	public String getFechaespera() {
		return fechaespera;
	}
	public void setFechaespera(String fechaespera) {
		this.fechaespera = fechaespera;
	}
	public String getTransito() {
		return transito;
	}
	public void setTransito(String transito) {
		this.transito = transito;
	}
	public String getFamiliaProducto() {
		return familiaProducto;
	}
	public void setFamiliaProducto(String familiaProducto) {
		this.familiaProducto = familiaProducto;
	}
	public String getReferenciaProducto() {
		return referenciaProducto;
	}
	public void setReferenciaProducto(String referenciaProducto) {
		this.referenciaProducto = referenciaProducto;
	}
	
	
	
}
