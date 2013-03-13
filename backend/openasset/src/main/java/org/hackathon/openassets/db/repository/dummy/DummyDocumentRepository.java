package org.hackathon.openassets.db.repository.dummy;

import org.hackathon.openassets.datagrabber.HtmlDocumentSnippetReader;
import org.hackathon.openassets.db.repository.DocumentRepository;
import org.hackathon.openassets.model.DocumentForm;

public class DummyDocumentRepository implements DocumentRepository {

	@Override
	public DocumentForm getRandomIncomplete() {
		Long id = 153239L;

		// Gson gson = new Gson();
		DocumentForm response = new DocumentForm();
		if (id != null) {
			response.setDocument_id(id.toString());
			response.setImages(HtmlDocumentSnippetReader.getImageUrls(id));
		}
		// return gson.toJson(response);
		return response;
	}

	@Override
	public void update(DocumentForm document) {
		// TODO Auto-generated method stub

	}

}
