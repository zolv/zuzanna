package net.zuzanna.neuron.dendrite;

import java.util.ArrayList;
import java.util.List;

public class BasicDendrites implements Dendrites {

	private final List< Dendrite > dendrits = new ArrayList<>();

	@Override
	public void removeDendrite( Dendrite dendrite ) {
		this.dendrits.remove( dendrite );
	}

	@Override
	public List< Dendrite > getDendrits() {
		return this.dendrits;
	}

	@Override
	public void addDendrite( Dendrite dendrite ) {
		this.dendrits.add( dendrite );
	}
}
