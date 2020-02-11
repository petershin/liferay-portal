/*
 * An XML document type.
 * Localname: AddListFromFeatureResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.AddListFromFeatureResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one AddListFromFeatureResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class AddListFromFeatureResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.AddListFromFeatureResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddListFromFeatureResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDLISTFROMFEATURERESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "AddListFromFeatureResponse");
    
    
    /**
     * Gets the "AddListFromFeatureResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.AddListFromFeatureResponseDocument.AddListFromFeatureResponse getAddListFromFeatureResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.AddListFromFeatureResponseDocument.AddListFromFeatureResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.AddListFromFeatureResponseDocument.AddListFromFeatureResponse)get_store().find_element_user(ADDLISTFROMFEATURERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AddListFromFeatureResponse" element
     */
    public void setAddListFromFeatureResponse(com.microsoft.schemas.sharepoint.soap.AddListFromFeatureResponseDocument.AddListFromFeatureResponse addListFromFeatureResponse)
    {
        generatedSetterHelperImpl(addListFromFeatureResponse, ADDLISTFROMFEATURERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AddListFromFeatureResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.AddListFromFeatureResponseDocument.AddListFromFeatureResponse addNewAddListFromFeatureResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.AddListFromFeatureResponseDocument.AddListFromFeatureResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.AddListFromFeatureResponseDocument.AddListFromFeatureResponse)get_store().add_element_user(ADDLISTFROMFEATURERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML AddListFromFeatureResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class AddListFromFeatureResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.AddListFromFeatureResponseDocument.AddListFromFeatureResponse
    {
        private static final long serialVersionUID = 1L;
        
        public AddListFromFeatureResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ADDLISTFROMFEATURERESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "AddListFromFeatureResult");
        
        
        /**
         * Gets the "AddListFromFeatureResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.AddListFromFeatureResponseDocument.AddListFromFeatureResponse.AddListFromFeatureResult getAddListFromFeatureResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.AddListFromFeatureResponseDocument.AddListFromFeatureResponse.AddListFromFeatureResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.AddListFromFeatureResponseDocument.AddListFromFeatureResponse.AddListFromFeatureResult)get_store().find_element_user(ADDLISTFROMFEATURERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "AddListFromFeatureResult" element
         */
        public boolean isSetAddListFromFeatureResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADDLISTFROMFEATURERESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "AddListFromFeatureResult" element
         */
        public void setAddListFromFeatureResult(com.microsoft.schemas.sharepoint.soap.AddListFromFeatureResponseDocument.AddListFromFeatureResponse.AddListFromFeatureResult addListFromFeatureResult)
        {
            generatedSetterHelperImpl(addListFromFeatureResult, ADDLISTFROMFEATURERESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "AddListFromFeatureResult" element
         */
        public com.microsoft.schemas.sharepoint.soap.AddListFromFeatureResponseDocument.AddListFromFeatureResponse.AddListFromFeatureResult addNewAddListFromFeatureResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.AddListFromFeatureResponseDocument.AddListFromFeatureResponse.AddListFromFeatureResult target = null;
                target = (com.microsoft.schemas.sharepoint.soap.AddListFromFeatureResponseDocument.AddListFromFeatureResponse.AddListFromFeatureResult)get_store().add_element_user(ADDLISTFROMFEATURERESULT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "AddListFromFeatureResult" element
         */
        public void unsetAddListFromFeatureResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADDLISTFROMFEATURERESULT$0, 0);
            }
        }
        /**
         * An XML AddListFromFeatureResult(@http://schemas.microsoft.com/sharepoint/soap/).
         *
         * This is a complex type.
         */
        public static class AddListFromFeatureResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.AddListFromFeatureResponseDocument.AddListFromFeatureResponse.AddListFromFeatureResult
        {
            private static final long serialVersionUID = 1L;
            
            public AddListFromFeatureResultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
