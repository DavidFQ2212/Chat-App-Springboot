/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BlogDavid.BlogDavid.Dao;

import com.BlogDavid.BlogDavid.Dominio.PubDominio;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author david
 */ 
public interface PubDao extends JpaRepository<PubDominio,Long>{
    
}
