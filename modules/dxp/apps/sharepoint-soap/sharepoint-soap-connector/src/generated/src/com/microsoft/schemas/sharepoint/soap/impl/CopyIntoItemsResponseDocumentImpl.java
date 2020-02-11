/*
 * An XML document type.
 * Localname: CopyIntoItemsResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.CopyIntoItemsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one CopyIntoItemsResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class CopyIntoItemsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.CopyIntoItemsResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CopyIntoItemsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COPYINTOITEMSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "CopyIntoItemsResponse");
    
    
    /**
     * Gets the "CopyIntoItemsResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.CopyIntoItemsResponseDocument.CopyIntoItemsResponse getCopyIntoItemsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.CopyIntoItemsResponseDocument.CopyIntoItemsResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.CopyIntoItemsResponseDocument.CopyIntoItemsResponse)get_store().find_element_user(COPYINTOITEMSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CopyIntoItemsResponse" element
     */
    public void setCopyIntoItemsResponse(com.microsoft.schemas.sharepoint.soap.CopyIntoItemsResponseDocument.CopyIntoItemsResponse copyIntoItemsResponse)
    {
        generatedSetterHelperImpl(copyIntoItemsResponse, COPYINTOITEMSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CopyIntoItemsResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.CopyIntoItemsResponseDocument.CopyIntoItemsResponse addNewCopyIntoItemsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.CopyIntoItemsResponseDocument.CopyIntoItemsResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.CopyIntoItemsResponseDocument.CopyIntoItemsResponse)get_store().add_element_user(COPYINTOITEMSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CopyIntoItemsResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class CopyIntoItemsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.CopyIntoItemsResponseDocument.CopyIntoItemsResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CopyIntoItemsResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COPYINTOITEMSRESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "CopyIntoItemsResult");
        private static final javax.xml.namespace.QName RESULTS$2 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "Results");
        
        
        /**
         * Gets the "CopyIntoItemsResult" element
         */
        public long getCopyIntoItemsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COPYINTOITEMSRESULT$0, 0);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "CopyIntoItemsResult" element
         */
        public org.apache.xmlbeans.XmlUnsignedInt xgetCopyIntoItemsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlUnsignedInt target = null;
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(COPYINTOITEMSRESULT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CopyIntoItemsResult" element
         */
        public void setCopyIntoItemsResult(long copyIntoItemsResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COPYINTOITEMSRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COPYINTOITEMSRESULT$0);
                }
                target.setLongValue(copyIntoItemsResult);
            }
        }
        
        /**
         * Sets (as xml) the "CopyIntoItemsResult" element
         */
        public void xsetCopyIntoItemsResult(org.apache.xmlbeans.XmlUnsignedInt copyIntoItemsResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlUnsignedInt target = null;
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(COPYINTOITEMSRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_element_user(COPYINTOITEMSRESULT$0);
                }
                target.set(copyIntoItemsResult);
            }
        }
        
        /**
         * Gets the "Results" element
         */
        public com.microsoft.schemas.sharepoint.soap.CopyResultCollection getResults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.CopyResultCollection target = null;
                target = (com.microsoft.schemas.sharepoint.soap.CopyResultCollection)get_store().find_element_user(RESULTS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Results" element
         */
        public boolean isSetResults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESULTS$2) != 0;
            }
        }
        
        /**
         * Sets the "Results" element
         */
        public void setResults(com.microsoft.schemas.sharepoint.soap.CopyResultCollection results)
        {
            generatedSetterHelperImpl(results, RESULTS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Results" element
         */
        public com.microsoft.schemas.sharepoint.soap.CopyResultCollection addNewResults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.CopyResultCollection target = null;
                target = (com.microsoft.schemas.sharepoint.soap.CopyResultCollection)get_store().add_element_user(RESULTS$2);
                return target;
            }
        }
        
        /**
         * Unsets the "Results" element
         */
        public void unsetResults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESULTS$2, 0);
            }
        }
    }
}
