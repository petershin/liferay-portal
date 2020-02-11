
/**
 * VersionsMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
        package com.microsoft.schemas.sharepoint.soap;

        /**
        *  VersionsMessageReceiverInOut message receiver
        */

        public class VersionsMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        VersionsSkeleton skel = (VersionsSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("deleteAllVersions".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsResponseDocument deleteAllVersionsResponse17 = null;
	                        com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsDocument wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsDocument.class);
                                                
                                               deleteAllVersionsResponse17 =
                                                   
                                                   
                                                         skel.deleteAllVersions(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deleteAllVersionsResponse17, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "DeleteAllVersionsResponse"));
                                    } else 

            if("deleteVersion".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.DeleteVersionResponseDocument deleteVersionResponse19 = null;
	                        com.microsoft.schemas.sharepoint.soap.DeleteVersionDocument wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.DeleteVersionDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.DeleteVersionDocument.class);
                                                
                                               deleteVersionResponse19 =
                                                   
                                                   
                                                         skel.deleteVersion(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deleteVersionResponse19, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "DeleteVersionResponse"));
                                    } else 

            if("getVersions".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.GetVersionsResponseDocument getVersionsResponse21 = null;
	                        com.microsoft.schemas.sharepoint.soap.GetVersionsDocument wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.GetVersionsDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.GetVersionsDocument.class);
                                                
                                               getVersionsResponse21 =
                                                   
                                                   
                                                         skel.getVersions(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getVersionsResponse21, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetVersionsResponse"));
                                    } else 

            if("restoreVersion".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.RestoreVersionResponseDocument restoreVersionResponse23 = null;
	                        com.microsoft.schemas.sharepoint.soap.RestoreVersionDocument wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.RestoreVersionDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.RestoreVersionDocument.class);
                                                
                                               restoreVersionResponse23 =
                                                   
                                                   
                                                         skel.restoreVersion(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), restoreVersionResponse23, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "RestoreVersionResponse"));
                                    
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
        
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.DeleteVersionDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.DeleteVersionDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.DeleteVersionResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.DeleteVersionResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.GetVersionsDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.GetVersionsDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.GetVersionsResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.GetVersionsResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.RestoreVersionDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.RestoreVersionDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.RestoreVersionResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.RestoreVersionResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.DeleteVersionResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.GetVersionsResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.RestoreVersionResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
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
        

            if (com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.DeleteVersionDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.DeleteVersionDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.DeleteVersionResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.DeleteVersionResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.GetVersionsDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.GetVersionsDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.GetVersionsResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.GetVersionsResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.RestoreVersionDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.RestoreVersionDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.RestoreVersionResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.RestoreVersionResponseDocument.Factory.parse(
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
    