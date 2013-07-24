package com.ruyicai.action.cooperation;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;

import com.ruyicai.util.JSONReslutUtil;
import com.ruyicai.util.LotErrorCode;
import com.ruyicai.util.ResourceBundleUtil;
import com.ruyicai.util.URLEncoder;
import com.ruyicai.util.MD5.PaySign;

/**
 * 活动相关的功能
 * @author 鞠牧
 *
 */
public class dto_Activity {
	private Logger log = Logger.getLogger(dto_Activity.class);
	//接口交互密钥
	public static final String INTERFACE_KEY="ruyicaiwebgood";
	
	private String userNo;//用户编号
	private String isKey;//活动的唯一标识
	private Long reward;//奖励
	private Integer type;//活动类型，1第一次绑定手机赠送彩金
	
	public String getUserNo() {
		return userNo;
	}
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	public String getIsKey() {
		return isKey;
	}
	public void setIsKey(String isKey) {
		this.isKey = isKey;
	}
	
	public Long getReward() {
		return reward;
	}
	public void setReward(Long reward) {
		this.reward = reward;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	
	
	public static dto_Activity getActivityType(
			String userNo,String isKey,Long reward,Integer type) {
		dto_Activity dat = new dto_Activity();
		dat.setUserNo(userNo);
		dat.setIsKey(isKey);
		dat.setReward(reward);
		dat.setType(type);
		return dat;
	}
	public String toString() {
		return "dto_ActivityType [userNo=" + userNo + ", isKey=" + isKey
				+ ", reward=" + reward + ", type="+ type + "]";
	}
	
	
}

