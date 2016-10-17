package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;



public class Staff_Test {
	
	static ArrayList<Staff> Stafftest = new ArrayList<Staff>();
	


	@BeforeClass
	
	
	public static Date Date (int Year, int Month, int Day){
		Calendar calendar = Calendar.getInstance();
		return null;
		
	}
	
	
	public static void setup() throws PersonException {
		
		
		Staff Smantha = new Staff(eTitle.MS);
		Smantha.setSalary(200000);
		Smantha.setPhone("302-333-1234");
		Stafftest.add(Smantha);
		
		Staff NarutoD = new Staff(eTitle.MR);
		NarutoD.setSalary(15000);
		Stafftest.add(NarutoD);
		
		Staff LuffyD = new Staff(eTitle.MR);
		LuffyD.setSalary(51000);
		Stafftest.add(LuffyD);
		
		Staff BillJu = new Staff(eTitle.MR);
		BillJu.setSalary(12345);
		Stafftest.add(BillJu);
		
		Staff Uehara = new Staff(eTitle.MS);
		Uehara.setSalary(123456);
		Stafftest.add(Uehara);
		
		double Average = ( Smantha.getSalary() + NarutoD.getSalary() + LuffyD.getSalary() + BillJu.getSalary() + Uehara.getSalary() ) / 5;
		assertEquals(298921,Average,0);
		

	}
	
	@Test
	public void test() {
		assertEquals(1,1);
	}	
	
	public final void phoneNumberTest() throws PersonException{
		
		Staff Smantha = new Staff(eTitle.MS);
		Smantha.setPhone("302-333-3214");
		fail("");
		
		}
	
	public final void DOBtest() throws PersonException{
		Staff BillJu = new Staff(eTitle.MR);
		BillJu.setDOB(Date(1993, 7, 15));
		fail("");
		
	}

	}
	


