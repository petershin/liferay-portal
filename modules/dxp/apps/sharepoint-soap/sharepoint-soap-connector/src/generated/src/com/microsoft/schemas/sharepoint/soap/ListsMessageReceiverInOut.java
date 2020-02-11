
/**
 * ListsMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
        package com.microsoft.schemas.sharepoint.soap;

        /**
        *  ListsMessageReceiverInOut message receiver
        */

        public class ListsMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        ListsSkeleton skel = (ListsSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("deleteContentTypeXmlDocument".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument deleteContentTypeXmlDocumentResponse129 = null;
	                        com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1 wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1.class);
                                                
                                               deleteContentTypeXmlDocumentResponse129 =
                                                   
                                                   
                                                         skel.deleteContentTypeXmlDocument(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deleteContentTypeXmlDocumentResponse129, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "DeleteContentTypeXmlDocumentResponse"));
                                    } else 

            if("getListItemChangesSinceToken".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenResponseDocument getListItemChangesSinceTokenResponse131 = null;
	                        com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.class);
                                                
                                               getListItemChangesSinceTokenResponse131 =
                                                   
                                                   
                                                         skel.getListItemChangesSinceToken(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getListItemChangesSinceTokenResponse131, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListItemChangesSinceTokenResponse"));
                                    } else 

            if("addList".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.AddListResponseDocument addListResponse133 = null;
	                        com.microsoft.schemas.sharepoint.soap.AddListDocument wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.AddListDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.AddListDocument.class);
                                                
                                               addListResponse133 =
                                                   
                                                   
                                                         skel.addList(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), addListResponse133, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "AddListResponse"));
                                    } else 

            if("addAttachment".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.AddAttachmentResponseDocument addAttachmentResponse135 = null;
	                        com.microsoft.schemas.sharepoint.soap.AddAttachmentDocument wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.AddAttachmentDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.AddAttachmentDocument.class);
                                                
                                               addAttachmentResponse135 =
                                                   
                                                   
                                                         skel.addAttachment(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), addAttachmentResponse135, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "AddAttachmentResponse"));
                                    } else 

            if("updateList".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.UpdateListResponseDocument updateListResponse137 = null;
	                        com.microsoft.schemas.sharepoint.soap.UpdateListDocument wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.UpdateListDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.UpdateListDocument.class);
                                                
                                               updateListResponse137 =
                                                   
                                                   
                                                         skel.updateList(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateListResponse137, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "UpdateListResponse"));
                                    } else 

            if("getList".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.GetListResponseDocument getListResponse139 = null;
	                        com.microsoft.schemas.sharepoint.soap.GetListDocument wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.GetListDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.GetListDocument.class);
                                                
                                               getListResponse139 =
                                                   
                                                   
                                                         skel.getList(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getListResponse139, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListResponse"));
                                    } else 

            if("checkOutFile".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.CheckOutFileResponseDocument checkOutFileResponse141 = null;
	                        com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument.class);
                                                
                                               checkOutFileResponse141 =
                                                   
                                                   
                                                         skel.checkOutFile(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), checkOutFileResponse141, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "CheckOutFileResponse"));
                                    } else 

            if("getListContentTypes".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.GetListContentTypesResponseDocument getListContentTypesResponse143 = null;
	                        com.microsoft.schemas.sharepoint.soap.GetListContentTypesDocument wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.GetListContentTypesDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.GetListContentTypesDocument.class);
                                                
                                               getListContentTypesResponse143 =
                                                   
                                                   
                                                         skel.getListContentTypes(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getListContentTypesResponse143, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListContentTypesResponse"));
                                    } else 

            if("updateContentTypeXmlDocument".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument updateContentTypeXmlDocumentResponse145 = null;
	                        com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentDocument1 wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentDocument1)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentDocument1.class);
                                                
                                               updateContentTypeXmlDocumentResponse145 =
                                                   
                                                   
                                                         skel.updateContentTypeXmlDocument(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateContentTypeXmlDocumentResponse145, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "UpdateContentTypeXmlDocumentResponse"));
                                    } else 

            if("checkInFile".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.CheckInFileResponseDocument checkInFileResponse147 = null;
	                        com.microsoft.schemas.sharepoint.soap.CheckInFileDocument wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.CheckInFileDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.CheckInFileDocument.class);
                                                
                                               checkInFileResponse147 =
                                                   
                                                   
                                                         skel.checkInFile(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), checkInFileResponse147, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "CheckInFileResponse"));
                                    } else 

            if("updateContentType".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.UpdateContentTypeResponseDocument updateContentTypeResponse149 = null;
	                        com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.class);
                                                
                                               updateContentTypeResponse149 =
                                                   
                                                   
                                                         skel.updateContentType(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateContentTypeResponse149, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "UpdateContentTypeResponse"));
                                    } else 

            if("addDiscussionBoardItem".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemResponseDocument addDiscussionBoardItemResponse151 = null;
	                        com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemDocument wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemDocument.class);
                                                
                                               addDiscussionBoardItemResponse151 =
                                                   
                                                   
                                                         skel.addDiscussionBoardItem(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), addDiscussionBoardItemResponse151, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "AddDiscussionBoardItemResponse"));
                                    } else 

            if("addListFromFeature".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.AddListFromFeatureResponseDocument addListFromFeatureResponse153 = null;
	                        com.microsoft.schemas.sharepoint.soap.AddListFromFeatureDocument wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.AddListFromFeatureDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.AddListFromFeatureDocument.class);
                                                
                                               addListFromFeatureResponse153 =
                                                   
                                                   
                                                         skel.addListFromFeature(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), addListFromFeatureResponse153, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "AddListFromFeatureResponse"));
                                    } else 

            if("getListCollection".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.GetListCollectionResponseDocument getListCollectionResponse155 = null;
	                        com.microsoft.schemas.sharepoint.soap.GetListCollectionDocument wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.GetListCollectionDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.GetListCollectionDocument.class);
                                                
                                               getListCollectionResponse155 =
                                                   
                                                   
                                                         skel.getListCollection(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getListCollectionResponse155, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListCollectionResponse"));
                                    } else 

            if("updateListItems".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.UpdateListItemsResponseDocument updateListItemsResponse157 = null;
	                        com.microsoft.schemas.sharepoint.soap.UpdateListItemsDocument wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.UpdateListItemsDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.UpdateListItemsDocument.class);
                                                
                                               updateListItemsResponse157 =
                                                   
                                                   
                                                         skel.updateListItems(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateListItemsResponse157, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "UpdateListItemsResponse"));
                                    } else 

            if("undoCheckOut".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.UndoCheckOutResponseDocument undoCheckOutResponse159 = null;
	                        com.microsoft.schemas.sharepoint.soap.UndoCheckOutDocument wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.UndoCheckOutDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.UndoCheckOutDocument.class);
                                                
                                               undoCheckOutResponse159 =
                                                   
                                                   
                                                         skel.undoCheckOut(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), undoCheckOutResponse159, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "UndoCheckOutResponse"));
                                    } else 

            if("getListAndView".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.GetListAndViewResponseDocument getListAndViewResponse161 = null;
	                        com.microsoft.schemas.sharepoint.soap.GetListAndViewDocument wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.GetListAndViewDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.GetListAndViewDocument.class);
                                                
                                               getListAndViewResponse161 =
                                                   
                                                   
                                                         skel.getListAndView(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getListAndViewResponse161, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListAndViewResponse"));
                                    } else 

            if("deleteAttachment".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.DeleteAttachmentResponseDocument deleteAttachmentResponse163 = null;
	                        com.microsoft.schemas.sharepoint.soap.DeleteAttachmentDocument wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.DeleteAttachmentDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.DeleteAttachmentDocument.class);
                                                
                                               deleteAttachmentResponse163 =
                                                   
                                                   
                                                         skel.deleteAttachment(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deleteAttachmentResponse163, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "DeleteAttachmentResponse"));
                                    } else 

            if("createContentType".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.CreateContentTypeResponseDocument createContentTypeResponse165 = null;
	                        com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.class);
                                                
                                               createContentTypeResponse165 =
                                                   
                                                   
                                                         skel.createContentType(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createContentTypeResponse165, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "CreateContentTypeResponse"));
                                    } else 

            if("getListItems".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.GetListItemsResponseDocument getListItemsResponse167 = null;
	                        com.microsoft.schemas.sharepoint.soap.GetListItemsDocument wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.GetListItemsDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.GetListItemsDocument.class);
                                                
                                               getListItemsResponse167 =
                                                   
                                                   
                                                         skel.getListItems(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getListItemsResponse167, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListItemsResponse"));
                                    } else 

            if("deleteContentType".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.DeleteContentTypeResponseDocument deleteContentTypeResponse169 = null;
	                        com.microsoft.schemas.sharepoint.soap.DeleteContentTypeDocument wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.DeleteContentTypeDocument.class);
                                                
                                               deleteContentTypeResponse169 =
                                                   
                                                   
                                                         skel.deleteContentType(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deleteContentTypeResponse169, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "DeleteContentTypeResponse"));
                                    } else 

            if("getListContentTypesAndProperties".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument getListContentTypesAndPropertiesResponse171 = null;
	                        com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument.class);
                                                
                                               getListContentTypesAndPropertiesResponse171 =
                                                   
                                                   
                                                         skel.getListContentTypesAndProperties(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getListContentTypesAndPropertiesResponse171, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListContentTypesAndPropertiesResponse"));
                                    } else 

            if("addWikiPage".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.AddWikiPageResponseDocument addWikiPageResponse173 = null;
	                        com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument.class);
                                                
                                               addWikiPageResponse173 =
                                                   
                                                   
                                                         skel.addWikiPage(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), addWikiPageResponse173, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "AddWikiPageResponse"));
                                    } else 

            if("getListItemChangesWithKnowledge".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeResponseDocument getListItemChangesWithKnowledgeResponse175 = null;
	                        com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.class);
                                                
                                               getListItemChangesWithKnowledgeResponse175 =
                                                   
                                                   
                                                         skel.getListItemChangesWithKnowledge(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getListItemChangesWithKnowledgeResponse175, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListItemChangesWithKnowledgeResponse"));
                                    } else 

            if("updateListItemsWithKnowledge".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeResponseDocument updateListItemsWithKnowledgeResponse177 = null;
	                        com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.class);
                                                
                                               updateListItemsWithKnowledgeResponse177 =
                                                   
                                                   
                                                         skel.updateListItemsWithKnowledge(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateListItemsWithKnowledgeResponse177, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "UpdateListItemsWithKnowledgeResponse"));
                                    } else 

            if("getListItemChanges".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.GetListItemChangesResponseDocument getListItemChangesResponse179 = null;
	                        com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.class);
                                                
                                               getListItemChangesResponse179 =
                                                   
                                                   
                                                         skel.getListItemChanges(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getListItemChangesResponse179, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListItemChangesResponse"));
                                    } else 

            if("getAttachmentCollection".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionResponseDocument getAttachmentCollectionResponse181 = null;
	                        com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionDocument wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionDocument.class);
                                                
                                               getAttachmentCollectionResponse181 =
                                                   
                                                   
                                                         skel.getAttachmentCollection(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAttachmentCollectionResponse181, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetAttachmentCollectionResponse"));
                                    } else 

            if("deleteList".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.DeleteListResponseDocument deleteListResponse183 = null;
	                        com.microsoft.schemas.sharepoint.soap.DeleteListDocument wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.DeleteListDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.DeleteListDocument.class);
                                                
                                               deleteListResponse183 =
                                                   
                                                   
                                                         skel.deleteList(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deleteListResponse183, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "DeleteListResponse"));
                                    } else 

            if("updateContentTypesXmlDocument".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentResponseDocument updateContentTypesXmlDocumentResponse185 = null;
	                        com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1 wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1.class);
                                                
                                               updateContentTypesXmlDocumentResponse185 =
                                                   
                                                   
                                                         skel.updateContentTypesXmlDocument(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateContentTypesXmlDocumentResponse185, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "UpdateContentTypesXmlDocumentResponse"));
                                    } else 

            if("getListContentType".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.GetListContentTypeResponseDocument getListContentTypeResponse187 = null;
	                        com.microsoft.schemas.sharepoint.soap.GetListContentTypeDocument wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.GetListContentTypeDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.GetListContentTypeDocument.class);
                                                
                                               getListContentTypeResponse187 =
                                                   
                                                   
                                                         skel.getListContentType(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getListContentTypeResponse187, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetListContentTypeResponse"));
                                    } else 

            if("applyContentTypeToList".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListResponseDocument applyContentTypeToListResponse189 = null;
	                        com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListDocument wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListDocument.class);
                                                
                                               applyContentTypeToListResponse189 =
                                                   
                                                   
                                                         skel.applyContentTypeToList(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), applyContentTypeToListResponse189, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "ApplyContentTypeToListResponse"));
                                    } else 

            if("getVersionCollection".equals(methodName)){
                
                com.microsoft.schemas.sharepoint.soap.GetVersionCollectionResponseDocument getVersionCollectionResponse191 = null;
	                        com.microsoft.schemas.sharepoint.soap.GetVersionCollectionDocument wrappedParam =
                                                             (com.microsoft.schemas.sharepoint.soap.GetVersionCollectionDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.microsoft.schemas.sharepoint.soap.GetVersionCollectionDocument.class);
                                                
                                               getVersionCollectionResponse191 =
                                                   
                                                   
                                                         skel.getVersionCollection(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getVersionCollectionResponse191, false,
                                                    new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "GetVersionCollectionResponse"));
                                    
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
        
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1 param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1 param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.AddListDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.AddListDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.AddListResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.AddListResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.AddAttachmentDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.AddAttachmentDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.AddAttachmentResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.AddAttachmentResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.UpdateListDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.UpdateListDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.UpdateListResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.UpdateListResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.GetListDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.GetListDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.GetListResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.GetListResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.CheckOutFileResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.CheckOutFileResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.GetListContentTypesDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.GetListContentTypesDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.GetListContentTypesResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.GetListContentTypesResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentDocument1 param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentDocument1 param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.CheckInFileDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.CheckInFileDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.CheckInFileResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.CheckInFileResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.UpdateContentTypeResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.UpdateContentTypeResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.AddListFromFeatureDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.AddListFromFeatureDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.AddListFromFeatureResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.AddListFromFeatureResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.GetListCollectionDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.GetListCollectionDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.GetListCollectionResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.GetListCollectionResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.UpdateListItemsDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.UpdateListItemsDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.UpdateListItemsResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.UpdateListItemsResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.UndoCheckOutDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.UndoCheckOutDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.UndoCheckOutResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.UndoCheckOutResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.GetListAndViewDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.GetListAndViewDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.GetListAndViewResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.GetListAndViewResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.DeleteAttachmentDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.DeleteAttachmentDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.DeleteAttachmentResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.DeleteAttachmentResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.CreateContentTypeResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.CreateContentTypeResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.GetListItemsDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.GetListItemsDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.GetListItemsResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.GetListItemsResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.DeleteContentTypeDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.DeleteContentTypeDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.DeleteContentTypeResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.DeleteContentTypeResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.AddWikiPageResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.AddWikiPageResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.GetListItemChangesResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.GetListItemChangesResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.DeleteListDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.DeleteListDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.DeleteListResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.DeleteListResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1 param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1 param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.GetListContentTypeDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.GetListContentTypeDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.GetListContentTypeResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.GetListContentTypeResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.GetVersionCollectionDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.GetVersionCollectionDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.microsoft.schemas.sharepoint.soap.GetVersionCollectionResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.microsoft.schemas.sharepoint.soap.GetVersionCollectionResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.AddListResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.AddAttachmentResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.UpdateListResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.GetListResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.CheckOutFileResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.GetListContentTypesResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.CheckInFileResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.UpdateContentTypeResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.AddListFromFeatureResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.GetListCollectionResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.UpdateListItemsResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.UndoCheckOutResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.GetListAndViewResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.DeleteAttachmentResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.CreateContentTypeResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.GetListItemsResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.DeleteContentTypeResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.AddWikiPageResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.GetListItemChangesResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.DeleteListResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.GetListContentTypeResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.microsoft.schemas.sharepoint.soap.GetVersionCollectionResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
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
        

            if (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentDocument1.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.DeleteContentTypeXmlDocumentResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.GetListItemChangesSinceTokenResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.AddListDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.AddListDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.AddListResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.AddListResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.AddAttachmentDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.AddAttachmentDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.AddAttachmentResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.AddAttachmentResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.UpdateListDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.UpdateListDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.UpdateListResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.UpdateListResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.GetListDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.GetListDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.GetListResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.GetListResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.CheckOutFileDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.CheckOutFileResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.CheckOutFileResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.GetListContentTypesDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.GetListContentTypesDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.GetListContentTypesResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.GetListContentTypesResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentDocument1.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentDocument1.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.UpdateContentTypeXmlDocumentResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.CheckInFileDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.CheckInFileDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.CheckInFileResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.CheckInFileResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.UpdateContentTypeDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.UpdateContentTypeResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.UpdateContentTypeResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.AddDiscussionBoardItemResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.AddListFromFeatureDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.AddListFromFeatureDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.AddListFromFeatureResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.AddListFromFeatureResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.GetListCollectionDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.GetListCollectionDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.GetListCollectionResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.GetListCollectionResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.UpdateListItemsDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.UpdateListItemsDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.UpdateListItemsResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.UpdateListItemsResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.UndoCheckOutDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.UndoCheckOutDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.UndoCheckOutResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.UndoCheckOutResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.GetListAndViewDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.GetListAndViewDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.GetListAndViewResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.GetListAndViewResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.DeleteAttachmentDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.DeleteAttachmentDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.DeleteAttachmentResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.DeleteAttachmentResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.CreateContentTypeDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.CreateContentTypeResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.CreateContentTypeResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.GetListItemsDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.GetListItemsDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.GetListItemsResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.GetListItemsResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.DeleteContentTypeDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.DeleteContentTypeResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.DeleteContentTypeResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.GetListContentTypesAndPropertiesResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.AddWikiPageDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.AddWikiPageResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.AddWikiPageResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.GetListItemChangesWithKnowledgeResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.UpdateListItemsWithKnowledgeResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.GetListItemChangesDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.GetListItemChangesResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.GetListItemChangesResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.GetAttachmentCollectionResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.DeleteListDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.DeleteListDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.DeleteListResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.DeleteListResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentDocument1.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.UpdateContentTypesXmlDocumentResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.GetListContentTypeDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.GetListContentTypeDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.GetListContentTypeResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.GetListContentTypeResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.ApplyContentTypeToListResponseDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.GetVersionCollectionDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.GetVersionCollectionDocument.Factory.parse(
                    param.getXMLStreamReader(false, configuration));
            }

        

            if (com.microsoft.schemas.sharepoint.soap.GetVersionCollectionResponseDocument.class.equals(type)){
                org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration
                    = new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
                configuration.setPreserveNamespaceContext(true);
                return com.microsoft.schemas.sharepoint.soap.GetVersionCollectionResponseDocument.Factory.parse(
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
    