/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incca.notes.bo;

import com.incca.notes.dao.UsersDAO;
import com.incca.notes.entitys.Users;
import java.util.List;

/**
 *
 * @author JohnF
 */
public class UsersBO {

    UsersDAO usersDAO;

    public UsersBO() {
        usersDAO = new UsersDAO();
    }

    public List<Users> getAllUsers() {
        return usersDAO.getAllUsers();
    }
     public Users getUserValidate(String nickname, String pass) {
        return usersDAO.getUserValidate( nickname,  pass);
    }

      public boolean add(Users u) {
        return usersDAO.add(u);
    }

}
