
/**
 * CopyMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
        package com.microsoft.schemas.sharepoint.soap;

        /**
        *  CopyMessageReceiverInOut message receiver
        */

        public class CopyMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        CopySkeleton skel = (CopySkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getItem".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.GetItemResponseDocument getItemResponse13 = null;
	                        com.microsoft.schemas.sharepoint.soap.GetItemDocument wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.GetItemDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.GetItemDocument.class);
                                                
                                               getItemResponse13 =
                                                   
                                                   
                                                         skel.getItem(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getItemResponse13, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetItemResponse"));
                                    } else 

            if("copyIntoItemsLocal".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.CopyIntoItemsLocalResponseDocument copyIntoItemsLocalResponse15 = null;
	                        com.microsoft.schemas.sharepoint.soap.CopyIntoItemsLocalDocument wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.CopyIntoItemsLocalDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.CopyIntoItemsLocalDocument.class);
                                                
                                               copyIntoItemsLocalResponse15 =
                                                   
                                                   
                                                         skel.copyIntoItemsLocal(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), copyIntoItemsLocalResponse15, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "CopyIntoItemsLocalResponse"));
                                    } else 

            if("copyIntoItems".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.CopyIntoItemsResponseDocument copyIntoItemsResponse17 = null;
	                        com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument.class);
                                                
                                               copyIntoItemsResponse17 =
                                                   
                                                   
                                                         skel.copyIntoItems(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), copyIntoItemsResponse17, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "CopyIntoItemsResponse"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
        
        private final org.apache.xmlbeans.XmlOptions _xmlOptions;
        
        {
            _xmlOptions = new org.apache.xmlbeans.XmlOptions();
            _xmlOptions.setSaveNoXmlDecl();
            _xmlOptions.setSaveAggressiveNamespaces();
            _xmlOptions.setSaveNamespacesFirst();
        }
        
        /**
         * Get the {@link org.apache.xmlbeans.XmlOptions} object that the stub uses when
         * serializing objects to XML.
         *
         * @return the options used for serialization
         */
        public org.apache.xmlbeans.XmlOptions _getXmlOptions() {
            return _xmlOptions;
        }
        
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.GetItemDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.GetItemDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.GetItemResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.GetItemResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.CopyIntoItemsLocalDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.CopyIntoItemsLocalDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.CopyIntoItemsLocalResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.CopyIntoItemsLocalResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.CopyIntoItemsResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.CopyIntoItemsResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.GetItemResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.CopyIntoItemsLocalResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.CopyIntoItemsResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }

        public org.apache.xmlbeans.XmlObject fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type) throws org.apache.axis2.AxisFault{
        try{
        

            if (com.microsoft.schemas.sharepoint.soap.GetItemDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.GetItemDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.GetItemResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.GetItemResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.CopyIntoItemsLocalDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.CopyIntoItemsLocalDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.CopyIntoItemsLocalResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.CopyIntoItemsLocalResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.CopyIntoItemsDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.CopyIntoItemsResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.CopyIntoItemsResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        
        }catch(java.lang.Exception e){
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        return null;
        }

        
        

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    