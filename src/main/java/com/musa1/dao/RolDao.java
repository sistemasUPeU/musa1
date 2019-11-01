package com.musa1.dao;

import java.util.Map;

import com.musa1.entity.OpcionRol;
import com.musa1.entity.Rol;

public interface RolDao {
	public int create(Rol rol);
	public int addOpcionRol(OpcionRol opcionRol);
	public int edit(Rol rol);
	public int delete(int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
}
