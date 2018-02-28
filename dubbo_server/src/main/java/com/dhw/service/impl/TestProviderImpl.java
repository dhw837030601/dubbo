package com.dhw.service.impl;

import com.dhw.service.TestProvider;

public class TestProviderImpl implements TestProvider {

	public String testPrint(String content) {
		return "你说的啥?   啥"+content+"?";
	}

}
