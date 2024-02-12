package in.mkpits.enums;

public class EnumDemo {

	enum Days {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, raj
	}
//	enum Level {
//		int HIGH = 3; 
//		int LOW = 23; 
//		int MEDIUM=21;
//		int RAJ=13;
//	};

	public static void main(String[] args) {

//		System.out.println(Level.RAJ);

//		Level myVar = Level.RAJ;
//      Days days = Days.TUESDAY;

//		switch (myVar) {
//		case LOW:
//			System.out.println("Low level");
//			break;
//		case MEDIUM:
//			System.out.println("Medium level");
//			break;
//		case HIGH:
//			System.out.println("High level");
//			break;
//		case RAJ:
//			System.out.println("Hello Raj");
//			break;
//		}
//
//		for (Level var : Level.values()) {
//			System.out.println(var);
//		}

		for (Days d : Days.values()) {
			System.out.println(d);
		}

		System.out.println("The Value is " + Days.valueOf("MONDAY"));
		System.out.println("The Value is " + Days.valueOf("TUESDAY").ordinal());
	}

}
