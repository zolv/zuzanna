package net.zuzanna.neuron.synapse;

import net.zuzanna.neuron.Neuron;
import net.zuzanna.neuron.axon.Axon;

public class AxonSynapse implements Synapse {

	private final Axon axon;

	public AxonSynapse( Neuron neuron ) {
		this(neuron.getAxon());
	}

	public AxonSynapse( Axon axon ) {
		super();
		this.axon = axon;
	}

	@Override
	public double getValue() {
		return this.axon.getValue();
	}

}
