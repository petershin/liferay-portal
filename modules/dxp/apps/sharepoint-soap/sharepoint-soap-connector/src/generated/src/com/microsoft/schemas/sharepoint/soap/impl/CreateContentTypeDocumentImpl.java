/*
 * An XML document type.
 * Localname: CreateContentType
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one CreateContentType(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class CreateContentTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreateContentTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATECONTENTTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "CreateContentType");
    
    
    /**
     * Gets the "CreateContentType" element
     */
    public com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType getCreateContentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType target = null;
            target = (com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType)get_store().find_element_user(CREATECONTENTTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateContentType" element
     */
    public void setCreateContentType(com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType createContentType)
    {
        generatedSetterHelperImpl(createContentType, CREATECONTENTTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CreateContentType" element
     */
    public com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType addNewCreateContentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType target = null;
            target = (com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType)get_store().add_element_user(CREATECONTENTTYPE$0);
            return target;
        }
    }
    /**
     * An XML CreateContentType(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class CreateContentTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType
    {
        private static final long serialVersionUID = 1L;
        
        public CreateContentTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LISTNAME$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "listName");
        private static final javax.xml.namespace.QName DISPLAYNAME$2 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "displayName");
        private static final javax.xml.namespace.QName PARENTTYPE$4 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "parentType");
        private static final javax.xml.namespace.QName FIELDS$6 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "fields");
        private static final javax.xml.namespace.QName CONTENTTYPEPROPERTIES$8 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "contentTypeProperties");
        private static final javax.xml.namespace.QName ADDTOVIEW$10 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "addToView");
        
        
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
         * Gets the "displayName" element
         */
        public java.lang.String getDisplayName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYNAME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "displayName" element
         */
        public org.apache.xmlbeans.XmlString xgetDisplayName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYNAME$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "displayName" element
         */
        public boolean isSetDisplayName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DISPLAYNAME$2) != 0;
            }
        }
        
        /**
         * Sets the "displayName" element
         */
        public void setDisplayName(java.lang.String displayName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYNAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISPLAYNAME$2);
                }
                target.setStringValue(displayName);
            }
        }
        
        /**
         * Sets (as xml) the "displayName" element
         */
        public void xsetDisplayName(org.apache.xmlbeans.XmlString displayName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYNAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISPLAYNAME$2);
                }
                target.set(displayName);
            }
        }
        
        /**
         * Unsets the "displayName" element
         */
        public void unsetDisplayName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DISPLAYNAME$2, 0);
            }
        }
        
        /**
         * Gets the "parentType" element
         */
        public java.lang.String getParentType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTTYPE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "parentType" element
         */
        public org.apache.xmlbeans.XmlString xgetParentType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARENTTYPE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "parentType" element
         */
        public boolean isSetParentType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PARENTTYPE$4) != 0;
            }
        }
        
        /**
         * Sets the "parentType" element
         */
        public void setParentType(java.lang.String parentType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTTYPE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARENTTYPE$4);
                }
                target.setStringValue(parentType);
            }
        }
        
        /**
         * Sets (as xml) the "parentType" element
         */
        public void xsetParentType(org.apache.xmlbeans.XmlString parentType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARENTTYPE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARENTTYPE$4);
                }
                target.set(parentType);
            }
        }
        
        /**
         * Unsets the "parentType" element
         */
        public void unsetParentType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PARENTTYPE$4, 0);
            }
        }
        
        /**
         * Gets the "fields" element
         */
        public com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType.Fields getFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType.Fields target = null;
                target = (com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType.Fields)get_store().find_element_user(FIELDS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "fields" element
         */
        public boolean isSetFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FIELDS$6) != 0;
            }
        }
        
        /**
         * Sets the "fields" element
         */
        public void setFields(com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType.Fields fields)
        {
            generatedSetterHelperImpl(fields, FIELDS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "fields" element
         */
        public com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType.Fields addNewFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType.Fields target = null;
                target = (com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType.Fields)get_store().add_element_user(FIELDS$6);
                return target;
            }
        }
        
        /**
         * Unsets the "fields" element
         */
        public void unsetFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FIELDS$6, 0);
            }
        }
        
        /**
         * Gets the "contentTypeProperties" element
         */
        public com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType.ContentTypeProperties getContentTypeProperties()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType.ContentTypeProperties target = null;
                target = (com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType.ContentTypeProperties)get_store().find_element_user(CONTENTTYPEPROPERTIES$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "contentTypeProperties" element
         */
        public boolean isSetContentTypeProperties()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTENTTYPEPROPERTIES$8) != 0;
            }
        }
        
        /**
         * Sets the "contentTypeProperties" element
         */
        public void setContentTypeProperties(com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType.ContentTypeProperties contentTypeProperties)
        {
            generatedSetterHelperImpl(contentTypeProperties, CONTENTTYPEPROPERTIES$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "contentTypeProperties" element
         */
        public com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType.ContentTypeProperties addNewContentTypeProperties()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType.ContentTypeProperties target = null;
                target = (com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType.ContentTypeProperties)get_store().add_element_user(CONTENTTYPEPROPERTIES$8);
                return target;
            }
        }
        
        /**
         * Unsets the "contentTypeProperties" element
         */
        public void unsetContentTypeProperties()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTENTTYPEPROPERTIES$8, 0);
            }
        }
        
        /**
         * Gets the "addToView" element
         */
        public java.lang.String getAddToView()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDTOVIEW$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "addToView" element
         */
        public org.apache.xmlbeans.XmlString xgetAddToView()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDTOVIEW$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "addToView" element
         */
        public boolean isSetAddToView()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADDTOVIEW$10) != 0;
            }
        }
        
        /**
         * Sets the "addToView" element
         */
        public void setAddToView(java.lang.String addToView)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDTOVIEW$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDTOVIEW$10);
                }
                target.setStringValue(addToView);
            }
        }
        
        /**
         * Sets (as xml) the "addToView" element
         */
        public void xsetAddToView(org.apache.xmlbeans.XmlString addToView)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDTOVIEW$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDTOVIEW$10);
                }
                target.set(addToView);
            }
        }
        
        /**
         * Unsets the "addToView" element
         */
        public void unsetAddToView()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADDTOVIEW$10, 0);
            }
        }
        /**
         * An XML fields(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class FieldsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType.Fields
        {
            private static final long serialVersionUID = 1L;
            
            public FieldsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
        /**
         * An XML contentTypeProperties(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class ContentTypePropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.CreateContentType.ContentTypeProperties
        {
            private static final long serialVersionUID = 1L;
            
            public ContentTypePropertiesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
