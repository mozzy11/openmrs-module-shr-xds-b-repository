package org.openmrs.module.xdsbrepository.db;

import org.openmrs.module.shr.contenthandler.api.ContentHandler;

public interface XDSbDAO {
	
	public void registerDocument(String docId, Class<? extends ContentHandler> contentHandler);
	
	public Class<? extends ContentHandler> getDocumentHandlerClass(String documentUniqueId) throws ClassNotFoundException;

}