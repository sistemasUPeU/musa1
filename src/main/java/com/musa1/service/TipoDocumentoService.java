package com.musa1.service;

import java.util.Map;

import com.musa1.entity.TipoDocumento;

public interface TipoDocumentoService {
	public int create (TipoDocumento tipoDocumento);
	public int edit (TipoDocumento tipoDocumento);
	public int delete (int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
}
