/*
 * An XML document type.
 * Localname: GetAttachmentCollection
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one GetAttachmentCollection(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class GetAttachmentCollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetAttachmentCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETATTACHMENTCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetAttachmentCollection");
    
    
    /**
     * Gets the "GetAttachmentCollection" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionDocument.GetAttachmentCollection getGetAttachmentCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionDocument.GetAttachmentCollection target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionDocument.GetAttachmentCollection)get_store().find_element_user(GETATTACHMENTCOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetAttachmentCollection" element
     */
    public void setGetAttachmentCollection(com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionDocument.GetAttachmentCollection getAttachmentCollection)
    {
        generatedSetterHelperImpl(getAttachmentCollection, GETATTACHMENTCOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetAttachmentCollection" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionDocument.GetAttachmentCollection addNewGetAttachmentCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionDocument.GetAttachmentCollection target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionDocument.GetAttachmentCollection)get_store().add_element_user(GETATTACHMENTCOLLECTION$0);
            return target;
        }
    }
    /**
     * An XML GetAttachmentCollection(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class GetAttachmentCollectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionDocument.GetAttachmentCollection
    {
        private static final long serialVersionUID = 1L;
        
        public GetAttachmentCollectionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LISTNAME$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "listName");
        private static final javax.xml.namespace.QName LISTITEMID$2 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "listItemID");
        
        
        /**
         * Gets the "listName" element
         */
        public java.lang.String getListName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "listName" element
         */
        public org.apache.xmlbeans.XmlString xgetListName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LISTNAME$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "listName" element
         */
        public boolean isSetListName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LISTNAME$0) != 0;
            }
        }
        
        /**
         * Sets the "listName" element
         */
        public void setListName(java.lang.String listName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LISTNAME$0);
                }
                target.setStringValue(listName);
            }
        }
        
        /**
         * Sets (as xml) the "listName" element
         */
        public void xsetListName(org.apache.xmlbeans.XmlString listName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LISTNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LISTNAME$0);
                }
                target.set(listName);
            }
        }
        
        /**
         * Unsets the "listName" element
         */
        public void unsetListName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LISTNAME$0, 0);
            }
        }
        
        /**
         * Gets the "listItemID" element
         */
        public java.lang.String getListItemID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTITEMID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "listItemID" element
         */
        public org.apache.xmlbeans.XmlString xgetListItemID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LISTITEMID$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "listItemID" element
         */
        public boolean isSetListItemID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LISTITEMID$2) != 0;
            }
        }
        
        /**
         * Sets the "listItemID" element
         */
        public void setListItemID(java.lang.String listItemID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTITEMID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LISTITEMID$2);
                }
                target.setStringValue(listItemID);
            }
        }
        
        /**
         * Sets (as xml) the "listItemID" element
         */
        public void xsetListItemID(org.apache.xmlbeans.XmlString listItemID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LISTITEMID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LISTITEMID$2);
                }
                target.set(listItemID);
            }
        }
        
        /**
         * Unsets the "listItemID" element
         */
        public void unsetListItemID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LISTITEMID$2, 0);
            }
        }
    }
}
