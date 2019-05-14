package xzcode.qqsms.yunxinhulian.model.resp;

import java.util.List;

public class QpSmsYxhlSendResp {
	// 请求结果，具体参见STATUS错误代码表
	private Integer status;
	// 当前账户余额，单位厘
	private Long balance;
	// 短信提交响应列表
	private List<QpSmsYxhlSmsResult> list;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}

	public List<QpSmsYxhlSmsResult> getList() {
		return list;
	}

	public void setList(List<QpSmsYxhlSmsResult> list) {
		this.list = list;
	}

}
