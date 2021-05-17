/**
 * 
 */
package com.java.test.zipcode.daos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import com.java.test.zipcode.models.ResponseModel;
import com.java.test.zipcode.models.Sepomex;
import com.java.test.zipcode.models.Settlements;

/***************************************************************************************************************/
/* Date: 16/05/2021
 * Author: Floricelda Cabrera Santos
 * Descripción: Clase que implementa los métodos de SepomexDao*/
/***************************************************************************************************************/
public class SepomexDaoImpl implements SepomexDao {
	@PersistenceContext
	private EntityManager entityManager;


	/**
	 * return ResponseModel
	 */
	public ResponseModel getDataByCp(String cp){
		Query query= this.entityManager.createNativeQuery("SELECT cp.cp,"
				+ "cp.ciudad,"
				+ "cp.estado,"
				+ "cp.asentamiento,"
				+ "cp.zona,"
				+ "cp.tipo,"
				+ "cp.municipio"
				+ " FROM sepomex cp WHERE cp.cp = ? ");
		query.setParameter(1, cp);		     
		List<Object[]> result= query.getResultList(); 
		return(result.isEmpty())? null:maptoObject(result);
	}

	private ResponseModel maptoObject(List<Object[]> param) {
		ResponseModel object= new ResponseModel();
		object.setListSettlements(new ArrayList<Settlements>());
		for (Object[] a : param) {
			object.setZip_code(a[0]!= null?a[0].toString():"");
			object.setLocality(a[1]!=null?a[1].toString():"");
			object.setFederal_entity(a[2]!=null?a[2].toString():"");
			Settlements settlements= new Settlements();
			settlements.setName(a[3]!= null?a[3].toString():"");
			settlements.setZone_type(a[4]!= null?a[4].toString():"");
			settlements.setSettlement_type(a[5]!=null?a[5].toString():"");
			object.getListSettlements().add(settlements);
			object.setMunicipality(a[6]!=null?a[6].toString():"");
		}
		return object;
	}

	@Override
	public List<Sepomex> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Sepomex> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Sepomex> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Sepomex> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends Sepomex> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<Sepomex> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub

	}

	@Override
	public Sepomex getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Sepomex> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Sepomex> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Sepomex> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Sepomex> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Sepomex> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Sepomex entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends Sepomex> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends Sepomex> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Sepomex> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Sepomex> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Sepomex> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}




}
