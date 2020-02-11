/*
 * An XML document type.
 * Localname: GetListContentTypesAndProperties
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one GetListContentTypesAndProperties(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class GetListContentTypesAndPropertiesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetListContentTypesAndPropertiesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLISTCONTENTTYPESANDPROPERTIES$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListContentTypesAndProperties");
    
    
    /**
     * Gets the "GetListContentTypesAndProperties" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument.GetListContentTypesAndProperties getGetListContentTypesAndProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument.GetListContentTypesAndProperties target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument.GetListContentTypesAndProperties)get_store().find_element_user(GETLISTCONTENTTYPESANDPROPERTIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetListContentTypesAndProperties" element
     */
    public void setGetListContentTypesAndProperties(com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument.GetListContentTypesAndProperties getListContentTypesAndProperties)
    {
        generatedSetterHelperImpl(getListContentTypesAndProperties, GETLISTCONTENTTYPESANDPROPERTIES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetListContentTypesAndProperties" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument.GetListContentTypesAndProperties addNewGetListContentTypesAndProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument.GetListContentTypesAndProperties target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument.GetListContentTypesAndProperties)get_store().add_element_user(GETLISTCONTENTTYPESANDPROPERTIES$0);
            return target;
        }
    }
    /**
     * An XML GetListContentTypesAndProperties(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class GetListContentTypesAndPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument.GetListContentTypesAndProperties
    {
        private static final long serialVersionUID = 1L;
        
        public GetListContentTypesAndPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LISTNAME$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "listName");
        private static final javax.xml.namespace.QName CONTENTTYPEID$2 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "contentTypeId");
        private static final javax.xml.namespace.QName PROPERTYPREFIX$4 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "propertyPrefix");
        private static final javax.xml.namespace.QName INCLUDEWEBPROPERTIES$6 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "includeWebProperties");
        
        
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
         * Gets the "propertyPrefix" element
         */
        public java.lang.String getPropertyPrefix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYPREFIX$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "propertyPrefix" element
         */
        public org.apache.xmlbeans.XmlString xgetPropertyPrefix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYPREFIX$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "propertyPrefix" element
         */
        public boolean isSetPropertyPrefix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROPERTYPREFIX$4) != 0;
            }
        }
        
        /**
         * Sets the "propertyPrefix" element
         */
        public void setPropertyPrefix(java.lang.String propertyPrefix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYPREFIX$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTYPREFIX$4);
                }
                target.setStringValue(propertyPrefix);
            }
        }
        
        /**
         * Sets (as xml) the "propertyPrefix" element
         */
        public void xsetPropertyPrefix(org.apache.xmlbeans.XmlString propertyPrefix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTYPREFIX$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTYPREFIX$4);
                }
                target.set(propertyPrefix);
            }
        }
        
        /**
         * Unsets the "propertyPrefix" element
         */
        public void unsetPropertyPrefix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROPERTYPREFIX$4, 0);
            }
        }
        
        /**
         * Gets the "includeWebProperties" element
         */
        public boolean getIncludeWebProperties()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCLUDEWEBPROPERTIES$6, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "includeWebProperties" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetIncludeWebProperties()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INCLUDEWEBPROPERTIES$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "includeWebProperties" element
         */
        public boolean isSetIncludeWebProperties()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INCLUDEWEBPROPERTIES$6) != 0;
            }
        }
        
        /**
         * Sets the "includeWebProperties" element
         */
        public void setIncludeWebProperties(boolean includeWebProperties)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCLUDEWEBPROPERTIES$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCLUDEWEBPROPERTIES$6);
                }
                target.setBooleanValue(includeWebProperties);
            }
        }
        
        /**
         * Sets (as xml) the "includeWebProperties" element
         */
        public void xsetIncludeWebProperties(org.apache.xmlbeans.XmlBoolean includeWebProperties)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INCLUDEWEBPROPERTIES$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(INCLUDEWEBPROPERTIES$6);
                }
                target.set(includeWebProperties);
            }
        }
        
        /**
         * Unsets the "includeWebProperties" element
         */
        public void unsetIncludeWebProperties()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INCLUDEWEBPROPERTIES$6, 0);
            }
        }
    }
}
