/*
 * An XML document type.
 * Localname: GetVersions
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.GetVersionsDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one GetVersions(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class GetVersionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetVersionsDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetVersionsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETVERSIONS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetVersions");
    
    
    /**
     * Gets the "GetVersions" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetVersionsDocument.GetVersions getGetVersions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetVersionsDocument.GetVersions target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetVersionsDocument.GetVersions)get_store().find_element_user(GETVERSIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetVersions" element
     */
    public void setGetVersions(com.microsoft.schemas.sharepoint.soap.GetVersionsDocument.GetVersions getVersions)
    {
        generatedSetterHelperImpl(getVersions, GETVERSIONS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetVersions" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetVersionsDocument.GetVersions addNewGetVersions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetVersionsDocument.GetVersions target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetVersionsDocument.GetVersions)get_store().add_element_user(GETVERSIONS$0);
            return target;
        }
    }
    /**
     * An XML GetVersions(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class GetVersionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetVersionsDocument.GetVersions
    {
        private static final long serialVersionUID = 1L;
        
        public GetVersionsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FILENAME$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "fileName");
        
        
        /**
         * Gets the "fileName" element
         */
        public java.lang.String getFileName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILENAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fileName" element
         */
        public org.apache.xmlbeans.XmlString xgetFileName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILENAME$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "fileName" element
         */
        public boolean isSetFileName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FILENAME$0) != 0;
            }
        }
        
        /**
         * Sets the "fileName" element
         */
        public void setFileName(java.lang.String fileName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILENAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILENAME$0);
                }
                target.setStringValue(fileName);
            }
        }
        
        /**
         * Sets (as xml) the "fileName" element
         */
        public void xsetFileName(org.apache.xmlbeans.XmlString fileName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILENAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FILENAME$0);
                }
                target.set(fileName);
            }
        }
        
        /**
         * Unsets the "fileName" element
         */
        public void unsetFileName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FILENAME$0, 0);
            }
        }
    }
}
