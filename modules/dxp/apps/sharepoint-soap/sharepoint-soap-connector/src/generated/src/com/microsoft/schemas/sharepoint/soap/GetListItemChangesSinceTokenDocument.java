/*
 * An XML document type.
 * Localname: GetListItemChangesSinceToken
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap;


/**
 * A document containing one GetListItemChangesSinceToken(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public interface GetListItemChangesSinceTokenDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetListItemChangesSinceTokenDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("getlistitemchangessincetoken62b6doctype");
    
    /**
     * Gets the "GetListItemChangesSinceToken" element
     */
    com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.GetListItemChangesSinceToken getGetListItemChangesSinceToken();
    
    /**
     * Sets the "GetListItemChangesSinceToken" element
     */
    void setGetListItemChangesSinceToken(com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.GetListItemChangesSinceToken getListItemChangesSinceToken);
    
    /**
     * Appends and returns a new empty "GetListItemChangesSinceToken" element
     */
    com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.GetListItemChangesSinceToken addNewGetListItemChangesSinceToken();
    
    /**
     * An XML GetListItemChangesSinceToken(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public interface GetListItemChangesSinceToken extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetListItemChangesSinceToken.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("getlistitemchangessincetokenf8dfelemtype");
        
        /**
         * Gets the "listName" element
         */
        java.lang.String getListName();
        
        /**
         * Gets (as xml) the "listName" element
         */
        org.apache.xmlbeans.XmlString xgetListName();
        
        /**
         * True if has "listName" element
         */
        boolean isSetListName();
        
        /**
         * Sets the "listName" element
         */
        void setListName(java.lang.String listName);
        
        /**
         * Sets (as xml) the "listName" element
         */
        void xsetListName(org.apache.xmlbeans.XmlString listName);
        
        /**
         * Unsets the "listName" element
         */
        void unsetListName();
        
        /**
         * Gets the "viewName" element
         */
        java.lang.String getViewName();
        
        /**
         * Gets (as xml) the "viewName" element
         */
        org.apache.xmlbeans.XmlString xgetViewName();
        
        /**
         * True if has "viewName" element
         */
        boolean isSetViewName();
        
        /**
         * Sets the "viewName" element
         */
        void setViewName(java.lang.String viewName);
        
        /**
         * Sets (as xml) the "viewName" element
         */
        void xsetViewName(org.apache.xmlbeans.XmlString viewName);
        
        /**
         * Unsets the "viewName" element
         */
        void unsetViewName();
        
        /**
         * Gets the "query" element
         */
        com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.GetListItemChangesSinceToken.Query getQuery();
        
        /**
         * True if has "query" element
         */
        boolean isSetQuery();
        
        /**
         * Sets the "query" element
         */
        void setQuery(com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.GetListItemChangesSinceToken.Query query);
        
        /**
         * Appends and returns a new empty "query" element
         */
        com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.GetListItemChangesSinceToken.Query addNewQuery();
        
        /**
         * Unsets the "query" element
         */
        void unsetQuery();
        
        /**
         * Gets the "viewFields" element
         */
        com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.GetListItemChangesSinceToken.ViewFields getViewFields();
        
        /**
         * True if has "viewFields" element
         */
        boolean isSetViewFields();
        
        /**
         * Sets the "viewFields" element
         */
        void setViewFields(com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.GetListItemChangesSinceToken.ViewFields viewFields);
        
        /**
         * Appends and returns a new empty "viewFields" element
         */
        com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.GetListItemChangesSinceToken.ViewFields addNewViewFields();
        
        /**
         * Unsets the "viewFields" element
         */
        void unsetViewFields();
        
        /**
         * Gets the "rowLimit" element
         */
        java.lang.String getRowLimit();
        
        /**
         * Gets (as xml) the "rowLimit" element
         */
        org.apache.xmlbeans.XmlString xgetRowLimit();
        
        /**
         * True if has "rowLimit" element
         */
        boolean isSetRowLimit();
        
        /**
         * Sets the "rowLimit" element
         */
        void setRowLimit(java.lang.String rowLimit);
        
        /**
         * Sets (as xml) the "rowLimit" element
         */
        void xsetRowLimit(org.apache.xmlbeans.XmlString rowLimit);
        
        /**
         * Unsets the "rowLimit" element
         */
        void unsetRowLimit();
        
        /**
         * Gets the "queryOptions" element
         */
        com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.GetListItemChangesSinceToken.QueryOptions getQueryOptions();
        
        /**
         * True if has "queryOptions" element
         */
        boolean isSetQueryOptions();
        
        /**
         * Sets the "queryOptions" element
         */
        void setQueryOptions(com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.GetListItemChangesSinceToken.QueryOptions queryOptions);
        
        /**
         * Appends and returns a new empty "queryOptions" element
         */
        com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.GetListItemChangesSinceToken.QueryOptions addNewQueryOptions();
        
        /**
         * Unsets the "queryOptions" element
         */
        void unsetQueryOptions();
        
        /**
         * Gets the "changeToken" element
         */
        java.lang.String getChangeToken();
        
        /**
         * Gets (as xml) the "changeToken" element
         */
        org.apache.xmlbeans.XmlString xgetChangeToken();
        
        /**
         * True if has "changeToken" element
         */
        boolean isSetChangeToken();
        
        /**
         * Sets the "changeToken" element
         */
        void setChangeToken(java.lang.String changeToken);
        
        /**
         * Sets (as xml) the "changeToken" element
         */
        void xsetChangeToken(org.apache.xmlbeans.XmlString changeToken);
        
        /**
         * Unsets the "changeToken" element
         */
        void unsetChangeToken();
        
        /**
         * Gets the "contains" element
         */
        com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.GetListItemChangesSinceToken.Contains getContains();
        
        /**
         * True if has "contains" element
         */
        boolean isSetContains();
        
        /**
         * Sets the "contains" element
         */
        void setContains(com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.GetListItemChangesSinceToken.Contains contains);
        
        /**
         * Appends and returns a new empty "contains" element
         */
        com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.GetListItemChangesSinceToken.Contains addNewContains();
        
        /**
         * Unsets the "contains" element
         */
        void unsetContains();
        
        /**
         * An XML query(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public interface Query extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Query.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("query0a13elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.GetListItemChangesSinceToken.Query newInstance() {
                  return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.GetListItemChangesSinceToken.Query) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.GetListItemChangesSinceToken.Query newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.GetListItemChangesSinceToken.Query) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML viewFields(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public interface ViewFields extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ViewFields.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("viewfields0a39elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.GetListItemChangesSinceToken.ViewFields newInstance() {
                  return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.GetListItemChangesSinceToken.ViewFields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.GetListItemChangesSinceToken.ViewFields newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.GetListItemChangesSinceToken.ViewFields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML queryOptions(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public interface QueryOptions extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QueryOptions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("queryoptions2f31elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.GetListItemChangesSinceToken.QueryOptions newInstance() {
                  return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.GetListItemChangesSinceToken.QueryOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.GetListItemChangesSinceToken.QueryOptions newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.GetListItemChangesSinceToken.QueryOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML contains(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public interface Contains extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Contains.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("contains1b1aelemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.GetListItemChangesSinceToken.Contains newInstance() {
                  return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.GetListItemChangesSinceToken.Contains) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.GetListItemChangesSinceToken.Contains newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.GetListItemChangesSinceToken.Contains) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.GetListItemChangesSinceToken newInstance() {
              return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.GetListItemChangesSinceToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.GetListItemChangesSinceToken newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.GetListItemChangesSinceToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument newInstance() {
          return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
