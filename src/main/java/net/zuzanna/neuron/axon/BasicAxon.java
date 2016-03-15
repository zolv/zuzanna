package net.zuzanna.neuron.axon;

import net.zuzanna.common.Reader;
import net.zuzanna.common.Writer;
import net.zuzanna.neuron.Neuron;

public class BasicAxon implements Axon, Reader, Writer {
	
	private double value;
	
	private final Neuron neuron;
	
	public BasicAxon( Neuron neuron ) {
		super();
		this.neuron = neuron;
	}
	
	@Override
	public double getValue() {
		return this.value;
	}
	
	public void setValue( double value ) {
		this.value = value;
	}
	
	@Override
	public Neuron getNeuron() {
		return this.neuron;
	}
	
}
