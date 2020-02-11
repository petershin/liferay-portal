/*
 * An XML document type.
 * Localname: DeleteAttachmentResponse
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.DeleteAttachmentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one DeleteAttachmentResponse(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class DeleteAttachmentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.DeleteAttachmentResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public DeleteAttachmentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETEATTACHMENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "DeleteAttachmentResponse");
    
    
    /**
     * Gets the "DeleteAttachmentResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.DeleteAttachmentResponseDocument.DeleteAttachmentResponse getDeleteAttachmentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.DeleteAttachmentResponseDocument.DeleteAttachmentResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.DeleteAttachmentResponseDocument.DeleteAttachmentResponse)get_store().find_element_user(DELETEATTACHMENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeleteAttachmentResponse" element
     */
    public void setDeleteAttachmentResponse(com.microsoft.schemas.sharepoint.soap.DeleteAttachmentResponseDocument.DeleteAttachmentResponse deleteAttachmentResponse)
    {
        generatedSetterHelperImpl(deleteAttachmentResponse, DELETEATTACHMENTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DeleteAttachmentResponse" element
     */
    public com.microsoft.schemas.sharepoint.soap.DeleteAttachmentResponseDocument.DeleteAttachmentResponse addNewDeleteAttachmentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.DeleteAttachmentResponseDocument.DeleteAttachmentResponse target = null;
            target = (com.microsoft.schemas.sharepoint.soap.DeleteAttachmentResponseDocument.DeleteAttachmentResponse)get_store().add_element_user(DELETEATTACHMENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML DeleteAttachmentResponse(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class DeleteAttachmentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.DeleteAttachmentResponseDocument.DeleteAttachmentResponse
    {
        private static final long serialVersionUID = 1L;
        
        public DeleteAttachmentResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
