/*
 * An XML document type.
 * Localname: RegistrationResponse
 * Namespace: urn:Microsoft.Search
 * Java type: search.microsoft.RegistrationResponseDocument
 *
 * Automatically generated - do not modify.
 */
package search.microsoft.impl;
/**
 * A document containing one RegistrationResponse(@urn:Microsoft.Search) element.
 *
 * This is a complex type.
 */
public class RegistrationResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements search.microsoft.RegistrationResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public RegistrationResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REGISTRATIONRESPONSE$0 = 
        new javax.xml.namespace.QName("urn:Microsoft.Search", "RegistrationResponse");
    
    
    /**
     * Gets the "RegistrationResponse" element
     */
    public search.microsoft.RegistrationResponseDocument.RegistrationResponse getRegistrationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            search.microsoft.RegistrationResponseDocument.RegistrationResponse target = null;
            target = (search.microsoft.RegistrationResponseDocument.RegistrationResponse)get_store().find_element_user(REGISTRATIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RegistrationResponse" element
     */
    public void setRegistrationResponse(search.microsoft.RegistrationResponseDocument.RegistrationResponse registrationResponse)
    {
        generatedSetterHelperImpl(registrationResponse, REGISTRATIONRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RegistrationResponse" element
     */
    public search.microsoft.RegistrationResponseDocument.RegistrationResponse addNewRegistrationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            search.microsoft.RegistrationResponseDocument.RegistrationResponse target = null;
            target = (search.microsoft.RegistrationResponseDocument.RegistrationResponse)get_store().add_element_user(REGISTRATIONRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML RegistrationResponse(@urn:Microsoft.Search).
     *
     * This is a complex type.
     */
    public static class RegistrationResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements search.microsoft.RegistrationResponseDocument.RegistrationResponse
    {
        private static final long serialVersionUID = 1L;
        
        public RegistrationResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REGISTRATIONRESULT$0 = 
            new javax.xml.namespace.QName("urn:Microsoft.Search", "RegistrationResult");
        
        
        /**
         * Gets the "RegistrationResult" element
         */
        public java.lang.String getRegistrationResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGISTRATIONRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "RegistrationResult" element
         */
        public org.apache.xmlbeans.XmlString xgetRegistrationResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGISTRATIONRESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "RegistrationResult" element
         */
        public boolean isSetRegistrationResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REGISTRATIONRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "RegistrationResult" element
         */
        public void setRegistrationResult(java.lang.String registrationResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGISTRATIONRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGISTRATIONRESULT$0);
                }
                target.setStringValue(registrationResult);
            }
        }
        
        /**
         * Sets (as xml) the "RegistrationResult" element
         */
        public void xsetRegistrationResult(org.apache.xmlbeans.XmlString registrationResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGISTRATIONRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REGISTRATIONRESULT$0);
                }
                target.set(registrationResult);
            }
        }
        
        /**
         * Unsets the "RegistrationResult" element
         */
        public void unsetRegistrationResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REGISTRATIONRESULT$0, 0);
            }
        }
    }
}
