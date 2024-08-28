package com.project;

import com.project.adapters.UserInputAdapter;
import com.project.adapters.UserOutputAdapter;
import com.project.application.NumberReversalService;
import com.project.domain.NumberReverser;

public class Main {
    public static void main(String[] args) {
        UserInputAdapter userInputAdapter = new UserInputAdapter();
        UserOutputAdapter userOutputAdapter = new UserOutputAdapter();
        NumberReverser numberReverser = new NumberReverser();

        NumberReversalService service = new NumberReversalService(userInputAdapter, userOutputAdapter, numberReverser);
        service.reversal();

    }
}