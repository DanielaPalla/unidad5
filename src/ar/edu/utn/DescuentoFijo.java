package ar.edu.utn;

public class DescuentoFijo extends Descuento {
	@Override
	public float valorFinal(float valorInicial) {
		return valorInicial - this.getValorDesc();
	}
}
