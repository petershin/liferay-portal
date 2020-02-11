/*
 * An XML document type.
 * Localname: Query
 * Namespace: urn:Microsoft.Search
 * Java type: search.microsoft.QueryDocument
 *
 * Automatically generated - do not modify.
 */
package search.microsoft.impl;
/**
 * A document containing one Query(@urn:Microsoft.Search) element.
 *
 * This is a complex type.
 */
public class QueryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements search.microsoft.QueryDocument
{
    private static final long serialVersionUID = 1L;
    
    public QueryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERY$0 = 
        new javax.xml.namespace.QName("urn:Microsoft.Search", "Query");
    
    
    /**
     * Gets the "Query" element
     */
    public search.microsoft.QueryDocument.Query getQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            search.microsoft.QueryDocument.Query target = null;
            target = (search.microsoft.QueryDocument.Query)get_store().find_element_user(QUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Query" element
     */
    public void setQuery(search.microsoft.QueryDocument.Query query)
    {
        generatedSetterHelperImpl(query, QUERY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Query" element
     */
    public search.microsoft.QueryDocument.Query addNewQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            search.microsoft.QueryDocument.Query target = null;
            target = (search.microsoft.QueryDocument.Query)get_store().add_element_user(QUERY$0);
            return target;
        }
    }
    /**
     * An XML Query(@urn:Microsoft.Search).
     *
     * This is a complex type.
     */
    public static class QueryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements search.microsoft.QueryDocument.Query
    {
        private static final long serialVersionUID = 1L;
        
        public QueryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName QUERYXML$0 = 
            new javax.xml.namespace.QName("urn:Microsoft.Search", "queryXml");
        
        
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
