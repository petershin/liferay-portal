/*
 * An XML document type.
 * Localname: DeleteVersionResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.DeleteVersionResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one DeleteVersionResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class DeleteVersionResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.DeleteVersionResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public DeleteVersionResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETEVERSIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "DeleteVersionResponse");
    
    
    /**
     * Gets the "DeleteVersionResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.DeleteVersionResponseDocument.DeleteVersionResponse getDeleteVersionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.DeleteVersionResponseDocument.DeleteVersionResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.DeleteVersionResponseDocument.DeleteVersionResponse)get_store().find_element_user(DELETEVERSIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeleteVersionResponse" element
     */
    public void setDeleteVersionResponse(com.microsoft.schemas.sharepoint.soap.DeleteVersionResponseDocument.DeleteVersionResponse deleteVersionResponse)
    {
        generatedSetterHelperImpl(deleteVersionResponse, DELETEVERSIONRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DeleteVersionResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.DeleteVersionResponseDocument.DeleteVersionResponse addNewDeleteVersionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.DeleteVersionResponseDocument.DeleteVersionResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.DeleteVersionResponseDocument.DeleteVersionResponse)get_store().add_element_user(DELETEVERSIONRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML DeleteVersionResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class DeleteVersionResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.DeleteVersionResponseDocument.DeleteVersionResponse
    {
        private static final long serialVersionUID = 1L;
        
        public DeleteVersionResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DELETEVERSIONRESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "DeleteVersionResult");
        
        
        /**
         * Gets the "DeleteVersionResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.DeleteVersionResponseDocument.DeleteVersionResponse.DeleteVersionResult getDeleteVersionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.DeleteVersionResponseDocument.DeleteVersionResponse.DeleteVersionResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.DeleteVersionResponseDocument.DeleteVersionResponse.DeleteVersionResult)get_store().find_element_user(DELETEVERSIONRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "DeleteVersionResult" element
         */
        public boolean isSetDeleteVersionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DELETEVERSIONRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "DeleteVersionResult" element
         */
        public void setDeleteVersionResult(com.microsoft.schemas.sharepoint.soap.DeleteVersionResponseDocument.DeleteVersionResponse.DeleteVersionResult deleteVersionResult)
        {
            generatedSetterHelperImpl(deleteVersionResult, DELETEVERSIONRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "DeleteVersionResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.DeleteVersionResponseDocument.DeleteVersionResponse.DeleteVersionResult addNewDeleteVersionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.DeleteVersionResponseDocument.DeleteVersionResponse.DeleteVersionResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.DeleteVersionResponseDocument.DeleteVersionResponse.DeleteVersionResult)get_store().add_element_user(DELETEVERSIONRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "DeleteVersionResult" element
         */
        public void unsetDeleteVersionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DELETEVERSIONRESULT$0, 0);
            }
        }
        /**
         * An XML DeleteVersionResult(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class DeleteVersionResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.DeleteVersionResponseDocument.DeleteVersionResponse.DeleteVersionResult
        {
            private static final long serialVersionUID = 1L;
            
            public DeleteVersionResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
