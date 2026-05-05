/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author usuario
 */
public class ControladorDeArchivo {
    private File archivo;
    
    public boolean existe(String nombre){
        this.archivo = new File(nombre);
        if(archivo.exists()){
            return true;
        }else{
            return false; 
        } 
    }
        
    
    public void crearArchivo(String n) throws IOException{    
        this.archivo = new File(n);
        
        if(this.archivo.exists()){
            return;
        }
        
        try{
            if(this.archivo.createNewFile()){
                System.out.println("archivo creado: " + archivo.getName());
            }else{
                System.out.println("Error creando archivo");
            }  
        }catch(IOException e){
            System.out.println("OCURRIO UNA EXEPCION");
            e.printStackTrace();
        }
    }
    
    public void escribirArchivo(String f, String n) throws IOException{
        this.archivo = new File(n);
        
        if(this.archivo.exists()){
            FileWriter Warchivo = new FileWriter(archivo, true);
            BufferedWriter Bwarchivo = new BufferedWriter(Warchivo);
            Bwarchivo.append(f);
        }
    }
}
