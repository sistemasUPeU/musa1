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
	

	Map<String , Object> readfil(int nume);
>>>>>>> d122dd4daeb3a49fdd49fc7df63befa61bab6044

}