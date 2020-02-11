/*
 * An XML document type.
 * Localname: GetItemResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.GetItemResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one GetItemResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class GetItemResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetItemResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetItemResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETITEMRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetItemResponse");
    
    
    /**
     * Gets the "GetItemResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetItemResponseDocument.GetItemResponse getGetItemResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetItemResponseDocument.GetItemResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetItemResponseDocument.GetItemResponse)get_store().find_element_user(GETITEMRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetItemResponse" element
     */
    public void setGetItemResponse(com.microsoft.schemas.sharepoint.soap.GetItemResponseDocument.GetItemResponse getItemResponse)
    {
        generatedSetterHelperImpl(getItemResponse, GETITEMRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetItemResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetItemResponseDocument.GetItemResponse addNewGetItemResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetItemResponseDocument.GetItemResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetItemResponseDocument.GetItemResponse)get_store().add_element_user(GETITEMRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetItemResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class GetItemResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetItemResponseDocument.GetItemResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetItemResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETITEMRESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetItemResult");
        private static final javax.xml.namespace.QName FIELDS$2 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "Fields");
        private static final javax.xml.namespace.QName STREAM$4 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "Stream");
        
        
        /**
         * Gets the "GetItemResult" element
         */
        public long getGetItemResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GETITEMRESULT$0, 0);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "GetItemResult" element
         */
        public org.apache.xmlbeans.XmlUnsignedInt xgetGetItemResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlUnsignedInt target = null;
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(GETITEMRESULT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "GetItemResult" element
         */
        public void setGetItemResult(long getItemResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GETITEMRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GETITEMRESULT$0);
                }
                target.setLongValue(getItemResult);
            }
        }
        
        /**
         * Sets (as xml) the "GetItemResult" element
         */
        public void xsetGetItemResult(org.apache.xmlbeans.XmlUnsignedInt getItemResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlUnsignedInt target = null;
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(GETITEMRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_element_user(GETITEMRESULT$0);
                }
                target.set(getItemResult);
            }
        }
        
        /**
         * Gets the "Fields" element
         */
        public com.microsoft.schemas.sharepoint.soap.FieldInformationCollection getFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.FieldInformationCollection target = null;
                target = (com.microsoft.schemas.sharepoint.soap.FieldInformationCollection)get_store().find_element_user(FIELDS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Fields" element
         */
        public boolean isSetFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FIELDS$2) != 0;
            }
        }
        
        /**
         * Sets the "Fields" element
         */
        public void setFields(com.microsoft.schemas.sharepoint.soap.FieldInformationCollection fields)
        {
            generatedSetterHelperImpl(fields, FIELDS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Fields" element
         */
        public com.microsoft.schemas.sharepoint.soap.FieldInformationCollection addNewFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.sharepoint.soap.FieldInformationCollection target = null;
                target = (com.microsoft.schemas.sharepoint.soap.FieldInformationCollection)get_store().add_element_user(FIELDS$2);
                return target;
            }
        }
        
        /**
         * Unsets the "Fields" element
         */
        public void unsetFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FIELDS$2, 0);
            }
        }
        
        /**
         * Gets the "Stream" element
         */
        public byte[] getStream()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREAM$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getByteArrayValue();
            }
        }
        
        /**
         * Gets (as xml) the "Stream" element
         */
        public org.apache.xmlbeans.XmlBase64Binary xgetStream()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBase64Binary target = null;
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(STREAM$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "Stream" element
         */
        public boolean isSetStream()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STREAM$4) != 0;
            }
        }
        
        /**
         * Sets the "Stream" element
         */
        public void setStream(byte[] stream)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREAM$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STREAM$4);
                }
                target.setByteArrayValue(stream);
            }
        }
        
        /**
         * Sets (as xml) the "Stream" element
         */
        public void xsetStream(org.apache.xmlbeans.XmlBase64Binary stream)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBase64Binary target = null;
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(STREAM$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(STREAM$4);
                }
                target.set(stream);
            }
        }
        
        /**
         * Unsets the "Stream" element
         */
        public void unsetStream()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STREAM$4, 0);
            }
        }
    }
}
