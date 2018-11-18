package com.mingrn.keeper.base.enums;

/**
 * 删除状态枚举类
 *
 * @author MinGRn <br > MinGRn97@gmail.com
 * @date 14/11/2018 19:56
 */
public enum DeletedEnum {

	/**
	 * 正常
	 */
	NORMAL(1),

	/**
	 * 删除
	 */
	DELETED(2);

	private Integer code;

	DeletedEnum(Integer code) {
		this.code = code;
	}


	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
}
