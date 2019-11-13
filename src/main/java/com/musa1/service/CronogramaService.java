package com.musa1.service;

import java.util.Map;

import com.musa1.entity.CronogramaBus;
import com.musa1.entity.Periodo;

public interface CronogramaService {
	public int createcrono();
	public int update(Periodo p );
	public int create ( CronogramaBus cb);
	Map<String, Object> readperido ();
	Map<String, Object> readAll(int paradero , int periodo );
	
}
