/*
 * An XML document type.
 * Localname: DeleteContentTypeXmlDocumentResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap;


/**
 * A document containing one DeleteContentTypeXmlDocumentResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public interface DeleteContentTypeXmlDocumentResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DeleteContentTypeXmlDocumentResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("deletecontenttypexmldocumentresponseda26doctype");
    
    /**
     * Gets the "DeleteContentTypeXmlDocumentResponse" element
     */
    com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument.DeleteContentTypeXmlDocumentResponse getDeleteContentTypeXmlDocumentResponse();
    
    /**
     * Sets the "DeleteContentTypeXmlDocumentResponse" element
     */
    void setDeleteContentTypeXmlDocumentResponse(com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument.DeleteContentTypeXmlDocumentResponse deleteContentTypeXmlDocumentResponse);
    
    /**
     * Appends and returns a new empty "DeleteContentTypeXmlDocumentResponse" element
     */
    com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument.DeleteContentTypeXmlDocumentResponse addNewDeleteContentTypeXmlDocumentResponse();
    
    /**
     * An XML DeleteContentTypeXmlDocumentResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public interface DeleteContentTypeXmlDocumentResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DeleteContentTypeXmlDocumentResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("deletecontenttypexmldocumentresponsef0dfelemtype");
        
        /**
         * Gets the "DeleteContentTypeXmlDocumentResult" element
         */
        com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument.DeleteContentTypeXmlDocumentResponse.DeleteContentTypeXmlDocumentResult getDeleteContentTypeXmlDocumentResult();
        
        /**
         * True if has "DeleteContentTypeXmlDocumentResult" element
         */
        boolean isSetDeleteContentTypeXmlDocumentResult();
        
        /**
         * Sets the "DeleteContentTypeXmlDocumentResult" element
         */
        void setDeleteContentTypeXmlDocumentResult(com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument.DeleteContentTypeXmlDocumentResponse.DeleteContentTypeXmlDocumentResult deleteContentTypeXmlDocumentResult);
        
        /**
         * Appends and returns a new empty "DeleteContentTypeXmlDocumentResult" element
         */
        com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument.DeleteContentTypeXmlDocumentResponse.DeleteContentTypeXmlDocumentResult addNewDeleteContentTypeXmlDocumentResult();
        
        /**
         * Unsets the "DeleteContentTypeXmlDocumentResult" element
         */
        void unsetDeleteContentTypeXmlDocumentResult();
        
        /**
         * An XML DeleteContentTypeXmlDocumentResult(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public interface DeleteContentTypeXmlDocumentResult extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DeleteContentTypeXmlDocumentResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("deletecontenttypexmldocumentresult1e62elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument.DeleteContentTypeXmlDocumentResponse.DeleteContentTypeXmlDocumentResult newInstance() {
                  return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument.DeleteContentTypeXmlDocumentResponse.DeleteContentTypeXmlDocumentResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument.DeleteContentTypeXmlDocumentResponse.DeleteContentTypeXmlDocumentResult newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument.DeleteContentTypeXmlDocumentResponse.DeleteContentTypeXmlDocumentResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument.DeleteContentTypeXmlDocumentResponse newInstance() {
              return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument.DeleteContentTypeXmlDocumentResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument.DeleteContentTypeXmlDocumentResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument.DeleteContentTypeXmlDocumentResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument newInstance() {
          return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
