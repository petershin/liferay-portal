package ${configYAML.apiPackagePath}.internal.graphql.servlet.${versionDirName};

import ${configYAML.apiPackagePath}.internal.mutation.${versionDirName}.Mutation;
import ${configYAML.apiPackagePath}.internal.query.${versionDirName}.Query;

import com.liferay.portal.vulcan.graphql.servlet.ServletData;

import javax.annotation.Generated;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author ${configYAML.author}
 * @generated
 */
@Component(immediate = true, service = ServletData.class)
@Generated("")
public class ServletDataImpl implements ServletData {

	@Override
	public Mutation getMutation() {
		return _mutation;
	}

	@Override
	public String getPath() {
		return "${configYAML.application.baseURI}-graphql/${versionDirName}";
	}

	@Override
	public Query getQuery() {
		return _query;
	}

	@Reference
	private Mutation _mutation;

	@Reference
	private Query _query;

}