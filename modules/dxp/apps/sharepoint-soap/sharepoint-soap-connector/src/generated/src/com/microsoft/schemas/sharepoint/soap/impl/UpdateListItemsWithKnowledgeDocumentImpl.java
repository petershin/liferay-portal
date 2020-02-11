/*
 * An XML document type.
 * Localname: UpdateListItemsWithKnowledge
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one UpdateListItemsWithKnowledge(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class UpdateListItemsWithKnowledgeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateListItemsWithKnowledgeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATELISTITEMSWITHKNOWLEDGE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "UpdateListItemsWithKnowledge");
    
    
    /**
     * Gets the "UpdateListItemsWithKnowledge" element
     */
    public com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge getUpdateListItemsWithKnowledge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge target = null;
            target = (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge)get_store().find_element_user(UPDATELISTITEMSWITHKNOWLEDGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateListItemsWithKnowledge" element
     */
    public void setUpdateListItemsWithKnowledge(com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge updateListItemsWithKnowledge)
    {
        generatedSetterHelperImpl(updateListItemsWithKnowledge, UPDATELISTITEMSWITHKNOWLEDGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "UpdateListItemsWithKnowledge" element
     */
    public com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge addNewUpdateListItemsWithKnowledge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge target = null;
            target = (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge)get_store().add_element_user(UPDATELISTITEMSWITHKNOWLEDGE$0);
            return target;
        }
    }
    /**
     * An XML UpdateListItemsWithKnowledge(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class UpdateListItemsWithKnowledgeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateListItemsWithKnowledgeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LISTNAME$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "listName");
        private static final javax.xml.namespace.QName UPDATES$2 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "updates");
        private static final javax.xml.namespace.QName SYNCSCOPE$4 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "syncScope");
        private static final javax.xml.namespace.QName KNOWLEDGE$6 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "knowledge");
        
        
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
         * Gets the "updates" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge.Updates getUpdates()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge.Updates target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge.Updates)get_store().find_element_user(UPDATES$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "updates" element
         */
        public void setUpdates(com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge.Updates updates)
        {
            generatedSetterHelperImpl(updates, UPDATES$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "updates" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge.Updates addNewUpdates()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge.Updates target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge.Updates)get_store().add_element_user(UPDATES$2);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYNCSCOPE$4, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SYNCSCOPE$4, 0);
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
                return get_store().count_elements(SYNCSCOPE$4) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYNCSCOPE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SYNCSCOPE$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SYNCSCOPE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SYNCSCOPE$4);
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
                get_store().remove_element(SYNCSCOPE$4, 0);
            }
        }
        
        /**
         * Gets the "knowledge" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge.Knowledge getKnowledge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge.Knowledge target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge.Knowledge)get_store().find_element_user(KNOWLEDGE$6, 0);
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
                return get_store().count_elements(KNOWLEDGE$6) != 0;
            }
        }
        
        /**
         * Sets the "knowledge" element
         */
        public void setKnowledge(com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge.Knowledge knowledge)
        {
            generatedSetterHelperImpl(knowledge, KNOWLEDGE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "knowledge" element
         */
        public com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge.Knowledge addNewKnowledge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge.Knowledge target = null;
                target = (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge.Knowledge)get_store().add_element_user(KNOWLEDGE$6);
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
                get_store().remove_element(KNOWLEDGE$6, 0);
            }
        }
        /**
         * An XML updates(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class UpdatesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge.Updates
        {
            private static final long serialVersionUID = 1L;
            
            public UpdatesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
        /**
         * An XML knowledge(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class KnowledgeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge.Knowledge
        {
            private static final long serialVersionUID = 1L;
            
            public KnowledgeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
