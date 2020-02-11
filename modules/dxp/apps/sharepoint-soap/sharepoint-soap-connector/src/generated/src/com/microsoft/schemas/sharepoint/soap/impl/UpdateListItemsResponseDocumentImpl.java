/*
 * An XML document type.
 * Localname: UpdateListItemsResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.UpdateListItemsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one UpdateListItemsResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class UpdateListItemsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateListItemsResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateListItemsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATELISTITEMSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "UpdateListItemsResponse");
    
    
    /**
     * Gets the "UpdateListItemsResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.UpdateListItemsResponseDocument.UpdateListItemsResponse getUpdateListItemsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.UpdateListItemsResponseDocument.UpdateListItemsResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.UpdateListItemsResponseDocument.UpdateListItemsResponse)get_store().find_element_user(UPDATELISTITEMSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateListItemsResponse" element
     */
    public void setUpdateListItemsResponse(com.microsoft.schemas.sharepoint.soap.UpdateListItemsResponseDocument.UpdateListItemsResponse updateListItemsResponse)
    {
        generatedSetterHelperImpl(updateListItemsResponse, UPDATELISTITEMSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "UpdateListItemsResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.UpdateListItemsResponseDocument.UpdateListItemsResponse addNewUpdateListItemsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.UpdateListItemsResponseDocument.UpdateListItemsResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.UpdateListItemsResponseDocument.UpdateListItemsResponse)get_store().add_element_user(UPDATELISTITEMSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UpdateListItemsResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class UpdateListItemsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateListItemsResponseDocument.UpdateListItemsResponse
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateListItemsResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName UPDATELISTITEMSRESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "UpdateListItemsResult");
        
        
        /**
         * Gets the "UpdateListItemsResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateListItemsResponseDocument.UpdateListItemsResponse.UpdateListItemsResult getUpdateListItemsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateListItemsResponseDocument.UpdateListItemsResponse.UpdateListItemsResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateListItemsResponseDocument.UpdateListItemsResponse.UpdateListItemsResult)get_store().find_element_user(UPDATELISTITEMSRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "UpdateListItemsResult" element
         */
        public boolean isSetUpdateListItemsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(UPDATELISTITEMSRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "UpdateListItemsResult" element
         */
        public void setUpdateListItemsResult(com.microsoft.schemas.sharepoint.soap.UpdateListItemsResponseDocument.UpdateListItemsResponse.UpdateListItemsResult updateListItemsResult)
        {
            generatedSetterHelperImpl(updateListItemsResult, UPDATELISTITEMSRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "UpdateListItemsResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateListItemsResponseDocument.UpdateListItemsResponse.UpdateListItemsResult addNewUpdateListItemsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateListItemsResponseDocument.UpdateListItemsResponse.UpdateListItemsResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateListItemsResponseDocument.UpdateListItemsResponse.UpdateListItemsResult)get_store().add_element_user(UPDATELISTITEMSRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "UpdateListItemsResult" element
         */
        public void unsetUpdateListItemsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(UPDATELISTITEMSRESULT$0, 0);
            }
        }
        /**
         * An XML UpdateListItemsResult(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class UpdateListItemsResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateListItemsResponseDocument.UpdateListItemsResponse.UpdateListItemsResult
        {
            private static final long serialVersionUID = 1L;
            
            public UpdateListItemsResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
