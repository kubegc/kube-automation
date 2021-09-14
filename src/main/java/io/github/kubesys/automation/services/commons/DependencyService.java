/**
 * Copyrigt (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.kubesys.automation.services.commons;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.kubesys.httpfrk.core.HttpBodyHandler;
import com.github.kubesys.tools.annotations.ServiceDefinition;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * @author wuheng@iscas.ac.cn
 * @since 2.0.3
 *
 * according to Kubernetes' API specification, providing the following APIs
 * 
 * - invoking Kubernetes
 *    - CreateResource
 *    - BindResource
 *    - UpdateResource
 *    - UpdateResourceStatus
 *    - GetResource
 *    - DeleteResource
 *    - WatchResource
 *    - WatchResources
 * - invoking Database
 *    - ListResources
 *    - queryResourceCount
 *    - queryResourceValue
 * - online handling
 *    - getMetadata
 */

@ServiceDefinition
@Api(value = "基于Kubernetes规范的资源生命周期管理")
public class DependencyService extends HttpBodyHandler {

	
	/*************************************************************************
	 * 
	 * 
	 *       Invoking Kubernetes
	 * 
	 * 
	 **************************************************************************/
	
	/**
	 * 
	 * @param token                    token
	 * @param json                     json
	 * @return                         json
	 * @throws Exception               exception
	 */
	@ApiOperation(value = "创建基于Kubernetes规范的资源，可以是自定义资源CRD")
	public JsonNode findAllDependency(
			@ApiParam(value = "权限凭证，关联到Kubernetes的Secret", required = true, example = "5kh562.a1sagksdyyk6ivs1") String token,
			@ApiParam(value = "基于Kubernetes规范的资源描述", required = true, example = "{\"apiVersion\": \"v1\" ,\"kind\" : \"Pod\"}") JsonNode json)
			throws Exception {

//		return ClientUtil.getClient(token).createResource(json);
		return null;
	}

}
