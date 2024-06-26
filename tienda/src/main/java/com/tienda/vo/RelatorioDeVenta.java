package com.tienda.vo;

import java.time.LocalDate;

public class RelatorioDeVenta {
    private String nombreDelProducto;
    private Long cantidadDeProducto;
    private LocalDate fechaDeUltimaVenta;

    public RelatorioDeVenta(String nombreDelProducto, Long cantidadDeProducto, LocalDate fechaDeUltimaVenta) {
        this.nombreDelProducto = nombreDelProducto;
        this.cantidadDeProducto = cantidadDeProducto;
        this.fechaDeUltimaVenta = fechaDeUltimaVenta;
    }

}