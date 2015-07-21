package net.zuzanna.neuron;

import java.util.List;

public interface DendriteManagaer {

	List<Dendrite> getDendrits();

	void addDendrite(Dendrite dendrite);

	void removeDendrite(Dendrite dendrite);

}
