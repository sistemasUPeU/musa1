package com.musa1.dao;

import java.util.Map;

import com.musa1.entity.CronogramaBus;
import com.musa1.entity.Periodo;

public interface CronogramaDao {
	public int createcrono ();
	public int update(Periodo p );
	public int create ( CronogramaBus cb);
	Map<String, Object> readperido ();
	Map<String, Object> readAll( int periodo );
	Map<String, Object> readAllC( int periodo );

}
