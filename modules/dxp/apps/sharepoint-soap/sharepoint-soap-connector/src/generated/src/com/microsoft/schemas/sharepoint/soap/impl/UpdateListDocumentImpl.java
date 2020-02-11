/*
 * An XML document type.
 * Localname: UpdateList
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.UpdateListDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one UpdateList(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class UpdateListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateListDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATELIST$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "UpdateList");
    
    
    /**
     * Gets the "UpdateList" element
     */
    public com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList getUpdateList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList target = null;
            target = (com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList)get_store().find_element_user(UPDATELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateList" element
     */
    public void setUpdateList(com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList updateList)
    {
        generatedSetterHelperImpl(updateList, UPDATELIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "UpdateList" element
     */
    public com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList addNewUpdateList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList target = null;
            target = (com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList)get_store().add_element_user(UPDATELIST$0);
            return target;
        }
    }
    /**
     * An XML UpdateList(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class UpdateListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LISTNAME$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "listName");
        private static final javax.xml.namespace.QName LISTPROPERTIES$2 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "listProperties");
        private static final javax.xml.namespace.QName NEWFIELDS$4 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "newFields");
        private static final javax.xml.namespace.QName UPDATEFIELDS$6 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "updateFields");
        private static final javax.xml.namespace.QName DELETEFIELDS$8 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "deleteFields");
        private static final javax.xml.namespace.QName LISTVERSION$10 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "listVersion");
        
        
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
         * Gets the "listProperties" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList.ListProperties getListProperties()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList.ListProperties target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList.ListProperties)get_store().find_element_user(LISTPROPERTIES$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "listProperties" element
         */
        public boolean isSetListProperties()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LISTPROPERTIES$2) != 0;
            }
        }
        
        /**
         * Sets the "listProperties" element
         */
        public void setListProperties(com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList.ListProperties listProperties)
        {
            generatedSetterHelperImpl(listProperties, LISTPROPERTIES$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "listProperties" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList.ListProperties addNewListProperties()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList.ListProperties target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList.ListProperties)get_store().add_element_user(LISTPROPERTIES$2);
                return target;
            }
        }
        
        /**
         * Unsets the "listProperties" element
         */
        public void unsetListProperties()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LISTPROPERTIES$2, 0);
            }
        }
        
        /**
         * Gets the "newFields" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList.NewFields getNewFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList.NewFields target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList.NewFields)get_store().find_element_user(NEWFIELDS$4, 0);
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
                return get_store().count_elements(NEWFIELDS$4) != 0;
            }
        }
        
        /**
         * Sets the "newFields" element
         */
        public void setNewFields(com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList.NewFields newFields)
        {
            generatedSetterHelperImpl(newFields, NEWFIELDS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "newFields" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList.NewFields addNewNewFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList.NewFields target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList.NewFields)get_store().add_element_user(NEWFIELDS$4);
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
                get_store().remove_element(NEWFIELDS$4, 0);
            }
        }
        
        /**
         * Gets the "updateFields" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList.UpdateFields getUpdateFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList.UpdateFields target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList.UpdateFields)get_store().find_element_user(UPDATEFIELDS$6, 0);
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
                return get_store().count_elements(UPDATEFIELDS$6) != 0;
            }
        }
        
        /**
         * Sets the "updateFields" element
         */
        public void setUpdateFields(com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList.UpdateFields updateFields)
        {
            generatedSetterHelperImpl(updateFields, UPDATEFIELDS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "updateFields" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList.UpdateFields addNewUpdateFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList.UpdateFields target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList.UpdateFields)get_store().add_element_user(UPDATEFIELDS$6);
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
                get_store().remove_element(UPDATEFIELDS$6, 0);
            }
        }
        
        /**
         * Gets the "deleteFields" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList.DeleteFields getDeleteFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList.DeleteFields target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList.DeleteFields)get_store().find_element_user(DELETEFIELDS$8, 0);
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
                return get_store().count_elements(DELETEFIELDS$8) != 0;
            }
        }
        
        /**
         * Sets the "deleteFields" element
         */
        public void setDeleteFields(com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList.DeleteFields deleteFields)
        {
            generatedSetterHelperImpl(deleteFields, DELETEFIELDS$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "deleteFields" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList.DeleteFields addNewDeleteFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList.DeleteFields target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList.DeleteFields)get_store().add_element_user(DELETEFIELDS$8);
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
                get_store().remove_element(DELETEFIELDS$8, 0);
            }
        }
        
        /**
         * Gets the "listVersion" element
         */
        public java.lang.String getListVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTVERSION$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "listVersion" element
         */
        public org.apache.xmlbeans.XmlString xgetListVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LISTVERSION$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "listVersion" element
         */
        public boolean isSetListVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LISTVERSION$10) != 0;
            }
        }
        
        /**
         * Sets the "listVersion" element
         */
        public void setListVersion(java.lang.String listVersion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTVERSION$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LISTVERSION$10);
                }
                target.setStringValue(listVersion);
            }
        }
        
        /**
         * Sets (as xml) the "listVersion" element
         */
        public void xsetListVersion(org.apache.xmlbeans.XmlString listVersion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LISTVERSION$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LISTVERSION$10);
                }
                target.set(listVersion);
            }
        }
        
        /**
         * Unsets the "listVersion" element
         */
        public void unsetListVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LISTVERSION$10, 0);
            }
        }
        /**
         * An XML listProperties(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class ListPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList.ListProperties
        {
            private static final long serialVersionUID = 1L;
            
            public ListPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
        /**
         * An XML newFields(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class NewFieldsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList.NewFields
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
        public static class UpdateFieldsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList.UpdateFields
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
        public static class DeleteFieldsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateListDocument.UpdateList.DeleteFields
        {
            private static final long serialVersionUID = 1L;
            
            public DeleteFieldsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
