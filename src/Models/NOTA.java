/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

public class Nota {
    private String nino, nivel;
    private int nota;

    public Nota(String nino, String nivel, int nota) {
        this.nino = nino;
        this.nivel = nivel;
        this.nota = nota;
    }

    public String getNino() {
        return nino;
    }

    public String getNivel() {
        return nivel;
    }

    public int getNota() {
        return nota;
    }

    public void setNino(String nino) {
        this.nino = nino;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

}
