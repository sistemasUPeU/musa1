package com.musa1.dao;
import java.util.Map;
import com.musa1.entity.DetalleMantenimiento;
public interface DetalleMantenimientoDao {
	public int create(DetalleMantenimiento detallemantenimiento);
	public int update(DetalleMantenimiento detallemantenimiento);
	public int delete(int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
}
	