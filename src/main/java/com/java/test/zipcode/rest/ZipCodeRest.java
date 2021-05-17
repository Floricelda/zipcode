package com.java.test.zipcode.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.java.test.zipcode.daos.SepomexDao;
import com.java.test.zipcode.models.ResponseModel;
/***************************************************************************************************************/
/* Date: 16/05/2021
 * Author: Floricelda Cabrera Santos
 * Descripción: Servicio implementando un getMapping, en esta misma clase se pueden agregar otras operaciones*/
/***************************************************************************************************************/

@RestController
@RequestMapping("v1") //es recomendable tener un contexto inicial para el recurso y con versión
public class ZipCodeRest{

	private static final Logger logger = LoggerFactory.getLogger(ZipCodeRest.class);

	@Autowired
	private SepomexDao sepomexDao;


	/**
	 * @param cp
	 * @return ResponseModel
	 */
	@GetMapping("/zip-codes/{id}")
	public ResponseModel findByCp(@PathVariable("id")String cp){
		return sepomexDao.getDataByCp(cp);
	}

}
