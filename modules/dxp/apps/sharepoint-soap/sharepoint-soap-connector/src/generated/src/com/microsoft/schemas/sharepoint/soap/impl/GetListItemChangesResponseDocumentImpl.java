/*
 * An XML document type.
 * Localname: GetListItemChangesResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.GetListItemChangesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one GetListItemChangesResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class GetListItemChangesResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListItemChangesResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetListItemChangesResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLISTITEMCHANGESRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListItemChangesResponse");
    
    
    /**
     * Gets the "GetListItemChangesResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetListItemChangesResponseDocument.GetListItemChangesResponse getGetListItemChangesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetListItemChangesResponseDocument.GetListItemChangesResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetListItemChangesResponseDocument.GetListItemChangesResponse)get_store().find_element_user(GETLISTITEMCHANGESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetListItemChangesResponse" element
     */
    public void setGetListItemChangesResponse(com.microsoft.schemas.sharepoint.soap.GetListItemChangesResponseDocument.GetListItemChangesResponse getListItemChangesResponse)
    {
        generatedSetterHelperImpl(getListItemChangesResponse, GETLISTITEMCHANGESRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetListItemChangesResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetListItemChangesResponseDocument.GetListItemChangesResponse addNewGetListItemChangesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetListItemChangesResponseDocument.GetListItemChangesResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetListItemChangesResponseDocument.GetListItemChangesResponse)get_store().add_element_user(GETLISTITEMCHANGESRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetListItemChangesResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class GetListItemChangesResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListItemChangesResponseDocument.GetListItemChangesResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetListItemChangesResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETLISTITEMCHANGESRESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListItemChangesResult");
        
        
        /**
         * Gets the "GetListItemChangesResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListItemChangesResponseDocument.GetListItemChangesResponse.GetListItemChangesResult getGetListItemChangesResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListItemChangesResponseDocument.GetListItemChangesResponse.GetListItemChangesResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListItemChangesResponseDocument.GetListItemChangesResponse.GetListItemChangesResult)get_store().find_element_user(GETLISTITEMCHANGESRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GetListItemChangesResult" element
         */
        public boolean isSetGetListItemChangesResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETLISTITEMCHANGESRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetListItemChangesResult" element
         */
        public void setGetListItemChangesResult(com.microsoft.schemas.sharepoint.soap.GetListItemChangesResponseDocument.GetListItemChangesResponse.GetListItemChangesResult getListItemChangesResult)
        {
            generatedSetterHelperImpl(getListItemChangesResult, GETLISTITEMCHANGESRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetListItemChangesResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListItemChangesResponseDocument.GetListItemChangesResponse.GetListItemChangesResult addNewGetListItemChangesResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListItemChangesResponseDocument.GetListItemChangesResponse.GetListItemChangesResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListItemChangesResponseDocument.GetListItemChangesResponse.GetListItemChangesResult)get_store().add_element_user(GETLISTITEMCHANGESRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "GetListItemChangesResult" element
         */
        public void unsetGetListItemChangesResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETLISTITEMCHANGESRESULT$0, 0);
            }
        }
        /**
         * An XML GetListItemChangesResult(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class GetListItemChangesResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListItemChangesResponseDocument.GetListItemChangesResponse.GetListItemChangesResult
        {
            private static final long serialVersionUID = 1L;
            
            public GetListItemChangesResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
