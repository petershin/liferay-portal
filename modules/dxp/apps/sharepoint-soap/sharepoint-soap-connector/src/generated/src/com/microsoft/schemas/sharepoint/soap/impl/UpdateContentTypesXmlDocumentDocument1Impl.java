/*
 * An XML document type.
 * Localname: UpdateContentTypesXmlDocument
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one UpdateContentTypesXmlDocument(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class UpdateContentTypesXmlDocumentDocument1Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1
{
    private static final long serialVersionUID = 1L;
    
    public UpdateContentTypesXmlDocumentDocument1Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATECONTENTTYPESXMLDOCUMENT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "UpdateContentTypesXmlDocument");
    
    
    /**
     * Gets the "UpdateContentTypesXmlDocument" element
     */
    public com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1.UpdateContentTypesXmlDocument getUpdateContentTypesXmlDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1.UpdateContentTypesXmlDocument target = null;
            target = (com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1.UpdateContentTypesXmlDocument)get_store().find_element_user(UPDATECONTENTTYPESXMLDOCUMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateContentTypesXmlDocument" element
     */
    public void setUpdateContentTypesXmlDocument(com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1.UpdateContentTypesXmlDocument updateContentTypesXmlDocument)
    {
        generatedSetterHelperImpl(updateContentTypesXmlDocument, UPDATECONTENTTYPESXMLDOCUMENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "UpdateContentTypesXmlDocument" element
     */
    public com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1.UpdateContentTypesXmlDocument addNewUpdateContentTypesXmlDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1.UpdateContentTypesXmlDocument target = null;
            target = (com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1.UpdateContentTypesXmlDocument)get_store().add_element_user(UPDATECONTENTTYPESXMLDOCUMENT$0);
            return target;
        }
    }
    /**
     * An XML UpdateContentTypesXmlDocument(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class UpdateContentTypesXmlDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1.UpdateContentTypesXmlDocument
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateContentTypesXmlDocumentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LISTNAME$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "listName");
        private static final javax.xml.namespace.QName NEWDOCUMENT$2 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "newDocument");
        
        
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
         * Gets the "newDocument" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1.UpdateContentTypesXmlDocument.NewDocument getNewDocument()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1.UpdateContentTypesXmlDocument.NewDocument target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1.UpdateContentTypesXmlDocument.NewDocument)get_store().find_element_user(NEWDOCUMENT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "newDocument" element
         */
        public boolean isSetNewDocument()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NEWDOCUMENT$2) != 0;
            }
        }
        
        /**
         * Sets the "newDocument" element
         */
        public void setNewDocument(com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1.UpdateContentTypesXmlDocument.NewDocument newDocument)
        {
            generatedSetterHelperImpl(newDocument, NEWDOCUMENT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "newDocument" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1.UpdateContentTypesXmlDocument.NewDocument addNewNewDocument()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1.UpdateContentTypesXmlDocument.NewDocument target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1.UpdateContentTypesXmlDocument.NewDocument)get_store().add_element_user(NEWDOCUMENT$2);
                return target;
            }
        }
        
        /**
         * Unsets the "newDocument" element
         */
        public void unsetNewDocument()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NEWDOCUMENT$2, 0);
            }
        }
        /**
         * An XML newDocument(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class NewDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1.UpdateContentTypesXmlDocument.NewDocument
        {
            private static final long serialVersionUID = 1L;
            
            public NewDocumentImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
