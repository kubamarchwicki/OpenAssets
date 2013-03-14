package org.hackathon.openassets.business;

import org.hackathon.openassets.db.repository.DocumentRepository;
import org.hackathon.openassets.db.repository.DocumentRepositoryImpl;
import org.hackathon.openassets.db.repository.RepositoryFactory;
import org.hackathon.openassets.model.DocumentForm;

/**
 * Handles document transcriptions, submitted by users.
 */
public class DocumentTranscriptionProcessor {

	/**
	 * Collects submitted transcription, and updates data.
	 * 
	 * @param transcription
	 */
	public void processTranscription(DocumentForm transcription,
			SimpleSentenceComparator comparator) {
		DocumentRepository repo = new RepositoryFactory()
				.getDocumentRepository(DocumentRepositoryImpl.class);
		// --1.Get document from repository by document_id from transcription--

		// --2.Melt transcription data with document--

		// ----2.1.For each transcription field----
		// if(comparator.compare(documentValue, transcriptionValue)) {
		// ----2.2.Add valid transcription
		// }else{
		// ----2.3.Add invalid transcription or ignore?
		// }

		// --3.Store document--
	}
}
