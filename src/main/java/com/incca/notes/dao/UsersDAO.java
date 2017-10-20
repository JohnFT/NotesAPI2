/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incca.notes.dao;

import com.incca.notes.entitys.Users;
import com.incca.notes.helper.ConnecionDB;
import com.incca.notes.interfaces.GeneralInterface;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Home
 */
public class UsersDAO implements GeneralInterface<Users> {

    EntityManager em;

    public UsersDAO() {
        em = new ConnecionDB().getConenection();
    }

    @Override
    public List<Users> getAllUsers() {
        return em.createNamedQuery("Users.findAll").getResultList();
    }

    public Users getUserValidate(String nickname, String pass) {
        List<Users> users = em.createNamedQuery("Users.findByCredencials").setParameter("useUser", nickname)
                .setParameter("usePass", pass).getResultList();
        if (users.isEmpty()) {
            return null;
        }
        return users.stream().findFirst().get();
    }

    @Override
    public boolean add(Users u) {
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public boolean update(Users t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(Users t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
