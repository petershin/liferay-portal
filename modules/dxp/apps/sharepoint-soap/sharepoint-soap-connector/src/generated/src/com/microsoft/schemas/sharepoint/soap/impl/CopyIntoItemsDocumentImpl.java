/*
 * An XML document type.
 * Localname: CopyIntoItems
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one CopyIntoItems(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class CopyIntoItemsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument
{
    private static final long serialVersionUID = 1L;
    
    public CopyIntoItemsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COPYINTOITEMS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "CopyIntoItems");
    
    
    /**
     * Gets the "CopyIntoItems" element
     */
    public com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument.CopyIntoItems getCopyIntoItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument.CopyIntoItems target = null;
            target = (com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument.CopyIntoItems)get_store().find_element_user(COPYINTOITEMS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CopyIntoItems" element
     */
    public void setCopyIntoItems(com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument.CopyIntoItems copyIntoItems)
    {
        generatedSetterHelperImpl(copyIntoItems, COPYINTOITEMS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CopyIntoItems" element
     */
    public com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument.CopyIntoItems addNewCopyIntoItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument.CopyIntoItems target = null;
            target = (com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument.CopyIntoItems)get_store().add_element_user(COPYINTOITEMS$0);
            return target;
        }
    }
    /**
     * An XML CopyIntoItems(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class CopyIntoItemsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument.CopyIntoItems
    {
        private static final long serialVersionUID = 1L;
        
        public CopyIntoItemsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCEURL$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "SourceUrl");
        private static final javax.xml.namespace.QName DESTINATIONURLS$2 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "DestinationUrls");
        private static final javax.xml.namespace.QName FIELDS$4 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "Fields");
        private static final javax.xml.namespace.QName STREAM$6 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "Stream");
        
        
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
        
        /**
         * Gets the "Fields" element
         */
        public com.microsoft.schemas.sharepoint.soap.FieldInformationCollection getFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.FieldInformationCollection target = null;
                target = (com.microsoft.schemas.sharepoint.soap.FieldInformationCollection)get_store().find_element_user(FIELDS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Fields" element
         */
        public boolean isSetFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FIELDS$4) != 0;
            }
        }
        
        /**
         * Sets the "Fields" element
         */
        public void setFields(com.microsoft.schemas.sharepoint.soap.FieldInformationCollection fields)
        {
            generatedSetterHelperImpl(fields, FIELDS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Fields" element
         */
        public com.microsoft.schemas.sharepoint.soap.FieldInformationCollection addNewFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.FieldInformationCollection target = null;
                target = (com.microsoft.schemas.sharepoint.soap.FieldInformationCollection)get_store().add_element_user(FIELDS$4);
                return target;
            }
        }
        
        /**
         * Unsets the "Fields" element
         */
        public void unsetFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FIELDS$4, 0);
            }
        }
        
        /**
         * Gets the "Stream" element
         */
        public byte[] getStream()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREAM$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getByteArrayValue();
            }
        }
        
        /**
         * Gets (as xml) the "Stream" element
         */
        public org.apache.xmlbeans.XmlBase64Binary xgetStream()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBase64Binary target = null;
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(STREAM$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "Stream" element
         */
        public boolean isSetStream()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STREAM$6) != 0;
            }
        }
        
        /**
         * Sets the "Stream" element
         */
        public void setStream(byte[] stream)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREAM$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STREAM$6);
                }
                target.setByteArrayValue(stream);
            }
        }
        
        /**
         * Sets (as xml) the "Stream" element
         */
        public void xsetStream(org.apache.xmlbeans.XmlBase64Binary stream)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBase64Binary target = null;
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(STREAM$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(STREAM$6);
                }
                target.set(stream);
            }
        }
        
        /**
         * Unsets the "Stream" element
         */
        public void unsetStream()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STREAM$6, 0);
            }
        }
    }
}
