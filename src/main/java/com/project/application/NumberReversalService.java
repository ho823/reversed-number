package com.project.application;

import com.project.domain.NumberReverser;
import com.project.ports.UserInputPort;
import com.project.ports.UserOutputPort;

public class NumberReversalService {
    private final UserInputPort inputPort;
    private final UserOutputPort outputPort;
    private final NumberReverser numberReverse;

    public NumberReversalService(UserInputPort inputPort, UserOutputPort outputPort, NumberReverser numberReverse) {
        this.inputPort = inputPort;
        this.outputPort = outputPort;
        this.numberReverse = numberReverse;
    }

    public void reversal() {
        int input = inputPort.getUserInput();

        String reversed = numberReverse.reverseNumber(input);
        outputPort.printOutput(reversed);

    }


    private boolean isFloat(String input) {
        try {
            Float.parseFloat(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


}
