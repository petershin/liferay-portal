/*
 * An XML document type.
 * Localname: AddAttachment
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.AddAttachmentDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one AddAttachment(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class AddAttachmentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.AddAttachmentDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddAttachmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDATTACHMENT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "AddAttachment");
    
    
    /**
     * Gets the "AddAttachment" element
     */
    public com.microsoft.schemas.sharepoint.soap.AddAttachmentDocument.AddAttachment getAddAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.AddAttachmentDocument.AddAttachment target = null;
            target = (com.microsoft.schemas.sharepoint.soap.AddAttachmentDocument.AddAttachment)get_store().find_element_user(ADDATTACHMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AddAttachment" element
     */
    public void setAddAttachment(com.microsoft.schemas.sharepoint.soap.AddAttachmentDocument.AddAttachment addAttachment)
    {
        generatedSetterHelperImpl(addAttachment, ADDATTACHMENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AddAttachment" element
     */
    public com.microsoft.schemas.sharepoint.soap.AddAttachmentDocument.AddAttachment addNewAddAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.AddAttachmentDocument.AddAttachment target = null;
            target = (com.microsoft.schemas.sharepoint.soap.AddAttachmentDocument.AddAttachment)get_store().add_element_user(ADDATTACHMENT$0);
            return target;
        }
    }
    /**
     * An XML AddAttachment(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class AddAttachmentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.AddAttachmentDocument.AddAttachment
    {
        private static final long serialVersionUID = 1L;
        
        public AddAttachmentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LISTNAME$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "listName");
        private static final javax.xml.namespace.QName LISTITEMID$2 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "listItemID");
        private static final javax.xml.namespace.QName FILENAME$4 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "fileName");
        private static final javax.xml.namespace.QName ATTACHMENT$6 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "attachment");
        
        
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
         * Gets the "fileName" element
         */
        public java.lang.String getFileName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILENAME$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fileName" element
         */
        public org.apache.xmlbeans.XmlString xgetFileName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILENAME$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "fileName" element
         */
        public boolean isSetFileName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FILENAME$4) != 0;
            }
        }
        
        /**
         * Sets the "fileName" element
         */
        public void setFileName(java.lang.String fileName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILENAME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILENAME$4);
                }
                target.setStringValue(fileName);
            }
        }
        
        /**
         * Sets (as xml) the "fileName" element
         */
        public void xsetFileName(org.apache.xmlbeans.XmlString fileName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILENAME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FILENAME$4);
                }
                target.set(fileName);
            }
        }
        
        /**
         * Unsets the "fileName" element
         */
        public void unsetFileName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FILENAME$4, 0);
            }
        }
        
        /**
         * Gets the "attachment" element
         */
        public byte[] getAttachment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTACHMENT$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getByteArrayValue();
            }
        }
        
        /**
         * Gets (as xml) the "attachment" element
         */
        public org.apache.xmlbeans.XmlBase64Binary xgetAttachment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBase64Binary target = null;
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(ATTACHMENT$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "attachment" element
         */
        public boolean isSetAttachment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ATTACHMENT$6) != 0;
            }
        }
        
        /**
         * Sets the "attachment" element
         */
        public void setAttachment(byte[] attachment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTACHMENT$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTACHMENT$6);
                }
                target.setByteArrayValue(attachment);
            }
        }
        
        /**
         * Sets (as xml) the "attachment" element
         */
        public void xsetAttachment(org.apache.xmlbeans.XmlBase64Binary attachment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBase64Binary target = null;
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(ATTACHMENT$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(ATTACHMENT$6);
                }
                target.set(attachment);
            }
        }
        
        /**
         * Unsets the "attachment" element
         */
        public void unsetAttachment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ATTACHMENT$6, 0);
            }
        }
    }
}
