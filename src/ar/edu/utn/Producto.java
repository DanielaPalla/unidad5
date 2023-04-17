package ar.edu.utn;

import java.time.LocalDate;

public class Producto {

	private String nombre;

	private String descripcion;

	private LocalDate fechaAlta;

	private Integer pesokg;

	private Double precio;

	private static final Double winPrecio = 0.1;

public Producto (String nombre, String descripcion, Integer pesokg, Double precio)

this.nombre = nombre; this.descripcion descripcion;

this.fechaAlta LocalDate.now();

this.pesokg pesokg; this.precio precio;

}

public Producto (String nombre) {

this.nombre = nombre;

this.fechaAlta LocalDate.now(); this.precio minPrecio;

}

public String getliombre() {

return this.nombre;

	public String getDescripcion() {
		return this.descripcion;
	}

public void setDescripcion(String descripcion) { this.descripcion descripcion;
}
