package net.zuzanna.neuron;

import net.zuzanna.neuron.activation.ActivationFunction;
import net.zuzanna.neuron.axon.Axon;
import net.zuzanna.neuron.axon.BasicAxon;
import net.zuzanna.neuron.dendrite.BasicDendrites;
import net.zuzanna.neuron.dendrite.Dendrites;

public class BasicNeuron implements Neuron {

	private BasicAxon axon;

	private final ActivationFunction activator;

	private final Dendrites dentrites;

	public BasicNeuron( ActivationFunction activator ) {
		super();
		this.activator = activator;
		this.dentrites = new BasicDendrites();
	}

	@Override
	public Axon getAxon() {
		return this.axon;
	}

	@Override
	public Dendrites getDendrites() {
		return this.dentrites;
	}

	@Override
	public void activate() {
		this.axon.setValue( this.activator.activate( this.dentrites ) );
	}

}
