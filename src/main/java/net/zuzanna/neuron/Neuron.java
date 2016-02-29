package net.zuzanna.neuron;

import net.zuzanna.common.Activateable;
import net.zuzanna.neuron.axon.Axon;
import net.zuzanna.neuron.dendrite.Dendrites;

public interface Neuron extends Activateable {
	
	Axon getAxon();
	
	Dendrites getDendrites();
	
}
