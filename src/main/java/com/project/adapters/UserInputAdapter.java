package com.project.adapters;

import com.project.ports.UserInputPort;
import java.util.Scanner;


public class UserInputAdapter implements UserInputPort {

    private Scanner scanner = new Scanner(System.in);
    @Override
    public int getUserInput() {
        System.out.println("Put a number: ");
        return scanner.nextInt();
    }
}
