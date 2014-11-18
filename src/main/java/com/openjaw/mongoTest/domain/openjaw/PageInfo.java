package com.openjaw.mongoTest.domain.openjaw;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true) 
public class PageInfo {
	private String SessionID;
	private String Language;
	private Boolean FromServicing;
	private Boolean ReadOnly;
	private String ConversationID;
	private String Locale;
	private String skin;
	private String SessionSource;
	private POS POS;
	public String getSessionID() {
		return SessionID;
	}
	public void setSessionID(String sessionID) {
		SessionID = sessionID;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	public Boolean getFromServicing() {
		return FromServicing;
	}
	public void setFromServicing(Boolean fromServicing) {
		FromServicing = fromServicing;
	}
	public Boolean getReadOnly() {
		return ReadOnly;
	}
	public void setReadOnly(Boolean readOnly) {
		ReadOnly = readOnly;
	}
	public String getConversationID() {
		return ConversationID;
	}
	public void setConversationID(String conversationID) {
		ConversationID = conversationID;
	}
	public String getLocale() {
		return Locale;
	}
	public void setLocale(String locale) {
		Locale = locale;
	}
	public String getSkin() {
		return skin;
	}
	public void setSkin(String skin) {
		this.skin = skin;
	}
	public String getSessionSource() {
		return SessionSource;
	}
	public void setSessionSource(String sessionSource) {
		SessionSource = sessionSource;
	}
	public POS getPOS() {
		return POS;
	}
	public void setPOS(POS pOS) {
		POS = pOS;
	} 
	
	
			
}
