package net.zuzanna.neuron.dendrite;

import java.util.List;

public interface Dendrites {
	
	List< Dendrite > getDendrits();
	
	void addDendrite( Dendrite dendrite );
	
	void removeDendrite( Dendrite dendrite );
	
}
