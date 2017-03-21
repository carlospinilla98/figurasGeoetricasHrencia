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
public class Cuadrado extends PuntosPadre {
    /**
     * ATRIBUTO QUE ALOJA X3 Y3
     */
    private Coordenadas punto3;
    /**
     * ATRIBUTO QUE ALOJA X4 Y4
     */
    private Coordenadas punto4;
    /**
     * GUARDA EL PERIMETRO DEL CUADRADO
     */
    private double perimetro;

    public Cuadrado(Coordenadas punto3, Coordenadas punto4, Coordenadas punto1, Coordenadas punto2) {
        super(punto1, punto2);
        this.punto3 = punto3;
        this.punto4 = punto4;
    }
    /**
     * METODO QUE DA LOS RESULTADOS DEL CUADRADO
     */
    public void darResultadosCuadrado(){
        if(isCuadrado() == true){
            System.out.println("Lado1: " + darLado1());
            System.out.println("Lado2: " + darLado2());
            System.out.println("Lado3: " + darLado3());
            System.out.println("Lado4: " + darLado4());
            System.out.println("Perimetro : "+darPerimetro());
            System.out.println("Area : "+darArea());
            System.out.println("Tipo De Cuadro: " + darTipoCuadro());
        }else{
            System.out.println("No tiene forma");
        }
    }
    /**
     * METODO QUE RETORNA SI ES CUADRADO O NO
     * @return 
     */
    private boolean isCuadrado(){
        if(punto1.getX() == punto4.getX() && punto2.getX() == punto3.getX()){
           
            if(punto1.getY() == punto2.getY() && punto3.getY() == punto4.getY()){
                return true;
            }
        }else{
            return false; 
        }
        return false;
    }
    /**
     * METODO QUE RETORNA LA LONGITUD DEL LADO1 DEL PUNTO AB
     * @return 
     */
    private double darLado1(){
        double auxiliarX = Math.pow(punto2.getX() - punto1.getX(), 2);
        double auxiliarY = Math.pow(punto2.getY() - punto1.getY(), 2);
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
     /**
     * METODO QUE RETORNA LA LONGITUD DEL LADO2 DEL PUNTO BC
     * @return 
     */
    private double darLado2(){
        double auxiliarX = Math.pow(punto3.getX() - punto2.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - punto2.getY(), 2);
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
     /**
     * METODO QUE RETORNA LA LONGITUD DEL LADO3 DEL PUNTO CD
     * @return 
     */
    private double darLado3(){
        double auxiliarX = Math.pow(punto3.getX() - punto2.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - punto2.getY(), 2);
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
   /**
    * METODO QUE RETORNA LA LONGITUD DEL LADO4 DEL PUNTO DA
    * @return 
    */
    private double darLado4(){
        double auxiliarX = Math.pow(punto3.getX() - punto4.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - punto4.getY(), 2);
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    /**
     * METODO QUE RETORNA EL PERIMETRO DEL CUADRADO
     * @return 
     */
    private double darPerimetro(){
        this.perimetro=darLado1()+darLado2()+darLado3()+darLado4();
        return this.perimetro;
    }
    /**
     * METODO QUE RETORNA EL AREA DEL CUADRADO
     * @return 
     */
    private double darArea(){
        double area =darLado1()*darLado2();
        return area;
    }
    /**
     * METODO QUE RETORNA EL TIPO DE CUADRO
     * @return 
     */
    public String darTipoCuadro() {
        if (darLado1() == darLado2() && darLado2() == darLado3() && darLado3() == darLado4()){
            return "Cuadrado";
        }else {
            return "Rectangulo";
        }
    }
    /**
     * RETORNA COORDENADAS X3 Y3
     * @return 
     */
    public Coordenadas getPunto3() {
        return punto3;
    }
    /**
     * MODIFICA LAS COORDENADAS X3 Y3
     * @param punto3 
     */
    public void setPunto3(Coordenadas punto3) {
        this.punto3 = punto3;
    }
    /**
     * RETORNA COORDENADAS X4 Y4
     * @return 
     */
    public Coordenadas getPunto4() {
        return punto4;
    }
    /**
     * MODIFICA LAS COORDENADAS X4 Y4
     * @param punto4 
     */
    public void setPunto4(Coordenadas punto4) {
        this.punto4 = punto4;
    }
}