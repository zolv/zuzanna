package net.zuzanna.neuron.synapsy;

import net.zuzanna.neuron.Axon;

public class SynapsyToAxon implements Synapsy {

	private Axon input;

	@Override
	public double getValue() {
		return input.getValue();
	}

}
