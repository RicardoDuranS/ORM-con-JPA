package com.tienda.prueba;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import com.tienda.JPAUtils.JPAUtils;
import com.tienda.dao.CategoriaDao;
import com.tienda.dao.ClienteDao;
import com.tienda.dao.PedidoDao;
import com.tienda.dao.ProductoDao;
import com.tienda.modelo.Categoria;
import com.tienda.modelo.Cliente;
import com.tienda.modelo.ItemsPedido;
import com.tienda.modelo.Pedido;
import com.tienda.modelo.Producto;

public class RegistroDeProducto {
    public static void main(String[] args) {
        registrarProducto();

        EntityManager em = JPAUtils.getEntityManager();

        ProductoDao productoDao = new ProductoDao(em);
        Producto producto = productoDao.consultaPorId(1L);

        ClienteDao clienteDao = new ClienteDao(em);
        Cliente cliente = new Cliente("Juan", "k6757kjb");
        Pedido pedido = new Pedido(cliente);
        pedido.agregarItems(new ItemsPedido(5, producto, pedido));

        PedidoDao pedidoDao = new PedidoDao(em);

        em.getTransaction().begin();
        clienteDao.guardar(cliente);
        pedidoDao.guardar(pedido);

        em.getTransaction().commit();

        BigDecimal valort = pedidoDao.valorTotalVendido();
        System.out.println(valort);
        em.close();
    }

    private static void registrarProducto() {
        Categoria celulares = new Categoria("CELULARES");
        Producto celular = new Producto("Samsung", "Telefono usado", new BigDecimal("700"), celulares);

        EntityManager em = JPAUtils.getEntityManager();

        ProductoDao productoDao = new ProductoDao(em);
        CategoriaDao categoriaDao = new CategoriaDao(em);

        em.getTransaction().begin();

        categoriaDao.guardar(celulares);
        productoDao.guardar(celular);

        em.getTransaction().commit();
        em.close();
    }
}
