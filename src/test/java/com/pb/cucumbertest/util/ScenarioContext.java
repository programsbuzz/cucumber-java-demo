package com.pb.cucumbertest.util;

import java.util.HashMap;
import java.util.Map;

public class ScenarioContext {
	private static ScenarioContext instance = null;
	private HashMap scenarioContextMap;
	
	private ScenarioContext()
	{
		scenarioContextMap = new HashMap<String, Object>();
	}
	
	public static ScenarioContext getInstance()
	{
		if(instance == null)
		{
			synchronized (ScenarioContext.class)
			{
				if(instance == null)
				{
					instance = new ScenarioContext();
				}
			}
		}
		return instance;
	}
	
	public void setContext(Context key, Object value)
	{
		scenarioContextMap.put(key.toString(), value);
	}
	
	public Object getContext(Context key)
	{
		return scenarioContextMap.get(key.toString());
	}
	
	public <T> T getContext(String key)
	{
		return (T) scenarioContextMap.get(key);
	}
	
	public Boolean isContains(Context key)
	{
		return scenarioContextMap.containsKey(key.toString());
	}
	
	public Map<String, Object> getFullContextMap()
	{
		return scenarioContextMap;
	}

}
