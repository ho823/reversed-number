package com.project.adapters;

import com.project.ports.UserOutputPort;

public class UserOutputAdapter implements UserOutputPort {
    @Override
    public void printOutput(String output) {
        System.out.println("number reversed: "+ output);
    }
}
