package com.dev.lombokDemo;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@ToString(callSuper=true,exclude={"psncode"})
public class User {

	@Getter@Setter@NonNull
	private String id;
	@Getter@Setter
	private String psncode;
	@Getter@Setter
	private String psnname;
	@Getter(AccessLevel.PROTECTED)
	private String idCard;
}
