/*
 * An XML document type.
 * Localname: AddListResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.AddListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one AddListResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class AddListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.AddListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "AddListResponse");
    
    
    /**
     * Gets the "AddListResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.AddListResponseDocument.AddListResponse getAddListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.AddListResponseDocument.AddListResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.AddListResponseDocument.AddListResponse)get_store().find_element_user(ADDLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AddListResponse" element
     */
    public void setAddListResponse(com.microsoft.schemas.sharepoint.soap.AddListResponseDocument.AddListResponse addListResponse)
    {
        generatedSetterHelperImpl(addListResponse, ADDLISTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AddListResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.AddListResponseDocument.AddListResponse addNewAddListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.AddListResponseDocument.AddListResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.AddListResponseDocument.AddListResponse)get_store().add_element_user(ADDLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML AddListResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class AddListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.AddListResponseDocument.AddListResponse
    {
        private static final long serialVersionUID = 1L;
        
        public AddListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ADDLISTRESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "AddListResult");
        
        
        /**
         * Gets the "AddListResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.AddListResponseDocument.AddListResponse.AddListResult getAddListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.AddListResponseDocument.AddListResponse.AddListResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.AddListResponseDocument.AddListResponse.AddListResult)get_store().find_element_user(ADDLISTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "AddListResult" element
         */
        public boolean isSetAddListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADDLISTRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "AddListResult" element
         */
        public void setAddListResult(com.microsoft.schemas.sharepoint.soap.AddListResponseDocument.AddListResponse.AddListResult addListResult)
        {
            generatedSetterHelperImpl(addListResult, ADDLISTRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "AddListResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.AddListResponseDocument.AddListResponse.AddListResult addNewAddListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.AddListResponseDocument.AddListResponse.AddListResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.AddListResponseDocument.AddListResponse.AddListResult)get_store().add_element_user(ADDLISTRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "AddListResult" element
         */
        public void unsetAddListResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADDLISTRESULT$0, 0);
            }
        }
        /**
         * An XML AddListResult(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class AddListResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.AddListResponseDocument.AddListResponse.AddListResult
        {
            private static final long serialVersionUID = 1L;
            
            public AddListResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
