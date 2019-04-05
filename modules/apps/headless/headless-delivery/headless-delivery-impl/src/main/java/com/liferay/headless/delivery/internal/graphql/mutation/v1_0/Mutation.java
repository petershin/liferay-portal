/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.headless.delivery.internal.graphql.mutation.v1_0;

import com.liferay.headless.delivery.dto.v1_0.BlogPosting;
import com.liferay.headless.delivery.dto.v1_0.BlogPostingImage;
import com.liferay.headless.delivery.dto.v1_0.Comment;
import com.liferay.headless.delivery.dto.v1_0.Document;
import com.liferay.headless.delivery.dto.v1_0.DocumentFolder;
import com.liferay.headless.delivery.dto.v1_0.KnowledgeBaseArticle;
import com.liferay.headless.delivery.dto.v1_0.KnowledgeBaseAttachment;
import com.liferay.headless.delivery.dto.v1_0.KnowledgeBaseFolder;
import com.liferay.headless.delivery.dto.v1_0.MessageBoardAttachment;
import com.liferay.headless.delivery.dto.v1_0.MessageBoardMessage;
import com.liferay.headless.delivery.dto.v1_0.MessageBoardSection;
import com.liferay.headless.delivery.dto.v1_0.MessageBoardThread;
import com.liferay.headless.delivery.dto.v1_0.Rating;
import com.liferay.headless.delivery.dto.v1_0.StructuredContent;
import com.liferay.headless.delivery.dto.v1_0.StructuredContentFolder;
import com.liferay.headless.delivery.resource.v1_0.BlogPostingImageResource;
import com.liferay.headless.delivery.resource.v1_0.BlogPostingResource;
import com.liferay.headless.delivery.resource.v1_0.CommentResource;
import com.liferay.headless.delivery.resource.v1_0.DocumentFolderResource;
import com.liferay.headless.delivery.resource.v1_0.DocumentResource;
import com.liferay.headless.delivery.resource.v1_0.KnowledgeBaseArticleResource;
import com.liferay.headless.delivery.resource.v1_0.KnowledgeBaseAttachmentResource;
import com.liferay.headless.delivery.resource.v1_0.KnowledgeBaseFolderResource;
import com.liferay.headless.delivery.resource.v1_0.MessageBoardAttachmentResource;
import com.liferay.headless.delivery.resource.v1_0.MessageBoardMessageResource;
import com.liferay.headless.delivery.resource.v1_0.MessageBoardSectionResource;
import com.liferay.headless.delivery.resource.v1_0.MessageBoardThreadResource;
import com.liferay.headless.delivery.resource.v1_0.StructuredContentFolderResource;
import com.liferay.headless.delivery.resource.v1_0.StructuredContentResource;
import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.CompanyLocalServiceUtil;
import com.liferay.portal.vulcan.multipart.MultipartBody;

import graphql.annotations.annotationTypes.GraphQLField;
import graphql.annotations.annotationTypes.GraphQLInvokeDetached;
import graphql.annotations.annotationTypes.GraphQLName;

import javax.annotation.Generated;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Mutation {

	public static void setBlogPostingResourceComponentServiceObjects(
		ComponentServiceObjects<BlogPostingResource>
			blogPostingResourceComponentServiceObjects) {

		_blogPostingResourceComponentServiceObjects =
			blogPostingResourceComponentServiceObjects;
	}

	public static void setBlogPostingImageResourceComponentServiceObjects(
		ComponentServiceObjects<BlogPostingImageResource>
			blogPostingImageResourceComponentServiceObjects) {

		_blogPostingImageResourceComponentServiceObjects =
			blogPostingImageResourceComponentServiceObjects;
	}

	public static void setCommentResourceComponentServiceObjects(
		ComponentServiceObjects<CommentResource>
			commentResourceComponentServiceObjects) {

		_commentResourceComponentServiceObjects =
			commentResourceComponentServiceObjects;
	}

	public static void setDocumentResourceComponentServiceObjects(
		ComponentServiceObjects<DocumentResource>
			documentResourceComponentServiceObjects) {

		_documentResourceComponentServiceObjects =
			documentResourceComponentServiceObjects;
	}

	public static void setDocumentFolderResourceComponentServiceObjects(
		ComponentServiceObjects<DocumentFolderResource>
			documentFolderResourceComponentServiceObjects) {

		_documentFolderResourceComponentServiceObjects =
			documentFolderResourceComponentServiceObjects;
	}

	public static void setKnowledgeBaseArticleResourceComponentServiceObjects(
		ComponentServiceObjects<KnowledgeBaseArticleResource>
			knowledgeBaseArticleResourceComponentServiceObjects) {

		_knowledgeBaseArticleResourceComponentServiceObjects =
			knowledgeBaseArticleResourceComponentServiceObjects;
	}

	public static void
		setKnowledgeBaseAttachmentResourceComponentServiceObjects(
			ComponentServiceObjects<KnowledgeBaseAttachmentResource>
				knowledgeBaseAttachmentResourceComponentServiceObjects) {

		_knowledgeBaseAttachmentResourceComponentServiceObjects =
			knowledgeBaseAttachmentResourceComponentServiceObjects;
	}

	public static void setKnowledgeBaseFolderResourceComponentServiceObjects(
		ComponentServiceObjects<KnowledgeBaseFolderResource>
			knowledgeBaseFolderResourceComponentServiceObjects) {

		_knowledgeBaseFolderResourceComponentServiceObjects =
			knowledgeBaseFolderResourceComponentServiceObjects;
	}

	public static void setMessageBoardAttachmentResourceComponentServiceObjects(
		ComponentServiceObjects<MessageBoardAttachmentResource>
			messageBoardAttachmentResourceComponentServiceObjects) {

		_messageBoardAttachmentResourceComponentServiceObjects =
			messageBoardAttachmentResourceComponentServiceObjects;
	}

	public static void setMessageBoardMessageResourceComponentServiceObjects(
		ComponentServiceObjects<MessageBoardMessageResource>
			messageBoardMessageResourceComponentServiceObjects) {

		_messageBoardMessageResourceComponentServiceObjects =
			messageBoardMessageResourceComponentServiceObjects;
	}

	public static void setMessageBoardSectionResourceComponentServiceObjects(
		ComponentServiceObjects<MessageBoardSectionResource>
			messageBoardSectionResourceComponentServiceObjects) {

		_messageBoardSectionResourceComponentServiceObjects =
			messageBoardSectionResourceComponentServiceObjects;
	}

	public static void setMessageBoardThreadResourceComponentServiceObjects(
		ComponentServiceObjects<MessageBoardThreadResource>
			messageBoardThreadResourceComponentServiceObjects) {

		_messageBoardThreadResourceComponentServiceObjects =
			messageBoardThreadResourceComponentServiceObjects;
	}

	public static void setStructuredContentResourceComponentServiceObjects(
		ComponentServiceObjects<StructuredContentResource>
			structuredContentResourceComponentServiceObjects) {

		_structuredContentResourceComponentServiceObjects =
			structuredContentResourceComponentServiceObjects;
	}

	public static void
		setStructuredContentFolderResourceComponentServiceObjects(
			ComponentServiceObjects<StructuredContentFolderResource>
				structuredContentFolderResourceComponentServiceObjects) {

		_structuredContentFolderResourceComponentServiceObjects =
			structuredContentFolderResourceComponentServiceObjects;
	}

	@GraphQLInvokeDetached
	public void deleteBlogPosting(Long blogPostingId) throws Exception {
		_applyVoidComponentServiceObjects(
			_blogPostingResourceComponentServiceObjects,
			this::_populateResourceContext,
			blogPostingResource -> blogPostingResource.deleteBlogPosting(
				blogPostingId));
	}

	@GraphQLInvokeDetached
	public BlogPosting patchBlogPosting(
			Long blogPostingId, BlogPosting blogPosting)
		throws Exception {

		return _applyComponentServiceObjects(
			_blogPostingResourceComponentServiceObjects,
			this::_populateResourceContext,
			blogPostingResource -> blogPostingResource.patchBlogPosting(
				blogPostingId, blogPosting));
	}

	@GraphQLInvokeDetached
	public BlogPosting putBlogPosting(
			Long blogPostingId, BlogPosting blogPosting)
		throws Exception {

		return _applyComponentServiceObjects(
			_blogPostingResourceComponentServiceObjects,
			this::_populateResourceContext,
			blogPostingResource -> blogPostingResource.putBlogPosting(
				blogPostingId, blogPosting));
	}

	@GraphQLInvokeDetached
	public void deleteBlogPostingMyRating(Long blogPostingId) throws Exception {
		_applyVoidComponentServiceObjects(
			_blogPostingResourceComponentServiceObjects,
			this::_populateResourceContext,
			blogPostingResource ->
				blogPostingResource.deleteBlogPostingMyRating(blogPostingId));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Rating postBlogPostingMyRating(Long blogPostingId, Rating rating)
		throws Exception {

		return _applyComponentServiceObjects(
			_blogPostingResourceComponentServiceObjects,
			this::_populateResourceContext,
			blogPostingResource -> blogPostingResource.postBlogPostingMyRating(
				blogPostingId, rating));
	}

	@GraphQLInvokeDetached
	public Rating putBlogPostingMyRating(Long blogPostingId, Rating rating)
		throws Exception {

		return _applyComponentServiceObjects(
			_blogPostingResourceComponentServiceObjects,
			this::_populateResourceContext,
			blogPostingResource -> blogPostingResource.putBlogPostingMyRating(
				blogPostingId, rating));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public BlogPosting postContentSpaceBlogPosting(
			Long contentSpaceId, BlogPosting blogPosting)
		throws Exception {

		return _applyComponentServiceObjects(
			_blogPostingResourceComponentServiceObjects,
			this::_populateResourceContext,
			blogPostingResource ->
				blogPostingResource.postContentSpaceBlogPosting(
					contentSpaceId, blogPosting));
	}

	@GraphQLInvokeDetached
	public void deleteBlogPostingImage(Long blogPostingImageId)
		throws Exception {

		_applyVoidComponentServiceObjects(
			_blogPostingImageResourceComponentServiceObjects,
			this::_populateResourceContext,
			blogPostingImageResource ->
				blogPostingImageResource.deleteBlogPostingImage(
					blogPostingImageId));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	@GraphQLName("postContentSpaceBlogPostingImageContentSpaceIdMultipartBody")
	public BlogPostingImage postContentSpaceBlogPostingImage(
			Long contentSpaceId, MultipartBody multipartBody)
		throws Exception {

		return _applyComponentServiceObjects(
			_blogPostingImageResourceComponentServiceObjects,
			this::_populateResourceContext,
			blogPostingImageResource ->
				blogPostingImageResource.postContentSpaceBlogPostingImage(
					contentSpaceId, multipartBody));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Comment postBlogPostingComment(Long blogPostingId, Comment comment)
		throws Exception {

		return _applyComponentServiceObjects(
			_commentResourceComponentServiceObjects,
			this::_populateResourceContext,
			commentResource -> commentResource.postBlogPostingComment(
				blogPostingId, comment));
	}

	@GraphQLInvokeDetached
	public void deleteComment(Long commentId) throws Exception {
		_applyVoidComponentServiceObjects(
			_commentResourceComponentServiceObjects,
			this::_populateResourceContext,
			commentResource -> commentResource.deleteComment(commentId));
	}

	@GraphQLInvokeDetached
	public Comment putComment(Long commentId, Comment comment)
		throws Exception {

		return _applyComponentServiceObjects(
			_commentResourceComponentServiceObjects,
			this::_populateResourceContext,
			commentResource -> commentResource.putComment(commentId, comment));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Comment postCommentComment(Long parentCommentId, Comment comment)
		throws Exception {

		return _applyComponentServiceObjects(
			_commentResourceComponentServiceObjects,
			this::_populateResourceContext,
			commentResource -> commentResource.postCommentComment(
				parentCommentId, comment));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Comment postDocumentComment(Long documentId, Comment comment)
		throws Exception {

		return _applyComponentServiceObjects(
			_commentResourceComponentServiceObjects,
			this::_populateResourceContext,
			commentResource -> commentResource.postDocumentComment(
				documentId, comment));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Comment postStructuredContentComment(
			Long structuredContentId, Comment comment)
		throws Exception {

		return _applyComponentServiceObjects(
			_commentResourceComponentServiceObjects,
			this::_populateResourceContext,
			commentResource -> commentResource.postStructuredContentComment(
				structuredContentId, comment));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	@GraphQLName("postContentSpaceDocumentContentSpaceIdMultipartBody")
	public Document postContentSpaceDocument(
			Long contentSpaceId, MultipartBody multipartBody)
		throws Exception {

		return _applyComponentServiceObjects(
			_documentResourceComponentServiceObjects,
			this::_populateResourceContext,
			documentResource -> documentResource.postContentSpaceDocument(
				contentSpaceId, multipartBody));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	@GraphQLName("postDocumentFolderDocumentDocumentFolderIdMultipartBody")
	public Document postDocumentFolderDocument(
			Long documentFolderId, MultipartBody multipartBody)
		throws Exception {

		return _applyComponentServiceObjects(
			_documentResourceComponentServiceObjects,
			this::_populateResourceContext,
			documentResource -> documentResource.postDocumentFolderDocument(
				documentFolderId, multipartBody));
	}

	@GraphQLInvokeDetached
	public void deleteDocument(Long documentId) throws Exception {
		_applyVoidComponentServiceObjects(
			_documentResourceComponentServiceObjects,
			this::_populateResourceContext,
			documentResource -> documentResource.deleteDocument(documentId));
	}

	@GraphQLInvokeDetached
	@GraphQLName("patchDocumentDocumentIdMultipartBody")
	public Document patchDocument(Long documentId, MultipartBody multipartBody)
		throws Exception {

		return _applyComponentServiceObjects(
			_documentResourceComponentServiceObjects,
			this::_populateResourceContext,
			documentResource -> documentResource.patchDocument(
				documentId, multipartBody));
	}

	@GraphQLInvokeDetached
	@GraphQLName("putDocumentDocumentIdMultipartBody")
	public Document putDocument(Long documentId, MultipartBody multipartBody)
		throws Exception {

		return _applyComponentServiceObjects(
			_documentResourceComponentServiceObjects,
			this::_populateResourceContext,
			documentResource -> documentResource.putDocument(
				documentId, multipartBody));
	}

	@GraphQLInvokeDetached
	public void deleteDocumentMyRating(Long documentId) throws Exception {
		_applyVoidComponentServiceObjects(
			_documentResourceComponentServiceObjects,
			this::_populateResourceContext,
			documentResource -> documentResource.deleteDocumentMyRating(
				documentId));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Rating postDocumentMyRating(Long documentId, Rating rating)
		throws Exception {

		return _applyComponentServiceObjects(
			_documentResourceComponentServiceObjects,
			this::_populateResourceContext,
			documentResource -> documentResource.postDocumentMyRating(
				documentId, rating));
	}

	@GraphQLInvokeDetached
	public Rating putDocumentMyRating(Long documentId, Rating rating)
		throws Exception {

		return _applyComponentServiceObjects(
			_documentResourceComponentServiceObjects,
			this::_populateResourceContext,
			documentResource -> documentResource.putDocumentMyRating(
				documentId, rating));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public DocumentFolder postContentSpaceDocumentFolder(
			Long contentSpaceId, DocumentFolder documentFolder)
		throws Exception {

		return _applyComponentServiceObjects(
			_documentFolderResourceComponentServiceObjects,
			this::_populateResourceContext,
			documentFolderResource ->
				documentFolderResource.postContentSpaceDocumentFolder(
					contentSpaceId, documentFolder));
	}

	@GraphQLInvokeDetached
	public void deleteDocumentFolder(Long documentFolderId) throws Exception {
		_applyVoidComponentServiceObjects(
			_documentFolderResourceComponentServiceObjects,
			this::_populateResourceContext,
			documentFolderResource ->
				documentFolderResource.deleteDocumentFolder(documentFolderId));
	}

	@GraphQLInvokeDetached
	public DocumentFolder patchDocumentFolder(
			Long documentFolderId, DocumentFolder documentFolder)
		throws Exception {

		return _applyComponentServiceObjects(
			_documentFolderResourceComponentServiceObjects,
			this::_populateResourceContext,
			documentFolderResource ->
				documentFolderResource.patchDocumentFolder(
					documentFolderId, documentFolder));
	}

	@GraphQLInvokeDetached
	public DocumentFolder putDocumentFolder(
			Long documentFolderId, DocumentFolder documentFolder)
		throws Exception {

		return _applyComponentServiceObjects(
			_documentFolderResourceComponentServiceObjects,
			this::_populateResourceContext,
			documentFolderResource -> documentFolderResource.putDocumentFolder(
				documentFolderId, documentFolder));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public DocumentFolder postDocumentFolderDocumentFolder(
			Long parentDocumentFolderId, DocumentFolder documentFolder)
		throws Exception {

		return _applyComponentServiceObjects(
			_documentFolderResourceComponentServiceObjects,
			this::_populateResourceContext,
			documentFolderResource ->
				documentFolderResource.postDocumentFolderDocumentFolder(
					parentDocumentFolderId, documentFolder));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public KnowledgeBaseArticle postContentSpaceKnowledgeBaseArticle(
			Long contentSpaceId, KnowledgeBaseArticle knowledgeBaseArticle)
		throws Exception {

		return _applyComponentServiceObjects(
			_knowledgeBaseArticleResourceComponentServiceObjects,
			this::_populateResourceContext,
			knowledgeBaseArticleResource ->
				knowledgeBaseArticleResource.
					postContentSpaceKnowledgeBaseArticle(
						contentSpaceId, knowledgeBaseArticle));
	}

	@GraphQLInvokeDetached
	public void deleteKnowledgeBaseArticle(Long knowledgeBaseArticleId)
		throws Exception {

		_applyVoidComponentServiceObjects(
			_knowledgeBaseArticleResourceComponentServiceObjects,
			this::_populateResourceContext,
			knowledgeBaseArticleResource ->
				knowledgeBaseArticleResource.deleteKnowledgeBaseArticle(
					knowledgeBaseArticleId));
	}

	@GraphQLInvokeDetached
	public KnowledgeBaseArticle patchKnowledgeBaseArticle(
			Long knowledgeBaseArticleId,
			KnowledgeBaseArticle knowledgeBaseArticle)
		throws Exception {

		return _applyComponentServiceObjects(
			_knowledgeBaseArticleResourceComponentServiceObjects,
			this::_populateResourceContext,
			knowledgeBaseArticleResource ->
				knowledgeBaseArticleResource.patchKnowledgeBaseArticle(
					knowledgeBaseArticleId, knowledgeBaseArticle));
	}

	@GraphQLInvokeDetached
	public KnowledgeBaseArticle putKnowledgeBaseArticle(
			Long knowledgeBaseArticleId,
			KnowledgeBaseArticle knowledgeBaseArticle)
		throws Exception {

		return _applyComponentServiceObjects(
			_knowledgeBaseArticleResourceComponentServiceObjects,
			this::_populateResourceContext,
			knowledgeBaseArticleResource ->
				knowledgeBaseArticleResource.putKnowledgeBaseArticle(
					knowledgeBaseArticleId, knowledgeBaseArticle));
	}

	@GraphQLInvokeDetached
	public void deleteKnowledgeBaseArticleMyRating(Long knowledgeBaseArticleId)
		throws Exception {

		_applyVoidComponentServiceObjects(
			_knowledgeBaseArticleResourceComponentServiceObjects,
			this::_populateResourceContext,
			knowledgeBaseArticleResource ->
				knowledgeBaseArticleResource.deleteKnowledgeBaseArticleMyRating(
					knowledgeBaseArticleId));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Rating postKnowledgeBaseArticleMyRating(
			Long knowledgeBaseArticleId, Rating rating)
		throws Exception {

		return _applyComponentServiceObjects(
			_knowledgeBaseArticleResourceComponentServiceObjects,
			this::_populateResourceContext,
			knowledgeBaseArticleResource ->
				knowledgeBaseArticleResource.postKnowledgeBaseArticleMyRating(
					knowledgeBaseArticleId, rating));
	}

	@GraphQLInvokeDetached
	public Rating putKnowledgeBaseArticleMyRating(
			Long knowledgeBaseArticleId, Rating rating)
		throws Exception {

		return _applyComponentServiceObjects(
			_knowledgeBaseArticleResourceComponentServiceObjects,
			this::_populateResourceContext,
			knowledgeBaseArticleResource ->
				knowledgeBaseArticleResource.putKnowledgeBaseArticleMyRating(
					knowledgeBaseArticleId, rating));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public KnowledgeBaseArticle postKnowledgeBaseArticleKnowledgeBaseArticle(
			Long parentKnowledgeBaseArticleId,
			KnowledgeBaseArticle knowledgeBaseArticle)
		throws Exception {

		return _applyComponentServiceObjects(
			_knowledgeBaseArticleResourceComponentServiceObjects,
			this::_populateResourceContext,
			knowledgeBaseArticleResource ->
				knowledgeBaseArticleResource.
					postKnowledgeBaseArticleKnowledgeBaseArticle(
						parentKnowledgeBaseArticleId, knowledgeBaseArticle));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public KnowledgeBaseArticle postKnowledgeBaseFolderKnowledgeBaseArticle(
			Long knowledgeBaseFolderId,
			KnowledgeBaseArticle knowledgeBaseArticle)
		throws Exception {

		return _applyComponentServiceObjects(
			_knowledgeBaseArticleResourceComponentServiceObjects,
			this::_populateResourceContext,
			knowledgeBaseArticleResource ->
				knowledgeBaseArticleResource.
					postKnowledgeBaseFolderKnowledgeBaseArticle(
						knowledgeBaseFolderId, knowledgeBaseArticle));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	@GraphQLName(
		"postKnowledgeBaseArticleKnowledgeBaseAttachmentKnowledgeBaseArticleIdMultipartBody"
	)
	public KnowledgeBaseAttachment
			postKnowledgeBaseArticleKnowledgeBaseAttachment(
				Long knowledgeBaseArticleId, MultipartBody multipartBody)
		throws Exception {

		return _applyComponentServiceObjects(
			_knowledgeBaseAttachmentResourceComponentServiceObjects,
			this::_populateResourceContext,
			knowledgeBaseAttachmentResource ->
				knowledgeBaseAttachmentResource.
					postKnowledgeBaseArticleKnowledgeBaseAttachment(
						knowledgeBaseArticleId, multipartBody));
	}

	@GraphQLInvokeDetached
	public void deleteKnowledgeBaseAttachment(Long knowledgeBaseAttachmentId)
		throws Exception {

		_applyVoidComponentServiceObjects(
			_knowledgeBaseAttachmentResourceComponentServiceObjects,
			this::_populateResourceContext,
			knowledgeBaseAttachmentResource ->
				knowledgeBaseAttachmentResource.deleteKnowledgeBaseAttachment(
					knowledgeBaseAttachmentId));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public KnowledgeBaseFolder postContentSpaceKnowledgeBaseFolder(
			Long contentSpaceId, KnowledgeBaseFolder knowledgeBaseFolder)
		throws Exception {

		return _applyComponentServiceObjects(
			_knowledgeBaseFolderResourceComponentServiceObjects,
			this::_populateResourceContext,
			knowledgeBaseFolderResource ->
				knowledgeBaseFolderResource.postContentSpaceKnowledgeBaseFolder(
					contentSpaceId, knowledgeBaseFolder));
	}

	@GraphQLInvokeDetached
	public void deleteKnowledgeBaseFolder(Long knowledgeBaseFolderId)
		throws Exception {

		_applyVoidComponentServiceObjects(
			_knowledgeBaseFolderResourceComponentServiceObjects,
			this::_populateResourceContext,
			knowledgeBaseFolderResource ->
				knowledgeBaseFolderResource.deleteKnowledgeBaseFolder(
					knowledgeBaseFolderId));
	}

	@GraphQLInvokeDetached
	public KnowledgeBaseFolder patchKnowledgeBaseFolder(
			Long knowledgeBaseFolderId, KnowledgeBaseFolder knowledgeBaseFolder)
		throws Exception {

		return _applyComponentServiceObjects(
			_knowledgeBaseFolderResourceComponentServiceObjects,
			this::_populateResourceContext,
			knowledgeBaseFolderResource ->
				knowledgeBaseFolderResource.patchKnowledgeBaseFolder(
					knowledgeBaseFolderId, knowledgeBaseFolder));
	}

	@GraphQLInvokeDetached
	public KnowledgeBaseFolder putKnowledgeBaseFolder(
			Long knowledgeBaseFolderId, KnowledgeBaseFolder knowledgeBaseFolder)
		throws Exception {

		return _applyComponentServiceObjects(
			_knowledgeBaseFolderResourceComponentServiceObjects,
			this::_populateResourceContext,
			knowledgeBaseFolderResource ->
				knowledgeBaseFolderResource.putKnowledgeBaseFolder(
					knowledgeBaseFolderId, knowledgeBaseFolder));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public KnowledgeBaseFolder postKnowledgeBaseFolderKnowledgeBaseFolder(
			Long parentKnowledgeBaseFolderId,
			KnowledgeBaseFolder knowledgeBaseFolder)
		throws Exception {

		return _applyComponentServiceObjects(
			_knowledgeBaseFolderResourceComponentServiceObjects,
			this::_populateResourceContext,
			knowledgeBaseFolderResource ->
				knowledgeBaseFolderResource.
					postKnowledgeBaseFolderKnowledgeBaseFolder(
						parentKnowledgeBaseFolderId, knowledgeBaseFolder));
	}

	@GraphQLInvokeDetached
	public void deleteMessageBoardAttachment(Long messageBoardAttachmentId)
		throws Exception {

		_applyVoidComponentServiceObjects(
			_messageBoardAttachmentResourceComponentServiceObjects,
			this::_populateResourceContext,
			messageBoardAttachmentResource ->
				messageBoardAttachmentResource.deleteMessageBoardAttachment(
					messageBoardAttachmentId));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	@GraphQLName(
		"postMessageBoardMessageMessageBoardAttachmentMessageBoardMessageIdMultipartBody"
	)
	public MessageBoardAttachment postMessageBoardMessageMessageBoardAttachment(
			Long messageBoardMessageId, MultipartBody multipartBody)
		throws Exception {

		return _applyComponentServiceObjects(
			_messageBoardAttachmentResourceComponentServiceObjects,
			this::_populateResourceContext,
			messageBoardAttachmentResource ->
				messageBoardAttachmentResource.
					postMessageBoardMessageMessageBoardAttachment(
						messageBoardMessageId, multipartBody));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	@GraphQLName(
		"postMessageBoardThreadMessageBoardAttachmentMessageBoardThreadIdMultipartBody"
	)
	public MessageBoardAttachment postMessageBoardThreadMessageBoardAttachment(
			Long messageBoardThreadId, MultipartBody multipartBody)
		throws Exception {

		return _applyComponentServiceObjects(
			_messageBoardAttachmentResourceComponentServiceObjects,
			this::_populateResourceContext,
			messageBoardAttachmentResource ->
				messageBoardAttachmentResource.
					postMessageBoardThreadMessageBoardAttachment(
						messageBoardThreadId, multipartBody));
	}

	@GraphQLInvokeDetached
	public void deleteMessageBoardMessage(Long messageBoardMessageId)
		throws Exception {

		_applyVoidComponentServiceObjects(
			_messageBoardMessageResourceComponentServiceObjects,
			this::_populateResourceContext,
			messageBoardMessageResource ->
				messageBoardMessageResource.deleteMessageBoardMessage(
					messageBoardMessageId));
	}

	@GraphQLInvokeDetached
	public MessageBoardMessage patchMessageBoardMessage(
			Long messageBoardMessageId, MessageBoardMessage messageBoardMessage)
		throws Exception {

		return _applyComponentServiceObjects(
			_messageBoardMessageResourceComponentServiceObjects,
			this::_populateResourceContext,
			messageBoardMessageResource ->
				messageBoardMessageResource.patchMessageBoardMessage(
					messageBoardMessageId, messageBoardMessage));
	}

	@GraphQLInvokeDetached
	public MessageBoardMessage putMessageBoardMessage(
			Long messageBoardMessageId, MessageBoardMessage messageBoardMessage)
		throws Exception {

		return _applyComponentServiceObjects(
			_messageBoardMessageResourceComponentServiceObjects,
			this::_populateResourceContext,
			messageBoardMessageResource ->
				messageBoardMessageResource.putMessageBoardMessage(
					messageBoardMessageId, messageBoardMessage));
	}

	@GraphQLInvokeDetached
	public void deleteMessageBoardMessageMyRating(Long messageBoardMessageId)
		throws Exception {

		_applyVoidComponentServiceObjects(
			_messageBoardMessageResourceComponentServiceObjects,
			this::_populateResourceContext,
			messageBoardMessageResource ->
				messageBoardMessageResource.deleteMessageBoardMessageMyRating(
					messageBoardMessageId));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Rating postMessageBoardMessageMyRating(
			Long messageBoardMessageId, Rating rating)
		throws Exception {

		return _applyComponentServiceObjects(
			_messageBoardMessageResourceComponentServiceObjects,
			this::_populateResourceContext,
			messageBoardMessageResource ->
				messageBoardMessageResource.postMessageBoardMessageMyRating(
					messageBoardMessageId, rating));
	}

	@GraphQLInvokeDetached
	public Rating putMessageBoardMessageMyRating(
			Long messageBoardMessageId, Rating rating)
		throws Exception {

		return _applyComponentServiceObjects(
			_messageBoardMessageResourceComponentServiceObjects,
			this::_populateResourceContext,
			messageBoardMessageResource ->
				messageBoardMessageResource.putMessageBoardMessageMyRating(
					messageBoardMessageId, rating));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public MessageBoardMessage postMessageBoardMessageMessageBoardMessage(
			Long parentMessageBoardMessageId,
			MessageBoardMessage messageBoardMessage)
		throws Exception {

		return _applyComponentServiceObjects(
			_messageBoardMessageResourceComponentServiceObjects,
			this::_populateResourceContext,
			messageBoardMessageResource ->
				messageBoardMessageResource.
					postMessageBoardMessageMessageBoardMessage(
						parentMessageBoardMessageId, messageBoardMessage));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public MessageBoardMessage postMessageBoardThreadMessageBoardMessage(
			Long messageBoardThreadId, MessageBoardMessage messageBoardMessage)
		throws Exception {

		return _applyComponentServiceObjects(
			_messageBoardMessageResourceComponentServiceObjects,
			this::_populateResourceContext,
			messageBoardMessageResource ->
				messageBoardMessageResource.
					postMessageBoardThreadMessageBoardMessage(
						messageBoardThreadId, messageBoardMessage));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public MessageBoardSection postContentSpaceMessageBoardSection(
			Long contentSpaceId, MessageBoardSection messageBoardSection)
		throws Exception {

		return _applyComponentServiceObjects(
			_messageBoardSectionResourceComponentServiceObjects,
			this::_populateResourceContext,
			messageBoardSectionResource ->
				messageBoardSectionResource.postContentSpaceMessageBoardSection(
					contentSpaceId, messageBoardSection));
	}

	@GraphQLInvokeDetached
	public void deleteMessageBoardSection(Long messageBoardSectionId)
		throws Exception {

		_applyVoidComponentServiceObjects(
			_messageBoardSectionResourceComponentServiceObjects,
			this::_populateResourceContext,
			messageBoardSectionResource ->
				messageBoardSectionResource.deleteMessageBoardSection(
					messageBoardSectionId));
	}

	@GraphQLInvokeDetached
	public MessageBoardSection patchMessageBoardSection(
			Long messageBoardSectionId, MessageBoardSection messageBoardSection)
		throws Exception {

		return _applyComponentServiceObjects(
			_messageBoardSectionResourceComponentServiceObjects,
			this::_populateResourceContext,
			messageBoardSectionResource ->
				messageBoardSectionResource.patchMessageBoardSection(
					messageBoardSectionId, messageBoardSection));
	}

	@GraphQLInvokeDetached
	public MessageBoardSection putMessageBoardSection(
			Long messageBoardSectionId, MessageBoardSection messageBoardSection)
		throws Exception {

		return _applyComponentServiceObjects(
			_messageBoardSectionResourceComponentServiceObjects,
			this::_populateResourceContext,
			messageBoardSectionResource ->
				messageBoardSectionResource.putMessageBoardSection(
					messageBoardSectionId, messageBoardSection));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public MessageBoardSection postMessageBoardSectionMessageBoardSection(
			Long parentMessageBoardSectionId,
			MessageBoardSection messageBoardSection)
		throws Exception {

		return _applyComponentServiceObjects(
			_messageBoardSectionResourceComponentServiceObjects,
			this::_populateResourceContext,
			messageBoardSectionResource ->
				messageBoardSectionResource.
					postMessageBoardSectionMessageBoardSection(
						parentMessageBoardSectionId, messageBoardSection));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public MessageBoardThread postContentSpaceMessageBoardThread(
			Long contentSpaceId, MessageBoardThread messageBoardThread)
		throws Exception {

		return _applyComponentServiceObjects(
			_messageBoardThreadResourceComponentServiceObjects,
			this::_populateResourceContext,
			messageBoardThreadResource ->
				messageBoardThreadResource.postContentSpaceMessageBoardThread(
					contentSpaceId, messageBoardThread));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public MessageBoardThread postMessageBoardSectionMessageBoardThread(
			Long messageBoardSectionId, MessageBoardThread messageBoardThread)
		throws Exception {

		return _applyComponentServiceObjects(
			_messageBoardThreadResourceComponentServiceObjects,
			this::_populateResourceContext,
			messageBoardThreadResource ->
				messageBoardThreadResource.
					postMessageBoardSectionMessageBoardThread(
						messageBoardSectionId, messageBoardThread));
	}

	@GraphQLInvokeDetached
	public void deleteMessageBoardThread(Long messageBoardThreadId)
		throws Exception {

		_applyVoidComponentServiceObjects(
			_messageBoardThreadResourceComponentServiceObjects,
			this::_populateResourceContext,
			messageBoardThreadResource ->
				messageBoardThreadResource.deleteMessageBoardThread(
					messageBoardThreadId));
	}

	@GraphQLInvokeDetached
	public MessageBoardThread patchMessageBoardThread(
			Long messageBoardThreadId, MessageBoardThread messageBoardThread)
		throws Exception {

		return _applyComponentServiceObjects(
			_messageBoardThreadResourceComponentServiceObjects,
			this::_populateResourceContext,
			messageBoardThreadResource ->
				messageBoardThreadResource.patchMessageBoardThread(
					messageBoardThreadId, messageBoardThread));
	}

	@GraphQLInvokeDetached
	public MessageBoardThread putMessageBoardThread(
			Long messageBoardThreadId, MessageBoardThread messageBoardThread)
		throws Exception {

		return _applyComponentServiceObjects(
			_messageBoardThreadResourceComponentServiceObjects,
			this::_populateResourceContext,
			messageBoardThreadResource ->
				messageBoardThreadResource.putMessageBoardThread(
					messageBoardThreadId, messageBoardThread));
	}

	@GraphQLInvokeDetached
	public void deleteMessageBoardThreadMyRating(Long messageBoardThreadId)
		throws Exception {

		_applyVoidComponentServiceObjects(
			_messageBoardThreadResourceComponentServiceObjects,
			this::_populateResourceContext,
			messageBoardThreadResource ->
				messageBoardThreadResource.deleteMessageBoardThreadMyRating(
					messageBoardThreadId));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Rating postMessageBoardThreadMyRating(
			Long messageBoardThreadId, Rating rating)
		throws Exception {

		return _applyComponentServiceObjects(
			_messageBoardThreadResourceComponentServiceObjects,
			this::_populateResourceContext,
			messageBoardThreadResource ->
				messageBoardThreadResource.postMessageBoardThreadMyRating(
					messageBoardThreadId, rating));
	}

	@GraphQLInvokeDetached
	public Rating putMessageBoardThreadMyRating(
			Long messageBoardThreadId, Rating rating)
		throws Exception {

		return _applyComponentServiceObjects(
			_messageBoardThreadResourceComponentServiceObjects,
			this::_populateResourceContext,
			messageBoardThreadResource ->
				messageBoardThreadResource.putMessageBoardThreadMyRating(
					messageBoardThreadId, rating));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public StructuredContent postContentSpaceStructuredContent(
			Long contentSpaceId, StructuredContent structuredContent)
		throws Exception {

		return _applyComponentServiceObjects(
			_structuredContentResourceComponentServiceObjects,
			this::_populateResourceContext,
			structuredContentResource ->
				structuredContentResource.postContentSpaceStructuredContent(
					contentSpaceId, structuredContent));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public StructuredContent postStructuredContentFolderStructuredContent(
			Long structuredContentFolderId, StructuredContent structuredContent)
		throws Exception {

		return _applyComponentServiceObjects(
			_structuredContentResourceComponentServiceObjects,
			this::_populateResourceContext,
			structuredContentResource ->
				structuredContentResource.
					postStructuredContentFolderStructuredContent(
						structuredContentFolderId, structuredContent));
	}

	@GraphQLInvokeDetached
	public void deleteStructuredContent(Long structuredContentId)
		throws Exception {

		_applyVoidComponentServiceObjects(
			_structuredContentResourceComponentServiceObjects,
			this::_populateResourceContext,
			structuredContentResource ->
				structuredContentResource.deleteStructuredContent(
					structuredContentId));
	}

	@GraphQLInvokeDetached
	public StructuredContent patchStructuredContent(
			Long structuredContentId, StructuredContent structuredContent)
		throws Exception {

		return _applyComponentServiceObjects(
			_structuredContentResourceComponentServiceObjects,
			this::_populateResourceContext,
			structuredContentResource ->
				structuredContentResource.patchStructuredContent(
					structuredContentId, structuredContent));
	}

	@GraphQLInvokeDetached
	public StructuredContent putStructuredContent(
			Long structuredContentId, StructuredContent structuredContent)
		throws Exception {

		return _applyComponentServiceObjects(
			_structuredContentResourceComponentServiceObjects,
			this::_populateResourceContext,
			structuredContentResource ->
				structuredContentResource.putStructuredContent(
					structuredContentId, structuredContent));
	}

	@GraphQLInvokeDetached
	public void deleteStructuredContentMyRating(Long structuredContentId)
		throws Exception {

		_applyVoidComponentServiceObjects(
			_structuredContentResourceComponentServiceObjects,
			this::_populateResourceContext,
			structuredContentResource ->
				structuredContentResource.deleteStructuredContentMyRating(
					structuredContentId));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Rating postStructuredContentMyRating(
			Long structuredContentId, Rating rating)
		throws Exception {

		return _applyComponentServiceObjects(
			_structuredContentResourceComponentServiceObjects,
			this::_populateResourceContext,
			structuredContentResource ->
				structuredContentResource.postStructuredContentMyRating(
					structuredContentId, rating));
	}

	@GraphQLInvokeDetached
	public Rating putStructuredContentMyRating(
			Long structuredContentId, Rating rating)
		throws Exception {

		return _applyComponentServiceObjects(
			_structuredContentResourceComponentServiceObjects,
			this::_populateResourceContext,
			structuredContentResource ->
				structuredContentResource.putStructuredContentMyRating(
					structuredContentId, rating));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public StructuredContentFolder postContentSpaceStructuredContentFolder(
			Long contentSpaceId,
			StructuredContentFolder structuredContentFolder)
		throws Exception {

		return _applyComponentServiceObjects(
			_structuredContentFolderResourceComponentServiceObjects,
			this::_populateResourceContext,
			structuredContentFolderResource ->
				structuredContentFolderResource.
					postContentSpaceStructuredContentFolder(
						contentSpaceId, structuredContentFolder));
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public StructuredContentFolder
			postStructuredContentFolderStructuredContentFolder(
				Long parentStructuredContentFolderId,
				StructuredContentFolder structuredContentFolder)
		throws Exception {

		return _applyComponentServiceObjects(
			_structuredContentFolderResourceComponentServiceObjects,
			this::_populateResourceContext,
			structuredContentFolderResource ->
				structuredContentFolderResource.
					postStructuredContentFolderStructuredContentFolder(
						parentStructuredContentFolderId,
						structuredContentFolder));
	}

	@GraphQLInvokeDetached
	public void deleteStructuredContentFolder(Long structuredContentFolderId)
		throws Exception {

		_applyVoidComponentServiceObjects(
			_structuredContentFolderResourceComponentServiceObjects,
			this::_populateResourceContext,
			structuredContentFolderResource ->
				structuredContentFolderResource.deleteStructuredContentFolder(
					structuredContentFolderId));
	}

	@GraphQLInvokeDetached
	public StructuredContentFolder patchStructuredContentFolder(
			Long structuredContentFolderId,
			StructuredContentFolder structuredContentFolder)
		throws Exception {

		return _applyComponentServiceObjects(
			_structuredContentFolderResourceComponentServiceObjects,
			this::_populateResourceContext,
			structuredContentFolderResource ->
				structuredContentFolderResource.patchStructuredContentFolder(
					structuredContentFolderId, structuredContentFolder));
	}

	@GraphQLInvokeDetached
	public StructuredContentFolder putStructuredContentFolder(
			Long structuredContentFolderId,
			StructuredContentFolder structuredContentFolder)
		throws Exception {

		return _applyComponentServiceObjects(
			_structuredContentFolderResourceComponentServiceObjects,
			this::_populateResourceContext,
			structuredContentFolderResource ->
				structuredContentFolderResource.putStructuredContentFolder(
					structuredContentFolderId, structuredContentFolder));
	}

	private <T, R, E1 extends Throwable, E2 extends Throwable> R
			_applyComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeFunction<T, R, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			return unsafeFunction.apply(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private <T, E1 extends Throwable, E2 extends Throwable> void
			_applyVoidComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeConsumer<T, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			unsafeFunction.accept(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private void _populateResourceContext(
			BlogPostingResource blogPostingResource)
		throws Exception {

		blogPostingResource.setContextCompany(
			CompanyLocalServiceUtil.getCompany(
				CompanyThreadLocal.getCompanyId()));
	}

	private void _populateResourceContext(
			BlogPostingImageResource blogPostingImageResource)
		throws Exception {

		blogPostingImageResource.setContextCompany(
			CompanyLocalServiceUtil.getCompany(
				CompanyThreadLocal.getCompanyId()));
	}

	private void _populateResourceContext(CommentResource commentResource)
		throws Exception {

		commentResource.setContextCompany(
			CompanyLocalServiceUtil.getCompany(
				CompanyThreadLocal.getCompanyId()));
	}

	private void _populateResourceContext(DocumentResource documentResource)
		throws Exception {

		documentResource.setContextCompany(
			CompanyLocalServiceUtil.getCompany(
				CompanyThreadLocal.getCompanyId()));
	}

	private void _populateResourceContext(
			DocumentFolderResource documentFolderResource)
		throws Exception {

		documentFolderResource.setContextCompany(
			CompanyLocalServiceUtil.getCompany(
				CompanyThreadLocal.getCompanyId()));
	}

	private void _populateResourceContext(
			KnowledgeBaseArticleResource knowledgeBaseArticleResource)
		throws Exception {

		knowledgeBaseArticleResource.setContextCompany(
			CompanyLocalServiceUtil.getCompany(
				CompanyThreadLocal.getCompanyId()));
	}

	private void _populateResourceContext(
			KnowledgeBaseAttachmentResource knowledgeBaseAttachmentResource)
		throws Exception {

		knowledgeBaseAttachmentResource.setContextCompany(
			CompanyLocalServiceUtil.getCompany(
				CompanyThreadLocal.getCompanyId()));
	}

	private void _populateResourceContext(
			KnowledgeBaseFolderResource knowledgeBaseFolderResource)
		throws Exception {

		knowledgeBaseFolderResource.setContextCompany(
			CompanyLocalServiceUtil.getCompany(
				CompanyThreadLocal.getCompanyId()));
	}

	private void _populateResourceContext(
			MessageBoardAttachmentResource messageBoardAttachmentResource)
		throws Exception {

		messageBoardAttachmentResource.setContextCompany(
			CompanyLocalServiceUtil.getCompany(
				CompanyThreadLocal.getCompanyId()));
	}

	private void _populateResourceContext(
			MessageBoardMessageResource messageBoardMessageResource)
		throws Exception {

		messageBoardMessageResource.setContextCompany(
			CompanyLocalServiceUtil.getCompany(
				CompanyThreadLocal.getCompanyId()));
	}

	private void _populateResourceContext(
			MessageBoardSectionResource messageBoardSectionResource)
		throws Exception {

		messageBoardSectionResource.setContextCompany(
			CompanyLocalServiceUtil.getCompany(
				CompanyThreadLocal.getCompanyId()));
	}

	private void _populateResourceContext(
			MessageBoardThreadResource messageBoardThreadResource)
		throws Exception {

		messageBoardThreadResource.setContextCompany(
			CompanyLocalServiceUtil.getCompany(
				CompanyThreadLocal.getCompanyId()));
	}

	private void _populateResourceContext(
			StructuredContentResource structuredContentResource)
		throws Exception {

		structuredContentResource.setContextCompany(
			CompanyLocalServiceUtil.getCompany(
				CompanyThreadLocal.getCompanyId()));
	}

	private void _populateResourceContext(
			StructuredContentFolderResource structuredContentFolderResource)
		throws Exception {

		structuredContentFolderResource.setContextCompany(
			CompanyLocalServiceUtil.getCompany(
				CompanyThreadLocal.getCompanyId()));
	}

	private static ComponentServiceObjects<BlogPostingResource>
		_blogPostingResourceComponentServiceObjects;
	private static ComponentServiceObjects<BlogPostingImageResource>
		_blogPostingImageResourceComponentServiceObjects;
	private static ComponentServiceObjects<CommentResource>
		_commentResourceComponentServiceObjects;
	private static ComponentServiceObjects<DocumentResource>
		_documentResourceComponentServiceObjects;
	private static ComponentServiceObjects<DocumentFolderResource>
		_documentFolderResourceComponentServiceObjects;
	private static ComponentServiceObjects<KnowledgeBaseArticleResource>
		_knowledgeBaseArticleResourceComponentServiceObjects;
	private static ComponentServiceObjects<KnowledgeBaseAttachmentResource>
		_knowledgeBaseAttachmentResourceComponentServiceObjects;
	private static ComponentServiceObjects<KnowledgeBaseFolderResource>
		_knowledgeBaseFolderResourceComponentServiceObjects;
	private static ComponentServiceObjects<MessageBoardAttachmentResource>
		_messageBoardAttachmentResourceComponentServiceObjects;
	private static ComponentServiceObjects<MessageBoardMessageResource>
		_messageBoardMessageResourceComponentServiceObjects;
	private static ComponentServiceObjects<MessageBoardSectionResource>
		_messageBoardSectionResourceComponentServiceObjects;
	private static ComponentServiceObjects<MessageBoardThreadResource>
		_messageBoardThreadResourceComponentServiceObjects;
	private static ComponentServiceObjects<StructuredContentResource>
		_structuredContentResourceComponentServiceObjects;
	private static ComponentServiceObjects<StructuredContentFolderResource>
		_structuredContentFolderResourceComponentServiceObjects;

}