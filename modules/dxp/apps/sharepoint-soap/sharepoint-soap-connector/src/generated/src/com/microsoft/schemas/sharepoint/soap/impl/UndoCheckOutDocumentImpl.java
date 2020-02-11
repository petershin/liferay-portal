/*
 * An XML document type.
 * Localname: UndoCheckOut
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.UndoCheckOutDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one UndoCheckOut(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class UndoCheckOutDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UndoCheckOutDocument
{
    private static final long serialVersionUID = 1L;
    
    public UndoCheckOutDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNDOCHECKOUT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "UndoCheckOut");
    
    
    /**
     * Gets the "UndoCheckOut" element
     */
    public com.microsoft.schemas.sharepoint.soap.UndoCheckOutDocument.UndoCheckOut getUndoCheckOut()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.UndoCheckOutDocument.UndoCheckOut target = null;
            target = (com.microsoft.schemas.sharepoint.soap.UndoCheckOutDocument.UndoCheckOut)get_store().find_element_user(UNDOCHECKOUT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UndoCheckOut" element
     */
    public void setUndoCheckOut(com.microsoft.schemas.sharepoint.soap.UndoCheckOutDocument.UndoCheckOut undoCheckOut)
    {
        generatedSetterHelperImpl(undoCheckOut, UNDOCHECKOUT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "UndoCheckOut" element
     */
    public com.microsoft.schemas.sharepoint.soap.UndoCheckOutDocument.UndoCheckOut addNewUndoCheckOut()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.UndoCheckOutDocument.UndoCheckOut target = null;
            target = (com.microsoft.schemas.sharepoint.soap.UndoCheckOutDocument.UndoCheckOut)get_store().add_element_user(UNDOCHECKOUT$0);
            return target;
        }
    }
    /**
     * An XML UndoCheckOut(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class UndoCheckOutImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UndoCheckOutDocument.UndoCheckOut
    {
        private static final long serialVersionUID = 1L;
        
        public UndoCheckOutImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PAGEURL$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "pageUrl");
        
        
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
    }
}
