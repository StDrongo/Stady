package morePractice;

public class Main implements ChildInterface {

	@Override
	public void parentMethod() {
		System.out.println("Parent Method-----welcome to syntax solutions");
	}

	@Override
	public void childMehtod() {
		System.out.println("Child Method-----hi syntax solutions how are you");
	}

	public static void main(String[] args) {

		Main a = new Main();
		a.parentMethod();
		a.childMehtod();
	}
}
