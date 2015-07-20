package net.zuzanna.neuron;

import net.zuzanna.neuron.activation.ActivationFunction;
import net.zuzanna.neuron.composition.CompositionFunction;

public class CommonNeuron implements Neuron {

	private Axon axon;

	private ActivationFunction activator;

	private CompositionFunction compositor;

	public CommonNeuron(ActivationFunction activator, CompositionFunction compositor) {
		super();
		this.activator = activator;
		this.compositor = compositor;
	}

	public CommonNeuron(Axon axon, ActivationFunction activator) {
		super();
		this.activator = activator;
		this.compositor = compositor;
	}

	@Override
	public Axon getAxon() {
		return axon;
	}

	@Override
	public DendriteManagaer getDendritManager() {
		// TODO Auto-generated method stub
		return null;
	}

}
