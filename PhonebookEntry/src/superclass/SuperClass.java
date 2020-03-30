/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superclass;

/**
 *
 * @author QueenB
 */
public class SuperClass implements superclass.SuperInterface, AnotherInterface {

    public String superName = "Super";

    public void changeValue(String newValue) {
        superName = newValue;
    }

    public String getSuperName() {
        return superName;
    }

    @Override
    public String getValue() {
        return superName;
    }

    @Override
    public void setValue(String value) {
        superName = value;
    }

}
