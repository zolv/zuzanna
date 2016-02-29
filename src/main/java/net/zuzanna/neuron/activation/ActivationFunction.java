package net.zuzanna.neuron.activation;

import net.zuzanna.neuron.dendrite.Dendrites;

public interface ActivationFunction {
	
	double activate( Dendrites dendrites );
	
}
