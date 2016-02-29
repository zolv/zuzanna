package net.zuzanna.neuron.dendrite;

public abstract class DendriteBase implements Dendrite {

	private double weight;

	public DendriteBase() {
		super();
	}

	@Override
	public double getWeight() {
		return this.weight;
	}

	public void setWeight( double weight ) {
		this.weight = weight;
	}

}
