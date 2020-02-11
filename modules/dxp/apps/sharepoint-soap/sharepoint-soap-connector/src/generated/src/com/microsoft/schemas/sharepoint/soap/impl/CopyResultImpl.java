/*
 * XML Type:  CopyResult
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.CopyResult
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap.impl;
/**
 * An XML CopyResult(@http://schemas.microsoft.com/sharepoint/soap/).
 *
 * This is a complex type.
 */
public class CopyResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.sharepoint.soap.CopyResult
{
    private static final long serialVersionUID = 1L;
    
    public CopyResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORCODE$0 = 
        new javax.xml.namespace.QName("", "ErrorCode");
    private static final javax.xml.namespace.QName ERRORMESSAGE$2 = 
        new javax.xml.namespace.QName("", "ErrorMessage");
    private static final javax.xml.namespace.QName DESTINATIONURL$4 = 
        new javax.xml.namespace.QName("", "DestinationUrl");
    
    
    /**
     * Gets the "ErrorCode" attribute
     */
    public com.microsoft.schemas.sharepoint.soap.CopyErrorCode.Enum getErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORCODE$0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.sharepoint.soap.CopyErrorCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ErrorCode" attribute
     */
    public com.microsoft.schemas.sharepoint.soap.CopyErrorCode xgetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.CopyErrorCode target = null;
            target = (com.microsoft.schemas.sharepoint.soap.CopyErrorCode)get_store().find_attribute_user(ERRORCODE$0);
            return target;
        }
    }
    
    /**
     * Sets the "ErrorCode" attribute
     */
    public void setErrorCode(com.microsoft.schemas.sharepoint.soap.CopyErrorCode.Enum errorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORCODE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERRORCODE$0);
            }
            target.setEnumValue(errorCode);
        }
    }
    
    /**
     * Sets (as xml) the "ErrorCode" attribute
     */
    public void xsetErrorCode(com.microsoft.schemas.sharepoint.soap.CopyErrorCode errorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.sharepoint.soap.CopyErrorCode target = null;
            target = (com.microsoft.schemas.sharepoint.soap.CopyErrorCode)get_store().find_attribute_user(ERRORCODE$0);
            if (target == null)
            {
                target = (com.microsoft.schemas.sharepoint.soap.CopyErrorCode)get_store().add_attribute_user(ERRORCODE$0);
            }
            target.set(errorCode);
        }
    }
    
    /**
     * Gets the "ErrorMessage" attribute
     */
    public java.lang.String getErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORMESSAGE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ErrorMessage" attribute
     */
    public org.apache.xmlbeans.XmlString xgetErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORMESSAGE$2);
            return target;
        }
    }
    
    /**
     * True if has "ErrorMessage" attribute
     */
    public boolean isSetErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ERRORMESSAGE$2) != null;
        }
    }
    
    /**
     * Sets the "ErrorMessage" attribute
     */
    public void setErrorMessage(java.lang.String errorMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORMESSAGE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERRORMESSAGE$2);
            }
            target.setStringValue(errorMessage);
        }
    }
    
    /**
     * Sets (as xml) the "ErrorMessage" attribute
     */
    public void xsetErrorMessage(org.apache.xmlbeans.XmlString errorMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORMESSAGE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ERRORMESSAGE$2);
            }
            target.set(errorMessage);
        }
    }
    
    /**
     * Unsets the "ErrorMessage" attribute
     */
    public void unsetErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ERRORMESSAGE$2);
        }
    }
    
    /**
     * Gets the "DestinationUrl" attribute
     */
    public java.lang.String getDestinationUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESTINATIONURL$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DestinationUrl" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDestinationUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESTINATIONURL$4);
            return target;
        }
    }
    
    /**
     * True if has "DestinationUrl" attribute
     */
    public boolean isSetDestinationUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DESTINATIONURL$4) != null;
        }
    }
    
    /**
     * Sets the "DestinationUrl" attribute
     */
    public void setDestinationUrl(java.lang.String destinationUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESTINATIONURL$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESTINATIONURL$4);
            }
            target.setStringValue(destinationUrl);
        }
    }
    
    /**
     * Sets (as xml) the "DestinationUrl" attribute
     */
    public void xsetDestinationUrl(org.apache.xmlbeans.XmlString destinationUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESTINATIONURL$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESTINATIONURL$4);
            }
            target.set(destinationUrl);
        }
    }
    
    /**
     * Unsets the "DestinationUrl" attribute
     */
    public void unsetDestinationUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DESTINATIONURL$4);
        }
    }
}
