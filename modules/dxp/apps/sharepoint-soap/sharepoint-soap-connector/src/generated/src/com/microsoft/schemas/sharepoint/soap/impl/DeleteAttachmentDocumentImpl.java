/*
 * An XML document type.
 * Localname: DeleteAttachment
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.DeleteAttachmentDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one DeleteAttachment(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class DeleteAttachmentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.DeleteAttachmentDocument
{
    private static final long serialVersionUID = 1L;
    
    public DeleteAttachmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETEATTACHMENT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "DeleteAttachment");
    
    
    /**
     * Gets the "DeleteAttachment" element
     */
    public com.microsoft.schemas.sharepoint.soap.DeleteAttachmentDocument.DeleteAttachment getDeleteAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.DeleteAttachmentDocument.DeleteAttachment target = null;
            target = (com.microsoft.schemas.sharepoint.soap.DeleteAttachmentDocument.DeleteAttachment)get_store().find_element_user(DELETEATTACHMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeleteAttachment" element
     */
    public void setDeleteAttachment(com.microsoft.schemas.sharepoint.soap.DeleteAttachmentDocument.DeleteAttachment deleteAttachment)
    {
        generatedSetterHelperImpl(deleteAttachment, DELETEATTACHMENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DeleteAttachment" element
     */
    public com.microsoft.schemas.sharepoint.soap.DeleteAttachmentDocument.DeleteAttachment addNewDeleteAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.DeleteAttachmentDocument.DeleteAttachment target = null;
            target = (com.microsoft.schemas.sharepoint.soap.DeleteAttachmentDocument.DeleteAttachment)get_store().add_element_user(DELETEATTACHMENT$0);
            return target;
        }
    }
    /**
     * An XML DeleteAttachment(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class DeleteAttachmentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.DeleteAttachmentDocument.DeleteAttachment
    {
        private static final long serialVersionUID = 1L;
        
        public DeleteAttachmentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LISTNAME$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "listName");
        private static final javax.xml.namespace.QName LISTITEMID$2 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "listItemID");
        private static final javax.xml.namespace.QName URL$4 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "url");
        
        
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
        
        /**
         * Gets the "url" element
         */
        public java.lang.String getUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "url" element
         */
        public org.apache.xmlbeans.XmlString xgetUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "url" element
         */
        public boolean isSetUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(URL$4) != 0;
            }
        }
        
        /**
         * Sets the "url" element
         */
        public void setUrl(java.lang.String url)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URL$4);
                }
                target.setStringValue(url);
            }
        }
        
        /**
         * Sets (as xml) the "url" element
         */
        public void xsetUrl(org.apache.xmlbeans.XmlString url)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(URL$4);
                }
                target.set(url);
            }
        }
        
        /**
         * Unsets the "url" element
         */
        public void unsetUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(URL$4, 0);
            }
        }
    }
}
