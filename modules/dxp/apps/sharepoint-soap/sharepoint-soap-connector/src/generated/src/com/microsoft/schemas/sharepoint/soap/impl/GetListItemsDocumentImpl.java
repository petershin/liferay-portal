/*
 * An XML document type.
 * Localname: GetListItems
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.GetListItemsDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one GetListItems(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class GetListItemsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListItemsDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetListItemsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLISTITEMS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListItems");
    
    
    /**
     * Gets the "GetListItems" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetListItemsDocument.GetListItems getGetListItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetListItemsDocument.GetListItems target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetListItemsDocument.GetListItems)get_store().find_element_user(GETLISTITEMS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetListItems" element
     */
    public void setGetListItems(com.microsoft.schemas.sharepoint.soap.GetListItemsDocument.GetListItems getListItems)
    {
        generatedSetterHelperImpl(getListItems, GETLISTITEMS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetListItems" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetListItemsDocument.GetListItems addNewGetListItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetListItemsDocument.GetListItems target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetListItemsDocument.GetListItems)get_store().add_element_user(GETLISTITEMS$0);
            return target;
        }
    }
    /**
     * An XML GetListItems(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class GetListItemsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListItemsDocument.GetListItems
    {
        private static final long serialVersionUID = 1L;
        
        public GetListItemsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LISTNAME$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "listName");
        private static final javax.xml.namespace.QName VIEWNAME$2 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "viewName");
        private static final javax.xml.namespace.QName QUERY$4 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "query");
        private static final javax.xml.namespace.QName VIEWFIELDS$6 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "viewFields");
        private static final javax.xml.namespace.QName ROWLIMIT$8 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "rowLimit");
        private static final javax.xml.namespace.QName QUERYOPTIONS$10 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "queryOptions");
        private static final javax.xml.namespace.QName WEBID$12 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "webID");
        
        
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
         * Gets the "viewName" element
         */
        public java.lang.String getViewName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VIEWNAME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "viewName" element
         */
        public org.apache.xmlbeans.XmlString xgetViewName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VIEWNAME$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "viewName" element
         */
        public boolean isSetViewName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VIEWNAME$2) != 0;
            }
        }
        
        /**
         * Sets the "viewName" element
         */
        public void setViewName(java.lang.String viewName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VIEWNAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VIEWNAME$2);
                }
                target.setStringValue(viewName);
            }
        }
        
        /**
         * Sets (as xml) the "viewName" element
         */
        public void xsetViewName(org.apache.xmlbeans.XmlString viewName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VIEWNAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VIEWNAME$2);
                }
                target.set(viewName);
            }
        }
        
        /**
         * Unsets the "viewName" element
         */
        public void unsetViewName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VIEWNAME$2, 0);
            }
        }
        
        /**
         * Gets the "query" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListItemsDocument.GetListItems.Query getQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListItemsDocument.GetListItems.Query target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListItemsDocument.GetListItems.Query)get_store().find_element_user(QUERY$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "query" element
         */
        public boolean isSetQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(QUERY$4) != 0;
            }
        }
        
        /**
         * Sets the "query" element
         */
        public void setQuery(com.microsoft.schemas.sharepoint.soap.GetListItemsDocument.GetListItems.Query query)
        {
            generatedSetterHelperImpl(query, QUERY$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "query" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListItemsDocument.GetListItems.Query addNewQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListItemsDocument.GetListItems.Query target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListItemsDocument.GetListItems.Query)get_store().add_element_user(QUERY$4);
                return target;
            }
        }
        
        /**
         * Unsets the "query" element
         */
        public void unsetQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(QUERY$4, 0);
            }
        }
        
        /**
         * Gets the "viewFields" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListItemsDocument.GetListItems.ViewFields getViewFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListItemsDocument.GetListItems.ViewFields target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListItemsDocument.GetListItems.ViewFields)get_store().find_element_user(VIEWFIELDS$6, 0);
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
                return get_store().count_elements(VIEWFIELDS$6) != 0;
            }
        }
        
        /**
         * Sets the "viewFields" element
         */
        public void setViewFields(com.microsoft.schemas.sharepoint.soap.GetListItemsDocument.GetListItems.ViewFields viewFields)
        {
            generatedSetterHelperImpl(viewFields, VIEWFIELDS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "viewFields" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListItemsDocument.GetListItems.ViewFields addNewViewFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListItemsDocument.GetListItems.ViewFields target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListItemsDocument.GetListItems.ViewFields)get_store().add_element_user(VIEWFIELDS$6);
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
                get_store().remove_element(VIEWFIELDS$6, 0);
            }
        }
        
        /**
         * Gets the "rowLimit" element
         */
        public java.lang.String getRowLimit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROWLIMIT$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "rowLimit" element
         */
        public org.apache.xmlbeans.XmlString xgetRowLimit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROWLIMIT$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "rowLimit" element
         */
        public boolean isSetRowLimit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ROWLIMIT$8) != 0;
            }
        }
        
        /**
         * Sets the "rowLimit" element
         */
        public void setRowLimit(java.lang.String rowLimit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROWLIMIT$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROWLIMIT$8);
                }
                target.setStringValue(rowLimit);
            }
        }
        
        /**
         * Sets (as xml) the "rowLimit" element
         */
        public void xsetRowLimit(org.apache.xmlbeans.XmlString rowLimit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROWLIMIT$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ROWLIMIT$8);
                }
                target.set(rowLimit);
            }
        }
        
        /**
         * Unsets the "rowLimit" element
         */
        public void unsetRowLimit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ROWLIMIT$8, 0);
            }
        }
        
        /**
         * Gets the "queryOptions" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListItemsDocument.GetListItems.QueryOptions getQueryOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListItemsDocument.GetListItems.QueryOptions target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListItemsDocument.GetListItems.QueryOptions)get_store().find_element_user(QUERYOPTIONS$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "queryOptions" element
         */
        public boolean isSetQueryOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(QUERYOPTIONS$10) != 0;
            }
        }
        
        /**
         * Sets the "queryOptions" element
         */
        public void setQueryOptions(com.microsoft.schemas.sharepoint.soap.GetListItemsDocument.GetListItems.QueryOptions queryOptions)
        {
            generatedSetterHelperImpl(queryOptions, QUERYOPTIONS$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "queryOptions" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListItemsDocument.GetListItems.QueryOptions addNewQueryOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListItemsDocument.GetListItems.QueryOptions target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListItemsDocument.GetListItems.QueryOptions)get_store().add_element_user(QUERYOPTIONS$10);
                return target;
            }
        }
        
        /**
         * Unsets the "queryOptions" element
         */
        public void unsetQueryOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(QUERYOPTIONS$10, 0);
            }
        }
        
        /**
         * Gets the "webID" element
         */
        public java.lang.String getWebID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEBID$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "webID" element
         */
        public org.apache.xmlbeans.XmlString xgetWebID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEBID$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "webID" element
         */
        public boolean isSetWebID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WEBID$12) != 0;
            }
        }
        
        /**
         * Sets the "webID" element
         */
        public void setWebID(java.lang.String webID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEBID$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WEBID$12);
                }
                target.setStringValue(webID);
            }
        }
        
        /**
         * Sets (as xml) the "webID" element
         */
        public void xsetWebID(org.apache.xmlbeans.XmlString webID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEBID$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WEBID$12);
                }
                target.set(webID);
            }
        }
        
        /**
         * Unsets the "webID" element
         */
        public void unsetWebID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WEBID$12, 0);
            }
        }
        /**
         * An XML query(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class QueryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListItemsDocument.GetListItems.Query
        {
            private static final long serialVersionUID = 1L;
            
            public QueryImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
        /**
         * An XML viewFields(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class ViewFieldsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListItemsDocument.GetListItems.ViewFields
        {
            private static final long serialVersionUID = 1L;
            
            public ViewFieldsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
        /**
         * An XML queryOptions(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class QueryOptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListItemsDocument.GetListItems.QueryOptions
        {
            private static final long serialVersionUID = 1L;
            
            public QueryOptionsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
