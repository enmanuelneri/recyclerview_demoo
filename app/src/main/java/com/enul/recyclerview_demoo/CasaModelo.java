package com.enul.recyclerview_demoo;

/*Esta clase nos servira para representar al cantante y los datos con los que trabajaremos*/
public class CasaModelo {
    private String codigo,descripcion;
    private int imgCasa;

    public CasaModelo() {
    }

    public CasaModelo(String codigo, String descripcion, int imgCasa) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.imgCasa = imgCasa;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImgCasa() {
        return imgCasa;
    }

    public void setImgCasa(int imgCasa) {
        this.imgCasa = imgCasa;
    }
}
