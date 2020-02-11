/*
 * An XML document type.
 * Localname: RestoreVersion
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.RestoreVersionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one RestoreVersion(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class RestoreVersionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.RestoreVersionDocument
{
    private static final long serialVersionUID = 1L;
    
    public RestoreVersionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESTOREVERSION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "RestoreVersion");
    
    
    /**
     * Gets the "RestoreVersion" element
     */
    public com.microsoft.schemas.sharepoint.soap.RestoreVersionDocument.RestoreVersion getRestoreVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.RestoreVersionDocument.RestoreVersion target = null;
            target = (com.microsoft.schemas.sharepoint.soap.RestoreVersionDocument.RestoreVersion)get_store().find_element_user(RESTOREVERSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RestoreVersion" element
     */
    public void setRestoreVersion(com.microsoft.schemas.sharepoint.soap.RestoreVersionDocument.RestoreVersion restoreVersion)
    {
        generatedSetterHelperImpl(restoreVersion, RESTOREVERSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RestoreVersion" element
     */
    public com.microsoft.schemas.sharepoint.soap.RestoreVersionDocument.RestoreVersion addNewRestoreVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.RestoreVersionDocument.RestoreVersion target = null;
            target = (com.microsoft.schemas.sharepoint.soap.RestoreVersionDocument.RestoreVersion)get_store().add_element_user(RESTOREVERSION$0);
            return target;
        }
    }
    /**
     * An XML RestoreVersion(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class RestoreVersionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.RestoreVersionDocument.RestoreVersion
    {
        private static final long serialVersionUID = 1L;
        
        public RestoreVersionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FILENAME$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "fileName");
        private static final javax.xml.namespace.QName FILEVERSION$2 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "fileVersion");
        
        
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
        
        /**
         * Gets the "fileVersion" element
         */
        public java.lang.String getFileVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILEVERSION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fileVersion" element
         */
        public org.apache.xmlbeans.XmlString xgetFileVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILEVERSION$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "fileVersion" element
         */
        public boolean isSetFileVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FILEVERSION$2) != 0;
            }
        }
        
        /**
         * Sets the "fileVersion" element
         */
        public void setFileVersion(java.lang.String fileVersion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILEVERSION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILEVERSION$2);
                }
                target.setStringValue(fileVersion);
            }
        }
        
        /**
         * Sets (as xml) the "fileVersion" element
         */
        public void xsetFileVersion(org.apache.xmlbeans.XmlString fileVersion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILEVERSION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FILEVERSION$2);
                }
                target.set(fileVersion);
            }
        }
        
        /**
         * Unsets the "fileVersion" element
         */
        public void unsetFileVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FILEVERSION$2, 0);
            }
        }
    }
}
