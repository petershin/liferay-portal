/*
 * An XML document type.
 * Localname: UpdateContentType
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one UpdateContentType(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class UpdateContentTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateContentTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATECONTENTTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "UpdateContentType");
    
    
    /**
     * Gets the "UpdateContentType" element
     */
    public com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType getUpdateContentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType target = null;
            target = (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType)get_store().find_element_user(UPDATECONTENTTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateContentType" element
     */
    public void setUpdateContentType(com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType updateContentType)
    {
        generatedSetterHelperImpl(updateContentType, UPDATECONTENTTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "UpdateContentType" element
     */
    public com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType addNewUpdateContentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType target = null;
            target = (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType)get_store().add_element_user(UPDATECONTENTTYPE$0);
            return target;
        }
    }
    /**
     * An XML UpdateContentType(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class UpdateContentTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateContentTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LISTNAME$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "listName");
        private static final javax.xml.namespace.QName CONTENTTYPEID$2 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "contentTypeId");
        private static final javax.xml.namespace.QName CONTENTTYPEPROPERTIES$4 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "contentTypeProperties");
        private static final javax.xml.namespace.QName NEWFIELDS$6 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "newFields");
        private static final javax.xml.namespace.QName UPDATEFIELDS$8 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "updateFields");
        private static final javax.xml.namespace.QName DELETEFIELDS$10 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "deleteFields");
        private static final javax.xml.namespace.QName ADDTOVIEW$12 = 
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
         * Gets the "contentTypeProperties" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.ContentTypeProperties getContentTypeProperties()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.ContentTypeProperties target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.ContentTypeProperties)get_store().find_element_user(CONTENTTYPEPROPERTIES$4, 0);
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
                return get_store().count_elements(CONTENTTYPEPROPERTIES$4) != 0;
            }
        }
        
        /**
         * Sets the "contentTypeProperties" element
         */
        public void setContentTypeProperties(com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.ContentTypeProperties contentTypeProperties)
        {
            generatedSetterHelperImpl(contentTypeProperties, CONTENTTYPEPROPERTIES$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "contentTypeProperties" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.ContentTypeProperties addNewContentTypeProperties()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.ContentTypeProperties target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.ContentTypeProperties)get_store().add_element_user(CONTENTTYPEPROPERTIES$4);
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
                get_store().remove_element(CONTENTTYPEPROPERTIES$4, 0);
            }
        }
        
        /**
         * Gets the "newFields" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.NewFields getNewFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.NewFields target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.NewFields)get_store().find_element_user(NEWFIELDS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "newFields" element
         */
        public boolean isSetNewFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NEWFIELDS$6) != 0;
            }
        }
        
        /**
         * Sets the "newFields" element
         */
        public void setNewFields(com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.NewFields newFields)
        {
            generatedSetterHelperImpl(newFields, NEWFIELDS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "newFields" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.NewFields addNewNewFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.NewFields target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.NewFields)get_store().add_element_user(NEWFIELDS$6);
                return target;
            }
        }
        
        /**
         * Unsets the "newFields" element
         */
        public void unsetNewFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NEWFIELDS$6, 0);
            }
        }
        
        /**
         * Gets the "updateFields" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.UpdateFields getUpdateFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.UpdateFields target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.UpdateFields)get_store().find_element_user(UPDATEFIELDS$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "updateFields" element
         */
        public boolean isSetUpdateFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(UPDATEFIELDS$8) != 0;
            }
        }
        
        /**
         * Sets the "updateFields" element
         */
        public void setUpdateFields(com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.UpdateFields updateFields)
        {
            generatedSetterHelperImpl(updateFields, UPDATEFIELDS$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "updateFields" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.UpdateFields addNewUpdateFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.UpdateFields target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.UpdateFields)get_store().add_element_user(UPDATEFIELDS$8);
                return target;
            }
        }
        
        /**
         * Unsets the "updateFields" element
         */
        public void unsetUpdateFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(UPDATEFIELDS$8, 0);
            }
        }
        
        /**
         * Gets the "deleteFields" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.DeleteFields getDeleteFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.DeleteFields target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.DeleteFields)get_store().find_element_user(DELETEFIELDS$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "deleteFields" element
         */
        public boolean isSetDeleteFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DELETEFIELDS$10) != 0;
            }
        }
        
        /**
         * Sets the "deleteFields" element
         */
        public void setDeleteFields(com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.DeleteFields deleteFields)
        {
            generatedSetterHelperImpl(deleteFields, DELETEFIELDS$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "deleteFields" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.DeleteFields addNewDeleteFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.DeleteFields target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.DeleteFields)get_store().add_element_user(DELETEFIELDS$10);
                return target;
            }
        }
        
        /**
         * Unsets the "deleteFields" element
         */
        public void unsetDeleteFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DELETEFIELDS$10, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDTOVIEW$12, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDTOVIEW$12, 0);
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
                return get_store().count_elements(ADDTOVIEW$12) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDTOVIEW$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDTOVIEW$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDTOVIEW$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDTOVIEW$12);
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
                get_store().remove_element(ADDTOVIEW$12, 0);
            }
        }
        /**
         * An XML contentTypeProperties(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class ContentTypePropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.ContentTypeProperties
        {
            private static final long serialVersionUID = 1L;
            
            public ContentTypePropertiesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
        /**
         * An XML newFields(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class NewFieldsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.NewFields
        {
            private static final long serialVersionUID = 1L;
            
            public NewFieldsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
        /**
         * An XML updateFields(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class UpdateFieldsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.UpdateFields
        {
            private static final long serialVersionUID = 1L;
            
            public UpdateFieldsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
        /**
         * An XML deleteFields(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class DeleteFieldsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.DeleteFields
        {
            private static final long serialVersionUID = 1L;
            
            public DeleteFieldsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
