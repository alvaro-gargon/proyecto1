/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1;

import java.util.Objects;

/**
 *
 * @author alvaro.gargon.4
 */
public class Cuenta {
    private String codigo;
    private String titular;
    private float saldo;

    public Cuenta(String codigo, String titular, float saldo) {
        this.codigo = codigo;
        this.titular = titular;
        if(saldo>0){
            this.saldo = saldo;
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitular() {
        return titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(float saldo) {
        if (saldo>=0){
            this.saldo=saldo;
        }
        this.saldo = saldo;
    }
    public void ingresar(float cantidad){
        if(saldo>0){
            saldo+=cantidad;
        }
    }
    public void integrar(float cantidad){
        if(cantidad>0 && cantidad<=saldo){
            saldo-=cantidad;
        }
    }

    @Override
    public String toString() {
        return  codigo + "," + titular + "," + saldo ;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cuenta other = (Cuenta) obj;
        return Objects.equals(this.codigo, other.codigo);
    }
    

}
