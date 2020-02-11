/*
 * An XML document type.
 * Localname: UpdateContentTypeXmlDocument
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentDocument1
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one UpdateContentTypeXmlDocument(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class UpdateContentTypeXmlDocumentDocument1Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentDocument1
{
    private static final long serialVersionUID = 1L;
    
    public UpdateContentTypeXmlDocumentDocument1Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATECONTENTTYPEXMLDOCUMENT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "UpdateContentTypeXmlDocument");
    
    
    /**
     * Gets the "UpdateContentTypeXmlDocument" element
     */
    public com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentDocument1.UpdateContentTypeXmlDocument getUpdateContentTypeXmlDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentDocument1.UpdateContentTypeXmlDocument target = null;
            target = (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentDocument1.UpdateContentTypeXmlDocument)get_store().find_element_user(UPDATECONTENTTYPEXMLDOCUMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateContentTypeXmlDocument" element
     */
    public void setUpdateContentTypeXmlDocument(com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentDocument1.UpdateContentTypeXmlDocument updateContentTypeXmlDocument)
    {
        generatedSetterHelperImpl(updateContentTypeXmlDocument, UPDATECONTENTTYPEXMLDOCUMENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "UpdateContentTypeXmlDocument" element
     */
    public com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentDocument1.UpdateContentTypeXmlDocument addNewUpdateContentTypeXmlDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentDocument1.UpdateContentTypeXmlDocument target = null;
            target = (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentDocument1.UpdateContentTypeXmlDocument)get_store().add_element_user(UPDATECONTENTTYPEXMLDOCUMENT$0);
            return target;
        }
    }
    /**
     * An XML UpdateContentTypeXmlDocument(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class UpdateContentTypeXmlDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentDocument1.UpdateContentTypeXmlDocument
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateContentTypeXmlDocumentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LISTNAME$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "listName");
        private static final javax.xml.namespace.QName CONTENTTYPEID$2 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "contentTypeId");
        private static final javax.xml.namespace.QName NEWDOCUMENT$4 = 
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
         * Gets the "contentTypeId" element
         */
        public java.lang.String getContentTypeId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTENTTYPEID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "contentTypeId" element
         */
        public org.apache.xmlbeans.XmlString xgetContentTypeId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTENTTYPEID$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "contentTypeId" element
         */
        public boolean isSetContentTypeId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTENTTYPEID$2) != 0;
            }
        }
        
        /**
         * Sets the "contentTypeId" element
         */
        public void setContentTypeId(java.lang.String contentTypeId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTENTTYPEID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTENTTYPEID$2);
                }
                target.setStringValue(contentTypeId);
            }
        }
        
        /**
         * Sets (as xml) the "contentTypeId" element
         */
        public void xsetContentTypeId(org.apache.xmlbeans.XmlString contentTypeId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTENTTYPEID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTENTTYPEID$2);
                }
                target.set(contentTypeId);
            }
        }
        
        /**
         * Unsets the "contentTypeId" element
         */
        public void unsetContentTypeId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTENTTYPEID$2, 0);
            }
        }
        
        /**
         * Gets the "newDocument" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentDocument1.UpdateContentTypeXmlDocument.NewDocument getNewDocument()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentDocument1.UpdateContentTypeXmlDocument.NewDocument target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentDocument1.UpdateContentTypeXmlDocument.NewDocument)get_store().find_element_user(NEWDOCUMENT$4, 0);
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
                return get_store().count_elements(NEWDOCUMENT$4) != 0;
            }
        }
        
        /**
         * Sets the "newDocument" element
         */
        public void setNewDocument(com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentDocument1.UpdateContentTypeXmlDocument.NewDocument newDocument)
        {
            generatedSetterHelperImpl(newDocument, NEWDOCUMENT$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "newDocument" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentDocument1.UpdateContentTypeXmlDocument.NewDocument addNewNewDocument()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentDocument1.UpdateContentTypeXmlDocument.NewDocument target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentDocument1.UpdateContentTypeXmlDocument.NewDocument)get_store().add_element_user(NEWDOCUMENT$4);
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
                get_store().remove_element(NEWDOCUMENT$4, 0);
            }
        }
        /**
         * An XML newDocument(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class NewDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentDocument1.UpdateContentTypeXmlDocument.NewDocument
        {
            private static final long serialVersionUID = 1L;
            
            public NewDocumentImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
