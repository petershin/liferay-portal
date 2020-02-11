/*
 * XML Type:  FieldInformation
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.FieldInformation
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * An XML FieldInformation(@http://schemas.microsoft.com/sharepoint/soap/).
 *
 * This is a complex type.
 */
public class FieldInformationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.FieldInformation
{
    private static final long serialVersionUID = 1L;
    
    public FieldInformationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("", "Type");
    private static final javax.xml.namespace.QName DISPLAYNAME$2 = 
        new javax.xml.namespace.QName("", "DisplayName");
    private static final javax.xml.namespace.QName INTERNALNAME$4 = 
        new javax.xml.namespace.QName("", "InternalName");
    private static final javax.xml.namespace.QName ID$6 = 
        new javax.xml.namespace.QName("", "Id");
    private static final javax.xml.namespace.QName VALUE$8 = 
        new javax.xml.namespace.QName("", "Value");
    
    
    /**
     * Gets the "Type" attribute
     */
    public com.microsoft.schemas.sharepoint.soap.FieldType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.sharepoint.soap.FieldType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Type" attribute
     */
    public com.microsoft.schemas.sharepoint.soap.FieldType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.FieldType target = null;
            target = (com.microsoft.schemas.sharepoint.soap.FieldType)get_store().find_attribute_user(TYPE$0);
            return target;
        }
    }
    
    /**
     * Sets the "Type" attribute
     */
    public void setType(com.microsoft.schemas.sharepoint.soap.FieldType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "Type" attribute
     */
    public void xsetType(com.microsoft.schemas.sharepoint.soap.FieldType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.FieldType target = null;
            target = (com.microsoft.schemas.sharepoint.soap.FieldType)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (com.microsoft.schemas.sharepoint.soap.FieldType)get_store().add_attribute_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "DisplayName" attribute
     */
    public java.lang.String getDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYNAME$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DisplayName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISPLAYNAME$2);
            return target;
        }
    }
    
    /**
     * True if has "DisplayName" attribute
     */
    public boolean isSetDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISPLAYNAME$2) != null;
        }
    }
    
    /**
     * Sets the "DisplayName" attribute
     */
    public void setDisplayName(java.lang.String displayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYNAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISPLAYNAME$2);
            }
            target.setStringValue(displayName);
        }
    }
    
    /**
     * Sets (as xml) the "DisplayName" attribute
     */
    public void xsetDisplayName(org.apache.xmlbeans.XmlString displayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISPLAYNAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DISPLAYNAME$2);
            }
            target.set(displayName);
        }
    }
    
    /**
     * Unsets the "DisplayName" attribute
     */
    public void unsetDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISPLAYNAME$2);
        }
    }
    
    /**
     * Gets the "InternalName" attribute
     */
    public java.lang.String getInternalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERNALNAME$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "InternalName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetInternalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INTERNALNAME$4);
            return target;
        }
    }
    
    /**
     * True if has "InternalName" attribute
     */
    public boolean isSetInternalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INTERNALNAME$4) != null;
        }
    }
    
    /**
     * Sets the "InternalName" attribute
     */
    public void setInternalName(java.lang.String internalName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERNALNAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTERNALNAME$4);
            }
            target.setStringValue(internalName);
        }
    }
    
    /**
     * Sets (as xml) the "InternalName" attribute
     */
    public void xsetInternalName(org.apache.xmlbeans.XmlString internalName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INTERNALNAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(INTERNALNAME$4);
            }
            target.set(internalName);
        }
    }
    
    /**
     * Unsets the "InternalName" attribute
     */
    public void unsetInternalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INTERNALNAME$4);
        }
    }
    
    /**
     * Gets the "Id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Id" attribute
     */
    public com.microsoft.wsdl.types.Guid xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_attribute_user(ID$6);
            return target;
        }
    }
    
    /**
     * Sets the "Id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$6);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "Id" attribute
     */
    public void xsetId(com.microsoft.wsdl.types.Guid id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_attribute_user(ID$6);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets the "Value" attribute
     */
    public java.lang.String getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Value" attribute
     */
    public org.apache.xmlbeans.XmlString xgetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$8);
            return target;
        }
    }
    
    /**
     * True if has "Value" attribute
     */
    public boolean isSetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VALUE$8) != null;
        }
    }
    
    /**
     * Sets the "Value" attribute
     */
    public void setValue(java.lang.String value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$8);
            }
            target.setStringValue(value);
        }
    }
    
    /**
     * Sets (as xml) the "Value" attribute
     */
    public void xsetValue(org.apache.xmlbeans.XmlString value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUE$8);
            }
            target.set(value);
        }
    }
    
    /**
     * Unsets the "Value" attribute
     */
    public void unsetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VALUE$8);
        }
    }
}
