package edu.pattern.design.Mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * LoginFrame : Concrete Mediator
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/14
 **/
public class LoginFrame implements Mediator {
    private final Map<String, Colleague> colleagues = new HashMap<>();

    @Override
    public Colleague createColleague(String type) {
        Colleague colleague = null;
        if (type.equals("button")) {
            colleague = new ColleagueButton();
        } else if (type.equals("checkbox")) {
            colleague = new ColleagueCheckbox();
        } else if (type.equals("textfield")) {
            colleague = new ColleagueTextField();
        } else {
            throw new RuntimeException("Invalid Type");
        }
        colleague.setMediator(this);
        colleagues.put(type, colleague);
        return colleague;
    }

    @Override
    public String colleagueChanged(String mode) {
        Boolean checkBoxEnabled, buttonEnabled, textFieldEnabled;
        if (mode.equals("guest")) {
            checkBoxEnabled = colleagues.get("checkbox").setColleagueEnabled(true);
            buttonEnabled = colleagues.get("button").setColleagueEnabled(false);
            textFieldEnabled = colleagues.get("textfield").setColleagueEnabled(false);
        } else if (mode.equals("user")) {
            checkBoxEnabled = colleagues.get("checkbox").setColleagueEnabled(true);
            buttonEnabled = colleagues.get("button").setColleagueEnabled(true);
            textFieldEnabled = colleagues.get("textfield").setColleagueEnabled(true);
        } else {
            throw new RuntimeException("Invalid Mode");
        }
        return String.format("checkbox : %s, button : %s, textfield : %s", checkBoxEnabled, buttonEnabled, textFieldEnabled);
    }
}