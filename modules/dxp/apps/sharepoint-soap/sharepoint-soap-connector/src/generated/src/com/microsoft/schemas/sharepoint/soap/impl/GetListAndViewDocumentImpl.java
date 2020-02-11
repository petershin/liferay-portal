/*
 * An XML document type.
 * Localname: GetListAndView
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.GetListAndViewDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one GetListAndView(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class GetListAndViewDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListAndViewDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetListAndViewDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLISTANDVIEW$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListAndView");
    
    
    /**
     * Gets the "GetListAndView" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetListAndViewDocument.GetListAndView getGetListAndView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetListAndViewDocument.GetListAndView target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetListAndViewDocument.GetListAndView)get_store().find_element_user(GETLISTANDVIEW$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetListAndView" element
     */
    public void setGetListAndView(com.microsoft.schemas.sharepoint.soap.GetListAndViewDocument.GetListAndView getListAndView)
    {
        generatedSetterHelperImpl(getListAndView, GETLISTANDVIEW$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetListAndView" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetListAndViewDocument.GetListAndView addNewGetListAndView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetListAndViewDocument.GetListAndView target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetListAndViewDocument.GetListAndView)get_store().add_element_user(GETLISTANDVIEW$0);
            return target;
        }
    }
    /**
     * An XML GetListAndView(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class GetListAndViewImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListAndViewDocument.GetListAndView
    {
        private static final long serialVersionUID = 1L;
        
        public GetListAndViewImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LISTNAME$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "listName");
        private static final javax.xml.namespace.QName VIEWNAME$2 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "viewName");
        
        
        /**
         * Gets the "listName" element
         */
        public java.lang.String getListName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "listName" element
         */
        public org.apache.xmlbeans.XmlString xgetListName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LISTNAME$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "listName" element
         */
        public boolean isSetListName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LISTNAME$0) != 0;
            }
        }
        
        /**
         * Sets the "listName" element
         */
        public void setListName(java.lang.String listName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LISTNAME$0);
                }
                target.setStringValue(listName);
            }
        }
        
        /**
         * Sets (as xml) the "listName" element
         */
        public void xsetListName(org.apache.xmlbeans.XmlString listName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LISTNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LISTNAME$0);
                }
                target.set(listName);
            }
        }
        
        /**
         * Unsets the "listName" element
         */
        public void unsetListName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LISTNAME$0, 0);
            }
        }
        
        /**
         * Gets the "viewName" element
         */
        public java.lang.String getViewName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VIEWNAME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "viewName" element
         */
        public org.apache.xmlbeans.XmlString xgetViewName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VIEWNAME$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "viewName" element
         */
        public boolean isSetViewName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VIEWNAME$2) != 0;
            }
        }
        
        /**
         * Sets the "viewName" element
         */
        public void setViewName(java.lang.String viewName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VIEWNAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VIEWNAME$2);
                }
                target.setStringValue(viewName);
            }
        }
        
        /**
         * Sets (as xml) the "viewName" element
         */
        public void xsetViewName(org.apache.xmlbeans.XmlString viewName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VIEWNAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VIEWNAME$2);
                }
                target.set(viewName);
            }
        }
        
        /**
         * Unsets the "viewName" element
         */
        public void unsetViewName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VIEWNAME$2, 0);
            }
        }
    }
}
