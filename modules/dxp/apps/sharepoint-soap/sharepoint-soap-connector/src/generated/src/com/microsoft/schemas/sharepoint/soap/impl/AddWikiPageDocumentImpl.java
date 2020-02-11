/*
 * An XML document type.
 * Localname: AddWikiPage
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one AddWikiPage(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class AddWikiPageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddWikiPageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDWIKIPAGE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "AddWikiPage");
    
    
    /**
     * Gets the "AddWikiPage" element
     */
    public com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument.AddWikiPage getAddWikiPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument.AddWikiPage target = null;
            target = (com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument.AddWikiPage)get_store().find_element_user(ADDWIKIPAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AddWikiPage" element
     */
    public void setAddWikiPage(com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument.AddWikiPage addWikiPage)
    {
        generatedSetterHelperImpl(addWikiPage, ADDWIKIPAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AddWikiPage" element
     */
    public com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument.AddWikiPage addNewAddWikiPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument.AddWikiPage target = null;
            target = (com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument.AddWikiPage)get_store().add_element_user(ADDWIKIPAGE$0);
            return target;
        }
    }
    /**
     * An XML AddWikiPage(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class AddWikiPageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument.AddWikiPage
    {
        private static final long serialVersionUID = 1L;
        
        public AddWikiPageImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STRLISTNAME$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "strListName");
        private static final javax.xml.namespace.QName LISTRELPAGEURL$2 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "listRelPageUrl");
        private static final javax.xml.namespace.QName WIKICONTENT$4 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "wikiContent");
        
        
        /**
         * Gets the "strListName" element
         */
        public java.lang.String getStrListName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRLISTNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "strListName" element
         */
        public org.apache.xmlbeans.XmlString xgetStrListName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRLISTNAME$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "strListName" element
         */
        public boolean isSetStrListName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STRLISTNAME$0) != 0;
            }
        }
        
        /**
         * Sets the "strListName" element
         */
        public void setStrListName(java.lang.String strListName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRLISTNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRLISTNAME$0);
                }
                target.setStringValue(strListName);
            }
        }
        
        /**
         * Sets (as xml) the "strListName" element
         */
        public void xsetStrListName(org.apache.xmlbeans.XmlString strListName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRLISTNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STRLISTNAME$0);
                }
                target.set(strListName);
            }
        }
        
        /**
         * Unsets the "strListName" element
         */
        public void unsetStrListName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STRLISTNAME$0, 0);
            }
        }
        
        /**
         * Gets the "listRelPageUrl" element
         */
        public java.lang.String getListRelPageUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTRELPAGEURL$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "listRelPageUrl" element
         */
        public org.apache.xmlbeans.XmlString xgetListRelPageUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LISTRELPAGEURL$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "listRelPageUrl" element
         */
        public boolean isSetListRelPageUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LISTRELPAGEURL$2) != 0;
            }
        }
        
        /**
         * Sets the "listRelPageUrl" element
         */
        public void setListRelPageUrl(java.lang.String listRelPageUrl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTRELPAGEURL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LISTRELPAGEURL$2);
                }
                target.setStringValue(listRelPageUrl);
            }
        }
        
        /**
         * Sets (as xml) the "listRelPageUrl" element
         */
        public void xsetListRelPageUrl(org.apache.xmlbeans.XmlString listRelPageUrl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LISTRELPAGEURL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LISTRELPAGEURL$2);
                }
                target.set(listRelPageUrl);
            }
        }
        
        /**
         * Unsets the "listRelPageUrl" element
         */
        public void unsetListRelPageUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LISTRELPAGEURL$2, 0);
            }
        }
        
        /**
         * Gets the "wikiContent" element
         */
        public java.lang.String getWikiContent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WIKICONTENT$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "wikiContent" element
         */
        public org.apache.xmlbeans.XmlString xgetWikiContent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WIKICONTENT$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "wikiContent" element
         */
        public boolean isSetWikiContent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WIKICONTENT$4) != 0;
            }
        }
        
        /**
         * Sets the "wikiContent" element
         */
        public void setWikiContent(java.lang.String wikiContent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WIKICONTENT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WIKICONTENT$4);
                }
                target.setStringValue(wikiContent);
            }
        }
        
        /**
         * Sets (as xml) the "wikiContent" element
         */
        public void xsetWikiContent(org.apache.xmlbeans.XmlString wikiContent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WIKICONTENT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WIKICONTENT$4);
                }
                target.set(wikiContent);
            }
        }
        
        /**
         * Unsets the "wikiContent" element
         */
        public void unsetWikiContent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WIKICONTENT$4, 0);
            }
        }
    }
}
