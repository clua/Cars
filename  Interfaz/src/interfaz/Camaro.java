/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author Carlos
 */
public class Camaro implements Transporte{
     private String color, velocidadMax, puertas, motor;
     
     /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the velocidadMax
     */
    public String getVelocidadMax() {
        return velocidadMax;
    }

    /**
     * @param velocidadMax the velocidadMax to set
     */
    public void setVelocidadMax(String velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    /**
     * @return the puertas
     */
    public String getPuertas() {
        return puertas;
    }

    /**
     * @param puertas the puertas to set
     */
    public void setPuertas(String puertas) {
        this.puertas = puertas;
    }

    /**
     * @return the motor
     */
    public String getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(String motor) {
        this.motor = motor;
    }
    
    @Override
    public float getArrancar(){
       return 0; 
    }
    
    @Override
    public float getCambiarVelocidad(){
       return 0;
    }
     @Override
    public float getFrenar(){
       return 0;
    }
}
