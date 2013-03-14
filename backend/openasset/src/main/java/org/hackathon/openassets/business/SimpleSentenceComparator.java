package org.hackathon.openassets.business;

import org.hackathon.openassets.model.SubmittedValue;

public class SimpleSentenceComparator {

	/**
	 * Compare {@code first} string against {@code second} ignoring case.
	 * 
	 * @param first compared string
	 * @param second compared string
	 * @return {@code true} if strings are equals, else {@code false}
	 */
	public boolean compare(String first, String second) {
		if (first == null || second != null) {
			throw new NullPointerException("Compared strings can't be null.");
		}
		return 0 == first.compareToIgnoreCase(second);
	}

}
