/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t2actividad2;

/**
 *
 * @author Lucas
 */
public class numero {
    int numero1;
numero(){
  numero1=1;
}
public int getValor(){
return numero1;
}
public void setValor(int numero1){
    this.numero1= numero1;
}
public int suma(){
    numero1++;
        return numero1;
        
}
public int resta(){
    numero1--;
        return numero1;
}
public int getDouble(){
    return numero1*2;
}
public int getTriple(){
    return numero1*3;
}
}
