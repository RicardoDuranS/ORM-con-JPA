package com.tienda.prueba;

import java.io.FileNotFoundException;

import javax.persistence.EntityManager;

import com.tienda.dao.PedidoDao;
import com.tienda.modelo.Pedido;
import com.tienda.JPAUtils.JPAUtils;

public class PruebaDeDesempeño {
    public static void main(String[] args) throws FileNotFoundException {
        LoadRecords.cargarRegistros();

        EntityManager em = JPAUtils.getEntityManager();

        PedidoDao pedidoDao = new PedidoDao(em);
        Pedido pedidoConCliente = pedidoDao.consultarPedidoConCliente(3l);

        em.close();

        // System.out.println(pedido.getFecha());
        // System.out.println(pedido.getItems().size());
        System.out.println(pedidoConCliente.getCliente().getNombre());
    }
}
