/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometriabasica;
/**
 * @author Carlos Pinilla
 * @author Cristian Estevez
 */
public class Circulo extends PuntosPadre {
    double lado;
    double diametro;
    private final double pi=3.14159;

    public Circulo(Coordenadas punto1, Coordenadas punto2) {
        super(punto1, punto2);
    }
    /**
     * METODO QUE IMPRIME LOS RESULTADOS DEL CIRCULO
     */
    public void darResultadosCirculo(){
        if(isCirculo()== true){
            System.out.println("Longitud Radio : "+darLado());
            System.out.println("Longitud Diametro : "+darDiametro());
            System.out.println("Perimetro : "+darPerimetro());
            System.out.println("Area : "+darArea());
        }else{
            System.out.println("No es un Circulo");
        }
    }
    /**
     * METODO QUE RETORNA SI ES UN CIRCULO
     * @return 
     */
    private boolean isCirculo(){
        if(punto1.getX() == punto2.getX() && punto1.getY() == punto2.getY()){
            return false;
        }else{
            return true;
        }
    }
    /**
     * METODO QUE RETORNA MEDIDA DEL RADIO DEL PUNTO AB
     * @return 
     */
    @Override
    public double darLado(){
        return super.darLado();
    }
    /**
     * METODO QUE RETORNA DIAMETRO
     * @return 
     */
    private double darDiametro(){
        diametro = lado * 2;
        return diametro;
    } 
    /**
     * METODO QUE RETORNA PERIMETRO
     * @return 
     */
    private double darPerimetro(){
        double perimetro = 2* pi * lado;
        return perimetro;
    }
    /**
     *  METODO QUE RETORNA AREA
     * @return 
     */
    private double darArea(){
        double area = pi * diametro;
        return area;
    }
}