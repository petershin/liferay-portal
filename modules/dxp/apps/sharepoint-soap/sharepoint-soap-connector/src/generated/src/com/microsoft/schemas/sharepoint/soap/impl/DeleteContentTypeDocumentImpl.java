/*
 * An XML document type.
 * Localname: DeleteContentType
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.DeleteContentTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one DeleteContentType(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class DeleteContentTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.DeleteContentTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public DeleteContentTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETECONTENTTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "DeleteContentType");
    
    
    /**
     * Gets the "DeleteContentType" element
     */
    public com.microsoft.schemas.sharepoint.soap.DeleteContentTypeDocument.DeleteContentType getDeleteContentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.DeleteContentTypeDocument.DeleteContentType target = null;
            target = (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeDocument.DeleteContentType)get_store().find_element_user(DELETECONTENTTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeleteContentType" element
     */
    public void setDeleteContentType(com.microsoft.schemas.sharepoint.soap.DeleteContentTypeDocument.DeleteContentType deleteContentType)
    {
        generatedSetterHelperImpl(deleteContentType, DELETECONTENTTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DeleteContentType" element
     */
    public com.microsoft.schemas.sharepoint.soap.DeleteContentTypeDocument.DeleteContentType addNewDeleteContentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.DeleteContentTypeDocument.DeleteContentType target = null;
            target = (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeDocument.DeleteContentType)get_store().add_element_user(DELETECONTENTTYPE$0);
            return target;
        }
    }
    /**
     * An XML DeleteContentType(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class DeleteContentTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.DeleteContentTypeDocument.DeleteContentType
    {
        private static final long serialVersionUID = 1L;
        
        public DeleteContentTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LISTNAME$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "listName");
        private static final javax.xml.namespace.QName CONTENTTYPEID$2 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "contentTypeId");
        
        
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
    }
}
