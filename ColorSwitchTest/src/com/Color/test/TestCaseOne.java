package com.Color.test;

import com.jayway.android.robotium.solo.Solo;
import android.test.ActivityInstrumentationTestCase2;

@SuppressWarnings("unchecked")

public class TestCaseOne extends ActivityInstrumentationTestCase2 {
	
	private static final String TARGET_PACKAGE_ID = "com.Color.colorswitch";
	private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.Color.colorswitch.SplashActivity";
	private static Class<?> launcherActivityClass;
	
	static{
		try	{	
			launcherActivityClass=Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
		}catch(ClassNotFoundException e){ 
			throw new RuntimeException(e);
			}
	}
	
	public TestCaseOne() throws ClassNotFoundException
	{
	super(TARGET_PACKAGE_ID,launcherActivityClass);	
	}

	private Solo solo;

	@Override protected void setUp()throws Exception
		{ 
		super.setUp();
		solo = new Solo(getInstrumentation(),getActivity());
		}

	public void testCanOpenSettings(){
		solo.clickOnText("TOUCH...!!!");
		solo.clickOnButton("RED");
		solo.clickOnButton("BLACK");
		solo.clickOnButton("RED");
		solo.clickOnButton("BLUE");
		solo.clickOnButton("GREEN");
		solo.clickOnButton("RED");
		solo.clickOnButton("BLACK");
		solo.clickOnButton("RED");
		solo.clickOnButton("BLUE");
		solo.clickOnButton("BLUE");
		solo.clickOnButton("GREEN");
		solo.clickOnButton("RED");
		solo.clickOnButton("BLACK");
		solo.clickOnButton("RED");
		solo.clickOnButton("BLUE");
		solo.clickOnButton("BLUE");
		solo.clickOnButton("GREEN");
		solo.clickOnButton("RED");
		solo.clickOnButton("BLACK");
		solo.clickOnButton("RED");
		solo.clickOnButton("BLUE");
		solo.clickOnButton("BLUE");
		solo.clickOnButton("GREEN");
		solo.clickOnButton("RED");
		solo.clickOnButton("BLACK");
		solo.clickOnButton("RED");
		solo.clickOnButton("BLUE");
		solo.clickOnButton("BLUE");
		solo.clickOnButton("GREEN");
		//solo.pressMenuItem(0);
		}

	@Override
	public void tearDown() throws Exception
		{
		try
			{
			solo.finalize();
			}
		catch(Throwable e)
		{
			e.printStackTrace();
		}
		getActivity().finish();
		super.tearDown();
		}

}
