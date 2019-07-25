package top.selfhelp.http.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author zhuyuqiang
 */
public class AccessTokenResult {

	private String accessToken;
	private Integer expiresIn;
	private Integer errCode;
	private String errMsg;

	public String getAccessToken() {
		return accessToken;
	}

	@JsonProperty(value = "access_token")
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public Integer getExpiresIn() {
		return expiresIn;
	}

	@JsonProperty(value = "expires_in")
	public void setExpiresIn(Integer expiresIn) {
		this.expiresIn = expiresIn;
	}

	public Integer getErrCode() {
		return errCode;
	}

	@JsonProperty(value = "errcode")
	public void setErrCode(Integer errCode) {
		this.errCode = errCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	@JsonProperty(value = "errmsg")
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
}
