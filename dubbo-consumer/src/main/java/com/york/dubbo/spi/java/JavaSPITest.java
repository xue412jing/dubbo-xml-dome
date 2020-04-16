package com.york.dubbo.spi.java;

import java.util.ServiceLoader;

import com.york.dubbo.spi.Robot;

public class JavaSPITest {
public static void main(String[] args) {
	 ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
     System.out.println("Java SPI");
     serviceLoader.forEach(Robot::sayHello);
}
}
