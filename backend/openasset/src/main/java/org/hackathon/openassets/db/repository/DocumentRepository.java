package org.hackathon.openassets.db.repository;

import org.hackathon.openassets.model.Document;

/**
 * Repozytorium dokumentów.
 * 
 */
public interface DocumentRepository {

	/**
	 * @return Zwraca losowy niekompletny dokument.
	 */
	public Document getRandomIncomplete();

	/**
	 * Utrwala zmiany w dokumencie.
	 * 
	 * @param document
	 *            Zmieniony dokument
	 */
	public void update(Document document);

}
