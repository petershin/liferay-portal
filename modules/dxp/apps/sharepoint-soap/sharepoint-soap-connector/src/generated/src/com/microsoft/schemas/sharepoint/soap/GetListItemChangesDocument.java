/*
 * An XML document type.
 * Localname: GetListItemChanges
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap;


/**
 * A document containing one GetListItemChanges(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public interface GetListItemChangesDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetListItemChangesDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("getlistitemchangesf837doctype");
    
    /**
     * Gets the "GetListItemChanges" element
     */
    com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges getGetListItemChanges();
    
    /**
     * Sets the "GetListItemChanges" element
     */
    void setGetListItemChanges(com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges getListItemChanges);
    
    /**
     * Appends and returns a new empty "GetListItemChanges" element
     */
    com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges addNewGetListItemChanges();
    
    /**
     * An XML GetListItemChanges(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public interface GetListItemChanges extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetListItemChanges.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("getlistitemchangesefffelemtype");
        
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
         * Gets the "viewFields" element
         */
        com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges.ViewFields getViewFields();
        
        /**
         * True if has "viewFields" element
         */
        boolean isSetViewFields();
        
        /**
         * Sets the "viewFields" element
         */
        void setViewFields(com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges.ViewFields viewFields);
        
        /**
         * Appends and returns a new empty "viewFields" element
         */
        com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges.ViewFields addNewViewFields();
        
        /**
         * Unsets the "viewFields" element
         */
        void unsetViewFields();
        
        /**
         * Gets the "since" element
         */
        java.lang.String getSince();
        
        /**
         * Gets (as xml) the "since" element
         */
        org.apache.xmlbeans.XmlString xgetSince();
        
        /**
         * True if has "since" element
         */
        boolean isSetSince();
        
        /**
         * Sets the "since" element
         */
        void setSince(java.lang.String since);
        
        /**
         * Sets (as xml) the "since" element
         */
        void xsetSince(org.apache.xmlbeans.XmlString since);
        
        /**
         * Unsets the "since" element
         */
        void unsetSince();
        
        /**
         * Gets the "contains" element
         */
        com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges.Contains getContains();
        
        /**
         * True if has "contains" element
         */
        boolean isSetContains();
        
        /**
         * Sets the "contains" element
         */
        void setContains(com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges.Contains contains);
        
        /**
         * Appends and returns a new empty "contains" element
         */
        com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges.Contains addNewContains();
        
        /**
         * Unsets the "contains" element
         */
        void unsetContains();
        
        /**
         * An XML viewFields(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public interface ViewFields extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ViewFields.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("viewfieldsb259elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges.ViewFields newInstance() {
                  return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges.ViewFields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges.ViewFields newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges.ViewFields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Contains.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("contains3dbaelemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges.Contains newInstance() {
                  return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges.Contains) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges.Contains newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges.Contains) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges newInstance() {
              return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.GetListItemChanges) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument newInstance() {
          return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
