/*
 * An XML document type.
 * Localname: ApplyContentTypeToListResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one ApplyContentTypeToListResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class ApplyContentTypeToListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ApplyContentTypeToListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPLYCONTENTTYPETOLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "ApplyContentTypeToListResponse");
    
    
    /**
     * Gets the "ApplyContentTypeToListResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListResponseDocument.ApplyContentTypeToListResponse getApplyContentTypeToListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListResponseDocument.ApplyContentTypeToListResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListResponseDocument.ApplyContentTypeToListResponse)get_store().find_element_user(APPLYCONTENTTYPETOLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ApplyContentTypeToListResponse" element
     */
    public void setApplyContentTypeToListResponse(com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListResponseDocument.ApplyContentTypeToListResponse applyContentTypeToListResponse)
    {
        generatedSetterHelperImpl(applyContentTypeToListResponse, APPLYCONTENTTYPETOLISTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ApplyContentTypeToListResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListResponseDocument.ApplyContentTypeToListResponse addNewApplyContentTypeToListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListResponseDocument.ApplyContentTypeToListResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListResponseDocument.ApplyContentTypeToListResponse)get_store().add_element_user(APPLYCONTENTTYPETOLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ApplyContentTypeToListResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class ApplyContentTypeToListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListResponseDocument.ApplyContentTypeToListResponse
    {
        private static final long serialVersionUID = 1L;
        
        public ApplyContentTypeToListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName APPLYCONTENTTYPETOLISTRESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "ApplyContentTypeToListResult");
        
        
        /**
         * Gets the "ApplyContentTypeToListResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListResponseDocument.ApplyContentTypeToListResponse.ApplyContentTypeToListResult getApplyContentTypeToListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListResponseDocument.ApplyContentTypeToListResponse.ApplyContentTypeToListResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListResponseDocument.ApplyContentTypeToListResponse.ApplyContentTypeToListResult)get_store().find_element_user(APPLYCONTENTTYPETOLISTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ApplyContentTypeToListResult" element
         */
        public boolean isSetApplyContentTypeToListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(APPLYCONTENTTYPETOLISTRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "ApplyContentTypeToListResult" element
         */
        public void setApplyContentTypeToListResult(com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListResponseDocument.ApplyContentTypeToListResponse.ApplyContentTypeToListResult applyContentTypeToListResult)
        {
            generatedSetterHelperImpl(applyContentTypeToListResult, APPLYCONTENTTYPETOLISTRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "ApplyContentTypeToListResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListResponseDocument.ApplyContentTypeToListResponse.ApplyContentTypeToListResult addNewApplyContentTypeToListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListResponseDocument.ApplyContentTypeToListResponse.ApplyContentTypeToListResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListResponseDocument.ApplyContentTypeToListResponse.ApplyContentTypeToListResult)get_store().add_element_user(APPLYCONTENTTYPETOLISTRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "ApplyContentTypeToListResult" element
         */
        public void unsetApplyContentTypeToListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(APPLYCONTENTTYPETOLISTRESULT$0, 0);
            }
        }
        /**
         * An XML ApplyContentTypeToListResult(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class ApplyContentTypeToListResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListResponseDocument.ApplyContentTypeToListResponse.ApplyContentTypeToListResult
        {
            private static final long serialVersionUID = 1L;
            
            public ApplyContentTypeToListResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
