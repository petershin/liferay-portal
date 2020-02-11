/*
 * An XML document type.
 * Localname: UpdateListResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.UpdateListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one UpdateListResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class UpdateListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATELISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "UpdateListResponse");
    
    
    /**
     * Gets the "UpdateListResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.UpdateListResponseDocument.UpdateListResponse getUpdateListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.UpdateListResponseDocument.UpdateListResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.UpdateListResponseDocument.UpdateListResponse)get_store().find_element_user(UPDATELISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateListResponse" element
     */
    public void setUpdateListResponse(com.microsoft.schemas.sharepoint.soap.UpdateListResponseDocument.UpdateListResponse updateListResponse)
    {
        generatedSetterHelperImpl(updateListResponse, UPDATELISTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "UpdateListResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.UpdateListResponseDocument.UpdateListResponse addNewUpdateListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.UpdateListResponseDocument.UpdateListResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.UpdateListResponseDocument.UpdateListResponse)get_store().add_element_user(UPDATELISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UpdateListResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class UpdateListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateListResponseDocument.UpdateListResponse
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName UPDATELISTRESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "UpdateListResult");
        
        
        /**
         * Gets the "UpdateListResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateListResponseDocument.UpdateListResponse.UpdateListResult getUpdateListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateListResponseDocument.UpdateListResponse.UpdateListResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateListResponseDocument.UpdateListResponse.UpdateListResult)get_store().find_element_user(UPDATELISTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "UpdateListResult" element
         */
        public boolean isSetUpdateListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(UPDATELISTRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "UpdateListResult" element
         */
        public void setUpdateListResult(com.microsoft.schemas.sharepoint.soap.UpdateListResponseDocument.UpdateListResponse.UpdateListResult updateListResult)
        {
            generatedSetterHelperImpl(updateListResult, UPDATELISTRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "UpdateListResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateListResponseDocument.UpdateListResponse.UpdateListResult addNewUpdateListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateListResponseDocument.UpdateListResponse.UpdateListResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateListResponseDocument.UpdateListResponse.UpdateListResult)get_store().add_element_user(UPDATELISTRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "UpdateListResult" element
         */
        public void unsetUpdateListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(UPDATELISTRESULT$0, 0);
            }
        }
        /**
         * An XML UpdateListResult(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class UpdateListResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateListResponseDocument.UpdateListResponse.UpdateListResult
        {
            private static final long serialVersionUID = 1L;
            
            public UpdateListResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
