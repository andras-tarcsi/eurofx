/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hu.gov.allamkincstar.ecb.eurofx;

/**
 *
 * @author tarcsia XML modell
 */
public class Model {
    private String currency;
    private float rate;

    public String getCurrency() {
        return currency;
    }

    public float getRate() {
        return rate;
    }

    public Model(String currency, float rate) {
        this.currency = currency;
        this.rate = rate;
    }
    @Override
    public String toString(){
        return this.currency +" "+ this.rate;
    }

}
