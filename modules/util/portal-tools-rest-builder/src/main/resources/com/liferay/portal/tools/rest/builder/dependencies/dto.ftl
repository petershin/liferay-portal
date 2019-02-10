package ${configYAML.apiPackagePath}.dto.${versionDirName};

<#compress>
	<#list openAPIYAML.components.schemas?keys as schemaName>
		import ${configYAML.apiPackagePath}.dto.${versionDirName}.${schemaName};
	</#list>
</#compress>

import java.util.Date;

<#if schema.childSchemas?has_content>
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
</#if>

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author ${configYAML.author}
 * @generated
 */
@Generated("")
@XmlRootElement(name = "${schemaName}")
<#if schema.childSchemas?has_content>
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
	include = JsonTypeInfo.As.PROPERTY,
	property = "discriminator")
@JsonSubTypes({
	<#list schema.childSchemas as childSchema>
		@JsonSubTypes.Type(value=${childSchema}.class, name = "${childSchema}")<#if childSchema_has_next>,</#if>
	</#list>
})
</#if>
public class ${schemaName}
	<#if schema.parentSchema??>
		extends ${schema.parentSchema}
	</#if>
	{

	<#if schema.propertySchemas??>
		<#list schema.propertySchemas?keys as propertySchemaName>
			<#assign javaParameter = javaTool.getJavaParameter(propertySchemaName, schema.propertySchemas[propertySchemaName]) />

			<#assign content>
				public ${javaParameter.parameterType} get${javaParameter.parameterName?cap_first}() {
					return _${propertySchemaName};
				}

				public void set${javaParameter.parameterName?cap_first}(${javaParameter.parameterType} ${javaParameter.parameterName}) {
					_${propertySchemaName} = ${propertySchemaName};
				}

				private ${javaParameter.parameterType} _${propertySchemaName};
			</#assign>

			<#list content?split("\n") as line>
				${line?replace("^\t\t\t", "", "r")}<#lt>
			</#list>
		</#list>
	</#if>

}