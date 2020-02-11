/*
 * An XML document type.
 * Localname: RestoreVersionResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.RestoreVersionResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one RestoreVersionResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class RestoreVersionResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.RestoreVersionResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public RestoreVersionResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESTOREVERSIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "RestoreVersionResponse");
    
    
    /**
     * Gets the "RestoreVersionResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.RestoreVersionResponseDocument.RestoreVersionResponse getRestoreVersionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.RestoreVersionResponseDocument.RestoreVersionResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.RestoreVersionResponseDocument.RestoreVersionResponse)get_store().find_element_user(RESTOREVERSIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RestoreVersionResponse" element
     */
    public void setRestoreVersionResponse(com.microsoft.schemas.sharepoint.soap.RestoreVersionResponseDocument.RestoreVersionResponse restoreVersionResponse)
    {
        generatedSetterHelperImpl(restoreVersionResponse, RESTOREVERSIONRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RestoreVersionResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.RestoreVersionResponseDocument.RestoreVersionResponse addNewRestoreVersionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.RestoreVersionResponseDocument.RestoreVersionResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.RestoreVersionResponseDocument.RestoreVersionResponse)get_store().add_element_user(RESTOREVERSIONRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML RestoreVersionResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class RestoreVersionResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.RestoreVersionResponseDocument.RestoreVersionResponse
    {
        private static final long serialVersionUID = 1L;
        
        public RestoreVersionResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESTOREVERSIONRESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "RestoreVersionResult");
        
        
        /**
         * Gets the "RestoreVersionResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.RestoreVersionResponseDocument.RestoreVersionResponse.RestoreVersionResult getRestoreVersionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.RestoreVersionResponseDocument.RestoreVersionResponse.RestoreVersionResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.RestoreVersionResponseDocument.RestoreVersionResponse.RestoreVersionResult)get_store().find_element_user(RESTOREVERSIONRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "RestoreVersionResult" element
         */
        public boolean isSetRestoreVersionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESTOREVERSIONRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "RestoreVersionResult" element
         */
        public void setRestoreVersionResult(com.microsoft.schemas.sharepoint.soap.RestoreVersionResponseDocument.RestoreVersionResponse.RestoreVersionResult restoreVersionResult)
        {
            generatedSetterHelperImpl(restoreVersionResult, RESTOREVERSIONRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "RestoreVersionResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.RestoreVersionResponseDocument.RestoreVersionResponse.RestoreVersionResult addNewRestoreVersionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.RestoreVersionResponseDocument.RestoreVersionResponse.RestoreVersionResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.RestoreVersionResponseDocument.RestoreVersionResponse.RestoreVersionResult)get_store().add_element_user(RESTOREVERSIONRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "RestoreVersionResult" element
         */
        public void unsetRestoreVersionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESTOREVERSIONRESULT$0, 0);
            }
        }
        /**
         * An XML RestoreVersionResult(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class RestoreVersionResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.RestoreVersionResponseDocument.RestoreVersionResponse.RestoreVersionResult
        {
            private static final long serialVersionUID = 1L;
            
            public RestoreVersionResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
