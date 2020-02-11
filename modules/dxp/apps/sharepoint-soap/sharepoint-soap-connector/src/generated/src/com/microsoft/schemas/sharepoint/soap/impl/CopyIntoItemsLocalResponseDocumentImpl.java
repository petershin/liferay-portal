/*
 * An XML document type.
 * Localname: CopyIntoItemsLocalResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.CopyIntoItemsLocalResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one CopyIntoItemsLocalResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class CopyIntoItemsLocalResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.CopyIntoItemsLocalResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CopyIntoItemsLocalResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COPYINTOITEMSLOCALRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "CopyIntoItemsLocalResponse");
    
    
    /**
     * Gets the "CopyIntoItemsLocalResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.CopyIntoItemsLocalResponseDocument.CopyIntoItemsLocalResponse getCopyIntoItemsLocalResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.CopyIntoItemsLocalResponseDocument.CopyIntoItemsLocalResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.CopyIntoItemsLocalResponseDocument.CopyIntoItemsLocalResponse)get_store().find_element_user(COPYINTOITEMSLOCALRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CopyIntoItemsLocalResponse" element
     */
    public void setCopyIntoItemsLocalResponse(com.microsoft.schemas.sharepoint.soap.CopyIntoItemsLocalResponseDocument.CopyIntoItemsLocalResponse copyIntoItemsLocalResponse)
    {
        generatedSetterHelperImpl(copyIntoItemsLocalResponse, COPYINTOITEMSLOCALRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CopyIntoItemsLocalResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.CopyIntoItemsLocalResponseDocument.CopyIntoItemsLocalResponse addNewCopyIntoItemsLocalResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.CopyIntoItemsLocalResponseDocument.CopyIntoItemsLocalResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.CopyIntoItemsLocalResponseDocument.CopyIntoItemsLocalResponse)get_store().add_element_user(COPYINTOITEMSLOCALRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CopyIntoItemsLocalResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class CopyIntoItemsLocalResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.CopyIntoItemsLocalResponseDocument.CopyIntoItemsLocalResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CopyIntoItemsLocalResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COPYINTOITEMSLOCALRESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "CopyIntoItemsLocalResult");
        private static final javax.xml.namespace.QName RESULTS$2 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "Results");
        
        
        /**
         * Gets the "CopyIntoItemsLocalResult" element
         */
        public long getCopyIntoItemsLocalResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COPYINTOITEMSLOCALRESULT$0, 0);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "CopyIntoItemsLocalResult" element
         */
        public org.apache.xmlbeans.XmlUnsignedInt xgetCopyIntoItemsLocalResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlUnsignedInt target = null;
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(COPYINTOITEMSLOCALRESULT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CopyIntoItemsLocalResult" element
         */
        public void setCopyIntoItemsLocalResult(long copyIntoItemsLocalResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COPYINTOITEMSLOCALRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COPYINTOITEMSLOCALRESULT$0);
                }
                target.setLongValue(copyIntoItemsLocalResult);
            }
        }
        
        /**
         * Sets (as xml) the "CopyIntoItemsLocalResult" element
         */
        public void xsetCopyIntoItemsLocalResult(org.apache.xmlbeans.XmlUnsignedInt copyIntoItemsLocalResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlUnsignedInt target = null;
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(COPYINTOITEMSLOCALRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_element_user(COPYINTOITEMSLOCALRESULT$0);
                }
                target.set(copyIntoItemsLocalResult);
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
