/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetCorpIdentifyRequest extends RpcAcsRequest<GetCorpIdentifyResponse> {
	
	public GetCorpIdentifyRequest() {
		super("CloudCallCenter", "2017-07-05", "GetCorpIdentify", "CloudCallCenter", "innerAPI");
	}

	private Long taobaoUid;

	private Long ramId;

	public Long getTaobaoUid() {
		return this.taobaoUid;
	}

	public void setTaobaoUid(Long taobaoUid) {
		this.taobaoUid = taobaoUid;
		if(taobaoUid != null){
			putQueryParameter("TaobaoUid", taobaoUid.toString());
		}
	}

	public Long getRamId() {
		return this.ramId;
	}

	public void setRamId(Long ramId) {
		this.ramId = ramId;
		if(ramId != null){
			putQueryParameter("RamId", ramId.toString());
		}
	}

	@Override
	public Class<GetCorpIdentifyResponse> getResponseClass() {
		return GetCorpIdentifyResponse.class;
	}

}
