/*
 * An XML document type.
 * Localname: GetListContentTypesResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.GetListContentTypesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one GetListContentTypesResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class GetListContentTypesResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListContentTypesResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetListContentTypesResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLISTCONTENTTYPESRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListContentTypesResponse");
    
    
    /**
     * Gets the "GetListContentTypesResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetListContentTypesResponseDocument.GetListContentTypesResponse getGetListContentTypesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetListContentTypesResponseDocument.GetListContentTypesResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetListContentTypesResponseDocument.GetListContentTypesResponse)get_store().find_element_user(GETLISTCONTENTTYPESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetListContentTypesResponse" element
     */
    public void setGetListContentTypesResponse(com.microsoft.schemas.sharepoint.soap.GetListContentTypesResponseDocument.GetListContentTypesResponse getListContentTypesResponse)
    {
        generatedSetterHelperImpl(getListContentTypesResponse, GETLISTCONTENTTYPESRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetListContentTypesResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetListContentTypesResponseDocument.GetListContentTypesResponse addNewGetListContentTypesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetListContentTypesResponseDocument.GetListContentTypesResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetListContentTypesResponseDocument.GetListContentTypesResponse)get_store().add_element_user(GETLISTCONTENTTYPESRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetListContentTypesResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class GetListContentTypesResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListContentTypesResponseDocument.GetListContentTypesResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetListContentTypesResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETLISTCONTENTTYPESRESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListContentTypesResult");
        
        
        /**
         * Gets the "GetListContentTypesResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListContentTypesResponseDocument.GetListContentTypesResponse.GetListContentTypesResult getGetListContentTypesResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListContentTypesResponseDocument.GetListContentTypesResponse.GetListContentTypesResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListContentTypesResponseDocument.GetListContentTypesResponse.GetListContentTypesResult)get_store().find_element_user(GETLISTCONTENTTYPESRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GetListContentTypesResult" element
         */
        public boolean isSetGetListContentTypesResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETLISTCONTENTTYPESRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetListContentTypesResult" element
         */
        public void setGetListContentTypesResult(com.microsoft.schemas.sharepoint.soap.GetListContentTypesResponseDocument.GetListContentTypesResponse.GetListContentTypesResult getListContentTypesResult)
        {
            generatedSetterHelperImpl(getListContentTypesResult, GETLISTCONTENTTYPESRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetListContentTypesResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListContentTypesResponseDocument.GetListContentTypesResponse.GetListContentTypesResult addNewGetListContentTypesResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListContentTypesResponseDocument.GetListContentTypesResponse.GetListContentTypesResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListContentTypesResponseDocument.GetListContentTypesResponse.GetListContentTypesResult)get_store().add_element_user(GETLISTCONTENTTYPESRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "GetListContentTypesResult" element
         */
        public void unsetGetListContentTypesResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETLISTCONTENTTYPESRESULT$0, 0);
            }
        }
        /**
         * An XML GetListContentTypesResult(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class GetListContentTypesResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListContentTypesResponseDocument.GetListContentTypesResponse.GetListContentTypesResult
        {
            private static final long serialVersionUID = 1L;
            
            public GetListContentTypesResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
