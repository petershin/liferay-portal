/*
 * An XML document type.
 * Localname: GetListContentTypesAndProperties
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap;


/**
 * A document containing one GetListContentTypesAndProperties(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public interface GetListContentTypesAndPropertiesDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetListContentTypesAndPropertiesDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("getlistcontenttypesandproperties5c91doctype");
    
    /**
     * Gets the "GetListContentTypesAndProperties" element
     */
    com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument.GetListContentTypesAndProperties getGetListContentTypesAndProperties();
    
    /**
     * Sets the "GetListContentTypesAndProperties" element
     */
    void setGetListContentTypesAndProperties(com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument.GetListContentTypesAndProperties getListContentTypesAndProperties);
    
    /**
     * Appends and returns a new empty "GetListContentTypesAndProperties" element
     */
    com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument.GetListContentTypesAndProperties addNewGetListContentTypesAndProperties();
    
    /**
     * An XML GetListContentTypesAndProperties(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public interface GetListContentTypesAndProperties extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetListContentTypesAndProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("getlistcontenttypesandproperties4dffelemtype");
        
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
         * Gets the "contentTypeId" element
         */
        java.lang.String getContentTypeId();
        
        /**
         * Gets (as xml) the "contentTypeId" element
         */
        org.apache.xmlbeans.XmlString xgetContentTypeId();
        
        /**
         * True if has "contentTypeId" element
         */
        boolean isSetContentTypeId();
        
        /**
         * Sets the "contentTypeId" element
         */
        void setContentTypeId(java.lang.String contentTypeId);
        
        /**
         * Sets (as xml) the "contentTypeId" element
         */
        void xsetContentTypeId(org.apache.xmlbeans.XmlString contentTypeId);
        
        /**
         * Unsets the "contentTypeId" element
         */
        void unsetContentTypeId();
        
        /**
         * Gets the "propertyPrefix" element
         */
        java.lang.String getPropertyPrefix();
        
        /**
         * Gets (as xml) the "propertyPrefix" element
         */
        org.apache.xmlbeans.XmlString xgetPropertyPrefix();
        
        /**
         * True if has "propertyPrefix" element
         */
        boolean isSetPropertyPrefix();
        
        /**
         * Sets the "propertyPrefix" element
         */
        void setPropertyPrefix(java.lang.String propertyPrefix);
        
        /**
         * Sets (as xml) the "propertyPrefix" element
         */
        void xsetPropertyPrefix(org.apache.xmlbeans.XmlString propertyPrefix);
        
        /**
         * Unsets the "propertyPrefix" element
         */
        void unsetPropertyPrefix();
        
        /**
         * Gets the "includeWebProperties" element
         */
        boolean getIncludeWebProperties();
        
        /**
         * Gets (as xml) the "includeWebProperties" element
         */
        org.apache.xmlbeans.XmlBoolean xgetIncludeWebProperties();
        
        /**
         * True if has "includeWebProperties" element
         */
        boolean isSetIncludeWebProperties();
        
        /**
         * Sets the "includeWebProperties" element
         */
        void setIncludeWebProperties(boolean includeWebProperties);
        
        /**
         * Sets (as xml) the "includeWebProperties" element
         */
        void xsetIncludeWebProperties(org.apache.xmlbeans.XmlBoolean includeWebProperties);
        
        /**
         * Unsets the "includeWebProperties" element
         */
        void unsetIncludeWebProperties();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument.GetListContentTypesAndProperties newInstance() {
              return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument.GetListContentTypesAndProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument.GetListContentTypesAndProperties newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument.GetListContentTypesAndProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument newInstance() {
          return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
