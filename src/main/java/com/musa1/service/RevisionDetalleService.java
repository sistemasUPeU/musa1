package com.musa1.service;

import java.util.Map;

import com.musa1.entity.RevisionDetalle;


public interface RevisionDetalleService {
	public int create(RevisionDetalle revisiondetalle);
	public int edit(RevisionDetalle revisiondetalle);
	public int delete(int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
}
