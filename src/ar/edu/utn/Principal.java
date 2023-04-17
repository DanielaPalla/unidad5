package ar.edu.utn;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
				
		/*Persona persona1 = new Persona();
		persona1.apellido= "Lopez";
		persona1.nombre="Ana";
		persona1.fechaDeNacimiento= LocalDate.of(1990, 2, 10);
		persona1.display();
		
		LocalDate fecha= LocalDate.of(1985, 10, 12);
		Persona persona2 = new Persona("Juan", "Ruiz", fecha);
		persona2.display();*/
		
		Descuento desc1 = new DescuentoFijo();
		desc1.setValorDesc(14.0);
		System.out.println(desc1.valorFinal(100));

	}

}
