package com.musa1.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.musa1.dao.RevisionDetalleDao;
import com.musa1.entity.RevisionDetalle;

@Repository
public class RevisionDetalleDaoImp implements RevisionDetalleDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int create(RevisionDetalle revisiondetalle) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_REVISION_DETALLE.SP_INSERTAR_REVISION_DETALLE(?,?,?)",revisiondetalle.getEvaluacion(),revisiondetalle.getId_revision_detalle(),revisiondetalle.getId_accion());
	}

	@Override
	public int edit(RevisionDetalle revisiondetalle) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_REVISION_DETALLE.SP_MODIFICAR_REVISION_DETALLE(?,?,?,?)",revisiondetalle.getId_revision_detalle(),revisiondetalle.getEvaluacion(),revisiondetalle.getId_revision_tecnica(),revisiondetalle.getId_accion());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_REVISION_DETALLE.SP_ELIMINAR_REVISION_DETALLE(?)",id);
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
