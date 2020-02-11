/*
 * An XML document type.
 * Localname: GetListResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.GetListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one GetListResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class GetListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListResponse");
    
    
    /**
     * Gets the "GetListResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetListResponseDocument.GetListResponse getGetListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetListResponseDocument.GetListResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetListResponseDocument.GetListResponse)get_store().find_element_user(GETLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetListResponse" element
     */
    public void setGetListResponse(com.microsoft.schemas.sharepoint.soap.GetListResponseDocument.GetListResponse getListResponse)
    {
        generatedSetterHelperImpl(getListResponse, GETLISTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetListResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetListResponseDocument.GetListResponse addNewGetListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetListResponseDocument.GetListResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetListResponseDocument.GetListResponse)get_store().add_element_user(GETLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetListResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class GetListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListResponseDocument.GetListResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETLISTRESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListResult");
        
        
        /**
         * Gets the "GetListResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListResponseDocument.GetListResponse.GetListResult getGetListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListResponseDocument.GetListResponse.GetListResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListResponseDocument.GetListResponse.GetListResult)get_store().find_element_user(GETLISTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GetListResult" element
         */
        public boolean isSetGetListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETLISTRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetListResult" element
         */
        public void setGetListResult(com.microsoft.schemas.sharepoint.soap.GetListResponseDocument.GetListResponse.GetListResult getListResult)
        {
            generatedSetterHelperImpl(getListResult, GETLISTRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetListResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListResponseDocument.GetListResponse.GetListResult addNewGetListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListResponseDocument.GetListResponse.GetListResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListResponseDocument.GetListResponse.GetListResult)get_store().add_element_user(GETLISTRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "GetListResult" element
         */
        public void unsetGetListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETLISTRESULT$0, 0);
            }
        }
        /**
         * An XML GetListResult(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class GetListResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListResponseDocument.GetListResponse.GetListResult
        {
            private static final long serialVersionUID = 1L;
            
            public GetListResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
