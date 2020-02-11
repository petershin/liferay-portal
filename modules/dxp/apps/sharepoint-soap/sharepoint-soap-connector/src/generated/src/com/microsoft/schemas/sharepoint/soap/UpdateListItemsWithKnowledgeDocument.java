/*
 * An XML document type.
 * Localname: UpdateListItemsWithKnowledge
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap;


/**
 * A document containing one UpdateListItemsWithKnowledge(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public interface UpdateListItemsWithKnowledgeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UpdateListItemsWithKnowledgeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("updatelistitemswithknowledgeb91adoctype");
    
    /**
     * Gets the "UpdateListItemsWithKnowledge" element
     */
    com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge getUpdateListItemsWithKnowledge();
    
    /**
     * Sets the "UpdateListItemsWithKnowledge" element
     */
    void setUpdateListItemsWithKnowledge(com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge updateListItemsWithKnowledge);
    
    /**
     * Appends and returns a new empty "UpdateListItemsWithKnowledge" element
     */
    com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge addNewUpdateListItemsWithKnowledge();
    
    /**
     * An XML UpdateListItemsWithKnowledge(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public interface UpdateListItemsWithKnowledge extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UpdateListItemsWithKnowledge.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("updatelistitemswithknowledge2c5felemtype");
        
        /**
         * Gets the "listName" element
         */
        java.lang.String getListName();
        
        /**
         * Gets (as xml) the "listName" element
         */
        org.apache.xmlbeans.XmlString xgetListName();
        
        /**
         * Sets the "listName" element
         */
        void setListName(java.lang.String listName);
        
        /**
         * Sets (as xml) the "listName" element
         */
        void xsetListName(org.apache.xmlbeans.XmlString listName);
        
        /**
         * Gets the "updates" element
         */
        com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge.Updates getUpdates();
        
        /**
         * Sets the "updates" element
         */
        void setUpdates(com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge.Updates updates);
        
        /**
         * Appends and returns a new empty "updates" element
         */
        com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge.Updates addNewUpdates();
        
        /**
         * Gets the "syncScope" element
         */
        java.lang.String getSyncScope();
        
        /**
         * Gets (as xml) the "syncScope" element
         */
        org.apache.xmlbeans.XmlString xgetSyncScope();
        
        /**
         * True if has "syncScope" element
         */
        boolean isSetSyncScope();
        
        /**
         * Sets the "syncScope" element
         */
        void setSyncScope(java.lang.String syncScope);
        
        /**
         * Sets (as xml) the "syncScope" element
         */
        void xsetSyncScope(org.apache.xmlbeans.XmlString syncScope);
        
        /**
         * Unsets the "syncScope" element
         */
        void unsetSyncScope();
        
        /**
         * Gets the "knowledge" element
         */
        com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge.Knowledge getKnowledge();
        
        /**
         * True if has "knowledge" element
         */
        boolean isSetKnowledge();
        
        /**
         * Sets the "knowledge" element
         */
        void setKnowledge(com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge.Knowledge knowledge);
        
        /**
         * Appends and returns a new empty "knowledge" element
         */
        com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge.Knowledge addNewKnowledge();
        
        /**
         * Unsets the "knowledge" element
         */
        void unsetKnowledge();
        
        /**
         * An XML updates(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public interface Updates extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Updates.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("updates8095elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge.Updates newInstance() {
                  return (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge.Updates) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge.Updates newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge.Updates) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML knowledge(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public interface Knowledge extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Knowledge.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("knowledge3049elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge.Knowledge newInstance() {
                  return (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge.Knowledge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge.Knowledge newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge.Knowledge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge newInstance() {
              return (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.UpdateListItemsWithKnowledge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument newInstance() {
          return (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
