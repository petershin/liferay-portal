/*
 * XML Type:  FieldType
 * Namespace: http://schemas.microsoft.com/sharepoint/soap/
 * Java type: com.microsoft.schemas.sharepoint.soap.FieldType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.sharepoint.soap;


/**
 * An XML FieldType(@http://schemas.microsoft.com/sharepoint/soap/).
 *
 * This is an atomic type that is a restriction of com.microsoft.schemas.sharepoint.soap.FieldType.
 */
public interface FieldType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FieldType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFEE837E2BF6CB1515998A4F85A16FECD").resolveHandle("fieldtype4dcdtype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum INVALID = Enum.forString("Invalid");
    static final Enum INTEGER = Enum.forString("Integer");
    static final Enum TEXT = Enum.forString("Text");
    static final Enum NOTE = Enum.forString("Note");
    static final Enum DATE_TIME = Enum.forString("DateTime");
    static final Enum COUNTER = Enum.forString("Counter");
    static final Enum CHOICE = Enum.forString("Choice");
    static final Enum LOOKUP = Enum.forString("Lookup");
    static final Enum BOOLEAN = Enum.forString("Boolean");
    static final Enum NUMBER = Enum.forString("Number");
    static final Enum CURRENCY = Enum.forString("Currency");
    static final Enum URL = Enum.forString("URL");
    static final Enum COMPUTED = Enum.forString("Computed");
    static final Enum THREADING = Enum.forString("Threading");
    static final Enum GUID = Enum.forString("Guid");
    static final Enum MULTI_CHOICE = Enum.forString("MultiChoice");
    static final Enum GRID_CHOICE = Enum.forString("GridChoice");
    static final Enum CALCULATED = Enum.forString("Calculated");
    static final Enum FILE = Enum.forString("File");
    static final Enum ATTACHMENTS = Enum.forString("Attachments");
    static final Enum USER = Enum.forString("User");
    static final Enum RECURRENCE = Enum.forString("Recurrence");
    static final Enum CROSS_PROJECT_LINK = Enum.forString("CrossProjectLink");
    static final Enum MOD_STAT = Enum.forString("ModStat");
    static final Enum ALL_DAY_EVENT = Enum.forString("AllDayEvent");
    static final Enum ERROR = Enum.forString("Error");
    
    static final int INT_INVALID = Enum.INT_INVALID;
    static final int INT_INTEGER = Enum.INT_INTEGER;
    static final int INT_TEXT = Enum.INT_TEXT;
    static final int INT_NOTE = Enum.INT_NOTE;
    static final int INT_DATE_TIME = Enum.INT_DATE_TIME;
    static final int INT_COUNTER = Enum.INT_COUNTER;
    static final int INT_CHOICE = Enum.INT_CHOICE;
    static final int INT_LOOKUP = Enum.INT_LOOKUP;
    static final int INT_BOOLEAN = Enum.INT_BOOLEAN;
    static final int INT_NUMBER = Enum.INT_NUMBER;
    static final int INT_CURRENCY = Enum.INT_CURRENCY;
    static final int INT_URL = Enum.INT_URL;
    static final int INT_COMPUTED = Enum.INT_COMPUTED;
    static final int INT_THREADING = Enum.INT_THREADING;
    static final int INT_GUID = Enum.INT_GUID;
    static final int INT_MULTI_CHOICE = Enum.INT_MULTI_CHOICE;
    static final int INT_GRID_CHOICE = Enum.INT_GRID_CHOICE;
    static final int INT_CALCULATED = Enum.INT_CALCULATED;
    static final int INT_FILE = Enum.INT_FILE;
    static final int INT_ATTACHMENTS = Enum.INT_ATTACHMENTS;
    static final int INT_USER = Enum.INT_USER;
    static final int INT_RECURRENCE = Enum.INT_RECURRENCE;
    static final int INT_CROSS_PROJECT_LINK = Enum.INT_CROSS_PROJECT_LINK;
    static final int INT_MOD_STAT = Enum.INT_MOD_STAT;
    static final int INT_ALL_DAY_EVENT = Enum.INT_ALL_DAY_EVENT;
    static final int INT_ERROR = Enum.INT_ERROR;
    
    /**
     * Enumeration value class for com.microsoft.schemas.sharepoint.soap.FieldType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_INVALID
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_INVALID = 1;
        static final int INT_INTEGER = 2;
        static final int INT_TEXT = 3;
        static final int INT_NOTE = 4;
        static final int INT_DATE_TIME = 5;
        static final int INT_COUNTER = 6;
        static final int INT_CHOICE = 7;
        static final int INT_LOOKUP = 8;
        static final int INT_BOOLEAN = 9;
        static final int INT_NUMBER = 10;
        static final int INT_CURRENCY = 11;
        static final int INT_URL = 12;
        static final int INT_COMPUTED = 13;
        static final int INT_THREADING = 14;
        static final int INT_GUID = 15;
        static final int INT_MULTI_CHOICE = 16;
        static final int INT_GRID_CHOICE = 17;
        static final int INT_CALCULATED = 18;
        static final int INT_FILE = 19;
        static final int INT_ATTACHMENTS = 20;
        static final int INT_USER = 21;
        static final int INT_RECURRENCE = 22;
        static final int INT_CROSS_PROJECT_LINK = 23;
        static final int INT_MOD_STAT = 24;
        static final int INT_ALL_DAY_EVENT = 25;
        static final int INT_ERROR = 26;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Invalid", INT_INVALID),
                new Enum("Integer", INT_INTEGER),
                new Enum("Text", INT_TEXT),
                new Enum("Note", INT_NOTE),
                new Enum("DateTime", INT_DATE_TIME),
                new Enum("Counter", INT_COUNTER),
                new Enum("Choice", INT_CHOICE),
                new Enum("Lookup", INT_LOOKUP),
                new Enum("Boolean", INT_BOOLEAN),
                new Enum("Number", INT_NUMBER),
                new Enum("Currency", INT_CURRENCY),
                new Enum("URL", INT_URL),
                new Enum("Computed", INT_COMPUTED),
                new Enum("Threading", INT_THREADING),
                new Enum("Guid", INT_GUID),
                new Enum("MultiChoice", INT_MULTI_CHOICE),
                new Enum("GridChoice", INT_GRID_CHOICE),
                new Enum("Calculated", INT_CALCULATED),
                new Enum("File", INT_FILE),
                new Enum("Attachments", INT_ATTACHMENTS),
                new Enum("User", INT_USER),
                new Enum("Recurrence", INT_RECURRENCE),
                new Enum("CrossProjectLink", INT_CROSS_PROJECT_LINK),
                new Enum("ModStat", INT_MOD_STAT),
                new Enum("AllDayEvent", INT_ALL_DAY_EVENT),
                new Enum("Error", INT_ERROR),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.sharepoint.soap.FieldType newValue(java.lang.Object obj) {
          return (com.microsoft.schemas.sharepoint.soap.FieldType) type.newValue( obj ); }
        
        public static com.microsoft.schemas.sharepoint.soap.FieldType newInstance() {
          return (com.microsoft.schemas.sharepoint.soap.FieldType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.FieldType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.sharepoint.soap.FieldType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.sharepoint.soap.FieldType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.FieldType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.FieldType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.FieldType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.sharepoint.soap.FieldType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.FieldType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.FieldType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.FieldType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.FieldType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.FieldType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.FieldType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.FieldType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.FieldType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.FieldType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.FieldType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.FieldType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.FieldType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.FieldType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.FieldType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.sharepoint.soap.FieldType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.FieldType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.FieldType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.FieldType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.FieldType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.sharepoint.soap.FieldType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.FieldType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.sharepoint.soap.FieldType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.sharepoint.soap.FieldType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.sharepoint.soap.FieldType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.sharepoint.soap.FieldType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.sharepoint.soap.FieldType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.sharepoint.soap.FieldType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
