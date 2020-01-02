package org.i9Bach.mathUtils;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

class MathutilsTest {

	@Test
	
 void test1() {
		Mathutils test = new Mathutils();
		int output = test.Sum(8, 10);


		//int c = org.i9Bach.mathUtils.Mathutils.Sum(a,b);

		assertEquals(18, output);

		for(output=1; output <= test.Sum(8,10);output++)
		{
			System.out.println(output);

			if (output==test.Sum(8,10))
			{
				System.out.println("Test Passsed: Ewartet Zahl  " + output+ " Ergebnis " + test.Sum(8,10));

			}
		}
           

	}

	@Test
	
	void test2()
	{
		Mathutils test2 = new Mathutils();
		int output = test2.Mul(2, 10);
		assertNotEquals(15, output);
		for(output=1; output <= test2.Mul(8,10);output++)
		{
			System.out.println(output);

			if (output==test2.Mul(8,10))
			{
				System.out.println("Test Passsed: Ewartet Zahl  " + output+ " Ergebnis " + test2.Mul(8,10));

			}
		}
	try {
		TimeUnit.SECONDS.sleep(5);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 	
	}
	 
	
	
	
	@Test
	void test3() {

		Mathutils test3 = new Mathutils();
		int output = test3.Div(20, 2);
		assertTrue(output==10);
		for(output=1; output <= test3.Div(20, 2);output++)
		{
			System.out.println(output);

			if (output==test3.Div(20, 2))
			{
				System.out.println("Test Passsed: Ewartet Zahl  " + output+ " Ergebnis " + test3.Div(20, 2));

			}
		}

	}
	@Test
	void test4() {

		Mathutils test4 = new Mathutils();
		int output = test4.Mod(7, 2);
		assertNotEquals(0, output);
		for(output=0; output <= test4.Mod(7,2);output++)
		{
			System.out.println(output);

			if (output==test4.Mod(7,2))
			{
				System.out.println("Test Passsed: Ewartet Zahl  " + output+ " Ergebnis " + test4.Mod(7,2));

			}
		}
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	void test5() {
		Mathutils test5 = new Mathutils();
		int output = test5.Sub(15, 10);



		assertTrue(output-10!=0);
		for(output=1; output <= test5.Sub(15,10);output++)
		{
			System.out.println(output);

			if (output==test5.Sub(15,10))
			{
				System.out.println("Test Passsed: Ewartet Zahl  " + output+ " Ergebnis " + test5.Sub(15,10));

			}
		}
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	@Test
	void test6() {
		Mathutils test6 = new Mathutils();
		String Output = test6.Name("Ejangue Guillaume");
		assertNotSame("Master", Output, " Geben Sie eine String anders als Ejangue Guillaume");

		System.out.println(Output);
	}


	@Test
	public void test7() {
		Mathutils test7 = new Mathutils();
		int output = test7.Alt(28);
		assertSame(28, output);

		if(output<=17)
		{
			System.out.println("Du bist minderjaehrig");
		}
		else if(output>=28)
		{
			System.out.println("du bist 28 oder aelter");
		}
		else
		{
			System.out.println("du bist gerade geboren");
		}
	}


}



