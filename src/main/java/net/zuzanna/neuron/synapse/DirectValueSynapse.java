package net.zuzanna.neuron.synapse;

import net.zuzanna.common.Value;

public class DirectValueSynapse implements Synapse {

	private final Value input;

	public DirectValueSynapse( Value input ) {
		super();
		this.input = input;
	}

	@Override
	public double getValue() {
		return this.input.getValue();
	}

}
