/*
 * An XML document type.
 * Localname: GetListCollectionResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.GetListCollectionResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one GetListCollectionResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class GetListCollectionResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListCollectionResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetListCollectionResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLISTCOLLECTIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListCollectionResponse");
    
    
    /**
     * Gets the "GetListCollectionResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetListCollectionResponseDocument.GetListCollectionResponse getGetListCollectionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetListCollectionResponseDocument.GetListCollectionResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetListCollectionResponseDocument.GetListCollectionResponse)get_store().find_element_user(GETLISTCOLLECTIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetListCollectionResponse" element
     */
    public void setGetListCollectionResponse(com.microsoft.schemas.sharepoint.soap.GetListCollectionResponseDocument.GetListCollectionResponse getListCollectionResponse)
    {
        generatedSetterHelperImpl(getListCollectionResponse, GETLISTCOLLECTIONRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetListCollectionResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetListCollectionResponseDocument.GetListCollectionResponse addNewGetListCollectionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetListCollectionResponseDocument.GetListCollectionResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetListCollectionResponseDocument.GetListCollectionResponse)get_store().add_element_user(GETLISTCOLLECTIONRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetListCollectionResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class GetListCollectionResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListCollectionResponseDocument.GetListCollectionResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetListCollectionResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETLISTCOLLECTIONRESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListCollectionResult");
        
        
        /**
         * Gets the "GetListCollectionResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListCollectionResponseDocument.GetListCollectionResponse.GetListCollectionResult getGetListCollectionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListCollectionResponseDocument.GetListCollectionResponse.GetListCollectionResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListCollectionResponseDocument.GetListCollectionResponse.GetListCollectionResult)get_store().find_element_user(GETLISTCOLLECTIONRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GetListCollectionResult" element
         */
        public boolean isSetGetListCollectionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETLISTCOLLECTIONRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "GetListCollectionResult" element
         */
        public void setGetListCollectionResult(com.microsoft.schemas.sharepoint.soap.GetListCollectionResponseDocument.GetListCollectionResponse.GetListCollectionResult getListCollectionResult)
        {
            generatedSetterHelperImpl(getListCollectionResult, GETLISTCOLLECTIONRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GetListCollectionResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.GetListCollectionResponseDocument.GetListCollectionResponse.GetListCollectionResult addNewGetListCollectionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.GetListCollectionResponseDocument.GetListCollectionResponse.GetListCollectionResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.GetListCollectionResponseDocument.GetListCollectionResponse.GetListCollectionResult)get_store().add_element_user(GETLISTCOLLECTIONRESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "GetListCollectionResult" element
         */
        public void unsetGetListCollectionResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETLISTCOLLECTIONRESULT$0, 0);
            }
        }
        /**
         * An XML GetListCollectionResult(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class GetListCollectionResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListCollectionResponseDocument.GetListCollectionResponse.GetListCollectionResult
        {
            private static final long serialVersionUID = 1L;
            
            public GetListCollectionResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
