/*
 * An XML document type.
 * Localname: AddList
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.AddListDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one AddList(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class AddListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.AddListDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDLIST$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "AddList");
    
    
    /**
     * Gets the "AddList" element
     */
    public com.microsoft.schemas.sharepoint.soap.AddListDocument.AddList getAddList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.AddListDocument.AddList target = null;
            target = (com.microsoft.schemas.sharepoint.soap.AddListDocument.AddList)get_store().find_element_user(ADDLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AddList" element
     */
    public void setAddList(com.microsoft.schemas.sharepoint.soap.AddListDocument.AddList addList)
    {
        generatedSetterHelperImpl(addList, ADDLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AddList" element
     */
    public com.microsoft.schemas.sharepoint.soap.AddListDocument.AddList addNewAddList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.AddListDocument.AddList target = null;
            target = (com.microsoft.schemas.sharepoint.soap.AddListDocument.AddList)get_store().add_element_user(ADDLIST$0);
            return target;
        }
    }
    /**
     * An XML AddList(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class AddListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.AddListDocument.AddList
    {
        private static final long serialVersionUID = 1L;
        
        public AddListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LISTNAME$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "listName");
        private static final javax.xml.namespace.QName DESCRIPTION$2 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "description");
        private static final javax.xml.namespace.QName TEMPLATEID$4 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "templateID");
        
        
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
         * Gets the "description" element
         */
        public java.lang.String getDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "description" element
         */
        public org.apache.xmlbeans.XmlString xgetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "description" element
         */
        public boolean isSetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESCRIPTION$2) != 0;
            }
        }
        
        /**
         * Sets the "description" element
         */
        public void setDescription(java.lang.String description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$2);
                }
                target.setStringValue(description);
            }
        }
        
        /**
         * Sets (as xml) the "description" element
         */
        public void xsetDescription(org.apache.xmlbeans.XmlString description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$2);
                }
                target.set(description);
            }
        }
        
        /**
         * Unsets the "description" element
         */
        public void unsetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESCRIPTION$2, 0);
            }
        }
        
        /**
         * Gets the "templateID" element
         */
        public int getTemplateID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPLATEID$4, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "templateID" element
         */
        public org.apache.xmlbeans.XmlInt xgetTemplateID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TEMPLATEID$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "templateID" element
         */
        public void setTemplateID(int templateID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPLATEID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEMPLATEID$4);
                }
                target.setIntValue(templateID);
            }
        }
        
        /**
         * Sets (as xml) the "templateID" element
         */
        public void xsetTemplateID(org.apache.xmlbeans.XmlInt templateID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TEMPLATEID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TEMPLATEID$4);
                }
                target.set(templateID);
            }
        }
    }
}
