package com.tienda.dao;

import javax.persistence.EntityManager;

import com.tienda.modelo.Categoria;

public class CategoriaDao {

    private EntityManager em;

    public CategoriaDao(EntityManager em) {
        this.em = em;
    }

    public void guardar(Categoria categoria) {
        this.em.persist(categoria);
    }

    public void actualizar(Categoria categoria) {
        this.em.merge(categoria);
    }

    public void remover(Categoria categoria) {
        categoria = this.em.merge(categoria);// Garantizar que este en el estado Managed
        this.em.remove(categoria);
    }
}
