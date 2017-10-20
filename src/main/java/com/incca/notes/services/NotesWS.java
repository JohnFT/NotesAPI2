/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incca.notes.services;

import com.incca.notes.bo.NotesBO;
import com.incca.notes.entitys.Notes;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author JohnF
 */
@WebService(serviceName = "NotesWS")
public class NotesWS {

    NotesBO notesBo;

    public NotesWS() {
        notesBo = new NotesBO();
    }

    /**
     * Web service operation
     *
     * @param use_code
     * @return
     */
    @WebMethod(operationName = "findByUser")
    public List<Notes> findByUser(@WebParam(name = "use_code") int use_code) {
        return notesBo.findByUser(use_code);
    }

    /**
     * Web service operation
     * @param note
     * @return 
     */
    @WebMethod(operationName = "addNotes")
    public Boolean addNotes(@WebParam(name = "note") Notes note) {
        return notesBo.add(note);
    }


}
