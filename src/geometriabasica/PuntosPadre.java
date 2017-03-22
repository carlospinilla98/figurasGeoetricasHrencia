/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometriabasica;

/**
 *
 * @author Carlos Pinilla
 */
public class PuntosPadre {
    
    Coordenadas punto1;
    Coordenadas punto2;

    public PuntosPadre(Coordenadas punto1, Coordenadas punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    
    public double darLado(){
        double auxiliarX = Math.pow(punto1.getX() - punto2.getX(), 2);
        double auxiliarY = Math.pow(punto1.getY() - punto2.getY(), 2);
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    public Coordenadas getPunto1() {
        return punto1;
    }

    public void setPunto1(Coordenadas punto1) {
        this.punto1 = punto1;
    }

    public Coordenadas getPunto2() {
        return punto2;
    }

    public void setPunto2(Coordenadas punto2) {
        this.punto2 = punto2;
    }
}
