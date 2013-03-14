package org.hackathon.openassets.db.repository;

import org.hackathon.openassets.model.DocumentForm;

/**
 * Document repository.
 */
public interface DocumentRepository {

	/**
	 * @return random incomplete document
	 */
	public DocumentForm getRandomIncomplete();

	/**
	 * @param documentId
	 * @return document for given {@code documentId}
	 */
	public DocumentForm getById(String documentId);

	/**
	 * Persists changes in document.
	 * 
	 * @param document
	 *            changed document
	 */
	public void update(DocumentForm document);

}
