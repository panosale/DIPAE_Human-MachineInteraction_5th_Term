/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ergastirio4;

/**
 *
 * @author Panagiotis
 */
public class Presets {
    private int bassValue;
    private int midrangeValue;
    private int trembleValue;
    private int balanceValue;
    private int volumeValue;
    public Presets() {
        this.bassValue = 0;
        this.midrangeValue = 0;
        this.trembleValue = 0;
        this.balanceValue = 0;
        this.volumeValue = 0;
    }
    public Presets(int newBassValue, int newMidrangeValue, int newTrembleValue, int newBalanceValue, int newVolumeValue) {
        this.bassValue = newBassValue;
        this.midrangeValue = newMidrangeValue;
        this.trembleValue = newTrembleValue;
        this.balanceValue = newBalanceValue;
        this.volumeValue = newVolumeValue;
    }
    // Setters
    public void setBassValue(int newBassValue) {
        this.bassValue = newBassValue;
    }
    public void setMidrangeValue(int newMidrangeValue) {
        this.midrangeValue = newMidrangeValue;
    }
    public void setTrembleValue(int newTrembleValue) {
        this.trembleValue = newTrembleValue;
    }
    public void setBalanceValue(int newBalanceValue) {
        this.balanceValue = newBalanceValue;
    }
    public void setVolumeValue(int newVolumeValue) {
        this.volumeValue = newVolumeValue;
    }
    // Getters
    public int getBassValue() {
        return (this.bassValue);
    }
    public int getMidrangeValue() {
        return (this.midrangeValue);
    }
    public int getTrembleValue() {
        return (this.trembleValue);
    }
    public int getBalanceValue() {
        return (this.balanceValue);
    }
    public int getVolumeValue() {
        return (this.volumeValue);
    }
    
    public void setValues(int newBassValue, int newMidrangeValue, int newTrembleValue, int newBalanceValue, int newVolumeValue) {
        setBassValue(newBassValue);
        setMidrangeValue(newMidrangeValue);
        setTrembleValue(newTrembleValue);
        setBalanceValue(newBalanceValue);
        setVolumeValue(newVolumeValue);
    }
    public String toString() {
        return ("getBassValue: " + this.bassValue + ", MidrangeValue: " + this.midrangeValue + ", TrembleValue: " + this.trembleValue + ", BalanceValue: " + this.balanceValue + " VolumeValue: " + this.volumeValue);
    }
}
