package net.zuzanna.neuron.dendrite;

import net.zuzanna.neuron.synapse.Synapse;

public class SynapseDendrite extends DendriteBase {

	private final Synapse synapse;

	public SynapseDendrite( Synapse synapse ) {
		this.synapse = synapse;
	}

	@Override
	public Synapse getSynapse() {
		return this.synapse;
	}

}
