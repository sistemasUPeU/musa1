package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.VinculacionDao;
import com.musa1.entity.Vinculacion;
import com.musa1.service.VinculacionService;

@Service
public class VinculacionServiceImp implements VinculacionService{
	
	@Autowired
	private VinculacionDao dao;
	@Override
	public Map<String, Object> crearVinculacionBus(Vinculacion e) {
		return dao.crearVinculacionBus(e);
	}
	@Override
	public Map<String, Object> listarVistaVinculacionBus() {
		return dao.listarVistaVinculacionBus();
	}
	@Override
	public Map<String, Object> readVinculacionConductor() {
		// TODO Auto-generated method stub
		return dao.readVinculacionConductor();
	}
	@Override
	public Map<String, Object> createVinculacionConductor(Vinculacion vinculacion) {
		// TODO Auto-generated method stub
		return dao.createVinculacionConductor(vinculacion);
	}
	@Override
	public Map<String, Object> listarVinculacionBusPlaca(String placa) {
		return dao.listarVinculacionBusPlaca(placa);
	}
	@Override
	public int eliminarVinculacionBus(String placa) {
		return dao.eliminarVinculacionBus(placa);
	}
	@Override
	public Map<String, Object> listarInvolubradosBus(String placa) {
		return dao.listarInvolubradosBus(placa);
	}
	@Override
	public Map<String, Object> listarVinculacionBusId(int id) {
		return dao.listarVinculacionBusId(id);
	}
	@Override
	public int modificarVinculacionBus(Vinculacion e) {
		return dao.modificarVinculacionBus(e);
	}

}

