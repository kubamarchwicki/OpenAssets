package org.hackathon.openassets.db.repository;

import org.hackathon.openassets.model.DocumentForm;

/**
 * Document repository.
 * 
 */
public interface DocumentRepository {

	/**
	 * @return random incomplete document
	 */
	public DocumentForm getRandomIncomplete();

	/**
	 * Persists changes in document.
	 * 
	 * @param document
	 *            changed document
	 */
	public void update(DocumentForm document);

}
