/*
 * An XML document type.
 * Localname: GetVersionCollection
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.GetVersionCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one GetVersionCollection(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class GetVersionCollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetVersionCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetVersionCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETVERSIONCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetVersionCollection");
    
    
    /**
     * Gets the "GetVersionCollection" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetVersionCollectionDocument.GetVersionCollection getGetVersionCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetVersionCollectionDocument.GetVersionCollection target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetVersionCollectionDocument.GetVersionCollection)get_store().find_element_user(GETVERSIONCOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetVersionCollection" element
     */
    public void setGetVersionCollection(com.microsoft.schemas.sharepoint.soap.GetVersionCollectionDocument.GetVersionCollection getVersionCollection)
    {
        generatedSetterHelperImpl(getVersionCollection, GETVERSIONCOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetVersionCollection" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetVersionCollectionDocument.GetVersionCollection addNewGetVersionCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetVersionCollectionDocument.GetVersionCollection target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetVersionCollectionDocument.GetVersionCollection)get_store().add_element_user(GETVERSIONCOLLECTION$0);
            return target;
        }
    }
    /**
     * An XML GetVersionCollection(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class GetVersionCollectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetVersionCollectionDocument.GetVersionCollection
    {
        private static final long serialVersionUID = 1L;
        
        public GetVersionCollectionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STRLISTID$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "strlistID");
        private static final javax.xml.namespace.QName STRLISTITEMID$2 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "strlistItemID");
        private static final javax.xml.namespace.QName STRFIELDNAME$4 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "strFieldName");
        
        
        /**
         * Gets the "strlistID" element
         */
        public java.lang.String getStrlistID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRLISTID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "strlistID" element
         */
        public org.apache.xmlbeans.XmlString xgetStrlistID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRLISTID$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "strlistID" element
         */
        public boolean isSetStrlistID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STRLISTID$0) != 0;
            }
        }
        
        /**
         * Sets the "strlistID" element
         */
        public void setStrlistID(java.lang.String strlistID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRLISTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRLISTID$0);
                }
                target.setStringValue(strlistID);
            }
        }
        
        /**
         * Sets (as xml) the "strlistID" element
         */
        public void xsetStrlistID(org.apache.xmlbeans.XmlString strlistID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRLISTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STRLISTID$0);
                }
                target.set(strlistID);
            }
        }
        
        /**
         * Unsets the "strlistID" element
         */
        public void unsetStrlistID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STRLISTID$0, 0);
            }
        }
        
        /**
         * Gets the "strlistItemID" element
         */
        public java.lang.String getStrlistItemID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRLISTITEMID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "strlistItemID" element
         */
        public org.apache.xmlbeans.XmlString xgetStrlistItemID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRLISTITEMID$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "strlistItemID" element
         */
        public boolean isSetStrlistItemID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STRLISTITEMID$2) != 0;
            }
        }
        
        /**
         * Sets the "strlistItemID" element
         */
        public void setStrlistItemID(java.lang.String strlistItemID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRLISTITEMID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRLISTITEMID$2);
                }
                target.setStringValue(strlistItemID);
            }
        }
        
        /**
         * Sets (as xml) the "strlistItemID" element
         */
        public void xsetStrlistItemID(org.apache.xmlbeans.XmlString strlistItemID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRLISTITEMID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STRLISTITEMID$2);
                }
                target.set(strlistItemID);
            }
        }
        
        /**
         * Unsets the "strlistItemID" element
         */
        public void unsetStrlistItemID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STRLISTITEMID$2, 0);
            }
        }
        
        /**
         * Gets the "strFieldName" element
         */
        public java.lang.String getStrFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRFIELDNAME$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "strFieldName" element
         */
        public org.apache.xmlbeans.XmlString xgetStrFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRFIELDNAME$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "strFieldName" element
         */
        public boolean isSetStrFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STRFIELDNAME$4) != 0;
            }
        }
        
        /**
         * Sets the "strFieldName" element
         */
        public void setStrFieldName(java.lang.String strFieldName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRFIELDNAME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRFIELDNAME$4);
                }
                target.setStringValue(strFieldName);
            }
        }
        
        /**
         * Sets (as xml) the "strFieldName" element
         */
        public void xsetStrFieldName(org.apache.xmlbeans.XmlString strFieldName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRFIELDNAME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STRFIELDNAME$4);
                }
                target.set(strFieldName);
            }
        }
        
        /**
         * Unsets the "strFieldName" element
         */
        public void unsetStrFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STRFIELDNAME$4, 0);
            }
        }
    }
}
