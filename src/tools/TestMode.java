package tools;

public class TestMode {
    private static boolean isTestMode;
    public TestMode() {
        isTestMode = true;
        System.out.println("TestMode is:" + isTestMode);
    }
    public static boolean isTestMode()
    {
        return isTestMode;
    }
}
