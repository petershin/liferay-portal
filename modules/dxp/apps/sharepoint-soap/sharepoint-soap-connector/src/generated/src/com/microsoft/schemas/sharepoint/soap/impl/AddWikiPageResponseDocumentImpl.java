/*
 * An XML document type.
 * Localname: AddWikiPageResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.AddWikiPageResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one AddWikiPageResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class AddWikiPageResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.AddWikiPageResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddWikiPageResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDWIKIPAGERESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "AddWikiPageResponse");
    
    
    /**
     * Gets the "AddWikiPageResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.AddWikiPageResponseDocument.AddWikiPageResponse getAddWikiPageResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.AddWikiPageResponseDocument.AddWikiPageResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.AddWikiPageResponseDocument.AddWikiPageResponse)get_store().find_element_user(ADDWIKIPAGERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AddWikiPageResponse" element
     */
    public void setAddWikiPageResponse(com.microsoft.schemas.sharepoint.soap.AddWikiPageResponseDocument.AddWikiPageResponse addWikiPageResponse)
    {
        generatedSetterHelperImpl(addWikiPageResponse, ADDWIKIPAGERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AddWikiPageResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.AddWikiPageResponseDocument.AddWikiPageResponse addNewAddWikiPageResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.AddWikiPageResponseDocument.AddWikiPageResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.AddWikiPageResponseDocument.AddWikiPageResponse)get_store().add_element_user(ADDWIKIPAGERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML AddWikiPageResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class AddWikiPageResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.AddWikiPageResponseDocument.AddWikiPageResponse
    {
        private static final long serialVersionUID = 1L;
        
        public AddWikiPageResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ADDWIKIPAGERESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "AddWikiPageResult");
        
        
        /**
         * Gets the "AddWikiPageResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.AddWikiPageResponseDocument.AddWikiPageResponse.AddWikiPageResult getAddWikiPageResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.AddWikiPageResponseDocument.AddWikiPageResponse.AddWikiPageResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.AddWikiPageResponseDocument.AddWikiPageResponse.AddWikiPageResult)get_store().find_element_user(ADDWIKIPAGERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "AddWikiPageResult" element
         */
        public boolean isSetAddWikiPageResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADDWIKIPAGERESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "AddWikiPageResult" element
         */
        public void setAddWikiPageResult(com.microsoft.schemas.sharepoint.soap.AddWikiPageResponseDocument.AddWikiPageResponse.AddWikiPageResult addWikiPageResult)
        {
            generatedSetterHelperImpl(addWikiPageResult, ADDWIKIPAGERESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "AddWikiPageResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.AddWikiPageResponseDocument.AddWikiPageResponse.AddWikiPageResult addNewAddWikiPageResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.AddWikiPageResponseDocument.AddWikiPageResponse.AddWikiPageResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.AddWikiPageResponseDocument.AddWikiPageResponse.AddWikiPageResult)get_store().add_element_user(ADDWIKIPAGERESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "AddWikiPageResult" element
         */
        public void unsetAddWikiPageResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADDWIKIPAGERESULT$0, 0);
            }
        }
        /**
         * An XML AddWikiPageResult(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class AddWikiPageResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.AddWikiPageResponseDocument.AddWikiPageResponse.AddWikiPageResult
        {
            private static final long serialVersionUID = 1L;
            
            public AddWikiPageResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
