package org.hackathon.openassets.db.repository;

import org.hackathon.openassets.model.MappedDocument;

/**
 * Mapped document repository.
 */
public interface MappedDocumentRepository {

	/**
	 * @param documentId
	 * @return document for given {@code documentId}
	 */
	public MappedDocument getById(String documentId);

	/**
	 * Persists changes in document.
	 * 
	 * @param document
	 *            changed document
	 */
	public void update(MappedDocument document);
	
	public void save(MappedDocument document);

}
