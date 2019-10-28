package com.musa1.dao;

import java.util.List;
import java.util.Map;

public interface BusDao {
	public List<Map<String, Object>> ListarBusPropietario (String placa);
}
