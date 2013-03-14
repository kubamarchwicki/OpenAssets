package org.hackathon.openassets.db.repository;

import org.hackathon.openassets.model.DocumentForm;

/**
 * Repozytorium dokumentów.
 * 
 */
public interface DocumentRepository {

	/**
	 * @return Zwraca losowy niekompletny dokument.
	 */
	public DocumentForm getRandomIncomplete();

	/**
	 * Utrwala zmiany w dokumencie.
	 * 
	 * @param document
	 *            Zmieniony dokument
	 */
	public void update(DocumentForm document);

}
