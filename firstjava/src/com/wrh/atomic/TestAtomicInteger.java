package com.wrh.atomic;

import static org.junit.Assert.*;

import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Test;

public class TestAtomicInteger {

	@Test
	public void test() {
		AtomicInteger at = new AtomicInteger(3);		
		assertEquals(at.addAndGet(3),6);
		assertEquals(at.compareAndSet(7, 4),false);
		assertEquals(at.compareAndSet(6, 4),true);
		assertEquals(at.decrementAndGet(),3);//减一
		assertEquals(at.get(),3);
		assertEquals(at.getAndAdd(2),3);//注意：先get，再add
		assertEquals(at.getAndDecrement(),5);
		assertEquals(at.getAndIncrement(),4);
		assertEquals(at.getAndSet(10),5);
		assertEquals(at.incrementAndGet(),11);
		at.lazySet(50);
		assertEquals(at.get(),50);
		at.set(100);
		assertEquals(at.get(),100);
		assertEquals(at.weakCompareAndSet(100, 110), true);
		
		
	}

}
