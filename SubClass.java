package mypackage;

public class SubClass extends MyClass {
	protected void showMessage() {}
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.showMessage();  // ✅ Accessible through inheritance
    }
}
