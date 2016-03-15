package net.zuzanna.neuron.axon;

import net.zuzanna.neuron.Neuron;
import net.zuzanna.util.observer.Notifier;

public class NotifiableAxon implements Axon {

	private final BasicAxon axon;

	private final Notifier observed = new Notifier();

	public NotifiableAxon(Neuron neuron) {
		this( new BasicAxon(neuron) );
	}

	public NotifiableAxon( BasicAxon axon ) {
		super();
		this.axon = axon;
	}

	@Override
	public synchronized double getValue() {
		return this.axon.getValue();
	}

	public synchronized void setValue( double value ) {
		this.axon.setValue( value );
		this.observed.notifyObservers();
	}

	public Notifier getNotifier() {
		return this.observed;
	}

	@Override
	public Neuron getNeuron() {
		return this.axon.getNeuron();
	}

}
