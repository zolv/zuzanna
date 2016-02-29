package net.zuzanna.util.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/**
 * Implements Observable pattern (One provided by JDK does not fit).
 */
public class Notifier {

	private static final transient Logger Log = Logger.getLogger( Notifier.class.getName() );

	/** The observers. */
	private final List< Observer > observers = new ArrayList< Observer >( 2 );

	/**
	 * Adds new observer. If observer is null, no observer is added and no
	 * exception is thrown.
	 *
	 * @param observer
	 *          Given observer.
	 */
	public synchronized void addObserver( Observer observer ) {
		if ( observer != null ) {
			this.observers.add( observer );
		}
	}

	/**
	 * Removes specified observer.
	 *
	 * @param observer
	 *          Given observer.
	 */
	public synchronized void removeObserver( Observer observer ) {
		if ( observer != null ) {
			this.observers.remove( observer );
		}
	}

	/**
	 * Removes all observers.
	 */
	public synchronized void removeObservers() {
		this.observers.clear();
	}

	/**
	 * Gets the observers.
	 *
	 * @return the observers
	 */
	public synchronized List< Observer > getObservers() {
		return this.observers;
	}

	/**
	 * Notify observers. Don't implement this this way:
	 *
	 * <pre>
	 * List&lt; Observer &gt; copy = Arrays.asList( new Observer[ this.observers.size() ] );
	 * Collections.copy( copy , this.observers );
	 * </pre>
	 *
	 * Looks better, but after GWT compilation, JS says: gwt uncaught exception
	 * java.lang.UnsupportedOperationException: Add not supported on this list
	 * This is probably (I didn't have time to check it) asList method returns not
	 * modifable list.s
	 *
	 * @param obj
	 *          Object under change.
	 */
	public synchronized void notifyObservers() {

		final List< Observer > copy = new ArrayList< Observer >( this.observers );
		final Iterator< Observer > observersIt = copy.iterator();
		while ( observersIt.hasNext() ) {
			try {
				observersIt.next().update( this );
			} catch ( final Exception e ) {
				/*
				 * Catch is used to execute all observers' update method EVEN IF one of
				 * them has failed.
				 */
				Log.severe( e.getMessage() );
			}
		}
	}

}
