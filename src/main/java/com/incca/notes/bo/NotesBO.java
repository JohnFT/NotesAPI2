/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incca.notes.bo;

import com.incca.notes.dao.NotesDAO;
import com.incca.notes.entitys.Notes;
import java.util.List;

/**
 *
 * @author JohnF
 */
public class NotesBO {

    NotesDAO notesDAO;

    public NotesBO() {
        notesDAO = new NotesDAO();
    }

    public List<Notes> findByUser(int use_code) {
        return notesDAO.findByUser(use_code);
    }

    public boolean add(Notes n) {
        return notesDAO.add(n);
    }
}
