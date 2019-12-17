package com.bbg.market.common;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ResponseResult<T> {

	private int status;

	private String msg;

	private T data;

}
