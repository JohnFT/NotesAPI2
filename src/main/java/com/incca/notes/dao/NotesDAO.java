/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incca.notes.dao;

import com.incca.notes.entitys.Notes;
import com.incca.notes.helper.ConnecionDB;
import com.incca.notes.interfaces.GeneralInterface;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author JohnF
 */
public class NotesDAO implements GeneralInterface<Notes> {

    EntityManager em;

    public NotesDAO() {
        em = new ConnecionDB().getConenection();
    }

    public List<Notes> findByUser(int use_code) {
        return em.createNamedQuery("Notes.findAll").getResultList();
    }

    @Override
    public List<Notes> getAllUsers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Notes t) {
        if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }
        em.persist(t);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public boolean update(Notes t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(Notes t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
