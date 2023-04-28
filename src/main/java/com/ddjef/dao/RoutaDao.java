package com.ddjef.dao;

import java.util.List;
import com.ddjef.domain.Routa;

public interface RoutaDao {
	
	void save(Routa r);
	
	void update(Routa r);
	
	void delete (Long id);
	
	Routa getById(Long id);
	
	List<Routa> getAll();

}
