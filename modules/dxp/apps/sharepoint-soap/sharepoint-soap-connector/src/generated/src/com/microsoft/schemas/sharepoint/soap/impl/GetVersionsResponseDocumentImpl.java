/*
 * An XML document type.
 * Localname: GetVersionsResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.GetVersionsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one GetVersionsResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class GetVersionsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetVersionsResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetVersionsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETVERSIONSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetVersionsResponse");
    
    
    /**
     * Gets the "GetVersionsResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetVersionsResponseDocument.GetVersionsResponse getGetVersionsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetVersionsResponseDocument.GetVersionsResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetVersionsResponseDocument.GetVersionsResponse)get_store().find_element_user(GETVERSIONSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetVersionsResponse" element
     */
    public void setGetVersionsResponse(com.microsoft.schemas.sharepoint.soap.GetVersionsResponseDocument.GetVersionsResponse getVersionsResponse)
    {
        generatedSetterHelperImpl(getVersionsResponse, GETVERSIONSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetVersionsResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetVersionsResponseDocument.GetVersionsResponse addNewGetVersionsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetVersionsResponseDocument.GetVersionsResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetVersionsResponseDocument.GetVersionsResponse)get_store().add_element_user(GETVERSIONSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetVersionsResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class GetVersionsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetVersionsResponseDocument.GetVersionsResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetVersionsResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETVERSIONSRESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetVersionsResult");
        
        
        /**
         * Gets the "GetVersionsResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetVersionsResponseDocument.GetVersionsResponse.GetVersionsResult getGetVersionsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetVersionsResponseDocument.GetVersionsResponse.GetVersionsResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetVersionsResponseDocument.GetVersionsResponse.GetVersionsResult)get_store().find_element_user(GETVERSIONSRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GetVersionsResult" element
         */
        public boolean isSetGetVersionsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETVERSIONSRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetVersionsResult" element
         */
        public void setGetVersionsResult(com.microsoft.schemas.sharepoint.soap.GetVersionsResponseDocument.GetVersionsResponse.GetVersionsResult getVersionsResult)
        {
            generatedSetterHelperImpl(getVersionsResult, GETVERSIONSRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetVersionsResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetVersionsResponseDocument.GetVersionsResponse.GetVersionsResult addNewGetVersionsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetVersionsResponseDocument.GetVersionsResponse.GetVersionsResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetVersionsResponseDocument.GetVersionsResponse.GetVersionsResult)get_store().add_element_user(GETVERSIONSRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "GetVersionsResult" element
         */
        public void unsetGetVersionsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETVERSIONSRESULT$0, 0);
            }
        }
        /**
         * An XML GetVersionsResult(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class GetVersionsResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetVersionsResponseDocument.GetVersionsResponse.GetVersionsResult
        {
            private static final long serialVersionUID = 1L;
            
            public GetVersionsResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
