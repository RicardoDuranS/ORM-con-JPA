package com.tienda.modelo;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Libros extends Producto {

    private String autor;
    private int paginas;

    public Libros(String autor, int paginas) {
        this.autor = autor;
        this.paginas = paginas;
    }

    public Libros() {
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

}
