package mypackage;

public class MyClass {  
    private void showMessage() { }
    
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showMessage();  // ✅ Accessible inside the same class
    }
}
