/*
 * An XML document type.
 * Localname: UndoCheckOutResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.UndoCheckOutResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one UndoCheckOutResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class UndoCheckOutResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UndoCheckOutResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public UndoCheckOutResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNDOCHECKOUTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "UndoCheckOutResponse");
    
    
    /**
     * Gets the "UndoCheckOutResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.UndoCheckOutResponseDocument.UndoCheckOutResponse getUndoCheckOutResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.UndoCheckOutResponseDocument.UndoCheckOutResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.UndoCheckOutResponseDocument.UndoCheckOutResponse)get_store().find_element_user(UNDOCHECKOUTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UndoCheckOutResponse" element
     */
    public void setUndoCheckOutResponse(com.microsoft.schemas.sharepoint.soap.UndoCheckOutResponseDocument.UndoCheckOutResponse undoCheckOutResponse)
    {
        generatedSetterHelperImpl(undoCheckOutResponse, UNDOCHECKOUTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "UndoCheckOutResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.UndoCheckOutResponseDocument.UndoCheckOutResponse addNewUndoCheckOutResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.UndoCheckOutResponseDocument.UndoCheckOutResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.UndoCheckOutResponseDocument.UndoCheckOutResponse)get_store().add_element_user(UNDOCHECKOUTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UndoCheckOutResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class UndoCheckOutResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.UndoCheckOutResponseDocument.UndoCheckOutResponse
    {
        private static final long serialVersionUID = 1L;
        
        public UndoCheckOutResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName UNDOCHECKOUTRESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "UndoCheckOutResult");
        
        
        /**
         * Gets the "UndoCheckOutResult" element
         */
        public boolean getUndoCheckOutResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNDOCHECKOUTRESULT$0, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "UndoCheckOutResult" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetUndoCheckOutResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(UNDOCHECKOUTRESULT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "UndoCheckOutResult" element
         */
        public void setUndoCheckOutResult(boolean undoCheckOutResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNDOCHECKOUTRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNDOCHECKOUTRESULT$0);
                }
                target.setBooleanValue(undoCheckOutResult);
            }
        }
        
        /**
         * Sets (as xml) the "UndoCheckOutResult" element
         */
        public void xsetUndoCheckOutResult(org.apache.xmlbeans.XmlBoolean undoCheckOutResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(UNDOCHECKOUTRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(UNDOCHECKOUTRESULT$0);
                }
                target.set(undoCheckOutResult);
            }
        }
    }
}
