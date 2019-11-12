package com.musa1.dao;

import java.util.Map;

import com.musa1.entity.RevisionTecnica;


public interface RevisionTecnicaDao {
	public int create (RevisionTecnica revisiontecnica);
	public int edit(RevisionTecnica revisiontecnica);
	public int delete(int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
}
