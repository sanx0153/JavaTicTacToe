package core;

import tools.Testable;

public class Application implements Testable {

    Input input;
    Logic logic;
    Output output;

    public Application() {
        TestMe();
        input = new Input();
        logic = new Logic();
        output = new Output();
    }
}
