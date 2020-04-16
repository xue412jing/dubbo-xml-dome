package com.york.dubbo.spi.dubbo;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.rpc.cluster.loadbalance.AbstractLoadBalance;
import com.york.dubbo.spi.Robot;

public class DubboSPITest {

	public static void main(String[] args) {
		ExtensionLoader<Robot> extensionLoader = 
	            ExtensionLoader.getExtensionLoader(Robot.class);
	        Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
	        optimusPrime.sayHello();
	        Robot bumblebee = extensionLoader.getExtension("bumblebee");
	        bumblebee.sayHello();
//	        AbstractLoadBalance
	}

}
