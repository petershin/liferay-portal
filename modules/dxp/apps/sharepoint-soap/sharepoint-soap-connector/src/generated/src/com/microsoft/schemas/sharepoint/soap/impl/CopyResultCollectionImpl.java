/*
 * XML Type:  CopyResultCollection
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.CopyResultCollection
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * An XML CopyResultCollection(@http://schemas.microsoft.com/sharepoint/soap/).
 *
 * This is a complex type.
 */
public class CopyResultCollectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.CopyResultCollection
{
    private static final long serialVersionUID = 1L;
    
    public CopyResultCollectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COPYRESULT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "CopyResult");
    
    
    /**
     * Gets array of all "CopyResult" elements
     */
    public com.microsoft.schemas.sharepoint.soap.CopyResult[] getCopyResultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COPYRESULT$0, targetList);
            com.microsoft.schemas.sharepoint.soap.CopyResult[] result = new com.microsoft.schemas.sharepoint.soap.CopyResult[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CopyResult" element
     */
    public com.microsoft.schemas.sharepoint.soap.CopyResult getCopyResultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.CopyResult target = null;
            target = (com.microsoft.schemas.sharepoint.soap.CopyResult)get_store().find_element_user(COPYRESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "CopyResult" element
     */
    public boolean isNilCopyResultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.CopyResult target = null;
            target = (com.microsoft.schemas.sharepoint.soap.CopyResult)get_store().find_element_user(COPYRESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "CopyResult" element
     */
    public int sizeOfCopyResultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COPYRESULT$0);
        }
    }
    
    /**
     * Sets array of all "CopyResult" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCopyResultArray(com.microsoft.schemas.sharepoint.soap.CopyResult[] copyResultArray)
    {
        check_orphaned();
        arraySetterHelper(copyResultArray, COPYRESULT$0);
    }
    
    /**
     * Sets ith "CopyResult" element
     */
    public void setCopyResultArray(int i, com.microsoft.schemas.sharepoint.soap.CopyResult copyResult)
    {
        generatedSetterHelperImpl(copyResult, COPYRESULT$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Nils the ith "CopyResult" element
     */
    public void setNilCopyResultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.CopyResult target = null;
            target = (com.microsoft.schemas.sharepoint.soap.CopyResult)get_store().find_element_user(COPYRESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CopyResult" element
     */
    public com.microsoft.schemas.sharepoint.soap.CopyResult insertNewCopyResult(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.CopyResult target = null;
            target = (com.microsoft.schemas.sharepoint.soap.CopyResult)get_store().insert_element_user(COPYRESULT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CopyResult" element
     */
    public com.microsoft.schemas.sharepoint.soap.CopyResult addNewCopyResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.CopyResult target = null;
            target = (com.microsoft.schemas.sharepoint.soap.CopyResult)get_store().add_element_user(COPYRESULT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "CopyResult" element
     */
    public void removeCopyResult(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COPYRESULT$0, i);
        }
    }
}
