/*
 * An XML document type.
 * Localname: GetListContentTypesAndPropertiesResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap;


/**
 * A document containing one GetListContentTypesAndPropertiesResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public interface GetListContentTypesAndPropertiesResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetListContentTypesAndPropertiesResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("getlistcontenttypesandpropertiesresponse7432doctype");
    
    /**
     * Gets the "GetListContentTypesAndPropertiesResponse" element
     */
    com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument.GetListContentTypesAndPropertiesResponse getGetListContentTypesAndPropertiesResponse();
    
    /**
     * Sets the "GetListContentTypesAndPropertiesResponse" element
     */
    void setGetListContentTypesAndPropertiesResponse(com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument.GetListContentTypesAndPropertiesResponse getListContentTypesAndPropertiesResponse);
    
    /**
     * Appends and returns a new empty "GetListContentTypesAndPropertiesResponse" element
     */
    com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument.GetListContentTypesAndPropertiesResponse addNewGetListContentTypesAndPropertiesResponse();
    
    /**
     * An XML GetListContentTypesAndPropertiesResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public interface GetListContentTypesAndPropertiesResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetListContentTypesAndPropertiesResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("getlistcontenttypesandpropertiesresponse945felemtype");
        
        /**
         * Gets the "GetListContentTypesAndPropertiesResult" element
         */
        com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument.GetListContentTypesAndPropertiesResponse.GetListContentTypesAndPropertiesResult getGetListContentTypesAndPropertiesResult();
        
        /**
         * True if has "GetListContentTypesAndPropertiesResult" element
         */
        boolean isSetGetListContentTypesAndPropertiesResult();
        
        /**
         * Sets the "GetListContentTypesAndPropertiesResult" element
         */
        void setGetListContentTypesAndPropertiesResult(com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument.GetListContentTypesAndPropertiesResponse.GetListContentTypesAndPropertiesResult getListContentTypesAndPropertiesResult);
        
        /**
         * Appends and returns a new empty "GetListContentTypesAndPropertiesResult" element
         */
        com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument.GetListContentTypesAndPropertiesResponse.GetListContentTypesAndPropertiesResult addNewGetListContentTypesAndPropertiesResult();
        
        /**
         * Unsets the "GetListContentTypesAndPropertiesResult" element
         */
        void unsetGetListContentTypesAndPropertiesResult();
        
        /**
         * An XML GetListContentTypesAndPropertiesResult(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public interface GetListContentTypesAndPropertiesResult extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetListContentTypesAndPropertiesResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("getlistcontenttypesandpropertiesresultc36eelemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument.GetListContentTypesAndPropertiesResponse.GetListContentTypesAndPropertiesResult newInstance() {
                  return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument.GetListContentTypesAndPropertiesResponse.GetListContentTypesAndPropertiesResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument.GetListContentTypesAndPropertiesResponse.GetListContentTypesAndPropertiesResult newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument.GetListContentTypesAndPropertiesResponse.GetListContentTypesAndPropertiesResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument.GetListContentTypesAndPropertiesResponse newInstance() {
              return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument.GetListContentTypesAndPropertiesResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument.GetListContentTypesAndPropertiesResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument.GetListContentTypesAndPropertiesResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument newInstance() {
          return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
