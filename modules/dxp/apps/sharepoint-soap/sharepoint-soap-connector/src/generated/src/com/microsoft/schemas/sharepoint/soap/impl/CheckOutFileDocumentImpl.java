/*
 * An XML document type.
 * Localname: CheckOutFile
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one CheckOutFile(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class CheckOutFileDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument
{
    private static final long serialVersionUID = 1L;
    
    public CheckOutFileDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHECKOUTFILE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "CheckOutFile");
    
    
    /**
     * Gets the "CheckOutFile" element
     */
    public com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument.CheckOutFile getCheckOutFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument.CheckOutFile target = null;
            target = (com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument.CheckOutFile)get_store().find_element_user(CHECKOUTFILE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CheckOutFile" element
     */
    public void setCheckOutFile(com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument.CheckOutFile checkOutFile)
    {
        generatedSetterHelperImpl(checkOutFile, CHECKOUTFILE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CheckOutFile" element
     */
    public com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument.CheckOutFile addNewCheckOutFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument.CheckOutFile target = null;
            target = (com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument.CheckOutFile)get_store().add_element_user(CHECKOUTFILE$0);
            return target;
        }
    }
    /**
     * An XML CheckOutFile(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class CheckOutFileImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument.CheckOutFile
    {
        private static final long serialVersionUID = 1L;
        
        public CheckOutFileImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PAGEURL$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "pageUrl");
        private static final javax.xml.namespace.QName CHECKOUTTOLOCAL$2 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "checkoutToLocal");
        private static final javax.xml.namespace.QName LASTMODIFIED$4 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "lastmodified");
        
        
        /**
         * Gets the "pageUrl" element
         */
        public java.lang.String getPageUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGEURL$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "pageUrl" element
         */
        public org.apache.xmlbeans.XmlString xgetPageUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAGEURL$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "pageUrl" element
         */
        public boolean isSetPageUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PAGEURL$0) != 0;
            }
        }
        
        /**
         * Sets the "pageUrl" element
         */
        public void setPageUrl(java.lang.String pageUrl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGEURL$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAGEURL$0);
                }
                target.setStringValue(pageUrl);
            }
        }
        
        /**
         * Sets (as xml) the "pageUrl" element
         */
        public void xsetPageUrl(org.apache.xmlbeans.XmlString pageUrl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAGEURL$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PAGEURL$0);
                }
                target.set(pageUrl);
            }
        }
        
        /**
         * Unsets the "pageUrl" element
         */
        public void unsetPageUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PAGEURL$0, 0);
            }
        }
        
        /**
         * Gets the "checkoutToLocal" element
         */
        public java.lang.String getCheckoutToLocal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHECKOUTTOLOCAL$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "checkoutToLocal" element
         */
        public org.apache.xmlbeans.XmlString xgetCheckoutToLocal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHECKOUTTOLOCAL$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "checkoutToLocal" element
         */
        public boolean isSetCheckoutToLocal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CHECKOUTTOLOCAL$2) != 0;
            }
        }
        
        /**
         * Sets the "checkoutToLocal" element
         */
        public void setCheckoutToLocal(java.lang.String checkoutToLocal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHECKOUTTOLOCAL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHECKOUTTOLOCAL$2);
                }
                target.setStringValue(checkoutToLocal);
            }
        }
        
        /**
         * Sets (as xml) the "checkoutToLocal" element
         */
        public void xsetCheckoutToLocal(org.apache.xmlbeans.XmlString checkoutToLocal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHECKOUTTOLOCAL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHECKOUTTOLOCAL$2);
                }
                target.set(checkoutToLocal);
            }
        }
        
        /**
         * Unsets the "checkoutToLocal" element
         */
        public void unsetCheckoutToLocal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CHECKOUTTOLOCAL$2, 0);
            }
        }
        
        /**
         * Gets the "lastmodified" element
         */
        public java.lang.String getLastmodified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTMODIFIED$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "lastmodified" element
         */
        public org.apache.xmlbeans.XmlString xgetLastmodified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTMODIFIED$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "lastmodified" element
         */
        public boolean isSetLastmodified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LASTMODIFIED$4) != 0;
            }
        }
        
        /**
         * Sets the "lastmodified" element
         */
        public void setLastmodified(java.lang.String lastmodified)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTMODIFIED$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTMODIFIED$4);
                }
                target.setStringValue(lastmodified);
            }
        }
        
        /**
         * Sets (as xml) the "lastmodified" element
         */
        public void xsetLastmodified(org.apache.xmlbeans.XmlString lastmodified)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTMODIFIED$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LASTMODIFIED$4);
                }
                target.set(lastmodified);
            }
        }
        
        /**
         * Unsets the "lastmodified" element
         */
        public void unsetLastmodified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LASTMODIFIED$4, 0);
            }
        }
    }
}
