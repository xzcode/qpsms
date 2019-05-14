package xzcode.qqsms.yunxinhulian.model.resp;

public class QpSmsYxhlSmsResult {
	// 消息ID
	private String mid;
	//手机号码
	private String mobile;
	//短信提交错误代码，参见RESULT错误代码表
	private Integer result;

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Integer getResult() {
		return result;
	}

	public void setResult(Integer result) {
		this.result = result;
	}

}
