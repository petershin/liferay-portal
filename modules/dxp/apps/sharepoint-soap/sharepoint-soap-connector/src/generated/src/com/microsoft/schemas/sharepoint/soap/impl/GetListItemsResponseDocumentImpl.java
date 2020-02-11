/*
 * An XML document type.
 * Localname: GetListItemsResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.GetListItemsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one GetListItemsResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class GetListItemsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListItemsResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetListItemsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLISTITEMSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListItemsResponse");
    
    
    /**
     * Gets the "GetListItemsResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetListItemsResponseDocument.GetListItemsResponse getGetListItemsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetListItemsResponseDocument.GetListItemsResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetListItemsResponseDocument.GetListItemsResponse)get_store().find_element_user(GETLISTITEMSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetListItemsResponse" element
     */
    public void setGetListItemsResponse(com.microsoft.schemas.sharepoint.soap.GetListItemsResponseDocument.GetListItemsResponse getListItemsResponse)
    {
        generatedSetterHelperImpl(getListItemsResponse, GETLISTITEMSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetListItemsResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetListItemsResponseDocument.GetListItemsResponse addNewGetListItemsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetListItemsResponseDocument.GetListItemsResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetListItemsResponseDocument.GetListItemsResponse)get_store().add_element_user(GETLISTITEMSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetListItemsResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class GetListItemsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListItemsResponseDocument.GetListItemsResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetListItemsResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETLISTITEMSRESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListItemsResult");
        
        
        /**
         * Gets the "GetListItemsResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListItemsResponseDocument.GetListItemsResponse.GetListItemsResult getGetListItemsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListItemsResponseDocument.GetListItemsResponse.GetListItemsResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListItemsResponseDocument.GetListItemsResponse.GetListItemsResult)get_store().find_element_user(GETLISTITEMSRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GetListItemsResult" element
         */
        public boolean isSetGetListItemsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETLISTITEMSRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetListItemsResult" element
         */
        public void setGetListItemsResult(com.microsoft.schemas.sharepoint.soap.GetListItemsResponseDocument.GetListItemsResponse.GetListItemsResult getListItemsResult)
        {
            generatedSetterHelperImpl(getListItemsResult, GETLISTITEMSRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetListItemsResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListItemsResponseDocument.GetListItemsResponse.GetListItemsResult addNewGetListItemsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListItemsResponseDocument.GetListItemsResponse.GetListItemsResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListItemsResponseDocument.GetListItemsResponse.GetListItemsResult)get_store().add_element_user(GETLISTITEMSRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "GetListItemsResult" element
         */
        public void unsetGetListItemsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETLISTITEMSRESULT$0, 0);
            }
        }
        /**
         * An XML GetListItemsResult(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class GetListItemsResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListItemsResponseDocument.GetListItemsResponse.GetListItemsResult
        {
            private static final long serialVersionUID = 1L;
            
            public GetListItemsResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
