/*
 * An XML document type.
 * Localname: QueryResponse
 * Namespace: urn:Microsoft.Search
 * Java type: search.microsoft.QueryResponseDocument
 *
 * Automatically generated - do not modify.
 */
package search.microsoft.impl;
/**
 * A document containing one QueryResponse(@urn:Microsoft.Search) element.
 *
 * This is a complex type.
 */
public class QueryResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements search.microsoft.QueryResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public QueryResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYRESPONSE$0 = 
        new javax.xml.namespace.QName("urn:Microsoft.Search", "QueryResponse");
    
    
    /**
     * Gets the "QueryResponse" element
     */
    public search.microsoft.QueryResponseDocument.QueryResponse getQueryResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            search.microsoft.QueryResponseDocument.QueryResponse target = null;
            target = (search.microsoft.QueryResponseDocument.QueryResponse)get_store().find_element_user(QUERYRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QueryResponse" element
     */
    public void setQueryResponse(search.microsoft.QueryResponseDocument.QueryResponse queryResponse)
    {
        generatedSetterHelperImpl(queryResponse, QUERYRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "QueryResponse" element
     */
    public search.microsoft.QueryResponseDocument.QueryResponse addNewQueryResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            search.microsoft.QueryResponseDocument.QueryResponse target = null;
            target = (search.microsoft.QueryResponseDocument.QueryResponse)get_store().add_element_user(QUERYRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML QueryResponse(@urn:Microsoft.Search).
     *
     * This is a complex type.
     */
    public static class QueryResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements search.microsoft.QueryResponseDocument.QueryResponse
    {
        private static final long serialVersionUID = 1L;
        
        public QueryResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName QUERYRESULT$0 = 
            new javax.xml.namespace.QName("urn:Microsoft.Search", "QueryResult");
        
        
        /**
         * Gets the "QueryResult" element
         */
        public java.lang.String getQueryResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "QueryResult" element
         */
        public org.apache.xmlbeans.XmlString xgetQueryResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERYRESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "QueryResult" element
         */
        public boolean isSetQueryResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(QUERYRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "QueryResult" element
         */
        public void setQueryResult(java.lang.String queryResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUERYRESULT$0);
                }
                target.setStringValue(queryResult);
            }
        }
        
        /**
         * Sets (as xml) the "QueryResult" element
         */
        public void xsetQueryResult(org.apache.xmlbeans.XmlString queryResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERYRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUERYRESULT$0);
                }
                target.set(queryResult);
            }
        }
        
        /**
         * Unsets the "QueryResult" element
         */
        public void unsetQueryResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(QUERYRESULT$0, 0);
            }
        }
    }
}
