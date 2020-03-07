package com.cg;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestHello {
	
	private Hello hi;
	
	@Before
	public void init() {
		hi = new Hello();
	}
	
	@Test
	public void sayHello() {
		assertEquals("Hello Gagan", hi.sayHello());

	}
	
	@After
	public void clean() {
		hi = null;
	}

}
