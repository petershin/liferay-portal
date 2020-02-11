/*
 * An XML document type.
 * Localname: Status
 * Namespace: urn:Microsoft.Search
 * Java type: search.microsoft.StatusDocument
 *
 * Automatically generated - do not modify.
 */
package search.microsoft.impl;
/**
 * A document containing one Status(@urn:Microsoft.Search) element.
 *
 * This is a complex type.
 */
public class StatusDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements search.microsoft.StatusDocument
{
    private static final long serialVersionUID = 1L;
    
    public StatusDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUS$0 = 
        new javax.xml.namespace.QName("urn:Microsoft.Search", "Status");
    
    
    /**
     * Gets the "Status" element
     */
    public search.microsoft.StatusDocument.Status getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            search.microsoft.StatusDocument.Status target = null;
            target = (search.microsoft.StatusDocument.Status)get_store().find_element_user(STATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Status" element
     */
    public void setStatus(search.microsoft.StatusDocument.Status status)
    {
        generatedSetterHelperImpl(status, STATUS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Status" element
     */
    public search.microsoft.StatusDocument.Status addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            search.microsoft.StatusDocument.Status target = null;
            target = (search.microsoft.StatusDocument.Status)get_store().add_element_user(STATUS$0);
            return target;
        }
    }
    /**
     * An XML Status(@urn:Microsoft.Search).
     *
     * This is a complex type.
     */
    public static class StatusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements search.microsoft.StatusDocument.Status
    {
        private static final long serialVersionUID = 1L;
        
        public StatusImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
