
/**
 * QueryServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
        package com.microsoft.webservices.sharepoint.queryservice;

        /**
        *  QueryServiceMessageReceiverInOut message receiver
        */

        public class QueryServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        QueryServiceSkeleton skel = (QueryServiceSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("status".equals(methodName)){
                
                search.microsoft.StatusResponseDocument statusResponse17 = null;
	                        search.microsoft.StatusDocument wrappedParam =
                                                             (search.microsoft.StatusDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    search.microsoft.StatusDocument.class);
                                                
                                               statusResponse17 =
                                                   
                                                   
                                                         skel.status(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), statusResponse17, false,
                                                    new javax.xml.namespace.QName("urn:Microsoft.Search", "StatusResponse"));
                                    } else 

            if("registration".equals(methodName)){
                
                search.microsoft.RegistrationResponseDocument registrationResponse19 = null;
	                        search.microsoft.RegistrationDocument wrappedParam =
                                                             (search.microsoft.RegistrationDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    search.microsoft.RegistrationDocument.class);
                                                
                                               registrationResponse19 =
                                                   
                                                   
                                                         skel.registration(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), registrationResponse19, false,
                                                    new javax.xml.namespace.QName("urn:Microsoft.Search", "RegistrationResponse"));
                                    } else 

            if("query".equals(methodName)){
                
                search.microsoft.QueryResponseDocument queryResponse21 = null;
	                        search.microsoft.QueryDocument wrappedParam =
                                                             (search.microsoft.QueryDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    search.microsoft.QueryDocument.class);
                                                
                                               queryResponse21 =
                                                   
                                                   
                                                         skel.query(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), queryResponse21, false,
                                                    new javax.xml.namespace.QName("urn:Microsoft.Search", "QueryResponse"));
                                    } else 

            if("queryEx".equals(methodName)){
                
                com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument queryExResponse23 = null;
	                        com.microsoft.webservices.sharepoint.queryservice.QueryExDocument wrappedParam =
                                                             (com.microsoft.webservices.sharepoint.queryservice.QueryExDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.webservices.sharepoint.queryservice.QueryExDocument.class);
                                                
                                               queryExResponse23 =
                                                   
                                                   
                                                         skel.queryEx(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), queryExResponse23, false,
                                                    new javax.xml.namespace.QName("http://microsoft.com/webservices/SharePoint/QueryService", "QueryExResponse"));
                                    
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
        
        

            private  org.apache.axiom.om.OMElement  toOM(search.microsoft.StatusDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final search.microsoft.StatusDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(search.microsoft.StatusResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final search.microsoft.StatusResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(search.microsoft.RegistrationDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final search.microsoft.RegistrationDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(search.microsoft.RegistrationResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final search.microsoft.RegistrationResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(search.microsoft.QueryDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final search.microsoft.QueryDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(search.microsoft.QueryResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final search.microsoft.QueryResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.webservices.sharepoint.queryservice.QueryExDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.webservices.sharepoint.queryservice.QueryExDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, search.microsoft.StatusResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, search.microsoft.RegistrationResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, search.microsoft.QueryResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
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
        

            if (search.microsoft.StatusDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return search.microsoft.StatusDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (search.microsoft.StatusResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return search.microsoft.StatusResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (search.microsoft.RegistrationDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return search.microsoft.RegistrationDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (search.microsoft.RegistrationResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return search.microsoft.RegistrationResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (search.microsoft.QueryDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return search.microsoft.QueryDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (search.microsoft.QueryResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return search.microsoft.QueryResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.webservices.sharepoint.queryservice.QueryExDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.webservices.sharepoint.queryservice.QueryExDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.webservices.sharepoint.queryservice.QueryExResponseDocument.Factory.parse(
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
    