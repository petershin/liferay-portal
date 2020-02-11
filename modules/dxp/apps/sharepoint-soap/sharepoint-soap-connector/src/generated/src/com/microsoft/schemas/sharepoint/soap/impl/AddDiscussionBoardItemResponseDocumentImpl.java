/*
 * An XML document type.
 * Localname: AddDiscussionBoardItemResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one AddDiscussionBoardItemResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class AddDiscussionBoardItemResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddDiscussionBoardItemResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDDISCUSSIONBOARDITEMRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "AddDiscussionBoardItemResponse");
    
    
    /**
     * Gets the "AddDiscussionBoardItemResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemResponseDocument.AddDiscussionBoardItemResponse getAddDiscussionBoardItemResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemResponseDocument.AddDiscussionBoardItemResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemResponseDocument.AddDiscussionBoardItemResponse)get_store().find_element_user(ADDDISCUSSIONBOARDITEMRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AddDiscussionBoardItemResponse" element
     */
    public void setAddDiscussionBoardItemResponse(com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemResponseDocument.AddDiscussionBoardItemResponse addDiscussionBoardItemResponse)
    {
        generatedSetterHelperImpl(addDiscussionBoardItemResponse, ADDDISCUSSIONBOARDITEMRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AddDiscussionBoardItemResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemResponseDocument.AddDiscussionBoardItemResponse addNewAddDiscussionBoardItemResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemResponseDocument.AddDiscussionBoardItemResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemResponseDocument.AddDiscussionBoardItemResponse)get_store().add_element_user(ADDDISCUSSIONBOARDITEMRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML AddDiscussionBoardItemResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class AddDiscussionBoardItemResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemResponseDocument.AddDiscussionBoardItemResponse
    {
        private static final long serialVersionUID = 1L;
        
        public AddDiscussionBoardItemResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ADDDISCUSSIONBOARDITEMRESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "AddDiscussionBoardItemResult");
        
        
        /**
         * Gets the "AddDiscussionBoardItemResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemResponseDocument.AddDiscussionBoardItemResponse.AddDiscussionBoardItemResult getAddDiscussionBoardItemResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemResponseDocument.AddDiscussionBoardItemResponse.AddDiscussionBoardItemResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemResponseDocument.AddDiscussionBoardItemResponse.AddDiscussionBoardItemResult)get_store().find_element_user(ADDDISCUSSIONBOARDITEMRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "AddDiscussionBoardItemResult" element
         */
        public boolean isSetAddDiscussionBoardItemResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADDDISCUSSIONBOARDITEMRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "AddDiscussionBoardItemResult" element
         */
        public void setAddDiscussionBoardItemResult(com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemResponseDocument.AddDiscussionBoardItemResponse.AddDiscussionBoardItemResult addDiscussionBoardItemResult)
        {
            generatedSetterHelperImpl(addDiscussionBoardItemResult, ADDDISCUSSIONBOARDITEMRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "AddDiscussionBoardItemResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemResponseDocument.AddDiscussionBoardItemResponse.AddDiscussionBoardItemResult addNewAddDiscussionBoardItemResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemResponseDocument.AddDiscussionBoardItemResponse.AddDiscussionBoardItemResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemResponseDocument.AddDiscussionBoardItemResponse.AddDiscussionBoardItemResult)get_store().add_element_user(ADDDISCUSSIONBOARDITEMRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "AddDiscussionBoardItemResult" element
         */
        public void unsetAddDiscussionBoardItemResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADDDISCUSSIONBOARDITEMRESULT$0, 0);
            }
        }
        /**
         * An XML AddDiscussionBoardItemResult(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class AddDiscussionBoardItemResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemResponseDocument.AddDiscussionBoardItemResponse.AddDiscussionBoardItemResult
        {
            private static final long serialVersionUID = 1L;
            
            public AddDiscussionBoardItemResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
