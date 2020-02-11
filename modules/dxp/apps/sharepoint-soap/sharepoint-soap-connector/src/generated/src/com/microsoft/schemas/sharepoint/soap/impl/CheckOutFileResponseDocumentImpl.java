/*
 * An XML document type.
 * Localname: CheckOutFileResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.CheckOutFileResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one CheckOutFileResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class CheckOutFileResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.CheckOutFileResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CheckOutFileResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHECKOUTFILERESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "CheckOutFileResponse");
    
    
    /**
     * Gets the "CheckOutFileResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.CheckOutFileResponseDocument.CheckOutFileResponse getCheckOutFileResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.CheckOutFileResponseDocument.CheckOutFileResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.CheckOutFileResponseDocument.CheckOutFileResponse)get_store().find_element_user(CHECKOUTFILERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CheckOutFileResponse" element
     */
    public void setCheckOutFileResponse(com.microsoft.schemas.sharepoint.soap.CheckOutFileResponseDocument.CheckOutFileResponse checkOutFileResponse)
    {
        generatedSetterHelperImpl(checkOutFileResponse, CHECKOUTFILERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CheckOutFileResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.CheckOutFileResponseDocument.CheckOutFileResponse addNewCheckOutFileResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.CheckOutFileResponseDocument.CheckOutFileResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.CheckOutFileResponseDocument.CheckOutFileResponse)get_store().add_element_user(CHECKOUTFILERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CheckOutFileResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class CheckOutFileResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.CheckOutFileResponseDocument.CheckOutFileResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CheckOutFileResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CHECKOUTFILERESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "CheckOutFileResult");
        
        
        /**
         * Gets the "CheckOutFileResult" element
         */
        public boolean getCheckOutFileResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHECKOUTFILERESULT$0, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "CheckOutFileResult" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetCheckOutFileResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CHECKOUTFILERESULT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CheckOutFileResult" element
         */
        public void setCheckOutFileResult(boolean checkOutFileResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHECKOUTFILERESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHECKOUTFILERESULT$0);
                }
                target.setBooleanValue(checkOutFileResult);
            }
        }
        
        /**
         * Sets (as xml) the "CheckOutFileResult" element
         */
        public void xsetCheckOutFileResult(org.apache.xmlbeans.XmlBoolean checkOutFileResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CHECKOUTFILERESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CHECKOUTFILERESULT$0);
                }
                target.set(checkOutFileResult);
            }
        }
    }
}
