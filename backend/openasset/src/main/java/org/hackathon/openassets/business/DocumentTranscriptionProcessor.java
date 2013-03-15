package org.hackathon.openassets.business;

import java.util.LinkedList;

import org.hackathon.openassets.model.DocumentForm;
import org.hackathon.openassets.model.MappedDocument;
import org.hackathon.openassets.model.SubmittedValue;
import org.hackathon.openassets.model.SubmittedValue.TranscriptionText;

/**
 * Handles document transcriptions, submitted by users.
 */
public class DocumentTranscriptionProcessor {

	private SimpleSentenceComparator comparator;

	/**
	 * Updates provided mapped document with given transcription using provided
	 * comparator.
	 * 
	 * @param document
	 *            mapped document
	 * @param transcription
	 * @param comparator
	 * @return
	 */
	public MappedDocument processTranscription(MappedDocument document,
			DocumentForm transcription, SimpleSentenceComparator comparator) {
		this.comparator = comparator;

		SubmittedValue sv;
		boolean isValid = true;

		sv = updateTranscriptions(document.getName(), transcription.getName(),
				"name");
		if (sv != null) {
			document.setName(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getDate_of_birth(),
				transcription.getDate_of_birth(), "date_of_birth");
		if (sv != null) {
			document.setDate_of_birth(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getPlace_of_birth(),
				transcription.getPlace_of_birth(), "place_of_birth");
		if (sv != null) {
			document.setPlace_of_birth(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getWork(), transcription.getWork(),
				"work");
		if (sv != null) {
			document.setPlace_of_birth(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getCash_pln(),
				transcription.getCash_pln(), "cash_pln");
		if (sv != null) {
			document.setCash_pln(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getCash_other(),
				transcription.getCash_other(), "cash_other");
		if (sv != null) {
			document.setCash_other(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getStocks(),
				transcription.getStocks(), "stocks");
		if (sv != null) {
			document.setStocks(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getHouse_area(),
				transcription.getHouse_area(), "house_area");
		if (sv != null) {
			document.setHouse_area(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getHouse_value(),
				transcription.getHouse_value(), "house_value");
		if (sv != null) {
			document.setHouse_value(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getHouse_ownership(),
				transcription.getHouse_ownership(), "house_ownership");
		if (sv != null) {
			document.setHouse_ownership(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getFlat_area(),
				transcription.getFlat_area(), "flat_area");
		if (sv != null) {
			document.setFlat_area(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getFlat_value(),
				transcription.getFlat_value(), "flat_value");
		if (sv != null) {
			document.setFlat_value(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getFlat_ownership(),
				transcription.getFlat_ownership(), "flat_ownership");
		if (sv != null) {
			document.setFlat_ownership(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getFarm_type(),
				transcription.getFarm_type(), "farm_type");
		if (sv != null) {
			document.setFarm_type(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getFarm_area(),
				transcription.getFarm_area(), "farm_area");
		if (sv != null) {
			document.setFarm_area(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getFarm_value(),
				transcription.getFarm_value(), "farm_value");
		if (sv != null) {
			document.setFarm_value(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getFarm_buildings(),
				transcription.getFarm_buildings(), "farm_buildings");
		if (sv != null) {
			document.setFarm_buildings(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getFarm_ownership(),
				transcription.getFarm_ownership(), "farm_ownership");
		if (sv != null) {
			document.setFarm_ownership(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getFarm_income(),
				transcription.getFarm_income(), "farm_income");
		if (sv != null) {
			document.setFarm_income(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getOther_realestate(),
				transcription.getOther_realestate(), "other_realestate");
		if (sv != null) {
			document.setOther_realestate(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getStocks_participation(),
				transcription.getStocks_participation(), "stocks_participation");
		if (sv != null) {
			document.setStocks_participation(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getStocks_income(),
				transcription.getStocks_income(), "stocks_income");
		if (sv != null) {
			document.setStocks_income(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getStocks_government(),
				transcription.getStocks_government(), "stocks_government");
		if (sv != null) {
			document.setStocks_government(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getStocks_government_more_10_proc(),
				transcription.getStocks_government_more_10_proc(),
				"stocks_government_more_10_proc");
		if (sv != null) {
			document.setStocks_government_more_10_proc(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getStocks_government_income(),
				transcription.getStocks_government_income(),
				"stocks_government_income");
		if (sv != null) {
			document.setStocks_government_income(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getStocks_commercial_company(),
				transcription.getStocks_commercial_company(),
				"stocks_commercial_company");
		if (sv != null) {
			document.setStocks_commercial_company(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(
				document.getStocks_commercial_company_income(),
				transcription.getStocks_commercial_company_income(),
				"stocks_commercial_company_income");
		if (sv != null) {
			document.setStocks_commercial_company_income(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(
				document.getStocks_commercial_company_government(),
				transcription.getStocks_commercial_company_government(),
				"stocks_commercial_company_government");
		if (sv != null) {
			document.setStocks_commercial_company_government(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(
				document.getStocks_commercial_company_government_more_10proc(),
				transcription
						.getStocks_commercial_company_government_more_10proc(),
				"stocks_commercial_company_government_more_10proc");
		if (sv != null) {
			document.setStocks_commercial_company_government_more_10proc(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(
				document.getStocks_commercial_company_government_income(),
				transcription.getStocks_commercial_company_government_income(),
				"stocks_commercial_company_government_income");
		if (sv != null) {
			document.setStocks_commercial_company_government_income(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getStocks_other_company(),
				transcription.getStocks_other_company(), "stocks_other_company");
		if (sv != null) {
			document.setStocks_other_company(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getStocks_other_company_income(),
				transcription.getStocks_other_company_income(),
				"stocks_other_company_income");
		if (sv != null) {
			document.setStocks_other_company_income(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getAuction(),
				transcription.getAuction(), "auction");
		if (sv != null) {
			document.setAuction(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getSelf_employment(),
				transcription.getSelf_employment(), "self_employment");
		if (sv != null) {
			document.setSelf_employment(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getSelf_employment_personal(),
				transcription.getSelf_employment_personal(),
				"self_employment_personal");
		if (sv != null) {
			document.setSelf_employment_personal(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getSelf_employment_with_others(),
				transcription.getSelf_employment_with_others(),
				"self_employment_with_others");
		if (sv != null) {
			document.setSelf_employment_with_others(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getSelf_employment_income(),
				transcription.getSelf_employment_income(),
				"self_employment_income");
		if (sv != null) {
			document.setSelf_employment_income(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getRepresent_self_employment(),
				transcription.getRepresent_self_employment(),
				"represent_self_employment");
		if (sv != null) {
			document.setRepresent_self_employment(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getRepresent_self_personal(),
				transcription.getRepresent_self_personal(),
				"represent_self_personal");
		if (sv != null) {
			document.setRepresent_self_personal(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getRepresent_self_with_others(),
				transcription.getRepresent_self_with_others(),
				"represent_self_with_others");
		if (sv != null) {
			document.setRepresent_self_with_others(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getRepresent_self_income(),
				transcription.getRepresent_self_income(),
				"represent_self_income");
		if (sv != null) {
			document.setRepresent_self_income(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getPublic_company(),
				transcription.getPublic_company(), "public_company");
		if (sv != null) {
			document.setPublic_company(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getPublic_company_board(),
				transcription.getPublic_company_board(), "public_company_board");
		if (sv != null) {
			document.setPublic_company_board(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getPublic_company_directors(),
				transcription.getPublic_company_directors(),
				"public_company_directors");
		if (sv != null) {
			document.setPublic_company_directors(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getPublic_company_audit(),
				transcription.getPublic_company_audit(), "public_company_audit");
		if (sv != null) {
			document.setPublic_company_audit(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getPublic_company_income(),
				transcription.getPublic_company_income(),
				"public_company_income");
		if (sv != null) {
			document.setPublic_company_income(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getFoundation(),
				transcription.getFoundation(), "foundation");
		if (sv != null) {
			document.setFoundation(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getFoundation_board(),
				transcription.getFoundation_board(), "foundation_board");
		if (sv != null) {
			document.setFoundation_board(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getFoundation_directors(),
				transcription.getFoundation_directors(), "foundation_directors");
		if (sv != null) {
			document.setFoundation_directors(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getFoundation_audit(),
				transcription.getFoundation_audit(), "foundation_audit");
		if (sv != null) {
			document.setFoundation_audit(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getFoundation_income(),
				transcription.getFoundation_income(), "foundation_income");
		if (sv != null) {
			document.setFoundation_income(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getOther_income(),
				transcription.getOther_income(), "other_income");
		if (sv != null) {
			document.setOther_income(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getCars(), transcription.getCars(),
				"cars");
		if (sv != null) {
			document.setCars(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		sv = updateTranscriptions(document.getLiabilities(),
				transcription.getLiabilities(), "liabilities");
		if (sv != null) {
			document.setLiabilities(sv);
			if (isValid && !"yes".equals(sv.getTrusted())) {
				isValid = false;
			}
		}
		if (isValid) {
			document.setTrusted("yes");
		}
		return document;
	}

	public SubmittedValue updateTranscriptions(
			SubmittedValue fieldTranscription, String transcription,
			String fieldName) {
		if (transcription == null) {
			return fieldTranscription;
		}
		transcription = transcription.trim();
		if (transcription.isEmpty()) {
			return fieldTranscription;
		}

		if (null == fieldTranscription) {
			System.out.println("Processing document: found new field "
					+ fieldName);
			fieldTranscription = new SubmittedValue();
			fieldTranscription.setField_name(fieldName);
			fieldTranscription.setTrusted("no");
		}
		TranscriptionText transcriptionTxt = new TranscriptionText(
				transcription);

		if (null == fieldTranscription.getSubmittedValues()) {
			System.out.println("Processing document: field " + fieldName
					+ " don't have any transcriptions yet");
			fieldTranscription
					.setSubmittedValues(new LinkedList<SubmittedValue.TranscriptionText>());
		} else {
			String winner = null;
			Integer winnerPoints = Integer.valueOf(0);
			int size = fieldTranscription.getSubmittedValues().size();
			for (TranscriptionText txt : fieldTranscription
					.getSubmittedValues()) {
				if (comparator.compare(txt.getText(), transcription)) {
					System.out
							.println("Processing document: found matching transcription for field "
									+ fieldName);
					txt.setValidLevel(txt.getValidLevel() + 1);
					transcriptionTxt.setValidLevel(transcriptionTxt
							.getValidLevel() + 1);
					if (size > 3) {
						if (size * 0.66 < transcriptionTxt.getValidLevel()) {
							if (winnerPoints <= 0
									|| winnerPoints < transcriptionTxt
											.getValidLevel()) {
								winner = transcriptionTxt.getText();
								winnerPoints = transcriptionTxt.getValidLevel();
								System.out
										.println("Processing document: found candidate for correct transcription in field "
												+ fieldName
												+ " with points: "
												+ winnerPoints
												+ " / required level: "
												+ (size * 0.66));
							}
						}
					}
				}
			}
			if (winnerPoints > 0) {
				System.out
						.println("Processing document: found transcription in field "
								+ fieldName
								+ " with points: "
								+ winnerPoints
								+ " for required level: " + (size * 0.66));
				fieldTranscription.setCorrect_value(winner);
				fieldTranscription.setTrusted("yes");
			}
		}
		fieldTranscription.getSubmittedValues().add(transcriptionTxt);
		return fieldTranscription;
	}
}
