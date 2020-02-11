/*
 * XML Type:  FieldInformationCollection
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.FieldInformationCollection
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * An XML FieldInformationCollection(@http://schemas.microsoft.com/sharepoint/soap/).
 *
 * This is a complex type.
 */
public class FieldInformationCollectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.FieldInformationCollection
{
    private static final long serialVersionUID = 1L;
    
    public FieldInformationCollectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIELDINFORMATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "FieldInformation");
    
    
    /**
     * Gets array of all "FieldInformation" elements
     */
    public com.microsoft.schemas.sharepoint.soap.FieldInformation[] getFieldInformationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FIELDINFORMATION$0, targetList);
            com.microsoft.schemas.sharepoint.soap.FieldInformation[] result = new com.microsoft.schemas.sharepoint.soap.FieldInformation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "FieldInformation" element
     */
    public com.microsoft.schemas.sharepoint.soap.FieldInformation getFieldInformationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.FieldInformation target = null;
            target = (com.microsoft.schemas.sharepoint.soap.FieldInformation)get_store().find_element_user(FIELDINFORMATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "FieldInformation" element
     */
    public boolean isNilFieldInformationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.FieldInformation target = null;
            target = (com.microsoft.schemas.sharepoint.soap.FieldInformation)get_store().find_element_user(FIELDINFORMATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "FieldInformation" element
     */
    public int sizeOfFieldInformationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FIELDINFORMATION$0);
        }
    }
    
    /**
     * Sets array of all "FieldInformation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFieldInformationArray(com.microsoft.schemas.sharepoint.soap.FieldInformation[] fieldInformationArray)
    {
        check_orphaned();
        arraySetterHelper(fieldInformationArray, FIELDINFORMATION$0);
    }
    
    /**
     * Sets ith "FieldInformation" element
     */
    public void setFieldInformationArray(int i, com.microsoft.schemas.sharepoint.soap.FieldInformation fieldInformation)
    {
        generatedSetterHelperImpl(fieldInformation, FIELDINFORMATION$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Nils the ith "FieldInformation" element
     */
    public void setNilFieldInformationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.FieldInformation target = null;
            target = (com.microsoft.schemas.sharepoint.soap.FieldInformation)get_store().find_element_user(FIELDINFORMATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "FieldInformation" element
     */
    public com.microsoft.schemas.sharepoint.soap.FieldInformation insertNewFieldInformation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.FieldInformation target = null;
            target = (com.microsoft.schemas.sharepoint.soap.FieldInformation)get_store().insert_element_user(FIELDINFORMATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "FieldInformation" element
     */
    public com.microsoft.schemas.sharepoint.soap.FieldInformation addNewFieldInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.FieldInformation target = null;
            target = (com.microsoft.schemas.sharepoint.soap.FieldInformation)get_store().add_element_user(FIELDINFORMATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "FieldInformation" element
     */
    public void removeFieldInformation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FIELDINFORMATION$0, i);
        }
    }
}
