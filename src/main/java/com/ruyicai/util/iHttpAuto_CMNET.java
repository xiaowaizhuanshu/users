package com.ruyicai.util;
/**
 * 
 * @author 
* 创建者：
* 创建日期：
* 修改记录：
 */

public class iHttpAuto_CMNET implements Runnable{

	private String url = null;
	
	public void setUrl(String URL){
		this.url = URL;
	}
	public void run() {
		try {
			IHttp http = new IHttp();
			http.setRetValue(http.getViaHttpConnection_CMNET(this.url));
			if(IHttp.retValue!=null && IHttp.retValue.length()>0)
				http.setConnectionMethord(IHttp.CMNET);
		} catch (Exception e) {
			// TODO: handle exception
		}
		url = null;
	}
}
