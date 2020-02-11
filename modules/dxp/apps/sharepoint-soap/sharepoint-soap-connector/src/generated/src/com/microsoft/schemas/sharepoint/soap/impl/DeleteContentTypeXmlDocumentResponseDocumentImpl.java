/*
 * An XML document type.
 * Localname: DeleteContentTypeXmlDocumentResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one DeleteContentTypeXmlDocumentResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class DeleteContentTypeXmlDocumentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public DeleteContentTypeXmlDocumentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETECONTENTTYPEXMLDOCUMENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "DeleteContentTypeXmlDocumentResponse");
    
    
    /**
     * Gets the "DeleteContentTypeXmlDocumentResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument.DeleteContentTypeXmlDocumentResponse getDeleteContentTypeXmlDocumentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument.DeleteContentTypeXmlDocumentResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument.DeleteContentTypeXmlDocumentResponse)get_store().find_element_user(DELETECONTENTTYPEXMLDOCUMENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeleteContentTypeXmlDocumentResponse" element
     */
    public void setDeleteContentTypeXmlDocumentResponse(com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument.DeleteContentTypeXmlDocumentResponse deleteContentTypeXmlDocumentResponse)
    {
        generatedSetterHelperImpl(deleteContentTypeXmlDocumentResponse, DELETECONTENTTYPEXMLDOCUMENTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DeleteContentTypeXmlDocumentResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument.DeleteContentTypeXmlDocumentResponse addNewDeleteContentTypeXmlDocumentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument.DeleteContentTypeXmlDocumentResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument.DeleteContentTypeXmlDocumentResponse)get_store().add_element_user(DELETECONTENTTYPEXMLDOCUMENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML DeleteContentTypeXmlDocumentResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class DeleteContentTypeXmlDocumentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument.DeleteContentTypeXmlDocumentResponse
    {
        private static final long serialVersionUID = 1L;
        
        public DeleteContentTypeXmlDocumentResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DELETECONTENTTYPEXMLDOCUMENTRESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "DeleteContentTypeXmlDocumentResult");
        
        
        /**
         * Gets the "DeleteContentTypeXmlDocumentResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument.DeleteContentTypeXmlDocumentResponse.DeleteContentTypeXmlDocumentResult getDeleteContentTypeXmlDocumentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument.DeleteContentTypeXmlDocumentResponse.DeleteContentTypeXmlDocumentResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument.DeleteContentTypeXmlDocumentResponse.DeleteContentTypeXmlDocumentResult)get_store().find_element_user(DELETECONTENTTYPEXMLDOCUMENTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "DeleteContentTypeXmlDocumentResult" element
         */
        public boolean isSetDeleteContentTypeXmlDocumentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DELETECONTENTTYPEXMLDOCUMENTRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "DeleteContentTypeXmlDocumentResult" element
         */
        public void setDeleteContentTypeXmlDocumentResult(com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument.DeleteContentTypeXmlDocumentResponse.DeleteContentTypeXmlDocumentResult deleteContentTypeXmlDocumentResult)
        {
            generatedSetterHelperImpl(deleteContentTypeXmlDocumentResult, DELETECONTENTTYPEXMLDOCUMENTRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "DeleteContentTypeXmlDocumentResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument.DeleteContentTypeXmlDocumentResponse.DeleteContentTypeXmlDocumentResult addNewDeleteContentTypeXmlDocumentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument.DeleteContentTypeXmlDocumentResponse.DeleteContentTypeXmlDocumentResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument.DeleteContentTypeXmlDocumentResponse.DeleteContentTypeXmlDocumentResult)get_store().add_element_user(DELETECONTENTTYPEXMLDOCUMENTRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "DeleteContentTypeXmlDocumentResult" element
         */
        public void unsetDeleteContentTypeXmlDocumentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DELETECONTENTTYPEXMLDOCUMENTRESULT$0, 0);
            }
        }
        /**
         * An XML DeleteContentTypeXmlDocumentResult(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class DeleteContentTypeXmlDocumentResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument.DeleteContentTypeXmlDocumentResponse.DeleteContentTypeXmlDocumentResult
        {
            private static final long serialVersionUID = 1L;
            
            public DeleteContentTypeXmlDocumentResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
