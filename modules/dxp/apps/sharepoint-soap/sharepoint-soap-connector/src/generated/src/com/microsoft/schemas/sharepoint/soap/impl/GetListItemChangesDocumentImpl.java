/*
 * An XML document type.
 * Localname: GetListItemChanges
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one GetListItemChanges(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class GetListItemChangesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetListItemChangesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLISTITEMCHANGES$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListItemChanges");
    
    
    /**
     * Gets the "GetListItemChanges" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges getGetListItemChanges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges)get_store().find_element_user(GETLISTITEMCHANGES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetListItemChanges" element
     */
    public void setGetListItemChanges(com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges getListItemChanges)
    {
        generatedSetterHelperImpl(getListItemChanges, GETLISTITEMCHANGES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetListItemChanges" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges addNewGetListItemChanges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges)get_store().add_element_user(GETLISTITEMCHANGES$0);
            return target;
        }
    }
    /**
     * An XML GetListItemChanges(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class GetListItemChangesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges
    {
        private static final long serialVersionUID = 1L;
        
        public GetListItemChangesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LISTNAME$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "listName");
        private static final javax.xml.namespace.QName VIEWFIELDS$2 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "viewFields");
        private static final javax.xml.namespace.QName SINCE$4 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "since");
        private static final javax.xml.namespace.QName CONTAINS$6 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "contains");
        
        
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
         * Gets the "viewFields" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges.ViewFields getViewFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges.ViewFields target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges.ViewFields)get_store().find_element_user(VIEWFIELDS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "viewFields" element
         */
        public boolean isSetViewFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VIEWFIELDS$2) != 0;
            }
        }
        
        /**
         * Sets the "viewFields" element
         */
        public void setViewFields(com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges.ViewFields viewFields)
        {
            generatedSetterHelperImpl(viewFields, VIEWFIELDS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "viewFields" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges.ViewFields addNewViewFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges.ViewFields target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges.ViewFields)get_store().add_element_user(VIEWFIELDS$2);
                return target;
            }
        }
        
        /**
         * Unsets the "viewFields" element
         */
        public void unsetViewFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VIEWFIELDS$2, 0);
            }
        }
        
        /**
         * Gets the "since" element
         */
        public java.lang.String getSince()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SINCE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "since" element
         */
        public org.apache.xmlbeans.XmlString xgetSince()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SINCE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "since" element
         */
        public boolean isSetSince()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SINCE$4) != 0;
            }
        }
        
        /**
         * Sets the "since" element
         */
        public void setSince(java.lang.String since)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SINCE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SINCE$4);
                }
                target.setStringValue(since);
            }
        }
        
        /**
         * Sets (as xml) the "since" element
         */
        public void xsetSince(org.apache.xmlbeans.XmlString since)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SINCE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SINCE$4);
                }
                target.set(since);
            }
        }
        
        /**
         * Unsets the "since" element
         */
        public void unsetSince()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SINCE$4, 0);
            }
        }
        
        /**
         * Gets the "contains" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges.Contains getContains()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges.Contains target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges.Contains)get_store().find_element_user(CONTAINS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "contains" element
         */
        public boolean isSetContains()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTAINS$6) != 0;
            }
        }
        
        /**
         * Sets the "contains" element
         */
        public void setContains(com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges.Contains contains)
        {
            generatedSetterHelperImpl(contains, CONTAINS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "contains" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges.Contains addNewContains()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges.Contains target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges.Contains)get_store().add_element_user(CONTAINS$6);
                return target;
            }
        }
        
        /**
         * Unsets the "contains" element
         */
        public void unsetContains()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTAINS$6, 0);
            }
        }
        /**
         * An XML viewFields(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class ViewFieldsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges.ViewFields
        {
            private static final long serialVersionUID = 1L;
            
            public ViewFieldsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
        /**
         * An XML contains(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class ContainsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges.Contains
        {
            private static final long serialVersionUID = 1L;
            
            public ContainsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
