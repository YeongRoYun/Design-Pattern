package edu.pattern.design.Mediator;

/**
 * ColleagueTextField : Concrete Colleague
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/14
 **/
public class ColleagueTextField implements Colleague {
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