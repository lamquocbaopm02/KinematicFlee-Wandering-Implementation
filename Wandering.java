/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movement;

/**
 *
 * @author QUOC BAO
 */
public class KinematicWandering {

    private Kinematic character;
    private double maxSpeed;
    private double maxRotation;

    public KinematicWander() {
    }

    public KinematicWandering(Kinematic character, double maxSpeed, double maxRotation) {
        this.character = character;
        this.maxSpeed = maxSpeed;
        this.maxRotation = maxRotation;
    }

    public Kinematic getCharacter() {
        return character;
    }

    public void setCharacter(Kinematic character) {
        this.character = character;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getMaxRotation() {
        return maxRotation;
    }

    public void setMaxRotation(double maxRotation) {
        this.maxRotation = maxRotation;
    }


}
