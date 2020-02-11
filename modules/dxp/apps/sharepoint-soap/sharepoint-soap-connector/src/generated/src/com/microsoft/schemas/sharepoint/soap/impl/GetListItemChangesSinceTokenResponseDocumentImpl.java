/*
 * An XML document type.
 * Localname: GetListItemChangesSinceTokenResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one GetListItemChangesSinceTokenResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class GetListItemChangesSinceTokenResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetListItemChangesSinceTokenResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLISTITEMCHANGESSINCETOKENRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListItemChangesSinceTokenResponse");
    
    
    /**
     * Gets the "GetListItemChangesSinceTokenResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenResponseDocument.GetListItemChangesSinceTokenResponse getGetListItemChangesSinceTokenResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenResponseDocument.GetListItemChangesSinceTokenResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenResponseDocument.GetListItemChangesSinceTokenResponse)get_store().find_element_user(GETLISTITEMCHANGESSINCETOKENRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetListItemChangesSinceTokenResponse" element
     */
    public void setGetListItemChangesSinceTokenResponse(com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenResponseDocument.GetListItemChangesSinceTokenResponse getListItemChangesSinceTokenResponse)
    {
        generatedSetterHelperImpl(getListItemChangesSinceTokenResponse, GETLISTITEMCHANGESSINCETOKENRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetListItemChangesSinceTokenResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenResponseDocument.GetListItemChangesSinceTokenResponse addNewGetListItemChangesSinceTokenResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenResponseDocument.GetListItemChangesSinceTokenResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenResponseDocument.GetListItemChangesSinceTokenResponse)get_store().add_element_user(GETLISTITEMCHANGESSINCETOKENRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetListItemChangesSinceTokenResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class GetListItemChangesSinceTokenResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenResponseDocument.GetListItemChangesSinceTokenResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetListItemChangesSinceTokenResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETLISTITEMCHANGESSINCETOKENRESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListItemChangesSinceTokenResult");
        
        
        /**
         * Gets the "GetListItemChangesSinceTokenResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenResponseDocument.GetListItemChangesSinceTokenResponse.GetListItemChangesSinceTokenResult getGetListItemChangesSinceTokenResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenResponseDocument.GetListItemChangesSinceTokenResponse.GetListItemChangesSinceTokenResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenResponseDocument.GetListItemChangesSinceTokenResponse.GetListItemChangesSinceTokenResult)get_store().find_element_user(GETLISTITEMCHANGESSINCETOKENRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GetListItemChangesSinceTokenResult" element
         */
        public boolean isSetGetListItemChangesSinceTokenResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETLISTITEMCHANGESSINCETOKENRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetListItemChangesSinceTokenResult" element
         */
        public void setGetListItemChangesSinceTokenResult(com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenResponseDocument.GetListItemChangesSinceTokenResponse.GetListItemChangesSinceTokenResult getListItemChangesSinceTokenResult)
        {
            generatedSetterHelperImpl(getListItemChangesSinceTokenResult, GETLISTITEMCHANGESSINCETOKENRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetListItemChangesSinceTokenResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenResponseDocument.GetListItemChangesSinceTokenResponse.GetListItemChangesSinceTokenResult addNewGetListItemChangesSinceTokenResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenResponseDocument.GetListItemChangesSinceTokenResponse.GetListItemChangesSinceTokenResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenResponseDocument.GetListItemChangesSinceTokenResponse.GetListItemChangesSinceTokenResult)get_store().add_element_user(GETLISTITEMCHANGESSINCETOKENRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "GetListItemChangesSinceTokenResult" element
         */
        public void unsetGetListItemChangesSinceTokenResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETLISTITEMCHANGESSINCETOKENRESULT$0, 0);
            }
        }
        /**
         * An XML GetListItemChangesSinceTokenResult(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class GetListItemChangesSinceTokenResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenResponseDocument.GetListItemChangesSinceTokenResponse.GetListItemChangesSinceTokenResult
        {
            private static final long serialVersionUID = 1L;
            
            public GetListItemChangesSinceTokenResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
