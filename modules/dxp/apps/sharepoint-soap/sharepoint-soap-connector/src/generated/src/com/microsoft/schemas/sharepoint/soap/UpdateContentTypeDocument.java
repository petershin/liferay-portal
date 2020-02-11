/*
 * An XML document type.
 * Localname: UpdateContentType
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap;


/**
 * A document containing one UpdateContentType(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public interface UpdateContentTypeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UpdateContentTypeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("updatecontenttypeebb3doctype");
    
    /**
     * Gets the "UpdateContentType" element
     */
    com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType getUpdateContentType();
    
    /**
     * Sets the "UpdateContentType" element
     */
    void setUpdateContentType(com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType updateContentType);
    
    /**
     * Appends and returns a new empty "UpdateContentType" element
     */
    com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType addNewUpdateContentType();
    
    /**
     * An XML UpdateContentType(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public interface UpdateContentType extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UpdateContentType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("updatecontenttype6349elemtype");
        
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
         * Gets the "contentTypeProperties" element
         */
        com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.ContentTypeProperties getContentTypeProperties();
        
        /**
         * True if has "contentTypeProperties" element
         */
        boolean isSetContentTypeProperties();
        
        /**
         * Sets the "contentTypeProperties" element
         */
        void setContentTypeProperties(com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.ContentTypeProperties contentTypeProperties);
        
        /**
         * Appends and returns a new empty "contentTypeProperties" element
         */
        com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.ContentTypeProperties addNewContentTypeProperties();
        
        /**
         * Unsets the "contentTypeProperties" element
         */
        void unsetContentTypeProperties();
        
        /**
         * Gets the "newFields" element
         */
        com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.NewFields getNewFields();
        
        /**
         * True if has "newFields" element
         */
        boolean isSetNewFields();
        
        /**
         * Sets the "newFields" element
         */
        void setNewFields(com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.NewFields newFields);
        
        /**
         * Appends and returns a new empty "newFields" element
         */
        com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.NewFields addNewNewFields();
        
        /**
         * Unsets the "newFields" element
         */
        void unsetNewFields();
        
        /**
         * Gets the "updateFields" element
         */
        com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.UpdateFields getUpdateFields();
        
        /**
         * True if has "updateFields" element
         */
        boolean isSetUpdateFields();
        
        /**
         * Sets the "updateFields" element
         */
        void setUpdateFields(com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.UpdateFields updateFields);
        
        /**
         * Appends and returns a new empty "updateFields" element
         */
        com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.UpdateFields addNewUpdateFields();
        
        /**
         * Unsets the "updateFields" element
         */
        void unsetUpdateFields();
        
        /**
         * Gets the "deleteFields" element
         */
        com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.DeleteFields getDeleteFields();
        
        /**
         * True if has "deleteFields" element
         */
        boolean isSetDeleteFields();
        
        /**
         * Sets the "deleteFields" element
         */
        void setDeleteFields(com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.DeleteFields deleteFields);
        
        /**
         * Appends and returns a new empty "deleteFields" element
         */
        com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.DeleteFields addNewDeleteFields();
        
        /**
         * Unsets the "deleteFields" element
         */
        void unsetDeleteFields();
        
        /**
         * Gets the "addToView" element
         */
        java.lang.String getAddToView();
        
        /**
         * Gets (as xml) the "addToView" element
         */
        org.apache.xmlbeans.XmlString xgetAddToView();
        
        /**
         * True if has "addToView" element
         */
        boolean isSetAddToView();
        
        /**
         * Sets the "addToView" element
         */
        void setAddToView(java.lang.String addToView);
        
        /**
         * Sets (as xml) the "addToView" element
         */
        void xsetAddToView(org.apache.xmlbeans.XmlString addToView);
        
        /**
         * Unsets the "addToView" element
         */
        void unsetAddToView();
        
        /**
         * An XML contentTypeProperties(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public interface ContentTypeProperties extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ContentTypeProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("contenttypeproperties611belemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.ContentTypeProperties newInstance() {
                  return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.ContentTypeProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.ContentTypeProperties newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.ContentTypeProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML newFields(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public interface NewFields extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NewFields.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("newfieldsd06eelemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.NewFields newInstance() {
                  return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.NewFields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.NewFields newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.NewFields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML updateFields(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public interface UpdateFields extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UpdateFields.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("updatefields2e47elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.UpdateFields newInstance() {
                  return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.UpdateFields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.UpdateFields newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.UpdateFields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML deleteFields(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public interface DeleteFields extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DeleteFields.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB9FDA362101EDDF9D85C774AE43DE33").resolveHandle("deletefields2429elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.DeleteFields newInstance() {
                  return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.DeleteFields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.DeleteFields newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType.DeleteFields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType newInstance() {
              return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.UpdateContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument newInstance() {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
