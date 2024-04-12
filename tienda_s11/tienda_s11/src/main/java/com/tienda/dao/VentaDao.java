package com.tienda.dao;

import com.tienda.domain.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Racha
 */
public interface VentaDao extends JpaRepository<Venta, Long>{
    
}
