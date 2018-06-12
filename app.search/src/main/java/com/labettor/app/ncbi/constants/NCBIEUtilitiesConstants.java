package com.labettor.app.ncbi.constants;

public interface NCBIEUtilitiesConstants {

	/**
	 * BASE uRL for ALL NCBI EUtilities
	 */
	String BASE_URL = "https://eutils.ncbi.nlm.nih.gov/entrez/eutils/";

	/**
	 * EInfo (database statistics)
	 * 
	 * Provides the number of records indexed in each field of a given database, the
	 * date of the last update of the database, and the available links from the
	 * database to other Entrez databases.
	 */
	String URL_EXT_EINFO = "einfo.fcgi";

	/**
	 * ESearch (text searches)
	 * 
	 * Responds to a text query with the list of matching UIDs in a given database
	 * (for later use in ESummary, EFetch or ELink), along with the term
	 * translations of the query.
	 */
	String URL_EXT_ESEARCH = "esearch.fcgi";

	/**
	 * EPost (UID uploads)
	 * 
	 * Accepts a list of UIDs from a given database, stores the set on the History
	 * Server, and responds with a query key and web environment for the uploaded
	 * dataset.
	 */
	String URL_EXT_EPOST = "epost.fcgi";

	/**
	 * ESummary (document summary downloads)
	 * 
	 * Responds to a list of UIDs from a given database with the corresponding
	 * document summaries.
	 */
	String URL_EXT_ESUMMARY = "esummary.fcgi";

	/**
	 * EFetch (data record downloads)
	 * 
	 * Responds to a list of UIDs in a given database with the corresponding data
	 * records in a specified format.
	 */
	String URL_EXT_EFETCH = "efetch.fcgi";

	/**
	 * ELink (Entrez links)
	 * 
	 * Responds to a list of UIDs in a given database with either a list of related
	 * UIDs (and relevancy scores) in the same database or a list of linked UIDs in
	 * another Entrez database; checks for the existence of a specified link from a
	 * list of one or more UIDs; creates a hyperlink to the primary LinkOut provider
	 * for a specific UID and database, or lists LinkOut URLs and attributes for
	 * multiple UIDs.
	 */
	String URL_EXT_ELINK = "elink.fcgi";

	/**
	 * EGQuery (global query)
	 * 
	 * Responds to a text query with the number of records matching the query in
	 * each Entrez database.
	 */
	String URL_EXT_EGQUERY = "egquery.fcgi";

	/**
	 * ESpell (spelling suggestions)
	 * 
	 * Retrieves spelling suggestions for a text query in a given database.
	 */
	String URL_EXT_ESPELL = "espell.fcgi";

	/**
	 * ECitMatch (batch citation searching in PubMed)
	 * 
	 * Retrieves PubMed IDs (PMIDs) corresponding to a set of input citation
	 * strings.
	 */
	String URL_EXT_ECIMATCH = "ecitmatch.cgi";

	/**
	 * Utility constants
	 */

	String URL_PARAM_START = "?";

	String URL_PARAM_SEP = "&";

	String URL_PARAM_RTRN_MODE = "retmode=xml";

	String DB = "db=";
}
