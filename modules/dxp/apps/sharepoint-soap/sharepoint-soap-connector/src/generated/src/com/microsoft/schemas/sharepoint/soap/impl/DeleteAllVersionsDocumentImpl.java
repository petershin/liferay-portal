/*
 * An XML document type.
 * Localname: DeleteAllVersions
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one DeleteAllVersions(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class DeleteAllVersionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsDocument
{
    private static final long serialVersionUID = 1L;
    
    public DeleteAllVersionsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETEALLVERSIONS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "DeleteAllVersions");
    
    
    /**
     * Gets the "DeleteAllVersions" element
     */
    public com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsDocument.DeleteAllVersions getDeleteAllVersions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsDocument.DeleteAllVersions target = null;
            target = (com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsDocument.DeleteAllVersions)get_store().find_element_user(DELETEALLVERSIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeleteAllVersions" element
     */
    public void setDeleteAllVersions(com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsDocument.DeleteAllVersions deleteAllVersions)
    {
        generatedSetterHelperImpl(deleteAllVersions, DELETEALLVERSIONS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DeleteAllVersions" element
     */
    public com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsDocument.DeleteAllVersions addNewDeleteAllVersions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsDocument.DeleteAllVersions target = null;
            target = (com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsDocument.DeleteAllVersions)get_store().add_element_user(DELETEALLVERSIONS$0);
            return target;
        }
    }
    /**
     * An XML DeleteAllVersions(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class DeleteAllVersionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsDocument.DeleteAllVersions
    {
        private static final long serialVersionUID = 1L;
        
        public DeleteAllVersionsImpl(org.apache.xmlbeans.SchemaType sType)
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
