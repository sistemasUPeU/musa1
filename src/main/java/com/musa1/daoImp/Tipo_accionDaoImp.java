package com.musa1.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.musa1.dao.Tipo_accionDao;
import com.musa1.entity.Tipo_accion;

@Repository
public class Tipo_accionDaoImp implements Tipo_accionDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int create(Tipo_accion tipo_accion) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_tipo_accion.insertar_tipo_accion(?,?)", tipo_accion.getTipo_accion(),tipo_accion.getEstado());
	}
	@Override
	public int update(Tipo_accion tipo_accion) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_tipo_accion.modificar_tipo_accion(?,?,?)", tipo_accion.getTipo_accion(),tipo_accion.getEstado(),tipo_accion.getId_tipo_accion());
	}
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_tipo_accion.eliminar_tipo_accion(?)",id);
	}
	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
