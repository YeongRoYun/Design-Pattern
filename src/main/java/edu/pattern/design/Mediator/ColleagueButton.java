package edu.pattern.design.Mediator;

/**
 * ColleagueButton : Concrete Colleague
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/14
 **/
public class ColleagueButton implements Colleague {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public Boolean setColleagueEnabled(Boolean flag) {
        if (flag) {
            //something
            return flag;
        } else {
            //something
            return flag;
        }
    }
}