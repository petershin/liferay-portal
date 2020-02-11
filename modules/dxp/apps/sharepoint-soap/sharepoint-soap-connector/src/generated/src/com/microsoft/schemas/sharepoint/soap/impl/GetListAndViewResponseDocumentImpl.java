/*
 * An XML document type.
 * Localname: GetListAndViewResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.GetListAndViewResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one GetListAndViewResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class GetListAndViewResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListAndViewResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetListAndViewResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLISTANDVIEWRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListAndViewResponse");
    
    
    /**
     * Gets the "GetListAndViewResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetListAndViewResponseDocument.GetListAndViewResponse getGetListAndViewResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetListAndViewResponseDocument.GetListAndViewResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetListAndViewResponseDocument.GetListAndViewResponse)get_store().find_element_user(GETLISTANDVIEWRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetListAndViewResponse" element
     */
    public void setGetListAndViewResponse(com.microsoft.schemas.sharepoint.soap.GetListAndViewResponseDocument.GetListAndViewResponse getListAndViewResponse)
    {
        generatedSetterHelperImpl(getListAndViewResponse, GETLISTANDVIEWRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetListAndViewResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetListAndViewResponseDocument.GetListAndViewResponse addNewGetListAndViewResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetListAndViewResponseDocument.GetListAndViewResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetListAndViewResponseDocument.GetListAndViewResponse)get_store().add_element_user(GETLISTANDVIEWRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetListAndViewResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class GetListAndViewResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListAndViewResponseDocument.GetListAndViewResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetListAndViewResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETLISTANDVIEWRESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListAndViewResult");
        
        
        /**
         * Gets the "GetListAndViewResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListAndViewResponseDocument.GetListAndViewResponse.GetListAndViewResult getGetListAndViewResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListAndViewResponseDocument.GetListAndViewResponse.GetListAndViewResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListAndViewResponseDocument.GetListAndViewResponse.GetListAndViewResult)get_store().find_element_user(GETLISTANDVIEWRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GetListAndViewResult" element
         */
        public boolean isSetGetListAndViewResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETLISTANDVIEWRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetListAndViewResult" element
         */
        public void setGetListAndViewResult(com.microsoft.schemas.sharepoint.soap.GetListAndViewResponseDocument.GetListAndViewResponse.GetListAndViewResult getListAndViewResult)
        {
            generatedSetterHelperImpl(getListAndViewResult, GETLISTANDVIEWRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetListAndViewResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListAndViewResponseDocument.GetListAndViewResponse.GetListAndViewResult addNewGetListAndViewResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListAndViewResponseDocument.GetListAndViewResponse.GetListAndViewResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListAndViewResponseDocument.GetListAndViewResponse.GetListAndViewResult)get_store().add_element_user(GETLISTANDVIEWRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "GetListAndViewResult" element
         */
        public void unsetGetListAndViewResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETLISTANDVIEWRESULT$0, 0);
            }
        }
        /**
         * An XML GetListAndViewResult(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class GetListAndViewResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListAndViewResponseDocument.GetListAndViewResponse.GetListAndViewResult
        {
            private static final long serialVersionUID = 1L;
            
            public GetListAndViewResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
