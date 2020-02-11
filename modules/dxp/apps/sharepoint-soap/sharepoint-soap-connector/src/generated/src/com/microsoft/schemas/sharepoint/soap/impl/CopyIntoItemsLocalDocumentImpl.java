/*
 * An XML document type.
 * Localname: CopyIntoItemsLocal
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.CopyIntoItemsLocalDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one CopyIntoItemsLocal(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class CopyIntoItemsLocalDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.CopyIntoItemsLocalDocument
{
    private static final long serialVersionUID = 1L;
    
    public CopyIntoItemsLocalDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COPYINTOITEMSLOCAL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "CopyIntoItemsLocal");
    
    
    /**
     * Gets the "CopyIntoItemsLocal" element
     */
    public com.microsoft.schemas.sharepoint.soap.CopyIntoItemsLocalDocument.CopyIntoItemsLocal getCopyIntoItemsLocal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.CopyIntoItemsLocalDocument.CopyIntoItemsLocal target = null;
            target = (com.microsoft.schemas.sharepoint.soap.CopyIntoItemsLocalDocument.CopyIntoItemsLocal)get_store().find_element_user(COPYINTOITEMSLOCAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CopyIntoItemsLocal" element
     */
    public void setCopyIntoItemsLocal(com.microsoft.schemas.sharepoint.soap.CopyIntoItemsLocalDocument.CopyIntoItemsLocal copyIntoItemsLocal)
    {
        generatedSetterHelperImpl(copyIntoItemsLocal, COPYINTOITEMSLOCAL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CopyIntoItemsLocal" element
     */
    public com.microsoft.schemas.sharepoint.soap.CopyIntoItemsLocalDocument.CopyIntoItemsLocal addNewCopyIntoItemsLocal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.CopyIntoItemsLocalDocument.CopyIntoItemsLocal target = null;
            target = (com.microsoft.schemas.sharepoint.soap.CopyIntoItemsLocalDocument.CopyIntoItemsLocal)get_store().add_element_user(COPYINTOITEMSLOCAL$0);
            return target;
        }
    }
    /**
     * An XML CopyIntoItemsLocal(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class CopyIntoItemsLocalImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.CopyIntoItemsLocalDocument.CopyIntoItemsLocal
    {
        private static final long serialVersionUID = 1L;
        
        public CopyIntoItemsLocalImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCEURL$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "SourceUrl");
        private static final javax.xml.namespace.QName DESTINATIONURLS$2 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "DestinationUrls");
        
        
        /**
         * Gets the "SourceUrl" element
         */
        public java.lang.String getSourceUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEURL$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SourceUrl" element
         */
        public org.apache.xmlbeans.XmlString xgetSourceUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEURL$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "SourceUrl" element
         */
        public boolean isSetSourceUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOURCEURL$0) != 0;
            }
        }
        
        /**
         * Sets the "SourceUrl" element
         */
        public void setSourceUrl(java.lang.String sourceUrl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEURL$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEURL$0);
                }
                target.setStringValue(sourceUrl);
            }
        }
        
        /**
         * Sets (as xml) the "SourceUrl" element
         */
        public void xsetSourceUrl(org.apache.xmlbeans.XmlString sourceUrl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEURL$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCEURL$0);
                }
                target.set(sourceUrl);
            }
        }
        
        /**
         * Unsets the "SourceUrl" element
         */
        public void unsetSourceUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOURCEURL$0, 0);
            }
        }
        
        /**
         * Gets the "DestinationUrls" element
         */
        public com.microsoft.schemas.sharepoint.soap.DestinationUrlCollection getDestinationUrls()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.DestinationUrlCollection target = null;
                target = (com.microsoft.schemas.sharepoint.soap.DestinationUrlCollection)get_store().find_element_user(DESTINATIONURLS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "DestinationUrls" element
         */
        public boolean isSetDestinationUrls()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESTINATIONURLS$2) != 0;
            }
        }
        
        /**
         * Sets the "DestinationUrls" element
         */
        public void setDestinationUrls(com.microsoft.schemas.sharepoint.soap.DestinationUrlCollection destinationUrls)
        {
            generatedSetterHelperImpl(destinationUrls, DESTINATIONURLS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "DestinationUrls" element
         */
        public com.microsoft.schemas.sharepoint.soap.DestinationUrlCollection addNewDestinationUrls()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.DestinationUrlCollection target = null;
                target = (com.microsoft.schemas.sharepoint.soap.DestinationUrlCollection)get_store().add_element_user(DESTINATIONURLS$2);
                return target;
            }
        }
        
        /**
         * Unsets the "DestinationUrls" element
         */
        public void unsetDestinationUrls()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESTINATIONURLS$2, 0);
            }
        }
    }
}
