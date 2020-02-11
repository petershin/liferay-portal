/*
 * An XML document type.
 * Localname: GetListItemChangesWithKnowledge
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one GetListItemChangesWithKnowledge(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class GetListItemChangesWithKnowledgeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetListItemChangesWithKnowledgeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLISTITEMCHANGESWITHKNOWLEDGE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListItemChangesWithKnowledge");
    
    
    /**
     * Gets the "GetListItemChangesWithKnowledge" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge getGetListItemChangesWithKnowledge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge)get_store().find_element_user(GETLISTITEMCHANGESWITHKNOWLEDGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetListItemChangesWithKnowledge" element
     */
    public void setGetListItemChangesWithKnowledge(com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge getListItemChangesWithKnowledge)
    {
        generatedSetterHelperImpl(getListItemChangesWithKnowledge, GETLISTITEMCHANGESWITHKNOWLEDGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetListItemChangesWithKnowledge" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge addNewGetListItemChangesWithKnowledge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge)get_store().add_element_user(GETLISTITEMCHANGESWITHKNOWLEDGE$0);
            return target;
        }
    }
    /**
     * An XML GetListItemChangesWithKnowledge(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class GetListItemChangesWithKnowledgeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge
    {
        private static final long serialVersionUID = 1L;
        
        public GetListItemChangesWithKnowledgeImpl(org.apache.xmlbeans.SchemaType sType)
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
        private static final javax.xml.namespace.QName SYNCSCOPE$12 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "syncScope");
        private static final javax.xml.namespace.QName KNOWLEDGE$14 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "knowledge");
        private static final javax.xml.namespace.QName CONTAINS$16 = 
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
        public com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.Query getQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.Query target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.Query)get_store().find_element_user(QUERY$4, 0);
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
        public void setQuery(com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.Query query)
        {
            generatedSetterHelperImpl(query, QUERY$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "query" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.Query addNewQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.Query target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.Query)get_store().add_element_user(QUERY$4);
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
        public com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.ViewFields getViewFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.ViewFields target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.ViewFields)get_store().find_element_user(VIEWFIELDS$6, 0);
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
        public void setViewFields(com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.ViewFields viewFields)
        {
            generatedSetterHelperImpl(viewFields, VIEWFIELDS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "viewFields" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.ViewFields addNewViewFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.ViewFields target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.ViewFields)get_store().add_element_user(VIEWFIELDS$6);
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
        public com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.QueryOptions getQueryOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.QueryOptions target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.QueryOptions)get_store().find_element_user(QUERYOPTIONS$10, 0);
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
        public void setQueryOptions(com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.QueryOptions queryOptions)
        {
            generatedSetterHelperImpl(queryOptions, QUERYOPTIONS$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "queryOptions" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.QueryOptions addNewQueryOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.QueryOptions target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.QueryOptions)get_store().add_element_user(QUERYOPTIONS$10);
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
         * Gets the "syncScope" element
         */
        public java.lang.String getSyncScope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYNCSCOPE$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "syncScope" element
         */
        public org.apache.xmlbeans.XmlString xgetSyncScope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SYNCSCOPE$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "syncScope" element
         */
        public boolean isSetSyncScope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SYNCSCOPE$12) != 0;
            }
        }
        
        /**
         * Sets the "syncScope" element
         */
        public void setSyncScope(java.lang.String syncScope)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYNCSCOPE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SYNCSCOPE$12);
                }
                target.setStringValue(syncScope);
            }
        }
        
        /**
         * Sets (as xml) the "syncScope" element
         */
        public void xsetSyncScope(org.apache.xmlbeans.XmlString syncScope)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SYNCSCOPE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SYNCSCOPE$12);
                }
                target.set(syncScope);
            }
        }
        
        /**
         * Unsets the "syncScope" element
         */
        public void unsetSyncScope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SYNCSCOPE$12, 0);
            }
        }
        
        /**
         * Gets the "knowledge" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.Knowledge getKnowledge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.Knowledge target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.Knowledge)get_store().find_element_user(KNOWLEDGE$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "knowledge" element
         */
        public boolean isSetKnowledge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(KNOWLEDGE$14) != 0;
            }
        }
        
        /**
         * Sets the "knowledge" element
         */
        public void setKnowledge(com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.Knowledge knowledge)
        {
            generatedSetterHelperImpl(knowledge, KNOWLEDGE$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "knowledge" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.Knowledge addNewKnowledge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.Knowledge target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.Knowledge)get_store().add_element_user(KNOWLEDGE$14);
                return target;
            }
        }
        
        /**
         * Unsets the "knowledge" element
         */
        public void unsetKnowledge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(KNOWLEDGE$14, 0);
            }
        }
        
        /**
         * Gets the "contains" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.Contains getContains()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.Contains target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.Contains)get_store().find_element_user(CONTAINS$16, 0);
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
                return get_store().count_elements(CONTAINS$16) != 0;
            }
        }
        
        /**
         * Sets the "contains" element
         */
        public void setContains(com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.Contains contains)
        {
            generatedSetterHelperImpl(contains, CONTAINS$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "contains" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.Contains addNewContains()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.Contains target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.Contains)get_store().add_element_user(CONTAINS$16);
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
                get_store().remove_element(CONTAINS$16, 0);
            }
        }
        /**
         * An XML query(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class QueryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.Query
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
        public static class ViewFieldsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.ViewFields
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
        public static class QueryOptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.QueryOptions
        {
            private static final long serialVersionUID = 1L;
            
            public QueryOptionsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
        /**
         * An XML knowledge(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class KnowledgeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.Knowledge
        {
            private static final long serialVersionUID = 1L;
            
            public KnowledgeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
        /**
         * An XML contains(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class ContainsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.GetListItemChangesWithKnowledge.Contains
        {
            private static final long serialVersionUID = 1L;
            
            public ContainsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
