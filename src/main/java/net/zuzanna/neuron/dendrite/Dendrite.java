package net.zuzanna.neuron.dendrite;

import net.zuzanna.neuron.synapse.Synapse;

public interface Dendrite {
	
	Synapse getSynapse();
	
	double getWeight();
	
}
