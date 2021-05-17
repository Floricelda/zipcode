package com.java.test.zipcode.daos;
import org.springframework.data.jpa.repository.JpaRepository;
import com.java.test.zipcode.models.ResponseModel;
import com.java.test.zipcode.models.Sepomex;

/***************************************************************************************************************/
/* Date: 16/05/2021
 * Author: Floricelda Cabrera Santos
 * Descripción: Servicio para realizar operaciones en la base de datos ya sea con métodos predefinidos por
 * JPA Repository o creados*/
/***************************************************************************************************************/
public interface SepomexDao extends JpaRepository<Sepomex,Integer>{
	ResponseModel getDataByCp(String cp);
}
