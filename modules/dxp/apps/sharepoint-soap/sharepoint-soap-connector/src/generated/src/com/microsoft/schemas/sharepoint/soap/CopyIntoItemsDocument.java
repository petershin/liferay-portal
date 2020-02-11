/*
 * An XML document type.
 * Localname: CopyIntoItems
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap;


/**
 * A document containing one CopyIntoItems(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public interface CopyIntoItemsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CopyIntoItemsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFEE837E2BF6CB1515998A4F85A16FECD").resolveHandle("copyintoitemse3f4doctype");
    
    /**
     * Gets the "CopyIntoItems" element
     */
    com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument.CopyIntoItems getCopyIntoItems();
    
    /**
     * Sets the "CopyIntoItems" element
     */
    void setCopyIntoItems(com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument.CopyIntoItems copyIntoItems);
    
    /**
     * Appends and returns a new empty "CopyIntoItems" element
     */
    com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument.CopyIntoItems addNewCopyIntoItems();
    
    /**
     * An XML CopyIntoItems(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public interface CopyIntoItems extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CopyIntoItems.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFEE837E2BF6CB1515998A4F85A16FECD").resolveHandle("copyintoitems154belemtype");
        
        /**
         * Gets the "SourceUrl" element
         */
        java.lang.String getSourceUrl();
        
        /**
         * Gets (as xml) the "SourceUrl" element
         */
        org.apache.xmlbeans.XmlString xgetSourceUrl();
        
        /**
         * True if has "SourceUrl" element
         */
        boolean isSetSourceUrl();
        
        /**
         * Sets the "SourceUrl" element
         */
        void setSourceUrl(java.lang.String sourceUrl);
        
        /**
         * Sets (as xml) the "SourceUrl" element
         */
        void xsetSourceUrl(org.apache.xmlbeans.XmlString sourceUrl);
        
        /**
         * Unsets the "SourceUrl" element
         */
        void unsetSourceUrl();
        
        /**
         * Gets the "DestinationUrls" element
         */
        com.microsoft.schemas.sharepoint.soap.DestinationUrlCollection getDestinationUrls();
        
        /**
         * True if has "DestinationUrls" element
         */
        boolean isSetDestinationUrls();
        
        /**
         * Sets the "DestinationUrls" element
         */
        void setDestinationUrls(com.microsoft.schemas.sharepoint.soap.DestinationUrlCollection destinationUrls);
        
        /**
         * Appends and returns a new empty "DestinationUrls" element
         */
        com.microsoft.schemas.sharepoint.soap.DestinationUrlCollection addNewDestinationUrls();
        
        /**
         * Unsets the "DestinationUrls" element
         */
        void unsetDestinationUrls();
        
        /**
         * Gets the "Fields" element
         */
        com.microsoft.schemas.sharepoint.soap.FieldInformationCollection getFields();
        
        /**
         * True if has "Fields" element
         */
        boolean isSetFields();
        
        /**
         * Sets the "Fields" element
         */
        void setFields(com.microsoft.schemas.sharepoint.soap.FieldInformationCollection fields);
        
        /**
         * Appends and returns a new empty "Fields" element
         */
        com.microsoft.schemas.sharepoint.soap.FieldInformationCollection addNewFields();
        
        /**
         * Unsets the "Fields" element
         */
        void unsetFields();
        
        /**
         * Gets the "Stream" element
         */
        byte[] getStream();
        
        /**
         * Gets (as xml) the "Stream" element
         */
        org.apache.xmlbeans.XmlBase64Binary xgetStream();
        
        /**
         * True if has "Stream" element
         */
        boolean isSetStream();
        
        /**
         * Sets the "Stream" element
         */
        void setStream(byte[] stream);
        
        /**
         * Sets (as xml) the "Stream" element
         */
        void xsetStream(org.apache.xmlbeans.XmlBase64Binary stream);
        
        /**
         * Unsets the "Stream" element
         */
        void unsetStream();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument.CopyIntoItems newInstance() {
              return (com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument.CopyIntoItems) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument.CopyIntoItems newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument.CopyIntoItems) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument newInstance() {
          return (com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
