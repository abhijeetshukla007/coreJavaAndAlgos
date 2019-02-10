package core.java.experiments;

import java.io.IOException;

public class RuntimeTest {
	public static void main(String[] args) throws IOException {
	//	Runtime.getRuntime().exec("notepad");
		System.out.println(Runtime.getRuntime().freeMemory());
		System.out.println(Runtime.getRuntime().totalMemory());

	}
}
