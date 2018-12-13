package com.example.myapplication.tool;

import org.apache.commons.codec.digest.DigestUtils;

public class EncryptTool {

	private static final String KEY = "tml!^O8AoLBpnD{P:IQg5.4~0<`V;U}#Mv=&qG\"f";

	public static String dataMd5Key(String str) {
		return DigestUtils.md5Hex(DigestUtils.sha1Hex(str) + KEY);
	}
}
