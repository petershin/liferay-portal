/*
 * An XML document type.
 * Localname: GetItem
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.GetItemDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one GetItem(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class GetItemDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetItemDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetItemDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETITEM$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetItem");
    
    
    /**
     * Gets the "GetItem" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetItemDocument.GetItem getGetItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetItemDocument.GetItem target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetItemDocument.GetItem)get_store().find_element_user(GETITEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetItem" element
     */
    public void setGetItem(com.microsoft.schemas.sharepoint.soap.GetItemDocument.GetItem getItem)
    {
        generatedSetterHelperImpl(getItem, GETITEM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetItem" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetItemDocument.GetItem addNewGetItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetItemDocument.GetItem target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetItemDocument.GetItem)get_store().add_element_user(GETITEM$0);
            return target;
        }
    }
    /**
     * An XML GetItem(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class GetItemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetItemDocument.GetItem
    {
        private static final long serialVersionUID = 1L;
        
        public GetItemImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName URL$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "Url");
        
        
        /**
         * Gets the "Url" element
         */
        public java.lang.String getUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Url" element
         */
        public org.apache.xmlbeans.XmlString xgetUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "Url" element
         */
        public boolean isSetUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(URL$0) != 0;
            }
        }
        
        /**
         * Sets the "Url" element
         */
        public void setUrl(java.lang.String url)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URL$0);
                }
                target.setStringValue(url);
            }
        }
        
        /**
         * Sets (as xml) the "Url" element
         */
        public void xsetUrl(org.apache.xmlbeans.XmlString url)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(URL$0);
                }
                target.set(url);
            }
        }
        
        /**
         * Unsets the "Url" element
         */
        public void unsetUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(URL$0, 0);
            }
        }
    }
}
