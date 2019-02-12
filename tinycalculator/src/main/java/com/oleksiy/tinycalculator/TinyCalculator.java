package com.oleksiy.tinycalculator;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

@Named
@SessionScoped
public class TinyCalculator implements Serializable {
    private static final Logger logger = Logger.getLogger("TinyCalculator");

    private double param1;
    private double param2;
    private double result;

    public TinyCalculator(){
        logger.log(Level.INFO, "constructor TinyCalculator Invoked.");
    }

    public double getParam1() {
        return param1;
    }

    public void setParam1(double param1) {
        this.param1 = param1;
    }

    public double getParam2() {
        return param2;
    }

    public void setParam2(double param2) {
        this.param2 = param2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double res) {
        this.result = res;
    }

    public String subtract() {
        result = this.param1 - this.param2;
        return "";
    }

    public String add() {
        result = this.param1 + this.param2;
        return "";
    }

    public String multiply() {
        result = this.param1 * this.param2;
        return "";
    }

    public String divide() {
        result = this.param1 / this.param2;
        return "";
    }

    public String divideInt(int p1, int p2) {
        result = p1/p2;
        return "";
    }

}
