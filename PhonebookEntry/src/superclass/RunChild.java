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
public class RunChild {

    public static void main(String args[]) {
        Child child = new Child();

        System.out.println("Child " + child.child);
        System.out.println("Super " + child.superName);
        child.changeValue("Bla");
        System.out.println("Super " + child.superName);
        System.out.println("Super " + child.getSuperName());
        child.changeValue("Bla2");
        System.out.println("Super " + child.getValue());
        child.setValue("Bla 3");
        System.out.println("Super " + child.getValue());
    }

}

// first we created parent object named Superclass
//in super class we created variable String superName = "Super";
// Then we created a subclass name Child.
// We created varible String child = "Child";
//now in main program we instantiated child class where we have access to both child (subclass) and Superclass variables.
//method
