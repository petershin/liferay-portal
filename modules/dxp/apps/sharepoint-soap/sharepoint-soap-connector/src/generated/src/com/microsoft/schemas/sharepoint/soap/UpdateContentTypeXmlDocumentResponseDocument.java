/*
 * An XML document type.
 * Localname: UpdateContentTypeXmlDocumentResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap;


/**
 * A document containing one UpdateContentTypeXmlDocumentResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public interface UpdateContentTypeXmlDocumentResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UpdateContentTypeXmlDocumentResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("updatecontenttypexmldocumentresponsee044doctype");
    
    /**
     * Gets the "UpdateContentTypeXmlDocumentResponse" element
     */
    com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument.UpdateContentTypeXmlDocumentResponse getUpdateContentTypeXmlDocumentResponse();
    
    /**
     * Sets the "UpdateContentTypeXmlDocumentResponse" element
     */
    void setUpdateContentTypeXmlDocumentResponse(com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument.UpdateContentTypeXmlDocumentResponse updateContentTypeXmlDocumentResponse);
    
    /**
     * Appends and returns a new empty "UpdateContentTypeXmlDocumentResponse" element
     */
    com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument.UpdateContentTypeXmlDocumentResponse addNewUpdateContentTypeXmlDocumentResponse();
    
    /**
     * An XML UpdateContentTypeXmlDocumentResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public interface UpdateContentTypeXmlDocumentResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UpdateContentTypeXmlDocumentResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("updatecontenttypexmldocumentresponse6b1felemtype");
        
        /**
         * Gets the "UpdateContentTypeXmlDocumentResult" element
         */
        com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument.UpdateContentTypeXmlDocumentResponse.UpdateContentTypeXmlDocumentResult getUpdateContentTypeXmlDocumentResult();
        
        /**
         * True if has "UpdateContentTypeXmlDocumentResult" element
         */
        boolean isSetUpdateContentTypeXmlDocumentResult();
        
        /**
         * Sets the "UpdateContentTypeXmlDocumentResult" element
         */
        void setUpdateContentTypeXmlDocumentResult(com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument.UpdateContentTypeXmlDocumentResponse.UpdateContentTypeXmlDocumentResult updateContentTypeXmlDocumentResult);
        
        /**
         * Appends and returns a new empty "UpdateContentTypeXmlDocumentResult" element
         */
        com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument.UpdateContentTypeXmlDocumentResponse.UpdateContentTypeXmlDocumentResult addNewUpdateContentTypeXmlDocumentResult();
        
        /**
         * Unsets the "UpdateContentTypeXmlDocumentResult" element
         */
        void unsetUpdateContentTypeXmlDocumentResult();
        
        /**
         * An XML UpdateContentTypeXmlDocumentResult(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public interface UpdateContentTypeXmlDocumentResult extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UpdateContentTypeXmlDocumentResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("updatecontenttypexmldocumentresult71c0elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument.UpdateContentTypeXmlDocumentResponse.UpdateContentTypeXmlDocumentResult newInstance() {
                  return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument.UpdateContentTypeXmlDocumentResponse.UpdateContentTypeXmlDocumentResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument.UpdateContentTypeXmlDocumentResponse.UpdateContentTypeXmlDocumentResult newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument.UpdateContentTypeXmlDocumentResponse.UpdateContentTypeXmlDocumentResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument.UpdateContentTypeXmlDocumentResponse newInstance() {
              return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument.UpdateContentTypeXmlDocumentResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument.UpdateContentTypeXmlDocumentResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument.UpdateContentTypeXmlDocumentResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument newInstance() {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
