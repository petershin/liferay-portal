/*
 * An XML document type.
 * Localname: ApplyContentTypeToList
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one ApplyContentTypeToList(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class ApplyContentTypeToListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListDocument
{
    private static final long serialVersionUID = 1L;
    
    public ApplyContentTypeToListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPLYCONTENTTYPETOLIST$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "ApplyContentTypeToList");
    
    
    /**
     * Gets the "ApplyContentTypeToList" element
     */
    public com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListDocument.ApplyContentTypeToList getApplyContentTypeToList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListDocument.ApplyContentTypeToList target = null;
            target = (com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListDocument.ApplyContentTypeToList)get_store().find_element_user(APPLYCONTENTTYPETOLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ApplyContentTypeToList" element
     */
    public void setApplyContentTypeToList(com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListDocument.ApplyContentTypeToList applyContentTypeToList)
    {
        generatedSetterHelperImpl(applyContentTypeToList, APPLYCONTENTTYPETOLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ApplyContentTypeToList" element
     */
    public com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListDocument.ApplyContentTypeToList addNewApplyContentTypeToList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListDocument.ApplyContentTypeToList target = null;
            target = (com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListDocument.ApplyContentTypeToList)get_store().add_element_user(APPLYCONTENTTYPETOLIST$0);
            return target;
        }
    }
    /**
     * An XML ApplyContentTypeToList(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class ApplyContentTypeToListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListDocument.ApplyContentTypeToList
    {
        private static final long serialVersionUID = 1L;
        
        public ApplyContentTypeToListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WEBURL$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "webUrl");
        private static final javax.xml.namespace.QName CONTENTTYPEID$2 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "contentTypeId");
        private static final javax.xml.namespace.QName LISTNAME$4 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "listName");
        
        
        /**
         * Gets the "webUrl" element
         */
        public java.lang.String getWebUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEBURL$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "webUrl" element
         */
        public org.apache.xmlbeans.XmlString xgetWebUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEBURL$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "webUrl" element
         */
        public boolean isSetWebUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WEBURL$0) != 0;
            }
        }
        
        /**
         * Sets the "webUrl" element
         */
        public void setWebUrl(java.lang.String webUrl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEBURL$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WEBURL$0);
                }
                target.setStringValue(webUrl);
            }
        }
        
        /**
         * Sets (as xml) the "webUrl" element
         */
        public void xsetWebUrl(org.apache.xmlbeans.XmlString webUrl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEBURL$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WEBURL$0);
                }
                target.set(webUrl);
            }
        }
        
        /**
         * Unsets the "webUrl" element
         */
        public void unsetWebUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WEBURL$0, 0);
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
         * Gets the "listName" element
         */
        public java.lang.String getListName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTNAME$4, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LISTNAME$4, 0);
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
                return get_store().count_elements(LISTNAME$4) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTNAME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LISTNAME$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LISTNAME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LISTNAME$4);
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
                get_store().remove_element(LISTNAME$4, 0);
            }
        }
    }
}
