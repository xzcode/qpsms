package xzcode.qqsms.yunxinhulian;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import xzcode.qqsms.yunxinhulian.config.QpSmsYunxinhulianConfig;
import xzcode.qqsms.yunxinhulian.model.req.QpSmsYxhlSendSmsReq;
import xzcode.qqsms.yunxinhulian.model.resp.QpSmsYxhlSendResp;
import xzcode.qqsms.yunxinhulian.util.HttpUtil;

public class QpSmsYunxinhulianService {
	
	private QpSmsYunxinhulianConfig config;
	private HttpUtil httpUtil = new HttpUtil();
	
	
	
	public QpSmsYunxinhulianService(QpSmsYunxinhulianConfig config) {
		super();
		this.config = config;
	}



	public void send(String content, String mobiles) {
		/*QpSmsYxhlSendSmsReq req = new QpSmsYxhlSendSmsReq();
		req.setAccount(config.getAccount());
		req.setMobile(mobiles);
		req.setPassword(config.getPassword());
		req.setExtno(config.getExtno());
		req.setContent(content);*/
		Map<String, Object> formParams = new LinkedHashMap<String, Object>();
		formParams.put("account", config.getAccount());
		formParams.put("mobile", mobiles);
		formParams.put("content", content);
		formParams.put("password", config.getPassword());
		formParams.put("extno", config.getExtno());
		formParams.put("action", "send");
		formParams.put("rt", "json");
		try {
			httpUtil.postFormForJsonObject(config.getApiUrl(), formParams, QpSmsYxhlSendResp.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
