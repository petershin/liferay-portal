/*
 * An XML document type.
 * Localname: QueryExResponse
 * Namespace: http://microsoft.com/webservices/SharePoint/QueryService
 * Java type: com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.webservices.sharepoint.queryservice.impl;
/**
 * A document containing one QueryExResponse(@http://microsoft.com/webservices/SharePoint/QueryService) element.
 *
 * This is a complex type.
 */
public class QueryExResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public QueryExResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYEXRESPONSE$0 = 
        new javax.xml.namespace.QName("http://microsoft.com/webservices/SharePoint/QueryService", "QueryExResponse");
    
    
    /**
     * Gets the "QueryExResponse" element
     */
    public com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument.QueryExResponse getQueryExResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument.QueryExResponse target = null;
            target = (com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument.QueryExResponse)get_store().find_element_user(QUERYEXRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QueryExResponse" element
     */
    public void setQueryExResponse(com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument.QueryExResponse queryExResponse)
    {
        generatedSetterHelperImpl(queryExResponse, QUERYEXRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "QueryExResponse" element
     */
    public com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument.QueryExResponse addNewQueryExResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument.QueryExResponse target = null;
            target = (com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument.QueryExResponse)get_store().add_element_user(QUERYEXRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML QueryExResponse(@http://microsoft.com/webservices/SharePoint/QueryService).
     *
     * This is a complex type.
     */
    public static class QueryExResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument.QueryExResponse
    {
        private static final long serialVersionUID = 1L;
        
        public QueryExResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName QUERYEXRESULT$0 = 
            new javax.xml.namespace.QName("http://microsoft.com/webservices/SharePoint/QueryService", "QueryExResult");
        
        
        /**
         * Gets the "QueryExResult" element
         */
        public com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument.QueryExResponse.QueryExResult getQueryExResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument.QueryExResponse.QueryExResult target = null;
                target = (com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument.QueryExResponse.QueryExResult)get_store().find_element_user(QUERYEXRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "QueryExResult" element
         */
        public boolean isSetQueryExResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(QUERYEXRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "QueryExResult" element
         */
        public void setQueryExResult(com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument.QueryExResponse.QueryExResult queryExResult)
        {
            generatedSetterHelperImpl(queryExResult, QUERYEXRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "QueryExResult" element
         */
        public com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument.QueryExResponse.QueryExResult addNewQueryExResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument.QueryExResponse.QueryExResult target = null;
                target = (com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument.QueryExResponse.QueryExResult)get_store().add_element_user(QUERYEXRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "QueryExResult" element
         */
        public void unsetQueryExResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(QUERYEXRESULT$0, 0);
            }
        }
        /**
         * An XML QueryExResult(@http://microsoft.com/webservices/SharePoint/QueryService).
         *
         * This is a complex type.
         */
        public static class QueryExResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument.QueryExResponse.QueryExResult
        {
            private static final long serialVersionUID = 1L;
            
            public QueryExResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SCHEMA$0 = 
                new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "schema");
            
            
            /**
             * Gets the "schema" element
             */
            public org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema getSchema()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema target = null;
                    target = (org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema)get_store().find_element_user(SCHEMA$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "schema" element
             */
            public void setSchema(org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema schema)
            {
                generatedSetterHelperImpl(schema, SCHEMA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "schema" element
             */
            public org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema addNewSchema()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema target = null;
                    target = (org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema)get_store().add_element_user(SCHEMA$0);
                    return target;
                }
            }
        }
    }
}
