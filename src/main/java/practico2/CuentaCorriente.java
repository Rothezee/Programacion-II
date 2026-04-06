/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico2;

/**
 *
 * @author Usuario
 */
public class CuentaCorriente {
    private int NumerodeCuenta;
    private String NombreCliente;
    private float DineroDepositadoCliente;
    private float DineroDeudaCliente;
    
    
    public float calcularSaldo(){
        return DineroDepositadoCliente - DineroDeudaCliente;
    }
    
    public CuentaCorriente(){
    
    }
    
    public int getNumerodeCuenta(){
        return this.NumerodeCuenta;
    }
    
    public String getNombreCliente(){
        return this.NombreCliente;
    }
    
    public float getDineroDepositadoCliente(){
        return this.DineroDepositadoCliente;
    }
    
    public float getDineroDeudaCliente(){
        return this.DineroDeudaCliente;
    }
    
    /*==============Generadodes de atributos===============*/
    
    public void setNumerodeCuenta(int n){
        this.NumerodeCuenta = n;
    }
    
    public void setNombreCliente(String n){
        this.NombreCliente = n;
    }
    
    public void setDineroDepositadoCliente(float d){
        this.DineroDepositadoCliente = d;
    }
    
    public void setDineroDeudaCliente(float d){
        this.DineroDeudaCliente = d;
    }
}
