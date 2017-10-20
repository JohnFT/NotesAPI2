/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incca.notes.interfaces;

import java.util.List;

/**
 *
 * @author JohnF
 * @param <T>
 */
public interface GeneralInterface<T> {

    public List<T> getAllUsers();

    public boolean add(T t);

    public boolean update(T t);

    public boolean remove(T t);
}
