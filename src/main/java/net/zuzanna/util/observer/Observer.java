package net.zuzanna.util.observer;

public interface Observer {
	/**
	 *
	 * @param observable
	 * @param arg
	 */
	void update(Notifier notifier);
}
