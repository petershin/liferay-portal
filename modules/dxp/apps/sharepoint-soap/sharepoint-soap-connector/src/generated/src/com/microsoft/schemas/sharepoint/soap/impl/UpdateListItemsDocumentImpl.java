/*
 * An XML document type.
 * Localname: UpdateListItems
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.UpdateListItemsDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one UpdateListItems(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class UpdateListItemsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateListItemsDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateListItemsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATELISTITEMS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "UpdateListItems");
    
    
    /**
     * Gets the "UpdateListItems" element
     */
    public com.microsoft.schemas.sharepoint.soap.UpdateListItemsDocument.UpdateListItems getUpdateListItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.UpdateListItemsDocument.UpdateListItems target = null;
            target = (com.microsoft.schemas.sharepoint.soap.UpdateListItemsDocument.UpdateListItems)get_store().find_element_user(UPDATELISTITEMS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateListItems" element
     */
    public void setUpdateListItems(com.microsoft.schemas.sharepoint.soap.UpdateListItemsDocument.UpdateListItems updateListItems)
    {
        generatedSetterHelperImpl(updateListItems, UPDATELISTITEMS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "UpdateListItems" element
     */
    public com.microsoft.schemas.sharepoint.soap.UpdateListItemsDocument.UpdateListItems addNewUpdateListItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.UpdateListItemsDocument.UpdateListItems target = null;
            target = (com.microsoft.schemas.sharepoint.soap.UpdateListItemsDocument.UpdateListItems)get_store().add_element_user(UPDATELISTITEMS$0);
            return target;
        }
    }
    /**
     * An XML UpdateListItems(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class UpdateListItemsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateListItemsDocument.UpdateListItems
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateListItemsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LISTNAME$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "listName");
        private static final javax.xml.namespace.QName UPDATES$2 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "updates");
        
        
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
         * Gets the "updates" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateListItemsDocument.UpdateListItems.Updates getUpdates()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateListItemsDocument.UpdateListItems.Updates target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateListItemsDocument.UpdateListItems.Updates)get_store().find_element_user(UPDATES$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "updates" element
         */
        public void setUpdates(com.microsoft.schemas.sharepoint.soap.UpdateListItemsDocument.UpdateListItems.Updates updates)
        {
            generatedSetterHelperImpl(updates, UPDATES$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "updates" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateListItemsDocument.UpdateListItems.Updates addNewUpdates()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateListItemsDocument.UpdateListItems.Updates target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateListItemsDocument.UpdateListItems.Updates)get_store().add_element_user(UPDATES$2);
                return target;
            }
        }
        /**
         * An XML updates(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class UpdatesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateListItemsDocument.UpdateListItems.Updates
        {
            private static final long serialVersionUID = 1L;
            
            public UpdatesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
