package com.musa1.dao;

import java.util.Map;

import com.musa1.entity.RevisionDetalle;


public interface RevisionDetalleDao {
	public int create (RevisionDetalle revisiondetalle);
	public int edit(RevisionDetalle revisiondetalle);
	public int delete(int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
}
