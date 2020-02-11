/*
 * An XML document type.
 * Localname: GetListItemChangesWithKnowledgeResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one GetListItemChangesWithKnowledgeResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class GetListItemChangesWithKnowledgeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetListItemChangesWithKnowledgeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLISTITEMCHANGESWITHKNOWLEDGERESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListItemChangesWithKnowledgeResponse");
    
    
    /**
     * Gets the "GetListItemChangesWithKnowledgeResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeResponseDocument.GetListItemChangesWithKnowledgeResponse getGetListItemChangesWithKnowledgeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeResponseDocument.GetListItemChangesWithKnowledgeResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeResponseDocument.GetListItemChangesWithKnowledgeResponse)get_store().find_element_user(GETLISTITEMCHANGESWITHKNOWLEDGERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetListItemChangesWithKnowledgeResponse" element
     */
    public void setGetListItemChangesWithKnowledgeResponse(com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeResponseDocument.GetListItemChangesWithKnowledgeResponse getListItemChangesWithKnowledgeResponse)
    {
        generatedSetterHelperImpl(getListItemChangesWithKnowledgeResponse, GETLISTITEMCHANGESWITHKNOWLEDGERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetListItemChangesWithKnowledgeResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeResponseDocument.GetListItemChangesWithKnowledgeResponse addNewGetListItemChangesWithKnowledgeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeResponseDocument.GetListItemChangesWithKnowledgeResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeResponseDocument.GetListItemChangesWithKnowledgeResponse)get_store().add_element_user(GETLISTITEMCHANGESWITHKNOWLEDGERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetListItemChangesWithKnowledgeResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class GetListItemChangesWithKnowledgeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeResponseDocument.GetListItemChangesWithKnowledgeResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetListItemChangesWithKnowledgeResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETLISTITEMCHANGESWITHKNOWLEDGERESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListItemChangesWithKnowledgeResult");
        
        
        /**
         * Gets the "GetListItemChangesWithKnowledgeResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeResponseDocument.GetListItemChangesWithKnowledgeResponse.GetListItemChangesWithKnowledgeResult getGetListItemChangesWithKnowledgeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeResponseDocument.GetListItemChangesWithKnowledgeResponse.GetListItemChangesWithKnowledgeResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeResponseDocument.GetListItemChangesWithKnowledgeResponse.GetListItemChangesWithKnowledgeResult)get_store().find_element_user(GETLISTITEMCHANGESWITHKNOWLEDGERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GetListItemChangesWithKnowledgeResult" element
         */
        public boolean isSetGetListItemChangesWithKnowledgeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETLISTITEMCHANGESWITHKNOWLEDGERESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetListItemChangesWithKnowledgeResult" element
         */
        public void setGetListItemChangesWithKnowledgeResult(com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeResponseDocument.GetListItemChangesWithKnowledgeResponse.GetListItemChangesWithKnowledgeResult getListItemChangesWithKnowledgeResult)
        {
            generatedSetterHelperImpl(getListItemChangesWithKnowledgeResult, GETLISTITEMCHANGESWITHKNOWLEDGERESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetListItemChangesWithKnowledgeResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeResponseDocument.GetListItemChangesWithKnowledgeResponse.GetListItemChangesWithKnowledgeResult addNewGetListItemChangesWithKnowledgeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeResponseDocument.GetListItemChangesWithKnowledgeResponse.GetListItemChangesWithKnowledgeResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeResponseDocument.GetListItemChangesWithKnowledgeResponse.GetListItemChangesWithKnowledgeResult)get_store().add_element_user(GETLISTITEMCHANGESWITHKNOWLEDGERESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "GetListItemChangesWithKnowledgeResult" element
         */
        public void unsetGetListItemChangesWithKnowledgeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETLISTITEMCHANGESWITHKNOWLEDGERESULT$0, 0);
            }
        }
        /**
         * An XML GetListItemChangesWithKnowledgeResult(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class GetListItemChangesWithKnowledgeResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeResponseDocument.GetListItemChangesWithKnowledgeResponse.GetListItemChangesWithKnowledgeResult
        {
            private static final long serialVersionUID = 1L;
            
            public GetListItemChangesWithKnowledgeResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
