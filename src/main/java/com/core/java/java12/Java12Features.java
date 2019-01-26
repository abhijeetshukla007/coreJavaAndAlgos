package com.core.java.java12;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @author abhij
 *
 */
public class Java12Features {
	public static void main(String[] args) throws ScriptException {
		System.out.println("hello\nworld\n");

		String script = "function hello() {\n" + "   print(\'\"Hello World\"\');\n" + "}\n" + "\n" + "hello();\n";
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("js");
		Object obj = engine.eval(script);
		String html="<html>\r\n" + 
				"                           <body>\r\n" + 
				"                               <p>Hello World.</p>\r\n" + 
				"                           </body>\r\n" + 
				"                       </html>";
		System.out.println(html);
		
		
		//////////////SWTCH STAtEments
		
	}
}
