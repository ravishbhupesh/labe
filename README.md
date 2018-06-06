# labe

This application searches NCBI "pubmed" database for journals based on input data.

TODO
1. Send "tool=SOFTWARE NAME" and "email=COMPANY EMAIL" in every request, else will be blocked.
2. can only send 3 request per second.
3. can send 10 request per second by using API kets, introduced in May 2018.
4. Request an API key by creating an account at https://www.ncbi.nlm.nih.gov/account/
5. 


TERMINOLOGY
PMID - unique Identified for a record in PubMed database

WORKING - FUNCTIONAL

Combining E-utility Calls to Create Entrez Applications

The E-utilities are useful when used by themselves in single URLs; however, their full potential is realized when successive E-utility URLs are combined to create a data pipeline. When used within such pipelines, the Entrez History server simplifies complex retrieval tasks by allowing easy data transfer between successive E-utility calls. Listed below are several examples of pipelines produced by combining E-utilities, with the arrows representing the passing of db, WebEnv and query_key values from one E-utility to another. These and related pipelines are discussed in detail in Chapter 3.


Basic Pipelines


Retrieving data records matching an Entrez query

ESearch → ESummary

ESearch → EFetch


Retrieving data records matching a list of UIDs

EPost → ESummary

EPost → EFetch


Finding UIDs linked to a set of records

ESearch → ELink

EPost → ELink


Limiting a set of records with an Entrez query

EPost → ESearch

ELink → ESearch


Advanced Pipelines


Retrieving data records in database B linked to records in database A matching an Entrez query

ESearch → ELink → ESummary

ESearch → ELink → EFetch


Retrieving data records from a subset of an ID list defined by an Entrez query

EPost → ESearch → ESummary

EPost → ESearch → EFetch


Retrieving a set of data records, defined by an Entrez query, in database B from a larger set of records linked to a list of UIDs in database A

EPost → ELink → ESearch → ESummary

EPost → ELink → ESearch → EFetch
