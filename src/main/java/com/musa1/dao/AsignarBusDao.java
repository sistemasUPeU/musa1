package com.musa1.dao;

import java.util.Map;

import com.musa1.entity.AsignarBus;

public interface AsignarBusDao {

	public Map<String, Object> readAsignarBus();
	
	public Map<String, Object> readParadero();

	public int edit(AsignarBus ab);
<<<<<<< HEAD
	

	Map<String , Object> readfil(int nume);

=======
>>>>>>> a5087daa848d2f98712c78bce8878e98dc420fae

	Map<String , Object> readfil(int nume);
}