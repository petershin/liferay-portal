/*
 * An XML document type.
 * Localname: GetListContentTypeResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.GetListContentTypeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one GetListContentTypeResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class GetListContentTypeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListContentTypeResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetListContentTypeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLISTCONTENTTYPERESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListContentTypeResponse");
    
    
    /**
     * Gets the "GetListContentTypeResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetListContentTypeResponseDocument.GetListContentTypeResponse getGetListContentTypeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetListContentTypeResponseDocument.GetListContentTypeResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetListContentTypeResponseDocument.GetListContentTypeResponse)get_store().find_element_user(GETLISTCONTENTTYPERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetListContentTypeResponse" element
     */
    public void setGetListContentTypeResponse(com.microsoft.schemas.sharepoint.soap.GetListContentTypeResponseDocument.GetListContentTypeResponse getListContentTypeResponse)
    {
        generatedSetterHelperImpl(getListContentTypeResponse, GETLISTCONTENTTYPERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetListContentTypeResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetListContentTypeResponseDocument.GetListContentTypeResponse addNewGetListContentTypeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetListContentTypeResponseDocument.GetListContentTypeResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetListContentTypeResponseDocument.GetListContentTypeResponse)get_store().add_element_user(GETLISTCONTENTTYPERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetListContentTypeResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class GetListContentTypeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListContentTypeResponseDocument.GetListContentTypeResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetListContentTypeResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETLISTCONTENTTYPERESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListContentTypeResult");
        
        
        /**
         * Gets the "GetListContentTypeResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListContentTypeResponseDocument.GetListContentTypeResponse.GetListContentTypeResult getGetListContentTypeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListContentTypeResponseDocument.GetListContentTypeResponse.GetListContentTypeResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListContentTypeResponseDocument.GetListContentTypeResponse.GetListContentTypeResult)get_store().find_element_user(GETLISTCONTENTTYPERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GetListContentTypeResult" element
         */
        public boolean isSetGetListContentTypeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETLISTCONTENTTYPERESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetListContentTypeResult" element
         */
        public void setGetListContentTypeResult(com.microsoft.schemas.sharepoint.soap.GetListContentTypeResponseDocument.GetListContentTypeResponse.GetListContentTypeResult getListContentTypeResult)
        {
            generatedSetterHelperImpl(getListContentTypeResult, GETLISTCONTENTTYPERESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetListContentTypeResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListContentTypeResponseDocument.GetListContentTypeResponse.GetListContentTypeResult addNewGetListContentTypeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListContentTypeResponseDocument.GetListContentTypeResponse.GetListContentTypeResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListContentTypeResponseDocument.GetListContentTypeResponse.GetListContentTypeResult)get_store().add_element_user(GETLISTCONTENTTYPERESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "GetListContentTypeResult" element
         */
        public void unsetGetListContentTypeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETLISTCONTENTTYPERESULT$0, 0);
            }
        }
        /**
         * An XML GetListContentTypeResult(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class GetListContentTypeResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListContentTypeResponseDocument.GetListContentTypeResponse.GetListContentTypeResult
        {
            private static final long serialVersionUID = 1L;
            
            public GetListContentTypeResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
