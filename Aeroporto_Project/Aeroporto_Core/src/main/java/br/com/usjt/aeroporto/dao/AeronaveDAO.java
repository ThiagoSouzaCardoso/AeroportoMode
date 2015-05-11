/**
 * 
 */
package br.com.usjt.aeroporto.dao;

import java.util.List;

import br.com.usjt.aeroporto.entity.Aeronave;

/**
 * @author thiagosouzacardoso
 * 
 */
public interface AeronaveDAO extends GenericDAO<Aeronave> {

	List<Aeronave> findAllName(String name);

}
