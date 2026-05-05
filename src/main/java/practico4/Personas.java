/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico4;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import practico4.ControladorDeArchivo;

/**
 *
 * @author usuario
 */
public class Personas {
    private List<String> personas = new ArrayList<>();
    private File registro;
    private ControladorDeArchivo controlador = new ControladorDeArchivo();
    
    public Personas() throws IOException{
        controlador.crearArchivo("registro.txt");
    }
       
    
    public void insertarPersona() throws FileNotFoundException, IOException{
        String s;
        String texto = null;
        char c;
        StringBuilder resultado = new StringBuilder();
        BufferedReader bregistro = new BufferedReader(new FileReader(registro));
        
        while((s=bregistro.readLine()) != null){
            resultado.append(s.substring(0, s.indexOf(";")));
            personas.add(resultado.toString());
        }
        
        personas.sort(Comparator.naturalOrder());
    }
    
    public void modificarPersona(String n){
        for(int i = 0; i == personas.size(); i += 4){
            if(personas.get(i) == n){
                //modificar nombre(i)
                //modificar apellido(i + 1)
                //modificar Direccion(i + 2)
                //modificar Email(i + 3)
            }
        }
    }
    
    
}
