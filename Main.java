package javaScriptConnector;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

		// doesn't work because is deprecated
		// in java 15 this is function was stop
		// so if you run code you see error : 
		// null pointer exception 
		// eval was null 


public class Main {
	
		private static final String JS = "nashorn";
		
	public static void main(String[] args) {
		
		 
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName(JS);
		
		String script = "var x = 10; var y = 10; x + y;";
		
		
		try {
			Object o = engine.eval(script);
			System.out.println(o);
			
		} catch (ScriptException e) {
			
			System.out.println(e.toString());
			
		}
	}

}
