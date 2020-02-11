/*
 * An XML document type.
 * Localname: GetListContentType
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.GetListContentTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one GetListContentType(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class GetListContentTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListContentTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetListContentTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLISTCONTENTTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListContentType");
    
    
    /**
     * Gets the "GetListContentType" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetListContentTypeDocument.GetListContentType getGetListContentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetListContentTypeDocument.GetListContentType target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetListContentTypeDocument.GetListContentType)get_store().find_element_user(GETLISTCONTENTTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetListContentType" element
     */
    public void setGetListContentType(com.microsoft.schemas.sharepoint.soap.GetListContentTypeDocument.GetListContentType getListContentType)
    {
        generatedSetterHelperImpl(getListContentType, GETLISTCONTENTTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetListContentType" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetListContentTypeDocument.GetListContentType addNewGetListContentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetListContentTypeDocument.GetListContentType target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetListContentTypeDocument.GetListContentType)get_store().add_element_user(GETLISTCONTENTTYPE$0);
            return target;
        }
    }
    /**
     * An XML GetListContentType(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class GetListContentTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListContentTypeDocument.GetListContentType
    {
        private static final long serialVersionUID = 1L;
        
        public GetListContentTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
