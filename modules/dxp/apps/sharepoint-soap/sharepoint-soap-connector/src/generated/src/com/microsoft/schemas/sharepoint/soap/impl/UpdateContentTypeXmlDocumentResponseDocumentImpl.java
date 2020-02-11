/*
 * An XML document type.
 * Localname: UpdateContentTypeXmlDocumentResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one UpdateContentTypeXmlDocumentResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class UpdateContentTypeXmlDocumentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateContentTypeXmlDocumentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATECONTENTTYPEXMLDOCUMENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "UpdateContentTypeXmlDocumentResponse");
    
    
    /**
     * Gets the "UpdateContentTypeXmlDocumentResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument.UpdateContentTypeXmlDocumentResponse getUpdateContentTypeXmlDocumentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument.UpdateContentTypeXmlDocumentResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument.UpdateContentTypeXmlDocumentResponse)get_store().find_element_user(UPDATECONTENTTYPEXMLDOCUMENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateContentTypeXmlDocumentResponse" element
     */
    public void setUpdateContentTypeXmlDocumentResponse(com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument.UpdateContentTypeXmlDocumentResponse updateContentTypeXmlDocumentResponse)
    {
        generatedSetterHelperImpl(updateContentTypeXmlDocumentResponse, UPDATECONTENTTYPEXMLDOCUMENTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "UpdateContentTypeXmlDocumentResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument.UpdateContentTypeXmlDocumentResponse addNewUpdateContentTypeXmlDocumentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument.UpdateContentTypeXmlDocumentResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument.UpdateContentTypeXmlDocumentResponse)get_store().add_element_user(UPDATECONTENTTYPEXMLDOCUMENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UpdateContentTypeXmlDocumentResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class UpdateContentTypeXmlDocumentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument.UpdateContentTypeXmlDocumentResponse
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateContentTypeXmlDocumentResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName UPDATECONTENTTYPEXMLDOCUMENTRESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "UpdateContentTypeXmlDocumentResult");
        
        
        /**
         * Gets the "UpdateContentTypeXmlDocumentResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument.UpdateContentTypeXmlDocumentResponse.UpdateContentTypeXmlDocumentResult getUpdateContentTypeXmlDocumentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument.UpdateContentTypeXmlDocumentResponse.UpdateContentTypeXmlDocumentResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument.UpdateContentTypeXmlDocumentResponse.UpdateContentTypeXmlDocumentResult)get_store().find_element_user(UPDATECONTENTTYPEXMLDOCUMENTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "UpdateContentTypeXmlDocumentResult" element
         */
        public boolean isSetUpdateContentTypeXmlDocumentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(UPDATECONTENTTYPEXMLDOCUMENTRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "UpdateContentTypeXmlDocumentResult" element
         */
        public void setUpdateContentTypeXmlDocumentResult(com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument.UpdateContentTypeXmlDocumentResponse.UpdateContentTypeXmlDocumentResult updateContentTypeXmlDocumentResult)
        {
            generatedSetterHelperImpl(updateContentTypeXmlDocumentResult, UPDATECONTENTTYPEXMLDOCUMENTRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "UpdateContentTypeXmlDocumentResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument.UpdateContentTypeXmlDocumentResponse.UpdateContentTypeXmlDocumentResult addNewUpdateContentTypeXmlDocumentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument.UpdateContentTypeXmlDocumentResponse.UpdateContentTypeXmlDocumentResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument.UpdateContentTypeXmlDocumentResponse.UpdateContentTypeXmlDocumentResult)get_store().add_element_user(UPDATECONTENTTYPEXMLDOCUMENTRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "UpdateContentTypeXmlDocumentResult" element
         */
        public void unsetUpdateContentTypeXmlDocumentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(UPDATECONTENTTYPEXMLDOCUMENTRESULT$0, 0);
            }
        }
        /**
         * An XML UpdateContentTypeXmlDocumentResult(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class UpdateContentTypeXmlDocumentResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument.UpdateContentTypeXmlDocumentResponse.UpdateContentTypeXmlDocumentResult
        {
            private static final long serialVersionUID = 1L;
            
            public UpdateContentTypeXmlDocumentResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
