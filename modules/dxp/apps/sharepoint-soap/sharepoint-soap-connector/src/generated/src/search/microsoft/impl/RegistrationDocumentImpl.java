/*
 * An XML document type.
 * Localname: Registration
 * Namespace: urn:Microsoft.Search
 * Java type: search.microsoft.RegistrationDocument
 *
 * Automatically generated - do not modify.
 */
package search.microsoft.impl;
/**
 * A document containing one Registration(@urn:Microsoft.Search) element.
 *
 * This is a complex type.
 */
public class RegistrationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements search.microsoft.RegistrationDocument
{
    private static final long serialVersionUID = 1L;
    
    public RegistrationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REGISTRATION$0 = 
        new javax.xml.namespace.QName("urn:Microsoft.Search", "Registration");
    
    
    /**
     * Gets the "Registration" element
     */
    public search.microsoft.RegistrationDocument.Registration getRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            search.microsoft.RegistrationDocument.Registration target = null;
            target = (search.microsoft.RegistrationDocument.Registration)get_store().find_element_user(REGISTRATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Registration" element
     */
    public void setRegistration(search.microsoft.RegistrationDocument.Registration registration)
    {
        generatedSetterHelperImpl(registration, REGISTRATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Registration" element
     */
    public search.microsoft.RegistrationDocument.Registration addNewRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            search.microsoft.RegistrationDocument.Registration target = null;
            target = (search.microsoft.RegistrationDocument.Registration)get_store().add_element_user(REGISTRATION$0);
            return target;
        }
    }
    /**
     * An XML Registration(@urn:Microsoft.Search).
     *
     * This is a complex type.
     */
    public static class RegistrationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements search.microsoft.RegistrationDocument.Registration
    {
        private static final long serialVersionUID = 1L;
        
        public RegistrationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REGISTRATIONXML$0 = 
            new javax.xml.namespace.QName("urn:Microsoft.Search", "registrationXml");
        
        
        /**
         * Gets the "registrationXml" element
         */
        public java.lang.String getRegistrationXml()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGISTRATIONXML$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "registrationXml" element
         */
        public org.apache.xmlbeans.XmlString xgetRegistrationXml()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGISTRATIONXML$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "registrationXml" element
         */
        public boolean isSetRegistrationXml()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REGISTRATIONXML$0) != 0;
            }
        }
        
        /**
         * Sets the "registrationXml" element
         */
        public void setRegistrationXml(java.lang.String registrationXml)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGISTRATIONXML$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGISTRATIONXML$0);
                }
                target.setStringValue(registrationXml);
            }
        }
        
        /**
         * Sets (as xml) the "registrationXml" element
         */
        public void xsetRegistrationXml(org.apache.xmlbeans.XmlString registrationXml)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGISTRATIONXML$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REGISTRATIONXML$0);
                }
                target.set(registrationXml);
            }
        }
        
        /**
         * Unsets the "registrationXml" element
         */
        public void unsetRegistrationXml()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REGISTRATIONXML$0, 0);
            }
        }
    }
}
