package org.hackathon.openassets.db.repository;

/**
 * Fabryka repozytorium.
 */
public class RepositoryFactory {

	/**
	 * Pobiera repozytorium.
	 * 
	 * @param clazz
	 *            klasa repozytorium
	 * @return obiekt repozytorium
	 */
	public DocumentRepository getDocumentRepository(
			Class<? extends DocumentRepository> clazz) {
		throw new RuntimeException("Not implemented yet.");
	}

}
