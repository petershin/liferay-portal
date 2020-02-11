/*
 * An XML document type.
 * Localname: UpdateContentTypeResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.UpdateContentTypeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one UpdateContentTypeResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class UpdateContentTypeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateContentTypeResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateContentTypeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATECONTENTTYPERESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "UpdateContentTypeResponse");
    
    
    /**
     * Gets the "UpdateContentTypeResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.UpdateContentTypeResponseDocument.UpdateContentTypeResponse getUpdateContentTypeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.UpdateContentTypeResponseDocument.UpdateContentTypeResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeResponseDocument.UpdateContentTypeResponse)get_store().find_element_user(UPDATECONTENTTYPERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateContentTypeResponse" element
     */
    public void setUpdateContentTypeResponse(com.microsoft.schemas.sharepoint.soap.UpdateContentTypeResponseDocument.UpdateContentTypeResponse updateContentTypeResponse)
    {
        generatedSetterHelperImpl(updateContentTypeResponse, UPDATECONTENTTYPERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "UpdateContentTypeResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.UpdateContentTypeResponseDocument.UpdateContentTypeResponse addNewUpdateContentTypeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.UpdateContentTypeResponseDocument.UpdateContentTypeResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeResponseDocument.UpdateContentTypeResponse)get_store().add_element_user(UPDATECONTENTTYPERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UpdateContentTypeResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class UpdateContentTypeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateContentTypeResponseDocument.UpdateContentTypeResponse
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateContentTypeResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName UPDATECONTENTTYPERESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "UpdateContentTypeResult");
        
        
        /**
         * Gets the "UpdateContentTypeResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateContentTypeResponseDocument.UpdateContentTypeResponse.UpdateContentTypeResult getUpdateContentTypeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateContentTypeResponseDocument.UpdateContentTypeResponse.UpdateContentTypeResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeResponseDocument.UpdateContentTypeResponse.UpdateContentTypeResult)get_store().find_element_user(UPDATECONTENTTYPERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "UpdateContentTypeResult" element
         */
        public boolean isSetUpdateContentTypeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(UPDATECONTENTTYPERESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "UpdateContentTypeResult" element
         */
        public void setUpdateContentTypeResult(com.microsoft.schemas.sharepoint.soap.UpdateContentTypeResponseDocument.UpdateContentTypeResponse.UpdateContentTypeResult updateContentTypeResult)
        {
            generatedSetterHelperImpl(updateContentTypeResult, UPDATECONTENTTYPERESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "UpdateContentTypeResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateContentTypeResponseDocument.UpdateContentTypeResponse.UpdateContentTypeResult addNewUpdateContentTypeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateContentTypeResponseDocument.UpdateContentTypeResponse.UpdateContentTypeResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeResponseDocument.UpdateContentTypeResponse.UpdateContentTypeResult)get_store().add_element_user(UPDATECONTENTTYPERESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "UpdateContentTypeResult" element
         */
        public void unsetUpdateContentTypeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(UPDATECONTENTTYPERESULT$0, 0);
            }
        }
        /**
         * An XML UpdateContentTypeResult(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class UpdateContentTypeResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateContentTypeResponseDocument.UpdateContentTypeResponse.UpdateContentTypeResult
        {
            private static final long serialVersionUID = 1L;
            
            public UpdateContentTypeResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
