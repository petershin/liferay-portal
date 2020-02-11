/*
 * An XML document type.
 * Localname: DeleteAllVersionsResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one DeleteAllVersionsResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class DeleteAllVersionsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public DeleteAllVersionsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETEALLVERSIONSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "DeleteAllVersionsResponse");
    
    
    /**
     * Gets the "DeleteAllVersionsResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsResponseDocument.DeleteAllVersionsResponse getDeleteAllVersionsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsResponseDocument.DeleteAllVersionsResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsResponseDocument.DeleteAllVersionsResponse)get_store().find_element_user(DELETEALLVERSIONSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeleteAllVersionsResponse" element
     */
    public void setDeleteAllVersionsResponse(com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsResponseDocument.DeleteAllVersionsResponse deleteAllVersionsResponse)
    {
        generatedSetterHelperImpl(deleteAllVersionsResponse, DELETEALLVERSIONSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DeleteAllVersionsResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsResponseDocument.DeleteAllVersionsResponse addNewDeleteAllVersionsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsResponseDocument.DeleteAllVersionsResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsResponseDocument.DeleteAllVersionsResponse)get_store().add_element_user(DELETEALLVERSIONSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML DeleteAllVersionsResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class DeleteAllVersionsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsResponseDocument.DeleteAllVersionsResponse
    {
        private static final long serialVersionUID = 1L;
        
        public DeleteAllVersionsResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DELETEALLVERSIONSRESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "DeleteAllVersionsResult");
        
        
        /**
         * Gets the "DeleteAllVersionsResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsResponseDocument.DeleteAllVersionsResponse.DeleteAllVersionsResult getDeleteAllVersionsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsResponseDocument.DeleteAllVersionsResponse.DeleteAllVersionsResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsResponseDocument.DeleteAllVersionsResponse.DeleteAllVersionsResult)get_store().find_element_user(DELETEALLVERSIONSRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "DeleteAllVersionsResult" element
         */
        public boolean isSetDeleteAllVersionsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DELETEALLVERSIONSRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "DeleteAllVersionsResult" element
         */
        public void setDeleteAllVersionsResult(com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsResponseDocument.DeleteAllVersionsResponse.DeleteAllVersionsResult deleteAllVersionsResult)
        {
            generatedSetterHelperImpl(deleteAllVersionsResult, DELETEALLVERSIONSRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "DeleteAllVersionsResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsResponseDocument.DeleteAllVersionsResponse.DeleteAllVersionsResult addNewDeleteAllVersionsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsResponseDocument.DeleteAllVersionsResponse.DeleteAllVersionsResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsResponseDocument.DeleteAllVersionsResponse.DeleteAllVersionsResult)get_store().add_element_user(DELETEALLVERSIONSRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "DeleteAllVersionsResult" element
         */
        public void unsetDeleteAllVersionsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DELETEALLVERSIONSRESULT$0, 0);
            }
        }
        /**
         * An XML DeleteAllVersionsResult(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class DeleteAllVersionsResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsResponseDocument.DeleteAllVersionsResponse.DeleteAllVersionsResult
        {
            private static final long serialVersionUID = 1L;
            
            public DeleteAllVersionsResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
