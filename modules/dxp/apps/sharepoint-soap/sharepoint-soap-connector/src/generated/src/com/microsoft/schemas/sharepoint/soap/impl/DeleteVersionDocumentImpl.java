/*
 * An XML document type.
 * Localname: DeleteVersion
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.DeleteVersionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one DeleteVersion(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class DeleteVersionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.DeleteVersionDocument
{
    private static final long serialVersionUID = 1L;
    
    public DeleteVersionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETEVERSION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "DeleteVersion");
    
    
    /**
     * Gets the "DeleteVersion" element
     */
    public com.microsoft.schemas.sharepoint.soap.DeleteVersionDocument.DeleteVersion getDeleteVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.DeleteVersionDocument.DeleteVersion target = null;
            target = (com.microsoft.schemas.sharepoint.soap.DeleteVersionDocument.DeleteVersion)get_store().find_element_user(DELETEVERSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeleteVersion" element
     */
    public void setDeleteVersion(com.microsoft.schemas.sharepoint.soap.DeleteVersionDocument.DeleteVersion deleteVersion)
    {
        generatedSetterHelperImpl(deleteVersion, DELETEVERSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DeleteVersion" element
     */
    public com.microsoft.schemas.sharepoint.soap.DeleteVersionDocument.DeleteVersion addNewDeleteVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.DeleteVersionDocument.DeleteVersion target = null;
            target = (com.microsoft.schemas.sharepoint.soap.DeleteVersionDocument.DeleteVersion)get_store().add_element_user(DELETEVERSION$0);
            return target;
        }
    }
    /**
     * An XML DeleteVersion(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class DeleteVersionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.DeleteVersionDocument.DeleteVersion
    {
        private static final long serialVersionUID = 1L;
        
        public DeleteVersionImpl(org.apache.xmlbeans.SchemaType sType)
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
