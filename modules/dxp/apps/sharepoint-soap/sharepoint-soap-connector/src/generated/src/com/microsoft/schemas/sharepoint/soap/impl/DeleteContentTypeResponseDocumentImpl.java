/*
 * An XML document type.
 * Localname: DeleteContentTypeResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.DeleteContentTypeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one DeleteContentTypeResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class DeleteContentTypeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.DeleteContentTypeResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public DeleteContentTypeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETECONTENTTYPERESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "DeleteContentTypeResponse");
    
    
    /**
     * Gets the "DeleteContentTypeResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.DeleteContentTypeResponseDocument.DeleteContentTypeResponse getDeleteContentTypeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.DeleteContentTypeResponseDocument.DeleteContentTypeResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeResponseDocument.DeleteContentTypeResponse)get_store().find_element_user(DELETECONTENTTYPERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeleteContentTypeResponse" element
     */
    public void setDeleteContentTypeResponse(com.microsoft.schemas.sharepoint.soap.DeleteContentTypeResponseDocument.DeleteContentTypeResponse deleteContentTypeResponse)
    {
        generatedSetterHelperImpl(deleteContentTypeResponse, DELETECONTENTTYPERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DeleteContentTypeResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.DeleteContentTypeResponseDocument.DeleteContentTypeResponse addNewDeleteContentTypeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.DeleteContentTypeResponseDocument.DeleteContentTypeResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeResponseDocument.DeleteContentTypeResponse)get_store().add_element_user(DELETECONTENTTYPERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML DeleteContentTypeResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class DeleteContentTypeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.DeleteContentTypeResponseDocument.DeleteContentTypeResponse
    {
        private static final long serialVersionUID = 1L;
        
        public DeleteContentTypeResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DELETECONTENTTYPERESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "DeleteContentTypeResult");
        
        
        /**
         * Gets the "DeleteContentTypeResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.DeleteContentTypeResponseDocument.DeleteContentTypeResponse.DeleteContentTypeResult getDeleteContentTypeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.DeleteContentTypeResponseDocument.DeleteContentTypeResponse.DeleteContentTypeResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeResponseDocument.DeleteContentTypeResponse.DeleteContentTypeResult)get_store().find_element_user(DELETECONTENTTYPERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "DeleteContentTypeResult" element
         */
        public boolean isSetDeleteContentTypeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DELETECONTENTTYPERESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "DeleteContentTypeResult" element
         */
        public void setDeleteContentTypeResult(com.microsoft.schemas.sharepoint.soap.DeleteContentTypeResponseDocument.DeleteContentTypeResponse.DeleteContentTypeResult deleteContentTypeResult)
        {
            generatedSetterHelperImpl(deleteContentTypeResult, DELETECONTENTTYPERESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "DeleteContentTypeResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.DeleteContentTypeResponseDocument.DeleteContentTypeResponse.DeleteContentTypeResult addNewDeleteContentTypeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.DeleteContentTypeResponseDocument.DeleteContentTypeResponse.DeleteContentTypeResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeResponseDocument.DeleteContentTypeResponse.DeleteContentTypeResult)get_store().add_element_user(DELETECONTENTTYPERESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "DeleteContentTypeResult" element
         */
        public void unsetDeleteContentTypeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DELETECONTENTTYPERESULT$0, 0);
            }
        }
        /**
         * An XML DeleteContentTypeResult(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class DeleteContentTypeResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.DeleteContentTypeResponseDocument.DeleteContentTypeResponse.DeleteContentTypeResult
        {
            private static final long serialVersionUID = 1L;
            
            public DeleteContentTypeResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
