/*
 * An XML document type.
 * Localname: AddAttachmentResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.AddAttachmentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one AddAttachmentResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class AddAttachmentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.AddAttachmentResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddAttachmentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDATTACHMENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "AddAttachmentResponse");
    
    
    /**
     * Gets the "AddAttachmentResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.AddAttachmentResponseDocument.AddAttachmentResponse getAddAttachmentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.AddAttachmentResponseDocument.AddAttachmentResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.AddAttachmentResponseDocument.AddAttachmentResponse)get_store().find_element_user(ADDATTACHMENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AddAttachmentResponse" element
     */
    public void setAddAttachmentResponse(com.microsoft.schemas.sharepoint.soap.AddAttachmentResponseDocument.AddAttachmentResponse addAttachmentResponse)
    {
        generatedSetterHelperImpl(addAttachmentResponse, ADDATTACHMENTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AddAttachmentResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.AddAttachmentResponseDocument.AddAttachmentResponse addNewAddAttachmentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.AddAttachmentResponseDocument.AddAttachmentResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.AddAttachmentResponseDocument.AddAttachmentResponse)get_store().add_element_user(ADDATTACHMENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML AddAttachmentResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class AddAttachmentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.AddAttachmentResponseDocument.AddAttachmentResponse
    {
        private static final long serialVersionUID = 1L;
        
        public AddAttachmentResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ADDATTACHMENTRESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "AddAttachmentResult");
        
        
        /**
         * Gets the "AddAttachmentResult" element
         */
        public java.lang.String getAddAttachmentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDATTACHMENTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "AddAttachmentResult" element
         */
        public org.apache.xmlbeans.XmlString xgetAddAttachmentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDATTACHMENTRESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "AddAttachmentResult" element
         */
        public boolean isSetAddAttachmentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADDATTACHMENTRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "AddAttachmentResult" element
         */
        public void setAddAttachmentResult(java.lang.String addAttachmentResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDATTACHMENTRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDATTACHMENTRESULT$0);
                }
                target.setStringValue(addAttachmentResult);
            }
        }
        
        /**
         * Sets (as xml) the "AddAttachmentResult" element
         */
        public void xsetAddAttachmentResult(org.apache.xmlbeans.XmlString addAttachmentResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDATTACHMENTRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDATTACHMENTRESULT$0);
                }
                target.set(addAttachmentResult);
            }
        }
        
        /**
         * Unsets the "AddAttachmentResult" element
         */
        public void unsetAddAttachmentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADDATTACHMENTRESULT$0, 0);
            }
        }
    }
}
