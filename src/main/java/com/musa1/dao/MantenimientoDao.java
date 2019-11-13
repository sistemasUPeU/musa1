package com.musa1.dao;
import java.util.Map;
import com.musa1.entity.Mantenimiento;

public interface MantenimientoDao {
	public int create(Mantenimiento mantenimiento);
	public int update(Mantenimiento mantenimiento);
	public int update_estado(int ide);
	public int delete(int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
		
}
