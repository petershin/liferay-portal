/*
 * An XML document type.
 * Localname: GetListCollection
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.GetListCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * A document containing one GetListCollection(@http://schemas.microsoft.com/sharepoint/soap/) element.
 *
 * This is a complex type.
 */
public class GetListCollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetListCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLISTCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListCollection");
    
    
    /**
     * Gets the "GetListCollection" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetListCollectionDocument.GetListCollection getGetListCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetListCollectionDocument.GetListCollection target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetListCollectionDocument.GetListCollection)get_store().find_element_user(GETLISTCOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetListCollection" element
     */
    public void setGetListCollection(com.microsoft.schemas.sharepoint.soap.GetListCollectionDocument.GetListCollection getListCollection)
    {
        generatedSetterHelperImpl(getListCollection, GETLISTCOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GetListCollection" element
     */
    public com.microsoft.schemas.sharepoint.soap.GetListCollectionDocument.GetListCollection addNewGetListCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.GetListCollectionDocument.GetListCollection target = null;
            target = (com.microsoft.schemas.sharepoint.soap.GetListCollectionDocument.GetListCollection)get_store().add_element_user(GETLISTCOLLECTION$0);
            return target;
        }
    }
    /**
     * An XML GetListCollection(@http://schemas.microsoft.com/sharepoint/soap/).
     *
     * This is a complex type.
     */
    public static class GetListCollectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.GetListCollectionDocument.GetListCollection
    {
        private static final long serialVersionUID = 1L;
        
        public GetListCollectionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
