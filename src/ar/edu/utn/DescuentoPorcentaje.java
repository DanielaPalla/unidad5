package ar.edu.utn;

public class DescuentoPorcentaje extends Descuento {
	@Override
	public float valorFinal(float valorInicial) {
		return valorInicial - (valorInicial * this.getValorDesc());
	}
}
