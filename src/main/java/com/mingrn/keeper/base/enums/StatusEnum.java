package com.mingrn.keeper.base.enums;

/**
 * Status 状态码
 *
 * @author MinGRn <br > MinGRn97@gmail.com
 * @date 14/11/2018 20:01
 */
public enum StatusEnum {

	/**
	 * 正常
	 */
	NORMAL(1),
	/**
	 * 禁用、无效
	 */
	DISABLE(2);

	private Integer code;

	StatusEnum(Integer code) {
		this.code = code;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
}
