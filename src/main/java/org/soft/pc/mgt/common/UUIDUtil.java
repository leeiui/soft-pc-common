package org.soft.pc.mgt.common;

import java.util.UUID;

public class UUIDUtil {
	
	public static String UUIDGenerator() {
		String uuid = UUID.randomUUID().toString().replace("-", "");
		return uuid;
	}

}
