
package com.iltermon.mvc;

import java.util.Scanner;

public class Controller {

    private Model model;

    public Controller(Model model, ConsoleView view) {
        this.model = model;
        this.model.attach(view);
    }

    public void setState(String state) {
        model.setState(state);
    }

    public void start() {
        Scanner myObj = new Scanner(System.in);
        String input;
        while (true) {
            input = myObj.nextLine();
            if (input == "") {
                break;
            }
            model.setState(input);
        }
    }
}
