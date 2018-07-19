package core.java.enums;

public enum TestEnum {
	SUNDAY, MMONDAY, TUESDAYY, THURSDAY, FRIDAY, SATURDAY;
	public static void main(String[] args) {
		System.out.println(TestEnum.FRIDAY);
		System.out.println(TestEnum.values());
	}

	private TestEnum() {
		System.out.println("Constructor called for : " + this.toString());
	}
}
