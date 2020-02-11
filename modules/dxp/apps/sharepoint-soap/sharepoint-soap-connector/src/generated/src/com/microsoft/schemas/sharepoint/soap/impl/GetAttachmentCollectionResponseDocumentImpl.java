/*
 * An XML document type.
 * Localname: GetAttachmentCollectionResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one GetAttachmentCollectionResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class GetAttachmentCollectionResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetAttachmentCollectionResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETATTACHMENTCOLLECTIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetAttachmentCollectionResponse");
    
    
    /**
     * Gets the "GetAttachmentCollectionResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionResponseDocument.GetAttachmentCollectionResponse getGetAttachmentCollectionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionResponseDocument.GetAttachmentCollectionResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionResponseDocument.GetAttachmentCollectionResponse)get_store().find_element_user(GETATTACHMENTCOLLECTIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetAttachmentCollectionResponse" element
     */
    public void setGetAttachmentCollectionResponse(com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionResponseDocument.GetAttachmentCollectionResponse getAttachmentCollectionResponse)
    {
        generatedSetterHelperImpl(getAttachmentCollectionResponse, GETATTACHMENTCOLLECTIONRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetAttachmentCollectionResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionResponseDocument.GetAttachmentCollectionResponse addNewGetAttachmentCollectionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionResponseDocument.GetAttachmentCollectionResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionResponseDocument.GetAttachmentCollectionResponse)get_store().add_element_user(GETATTACHMENTCOLLECTIONRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetAttachmentCollectionResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class GetAttachmentCollectionResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionResponseDocument.GetAttachmentCollectionResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetAttachmentCollectionResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETATTACHMENTCOLLECTIONRESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetAttachmentCollectionResult");
        
        
        /**
         * Gets the "GetAttachmentCollectionResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionResponseDocument.GetAttachmentCollectionResponse.GetAttachmentCollectionResult getGetAttachmentCollectionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionResponseDocument.GetAttachmentCollectionResponse.GetAttachmentCollectionResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionResponseDocument.GetAttachmentCollectionResponse.GetAttachmentCollectionResult)get_store().find_element_user(GETATTACHMENTCOLLECTIONRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GetAttachmentCollectionResult" element
         */
        public boolean isSetGetAttachmentCollectionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETATTACHMENTCOLLECTIONRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetAttachmentCollectionResult" element
         */
        public void setGetAttachmentCollectionResult(com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionResponseDocument.GetAttachmentCollectionResponse.GetAttachmentCollectionResult getAttachmentCollectionResult)
        {
            generatedSetterHelperImpl(getAttachmentCollectionResult, GETATTACHMENTCOLLECTIONRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetAttachmentCollectionResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionResponseDocument.GetAttachmentCollectionResponse.GetAttachmentCollectionResult addNewGetAttachmentCollectionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionResponseDocument.GetAttachmentCollectionResponse.GetAttachmentCollectionResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionResponseDocument.GetAttachmentCollectionResponse.GetAttachmentCollectionResult)get_store().add_element_user(GETATTACHMENTCOLLECTIONRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "GetAttachmentCollectionResult" element
         */
        public void unsetGetAttachmentCollectionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETATTACHMENTCOLLECTIONRESULT$0, 0);
            }
        }
        /**
         * An XML GetAttachmentCollectionResult(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class GetAttachmentCollectionResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionResponseDocument.GetAttachmentCollectionResponse.GetAttachmentCollectionResult
        {
            private static final long serialVersionUID = 1L;
            
            public GetAttachmentCollectionResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
