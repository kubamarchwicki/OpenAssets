package org.hackathon.openassets.db.repository;

/**
 * Repository factory.
 */
public class RepositoryFactory {

	/**
	 * Produces document repository.
	 * 
	 * @param clazz
	 *            repository implementation class
	 * @return repository
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

	/**
	 * Produces mapped document repository.
	 * 
	 * @param clazz
	 *            repository implementation class
	 * @return repository
	 */
	public MappedDocumentRepository getMappedDocumentRepository(
			Class<? extends MappedDocumentRepository> clazz) {
		try {
			return clazz.newInstance();
		} catch (InstantiationException e) {
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}

}
