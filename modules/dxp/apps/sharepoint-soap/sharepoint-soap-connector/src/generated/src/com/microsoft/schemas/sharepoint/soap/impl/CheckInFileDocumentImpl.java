/*
 * An XML document type.
 * Localname: CheckInFile
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.CheckInFileDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one CheckInFile(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class CheckInFileDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.CheckInFileDocument
{
    private static final long serialVersionUID = 1L;
    
    public CheckInFileDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHECKINFILE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "CheckInFile");
    
    
    /**
     * Gets the "CheckInFile" element
     */
    public com.microsoft.schemas.sharepoint.soap.CheckInFileDocument.CheckInFile getCheckInFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.CheckInFileDocument.CheckInFile target = null;
            target = (com.microsoft.schemas.sharepoint.soap.CheckInFileDocument.CheckInFile)get_store().find_element_user(CHECKINFILE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CheckInFile" element
     */
    public void setCheckInFile(com.microsoft.schemas.sharepoint.soap.CheckInFileDocument.CheckInFile checkInFile)
    {
        generatedSetterHelperImpl(checkInFile, CHECKINFILE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CheckInFile" element
     */
    public com.microsoft.schemas.sharepoint.soap.CheckInFileDocument.CheckInFile addNewCheckInFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.CheckInFileDocument.CheckInFile target = null;
            target = (com.microsoft.schemas.sharepoint.soap.CheckInFileDocument.CheckInFile)get_store().add_element_user(CHECKINFILE$0);
            return target;
        }
    }
    /**
     * An XML CheckInFile(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class CheckInFileImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.CheckInFileDocument.CheckInFile
    {
        private static final long serialVersionUID = 1L;
        
        public CheckInFileImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PAGEURL$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "pageUrl");
        private static final javax.xml.namespace.QName COMMENT$2 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "comment");
        private static final javax.xml.namespace.QName CHECKINTYPE$4 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "CheckinType");
        
        
        /**
         * Gets the "pageUrl" element
         */
        public java.lang.String getPageUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGEURL$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "pageUrl" element
         */
        public org.apache.xmlbeans.XmlString xgetPageUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAGEURL$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "pageUrl" element
         */
        public boolean isSetPageUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PAGEURL$0) != 0;
            }
        }
        
        /**
         * Sets the "pageUrl" element
         */
        public void setPageUrl(java.lang.String pageUrl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGEURL$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAGEURL$0);
                }
                target.setStringValue(pageUrl);
            }
        }
        
        /**
         * Sets (as xml) the "pageUrl" element
         */
        public void xsetPageUrl(org.apache.xmlbeans.XmlString pageUrl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAGEURL$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PAGEURL$0);
                }
                target.set(pageUrl);
            }
        }
        
        /**
         * Unsets the "pageUrl" element
         */
        public void unsetPageUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PAGEURL$0, 0);
            }
        }
        
        /**
         * Gets the "comment" element
         */
        public java.lang.String getComment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "comment" element
         */
        public org.apache.xmlbeans.XmlString xgetComment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENT$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "comment" element
         */
        public boolean isSetComment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMMENT$2) != 0;
            }
        }
        
        /**
         * Sets the "comment" element
         */
        public void setComment(java.lang.String comment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMENT$2);
                }
                target.setStringValue(comment);
            }
        }
        
        /**
         * Sets (as xml) the "comment" element
         */
        public void xsetComment(org.apache.xmlbeans.XmlString comment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMMENT$2);
                }
                target.set(comment);
            }
        }
        
        /**
         * Unsets the "comment" element
         */
        public void unsetComment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMMENT$2, 0);
            }
        }
        
        /**
         * Gets the "CheckinType" element
         */
        public java.lang.String getCheckinType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHECKINTYPE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CheckinType" element
         */
        public org.apache.xmlbeans.XmlString xgetCheckinType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHECKINTYPE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "CheckinType" element
         */
        public boolean isSetCheckinType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CHECKINTYPE$4) != 0;
            }
        }
        
        /**
         * Sets the "CheckinType" element
         */
        public void setCheckinType(java.lang.String checkinType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHECKINTYPE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHECKINTYPE$4);
                }
                target.setStringValue(checkinType);
            }
        }
        
        /**
         * Sets (as xml) the "CheckinType" element
         */
        public void xsetCheckinType(org.apache.xmlbeans.XmlString checkinType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHECKINTYPE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHECKINTYPE$4);
                }
                target.set(checkinType);
            }
        }
        
        /**
         * Unsets the "CheckinType" element
         */
        public void unsetCheckinType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CHECKINTYPE$4, 0);
            }
        }
    }
}
