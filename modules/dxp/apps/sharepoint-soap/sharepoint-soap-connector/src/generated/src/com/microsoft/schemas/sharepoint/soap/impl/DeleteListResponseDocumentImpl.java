/*
 * An XML document type.
 * Localname: DeleteListResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.DeleteListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one DeleteListResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class DeleteListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.DeleteListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public DeleteListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETELISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "DeleteListResponse");
    
    
    /**
     * Gets the "DeleteListResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.DeleteListResponseDocument.DeleteListResponse getDeleteListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.DeleteListResponseDocument.DeleteListResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.DeleteListResponseDocument.DeleteListResponse)get_store().find_element_user(DELETELISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeleteListResponse" element
     */
    public void setDeleteListResponse(com.microsoft.schemas.sharepoint.soap.DeleteListResponseDocument.DeleteListResponse deleteListResponse)
    {
        generatedSetterHelperImpl(deleteListResponse, DELETELISTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DeleteListResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.DeleteListResponseDocument.DeleteListResponse addNewDeleteListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.DeleteListResponseDocument.DeleteListResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.DeleteListResponseDocument.DeleteListResponse)get_store().add_element_user(DELETELISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML DeleteListResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class DeleteListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.DeleteListResponseDocument.DeleteListResponse
    {
        private static final long serialVersionUID = 1L;
        
        public DeleteListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
