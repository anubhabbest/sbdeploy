package com.gl.CollegeFestDebateSpring.boot.service;

import java.util.List;

// External Service - Lets say this comes from WunderList
public interface TodoService {

    List<String> retrieveTodos(String user);

    void deleteTodo(String todo);

}