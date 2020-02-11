/*
 * An XML document type.
 * Localname: QueryEx
 * Namespace: http://microsoft.com/webservices/SharePoint/QueryService
 * Java type: com.microsoft.webservices.sharepoint.queryservice.QueryExDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.webservices.sharepoint.queryservice.impl;
/**
 * A document containing one QueryEx(@http://microsoft.com/webservices/SharePoint/QueryService) element.
 *
 * This is a complex type.
 */
public class QueryExDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.webservices.sharepoint.queryservice.QueryExDocument
{
    private static final long serialVersionUID = 1L;
    
    public QueryExDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYEX$0 = 
        new javax.xml.namespace.QName("http://microsoft.com/webservices/SharePoint/QueryService", "QueryEx");
    
    
    /**
     * Gets the "QueryEx" element
     */
    public com.microsoft.webservices.sharepoint.queryservice.QueryExDocument.QueryEx getQueryEx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.webservices.sharepoint.queryservice.QueryExDocument.QueryEx target = null;
            target = (com.microsoft.webservices.sharepoint.queryservice.QueryExDocument.QueryEx)get_store().find_element_user(QUERYEX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QueryEx" element
     */
    public void setQueryEx(com.microsoft.webservices.sharepoint.queryservice.QueryExDocument.QueryEx queryEx)
    {
        generatedSetterHelperImpl(queryEx, QUERYEX$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "QueryEx" element
     */
    public com.microsoft.webservices.sharepoint.queryservice.QueryExDocument.QueryEx addNewQueryEx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.webservices.sharepoint.queryservice.QueryExDocument.QueryEx target = null;
            target = (com.microsoft.webservices.sharepoint.queryservice.QueryExDocument.QueryEx)get_store().add_element_user(QUERYEX$0);
            return target;
        }
    }
    /**
     * An XML QueryEx(@http://microsoft.com/webservices/SharePoint/QueryService).
     *
     * This is a complex type.
     */
    public static class QueryExImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.webservices.sharepoint.queryservice.QueryExDocument.QueryEx
    {
        private static final long serialVersionUID = 1L;
        
        public QueryExImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName QUERYXML$0 = 
            new javax.xml.namespace.QName("http://microsoft.com/webservices/SharePoint/QueryService", "queryXml");
        
        
        /**
         * Gets the "queryXml" element
         */
        public java.lang.String getQueryXml()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYXML$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "queryXml" element
         */
        public org.apache.xmlbeans.XmlString xgetQueryXml()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERYXML$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "queryXml" element
         */
        public boolean isSetQueryXml()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(QUERYXML$0) != 0;
            }
        }
        
        /**
         * Sets the "queryXml" element
         */
        public void setQueryXml(java.lang.String queryXml)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYXML$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUERYXML$0);
                }
                target.setStringValue(queryXml);
            }
        }
        
        /**
         * Sets (as xml) the "queryXml" element
         */
        public void xsetQueryXml(org.apache.xmlbeans.XmlString queryXml)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERYXML$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUERYXML$0);
                }
                target.set(queryXml);
            }
        }
        
        /**
         * Unsets the "queryXml" element
         */
        public void unsetQueryXml()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(QUERYXML$0, 0);
            }
        }
    }
}
