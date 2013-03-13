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
		try {
			return clazz.newInstance();
		} catch (InstantiationException e) {
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}

}
