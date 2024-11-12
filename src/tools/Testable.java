package tools;

public interface Testable {
    default void TestMe() {
        if (TestMode.isTestMode()) {
            System.out.println(this.getClass().getName());
        }
    }
}
