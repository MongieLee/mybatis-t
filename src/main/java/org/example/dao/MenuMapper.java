package org.example.dao;

import org.example.entity.Menu;

import java.util.List;

public interface MenuMapper {
    List<Menu> getAll();

    Menu getMenuById();

    Integer update(Menu menu);

    Integer delete();

    Integer insert(Menu menu);
}
