package br.com.usjt.aeroporto.dao;

import java.util.List;


public interface GenericDAO<T> {

	void save(T t);

	void update(T t);

	void delete(T t);

	T findById(Long id);

	List<T> findByAll();

}
