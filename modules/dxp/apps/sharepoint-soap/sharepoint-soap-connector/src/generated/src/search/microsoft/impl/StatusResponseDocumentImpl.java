/*
 * An XML document type.
 * Localname: StatusResponse
 * Namespace: urn:Microsoft.Search
 * Java type: search.microsoft.StatusResponseDocument
 *
 * Automatically generated - do not modify.
 */
package search.microsoft.impl;
/**
 * A document containing one StatusResponse(@urn:Microsoft.Search) element.
 *
 * This is a complex type.
 */
public class StatusResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements search.microsoft.StatusResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public StatusResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUSRESPONSE$0 = 
        new javax.xml.namespace.QName("urn:Microsoft.Search", "StatusResponse");
    
    
    /**
     * Gets the "StatusResponse" element
     */
    public search.microsoft.StatusResponseDocument.StatusResponse getStatusResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            search.microsoft.StatusResponseDocument.StatusResponse target = null;
            target = (search.microsoft.StatusResponseDocument.StatusResponse)get_store().find_element_user(STATUSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StatusResponse" element
     */
    public void setStatusResponse(search.microsoft.StatusResponseDocument.StatusResponse statusResponse)
    {
        generatedSetterHelperImpl(statusResponse, STATUSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "StatusResponse" element
     */
    public search.microsoft.StatusResponseDocument.StatusResponse addNewStatusResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            search.microsoft.StatusResponseDocument.StatusResponse target = null;
            target = (search.microsoft.StatusResponseDocument.StatusResponse)get_store().add_element_user(STATUSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML StatusResponse(@urn:Microsoft.Search).
     *
     * This is a complex type.
     */
    public static class StatusResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements search.microsoft.StatusResponseDocument.StatusResponse
    {
        private static final long serialVersionUID = 1L;
        
        public StatusResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STATUSRESULT$0 = 
            new javax.xml.namespace.QName("urn:Microsoft.Search", "StatusResult");
        
        
        /**
         * Gets the "StatusResult" element
         */
        public java.lang.String getStatusResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "StatusResult" element
         */
        public org.apache.xmlbeans.XmlString xgetStatusResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSRESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "StatusResult" element
         */
        public boolean isSetStatusResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STATUSRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "StatusResult" element
         */
        public void setStatusResult(java.lang.String statusResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUSRESULT$0);
                }
                target.setStringValue(statusResult);
            }
        }
        
        /**
         * Sets (as xml) the "StatusResult" element
         */
        public void xsetStatusResult(org.apache.xmlbeans.XmlString statusResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUSRESULT$0);
                }
                target.set(statusResult);
            }
        }
        
        /**
         * Unsets the "StatusResult" element
         */
        public void unsetStatusResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STATUSRESULT$0, 0);
            }
        }
    }
}
