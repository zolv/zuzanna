package net.zuzanna.common;

public class SimpleInput implements Input {

	private double value;

	@Override
	public double getValue() {
		return this.value;
	}

	@Override
	public void setValue( double value ) {
		this.value = value;
	}

}
