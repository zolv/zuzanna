package net.zuzanna.neuron.axon;

public class BasicAxon implements Axon {
	private double value;

	@Override
	public double getValue() {
		return this.value;
	}

	public void setValue( double value ) {
		this.value = value;
	}

}
