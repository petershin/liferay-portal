/*
 * An XML document type.
 * Localname: UpdateContentTypesXmlDocumentResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one UpdateContentTypesXmlDocumentResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class UpdateContentTypesXmlDocumentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateContentTypesXmlDocumentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATECONTENTTYPESXMLDOCUMENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "UpdateContentTypesXmlDocumentResponse");
    
    
    /**
     * Gets the "UpdateContentTypesXmlDocumentResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentResponseDocument.UpdateContentTypesXmlDocumentResponse getUpdateContentTypesXmlDocumentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentResponseDocument.UpdateContentTypesXmlDocumentResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentResponseDocument.UpdateContentTypesXmlDocumentResponse)get_store().find_element_user(UPDATECONTENTTYPESXMLDOCUMENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateContentTypesXmlDocumentResponse" element
     */
    public void setUpdateContentTypesXmlDocumentResponse(com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentResponseDocument.UpdateContentTypesXmlDocumentResponse updateContentTypesXmlDocumentResponse)
    {
        generatedSetterHelperImpl(updateContentTypesXmlDocumentResponse, UPDATECONTENTTYPESXMLDOCUMENTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "UpdateContentTypesXmlDocumentResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentResponseDocument.UpdateContentTypesXmlDocumentResponse addNewUpdateContentTypesXmlDocumentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentResponseDocument.UpdateContentTypesXmlDocumentResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentResponseDocument.UpdateContentTypesXmlDocumentResponse)get_store().add_element_user(UPDATECONTENTTYPESXMLDOCUMENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UpdateContentTypesXmlDocumentResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class UpdateContentTypesXmlDocumentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentResponseDocument.UpdateContentTypesXmlDocumentResponse
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateContentTypesXmlDocumentResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName UPDATECONTENTTYPESXMLDOCUMENTRESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "UpdateContentTypesXmlDocumentResult");
        
        
        /**
         * Gets the "UpdateContentTypesXmlDocumentResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentResponseDocument.UpdateContentTypesXmlDocumentResponse.UpdateContentTypesXmlDocumentResult getUpdateContentTypesXmlDocumentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentResponseDocument.UpdateContentTypesXmlDocumentResponse.UpdateContentTypesXmlDocumentResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentResponseDocument.UpdateContentTypesXmlDocumentResponse.UpdateContentTypesXmlDocumentResult)get_store().find_element_user(UPDATECONTENTTYPESXMLDOCUMENTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "UpdateContentTypesXmlDocumentResult" element
         */
        public boolean isSetUpdateContentTypesXmlDocumentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(UPDATECONTENTTYPESXMLDOCUMENTRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "UpdateContentTypesXmlDocumentResult" element
         */
        public void setUpdateContentTypesXmlDocumentResult(com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentResponseDocument.UpdateContentTypesXmlDocumentResponse.UpdateContentTypesXmlDocumentResult updateContentTypesXmlDocumentResult)
        {
            generatedSetterHelperImpl(updateContentTypesXmlDocumentResult, UPDATECONTENTTYPESXMLDOCUMENTRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "UpdateContentTypesXmlDocumentResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentResponseDocument.UpdateContentTypesXmlDocumentResponse.UpdateContentTypesXmlDocumentResult addNewUpdateContentTypesXmlDocumentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentResponseDocument.UpdateContentTypesXmlDocumentResponse.UpdateContentTypesXmlDocumentResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentResponseDocument.UpdateContentTypesXmlDocumentResponse.UpdateContentTypesXmlDocumentResult)get_store().add_element_user(UPDATECONTENTTYPESXMLDOCUMENTRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "UpdateContentTypesXmlDocumentResult" element
         */
        public void unsetUpdateContentTypesXmlDocumentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(UPDATECONTENTTYPESXMLDOCUMENTRESULT$0, 0);
            }
        }
        /**
         * An XML UpdateContentTypesXmlDocumentResult(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class UpdateContentTypesXmlDocumentResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentResponseDocument.UpdateContentTypesXmlDocumentResponse.UpdateContentTypesXmlDocumentResult
        {
            private static final long serialVersionUID = 1L;
            
            public UpdateContentTypesXmlDocumentResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
