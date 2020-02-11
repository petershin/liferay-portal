/*
 * An XML document type.
 * Localname: GetVersionCollectionResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.GetVersionCollectionResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one GetVersionCollectionResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class GetVersionCollectionResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetVersionCollectionResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetVersionCollectionResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETVERSIONCOLLECTIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetVersionCollectionResponse");
    
    
    /**
     * Gets the "GetVersionCollectionResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetVersionCollectionResponseDocument.GetVersionCollectionResponse getGetVersionCollectionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetVersionCollectionResponseDocument.GetVersionCollectionResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetVersionCollectionResponseDocument.GetVersionCollectionResponse)get_store().find_element_user(GETVERSIONCOLLECTIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetVersionCollectionResponse" element
     */
    public void setGetVersionCollectionResponse(com.microsoft.schemas.sharepoint.soap.GetVersionCollectionResponseDocument.GetVersionCollectionResponse getVersionCollectionResponse)
    {
        generatedSetterHelperImpl(getVersionCollectionResponse, GETVERSIONCOLLECTIONRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetVersionCollectionResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetVersionCollectionResponseDocument.GetVersionCollectionResponse addNewGetVersionCollectionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetVersionCollectionResponseDocument.GetVersionCollectionResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetVersionCollectionResponseDocument.GetVersionCollectionResponse)get_store().add_element_user(GETVERSIONCOLLECTIONRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetVersionCollectionResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class GetVersionCollectionResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetVersionCollectionResponseDocument.GetVersionCollectionResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetVersionCollectionResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETVERSIONCOLLECTIONRESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetVersionCollectionResult");
        
        
        /**
         * Gets the "GetVersionCollectionResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetVersionCollectionResponseDocument.GetVersionCollectionResponse.GetVersionCollectionResult getGetVersionCollectionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetVersionCollectionResponseDocument.GetVersionCollectionResponse.GetVersionCollectionResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetVersionCollectionResponseDocument.GetVersionCollectionResponse.GetVersionCollectionResult)get_store().find_element_user(GETVERSIONCOLLECTIONRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GetVersionCollectionResult" element
         */
        public boolean isSetGetVersionCollectionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETVERSIONCOLLECTIONRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetVersionCollectionResult" element
         */
        public void setGetVersionCollectionResult(com.microsoft.schemas.sharepoint.soap.GetVersionCollectionResponseDocument.GetVersionCollectionResponse.GetVersionCollectionResult getVersionCollectionResult)
        {
            generatedSetterHelperImpl(getVersionCollectionResult, GETVERSIONCOLLECTIONRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetVersionCollectionResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetVersionCollectionResponseDocument.GetVersionCollectionResponse.GetVersionCollectionResult addNewGetVersionCollectionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetVersionCollectionResponseDocument.GetVersionCollectionResponse.GetVersionCollectionResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetVersionCollectionResponseDocument.GetVersionCollectionResponse.GetVersionCollectionResult)get_store().add_element_user(GETVERSIONCOLLECTIONRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "GetVersionCollectionResult" element
         */
        public void unsetGetVersionCollectionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETVERSIONCOLLECTIONRESULT$0, 0);
            }
        }
        /**
         * An XML GetVersionCollectionResult(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class GetVersionCollectionResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetVersionCollectionResponseDocument.GetVersionCollectionResponse.GetVersionCollectionResult
        {
            private static final long serialVersionUID = 1L;
            
            public GetVersionCollectionResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
