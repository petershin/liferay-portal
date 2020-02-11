/*
 * An XML document type.
 * Localname: AddDiscussionBoardItem
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one AddDiscussionBoardItem(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class AddDiscussionBoardItemDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddDiscussionBoardItemDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDDISCUSSIONBOARDITEM$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "AddDiscussionBoardItem");
    
    
    /**
     * Gets the "AddDiscussionBoardItem" element
     */
    public com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemDocument.AddDiscussionBoardItem getAddDiscussionBoardItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemDocument.AddDiscussionBoardItem target = null;
            target = (com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemDocument.AddDiscussionBoardItem)get_store().find_element_user(ADDDISCUSSIONBOARDITEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AddDiscussionBoardItem" element
     */
    public void setAddDiscussionBoardItem(com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemDocument.AddDiscussionBoardItem addDiscussionBoardItem)
    {
        generatedSetterHelperImpl(addDiscussionBoardItem, ADDDISCUSSIONBOARDITEM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AddDiscussionBoardItem" element
     */
    public com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemDocument.AddDiscussionBoardItem addNewAddDiscussionBoardItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemDocument.AddDiscussionBoardItem target = null;
            target = (com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemDocument.AddDiscussionBoardItem)get_store().add_element_user(ADDDISCUSSIONBOARDITEM$0);
            return target;
        }
    }
    /**
     * An XML AddDiscussionBoardItem(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class AddDiscussionBoardItemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemDocument.AddDiscussionBoardItem
    {
        private static final long serialVersionUID = 1L;
        
        public AddDiscussionBoardItemImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LISTNAME$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "listName");
        private static final javax.xml.namespace.QName MESSAGE$2 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "message");
        
        
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
         * Gets the "message" element
         */
        public byte[] getMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getByteArrayValue();
            }
        }
        
        /**
         * Gets (as xml) the "message" element
         */
        public org.apache.xmlbeans.XmlBase64Binary xgetMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBase64Binary target = null;
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(MESSAGE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "message" element
         */
        public boolean isSetMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MESSAGE$2) != 0;
            }
        }
        
        /**
         * Sets the "message" element
         */
        public void setMessage(byte[] message)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGE$2);
                }
                target.setByteArrayValue(message);
            }
        }
        
        /**
         * Sets (as xml) the "message" element
         */
        public void xsetMessage(org.apache.xmlbeans.XmlBase64Binary message)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBase64Binary target = null;
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(MESSAGE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(MESSAGE$2);
                }
                target.set(message);
            }
        }
        
        /**
         * Unsets the "message" element
         */
        public void unsetMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MESSAGE$2, 0);
            }
        }
    }
}
