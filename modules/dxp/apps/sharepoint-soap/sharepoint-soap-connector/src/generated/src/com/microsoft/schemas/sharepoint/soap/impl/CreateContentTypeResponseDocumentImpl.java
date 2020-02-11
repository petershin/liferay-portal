/*
 * An XML document type.
 * Localname: CreateContentTypeResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.CreateContentTypeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one CreateContentTypeResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class CreateContentTypeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.CreateContentTypeResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreateContentTypeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATECONTENTTYPERESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "CreateContentTypeResponse");
    
    
    /**
     * Gets the "CreateContentTypeResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.CreateContentTypeResponseDocument.CreateContentTypeResponse getCreateContentTypeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.CreateContentTypeResponseDocument.CreateContentTypeResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.CreateContentTypeResponseDocument.CreateContentTypeResponse)get_store().find_element_user(CREATECONTENTTYPERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateContentTypeResponse" element
     */
    public void setCreateContentTypeResponse(com.microsoft.schemas.sharepoint.soap.CreateContentTypeResponseDocument.CreateContentTypeResponse createContentTypeResponse)
    {
        generatedSetterHelperImpl(createContentTypeResponse, CREATECONTENTTYPERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CreateContentTypeResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.CreateContentTypeResponseDocument.CreateContentTypeResponse addNewCreateContentTypeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.CreateContentTypeResponseDocument.CreateContentTypeResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.CreateContentTypeResponseDocument.CreateContentTypeResponse)get_store().add_element_user(CREATECONTENTTYPERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CreateContentTypeResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class CreateContentTypeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.CreateContentTypeResponseDocument.CreateContentTypeResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CreateContentTypeResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CREATECONTENTTYPERESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "CreateContentTypeResult");
        
        
        /**
         * Gets the "CreateContentTypeResult" element
         */
        public java.lang.String getCreateContentTypeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATECONTENTTYPERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CreateContentTypeResult" element
         */
        public org.apache.xmlbeans.XmlString xgetCreateContentTypeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREATECONTENTTYPERESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "CreateContentTypeResult" element
         */
        public boolean isSetCreateContentTypeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CREATECONTENTTYPERESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "CreateContentTypeResult" element
         */
        public void setCreateContentTypeResult(java.lang.String createContentTypeResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATECONTENTTYPERESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATECONTENTTYPERESULT$0);
                }
                target.setStringValue(createContentTypeResult);
            }
        }
        
        /**
         * Sets (as xml) the "CreateContentTypeResult" element
         */
        public void xsetCreateContentTypeResult(org.apache.xmlbeans.XmlString createContentTypeResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREATECONTENTTYPERESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CREATECONTENTTYPERESULT$0);
                }
                target.set(createContentTypeResult);
            }
        }
        
        /**
         * Unsets the "CreateContentTypeResult" element
         */
        public void unsetCreateContentTypeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CREATECONTENTTYPERESULT$0, 0);
            }
        }
    }
}
