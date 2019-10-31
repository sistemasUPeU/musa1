package com.musa1.dao;

import java.util.Map;

import com.musa1.entity.TipoDocumento;

public interface TipoDocumentoDao {
	public int create (TipoDocumento tipoDocumento);
	public int edit (TipoDocumento tipoDocumento);
	public int delete (int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
}
