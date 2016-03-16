package net.zuzanna.common;

public class SimpleValue implements Value {

	private double value;

	@Override
	public double getValue() {
		return this.value;
	}

	@Override
	public void setValue( double value ) {
		this.value = value;
	}
	
	public Reader getReader() {
		return this;
	}
	
	public Writer getWriter() {
		return this;
	}

}
