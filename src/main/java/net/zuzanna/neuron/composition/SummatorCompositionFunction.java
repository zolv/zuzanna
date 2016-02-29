package net.zuzanna.neuron.composition;

import net.zuzanna.neuron.dendrite.Dendrite;
import net.zuzanna.neuron.dendrite.Dendrites;

public class SummatorCompositionFunction implements CompositionFunction {

	@Override
	public double activate( final Dendrites dendrites ) {
		double result = 0d;
		for ( final Dendrite dendrite : dendrites.getDendrits() ) {
			result += dendrite.getSynapse().getValue() * dendrite.getWeight();
		}
		return result;
	}

}
