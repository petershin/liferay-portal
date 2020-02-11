/*
 * An XML document type.
 * Localname: CheckInFileResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.CheckInFileResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one CheckInFileResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class CheckInFileResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.CheckInFileResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CheckInFileResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHECKINFILERESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "CheckInFileResponse");
    
    
    /**
     * Gets the "CheckInFileResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.CheckInFileResponseDocument.CheckInFileResponse getCheckInFileResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.CheckInFileResponseDocument.CheckInFileResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.CheckInFileResponseDocument.CheckInFileResponse)get_store().find_element_user(CHECKINFILERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CheckInFileResponse" element
     */
    public void setCheckInFileResponse(com.microsoft.schemas.sharepoint.soap.CheckInFileResponseDocument.CheckInFileResponse checkInFileResponse)
    {
        generatedSetterHelperImpl(checkInFileResponse, CHECKINFILERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CheckInFileResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.CheckInFileResponseDocument.CheckInFileResponse addNewCheckInFileResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.CheckInFileResponseDocument.CheckInFileResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.CheckInFileResponseDocument.CheckInFileResponse)get_store().add_element_user(CHECKINFILERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CheckInFileResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class CheckInFileResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.CheckInFileResponseDocument.CheckInFileResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CheckInFileResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CHECKINFILERESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "CheckInFileResult");
        
        
        /**
         * Gets the "CheckInFileResult" element
         */
        public boolean getCheckInFileResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHECKINFILERESULT$0, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "CheckInFileResult" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetCheckInFileResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CHECKINFILERESULT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CheckInFileResult" element
         */
        public void setCheckInFileResult(boolean checkInFileResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHECKINFILERESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHECKINFILERESULT$0);
                }
                target.setBooleanValue(checkInFileResult);
            }
        }
        
        /**
         * Sets (as xml) the "CheckInFileResult" element
         */
        public void xsetCheckInFileResult(org.apache.xmlbeans.XmlBoolean checkInFileResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CHECKINFILERESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CHECKINFILERESULT$0);
                }
                target.set(checkInFileResult);
            }
        }
    }
}
