package net.zuzanna.neuron.synapse;

import net.zuzanna.neuron.Neuron;

public class NeuronSynapse implements Synapse {

	private final Neuron neuron;

	public NeuronSynapse( Neuron neuron ) {
		this.neuron = neuron;
	}

	@Override
	public double getValue() {
		return this.neuron.getAxon().getValue();
	}

}
