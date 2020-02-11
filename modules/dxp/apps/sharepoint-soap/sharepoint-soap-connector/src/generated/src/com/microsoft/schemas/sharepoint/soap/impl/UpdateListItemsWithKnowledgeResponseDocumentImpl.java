/*
 * An XML document type.
 * Localname: UpdateListItemsWithKnowledgeResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one UpdateListItemsWithKnowledgeResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class UpdateListItemsWithKnowledgeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateListItemsWithKnowledgeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATELISTITEMSWITHKNOWLEDGERESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "UpdateListItemsWithKnowledgeResponse");
    
    
    /**
     * Gets the "UpdateListItemsWithKnowledgeResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeResponseDocument.UpdateListItemsWithKnowledgeResponse getUpdateListItemsWithKnowledgeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeResponseDocument.UpdateListItemsWithKnowledgeResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeResponseDocument.UpdateListItemsWithKnowledgeResponse)get_store().find_element_user(UPDATELISTITEMSWITHKNOWLEDGERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateListItemsWithKnowledgeResponse" element
     */
    public void setUpdateListItemsWithKnowledgeResponse(com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeResponseDocument.UpdateListItemsWithKnowledgeResponse updateListItemsWithKnowledgeResponse)
    {
        generatedSetterHelperImpl(updateListItemsWithKnowledgeResponse, UPDATELISTITEMSWITHKNOWLEDGERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "UpdateListItemsWithKnowledgeResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeResponseDocument.UpdateListItemsWithKnowledgeResponse addNewUpdateListItemsWithKnowledgeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeResponseDocument.UpdateListItemsWithKnowledgeResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeResponseDocument.UpdateListItemsWithKnowledgeResponse)get_store().add_element_user(UPDATELISTITEMSWITHKNOWLEDGERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UpdateListItemsWithKnowledgeResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class UpdateListItemsWithKnowledgeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeResponseDocument.UpdateListItemsWithKnowledgeResponse
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateListItemsWithKnowledgeResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName UPDATELISTITEMSWITHKNOWLEDGERESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "UpdateListItemsWithKnowledgeResult");
        
        
        /**
         * Gets the "UpdateListItemsWithKnowledgeResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeResponseDocument.UpdateListItemsWithKnowledgeResponse.UpdateListItemsWithKnowledgeResult getUpdateListItemsWithKnowledgeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeResponseDocument.UpdateListItemsWithKnowledgeResponse.UpdateListItemsWithKnowledgeResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeResponseDocument.UpdateListItemsWithKnowledgeResponse.UpdateListItemsWithKnowledgeResult)get_store().find_element_user(UPDATELISTITEMSWITHKNOWLEDGERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "UpdateListItemsWithKnowledgeResult" element
         */
        public boolean isSetUpdateListItemsWithKnowledgeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(UPDATELISTITEMSWITHKNOWLEDGERESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "UpdateListItemsWithKnowledgeResult" element
         */
        public void setUpdateListItemsWithKnowledgeResult(com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeResponseDocument.UpdateListItemsWithKnowledgeResponse.UpdateListItemsWithKnowledgeResult updateListItemsWithKnowledgeResult)
        {
            generatedSetterHelperImpl(updateListItemsWithKnowledgeResult, UPDATELISTITEMSWITHKNOWLEDGERESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "UpdateListItemsWithKnowledgeResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeResponseDocument.UpdateListItemsWithKnowledgeResponse.UpdateListItemsWithKnowledgeResult addNewUpdateListItemsWithKnowledgeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeResponseDocument.UpdateListItemsWithKnowledgeResponse.UpdateListItemsWithKnowledgeResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeResponseDocument.UpdateListItemsWithKnowledgeResponse.UpdateListItemsWithKnowledgeResult)get_store().add_element_user(UPDATELISTITEMSWITHKNOWLEDGERESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "UpdateListItemsWithKnowledgeResult" element
         */
        public void unsetUpdateListItemsWithKnowledgeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(UPDATELISTITEMSWITHKNOWLEDGERESULT$0, 0);
            }
        }
        /**
         * An XML UpdateListItemsWithKnowledgeResult(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class UpdateListItemsWithKnowledgeResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeResponseDocument.UpdateListItemsWithKnowledgeResponse.UpdateListItemsWithKnowledgeResult
        {
            private static final long serialVersionUID = 1L;
            
            public UpdateListItemsWithKnowledgeResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
