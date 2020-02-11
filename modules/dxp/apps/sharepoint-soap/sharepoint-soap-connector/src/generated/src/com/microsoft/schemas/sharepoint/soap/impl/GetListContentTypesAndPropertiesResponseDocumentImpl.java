/*
 * An XML document type.
 * Localname: GetListContentTypesAndPropertiesResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one GetListContentTypesAndPropertiesResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class GetListContentTypesAndPropertiesResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetListContentTypesAndPropertiesResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLISTCONTENTTYPESANDPROPERTIESRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListContentTypesAndPropertiesResponse");
    
    
    /**
     * Gets the "GetListContentTypesAndPropertiesResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument.GetListContentTypesAndPropertiesResponse getGetListContentTypesAndPropertiesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument.GetListContentTypesAndPropertiesResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument.GetListContentTypesAndPropertiesResponse)get_store().find_element_user(GETLISTCONTENTTYPESANDPROPERTIESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetListContentTypesAndPropertiesResponse" element
     */
    public void setGetListContentTypesAndPropertiesResponse(com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument.GetListContentTypesAndPropertiesResponse getListContentTypesAndPropertiesResponse)
    {
        generatedSetterHelperImpl(getListContentTypesAndPropertiesResponse, GETLISTCONTENTTYPESANDPROPERTIESRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetListContentTypesAndPropertiesResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument.GetListContentTypesAndPropertiesResponse addNewGetListContentTypesAndPropertiesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument.GetListContentTypesAndPropertiesResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument.GetListContentTypesAndPropertiesResponse)get_store().add_element_user(GETLISTCONTENTTYPESANDPROPERTIESRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetListContentTypesAndPropertiesResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class GetListContentTypesAndPropertiesResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument.GetListContentTypesAndPropertiesResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetListContentTypesAndPropertiesResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETLISTCONTENTTYPESANDPROPERTIESRESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListContentTypesAndPropertiesResult");
        
        
        /**
         * Gets the "GetListContentTypesAndPropertiesResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument.GetListContentTypesAndPropertiesResponse.GetListContentTypesAndPropertiesResult getGetListContentTypesAndPropertiesResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument.GetListContentTypesAndPropertiesResponse.GetListContentTypesAndPropertiesResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument.GetListContentTypesAndPropertiesResponse.GetListContentTypesAndPropertiesResult)get_store().find_element_user(GETLISTCONTENTTYPESANDPROPERTIESRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GetListContentTypesAndPropertiesResult" element
         */
        public boolean isSetGetListContentTypesAndPropertiesResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETLISTCONTENTTYPESANDPROPERTIESRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetListContentTypesAndPropertiesResult" element
         */
        public void setGetListContentTypesAndPropertiesResult(com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument.GetListContentTypesAndPropertiesResponse.GetListContentTypesAndPropertiesResult getListContentTypesAndPropertiesResult)
        {
            generatedSetterHelperImpl(getListContentTypesAndPropertiesResult, GETLISTCONTENTTYPESANDPROPERTIESRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetListContentTypesAndPropertiesResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument.GetListContentTypesAndPropertiesResponse.GetListContentTypesAndPropertiesResult addNewGetListContentTypesAndPropertiesResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument.GetListContentTypesAndPropertiesResponse.GetListContentTypesAndPropertiesResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument.GetListContentTypesAndPropertiesResponse.GetListContentTypesAndPropertiesResult)get_store().add_element_user(GETLISTCONTENTTYPESANDPROPERTIESRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "GetListContentTypesAndPropertiesResult" element
         */
        public void unsetGetListContentTypesAndPropertiesResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETLISTCONTENTTYPESANDPROPERTIESRESULT$0, 0);
            }
        }
        /**
         * An XML GetListContentTypesAndPropertiesResult(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class GetListContentTypesAndPropertiesResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument.GetListContentTypesAndPropertiesResponse.GetListContentTypesAndPropertiesResult
        {
            private static final long serialVersionUID = 1L;
            
            public GetListContentTypesAndPropertiesResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
