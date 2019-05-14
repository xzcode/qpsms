package xzcode.qqsms.yunxinhulian.model.req;

/**
 * 发送短信
 * 
 * @author zai
 * 2019-05-14 15:43:09
 */
public class QpSmsYxhlSendSmsReq {
	
	//发送任务命令,设置为固定的:send
	private String action = "send";

	//发送用户帐号,用户帐号，由系统管理员
	private String account;

	//发送帐号密码,用户账号对应的密码
	private String password;

	//发信发送的目的号码.多个号码之间用半角逗号隔开 
	private String mobile;

	//短信的内容，内容需要UTF-8编码
	private String content;

	//接入号，即 10690XXXXXX类似的号码
	private String extno;

	//响应数据类型
	private String rt = "json";

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getExtno() {
		return extno;
	}

	public void setExtno(String extno) {
		this.extno = extno;
	}

	public String getRt() {
		return rt;
	}

	public void setRt(String rt) {
		this.rt = rt;
	}
	
	
	
	

}
