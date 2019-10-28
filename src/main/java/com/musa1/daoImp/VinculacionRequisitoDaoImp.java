package com.musa1.daoImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.musa1.dao.VinculacionRequisitoDao;
import com.musa1.entity.Requisito;
import com.musa1.entity.VinculacionRequisito;

@Repository
public class VinculacionRequisitoDaoImp implements VinculacionRequisitoDao{

	@Autowired
	private JdbcTemplate jdbc;
	
	
	
	@Override
	public int CrearRequisitoBus(VinculacionRequisito e) {
		
		return jdbc.update("call pkg_crud_vinculacion_bus.sp_insert_vc_bus_requisito(?, ?, ?, ?)", e.getUrl(), e.getFecha_vencimiento_doc(), e.getId_requisito(), e.getId_vinculacion());
	}
}
