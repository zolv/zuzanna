package net.zuzanna.common;

public class Bias implements Value {

	private static final Bias DEFAULT_BIAS = new Bias( 1d );

	public static Bias get() {
		return DEFAULT_BIAS;
	}

	private final double value;

	public Bias( double value ) {
		this.value = value;
	}

	@Override
	public double getValue() {
		return this.value;
	}

}
