/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BlogDavid.BlogDavid.service;

import com.BlogDavid.BlogDavid.Dao.PubDao;
import com.BlogDavid.BlogDavid.Dominio.PubDominio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author david
 */
@Service
public class PubServiceImpl implements PubService {
   @Autowired
   private PubDao pubdao;

   @Override
   @Transactional
   public List<PubDominio> ListarPubs() {
      return (List<PubDominio>) pubdao.findAll();
   }

   @Override
   @Transactional
   public void guardar(PubDominio pub) {
      pubdao.save(pub);
   }

   @Override
   public void eliminar(PubDominio pub) {
      pubdao.delete(pub);
   }

   @Override
   @Transactional(readOnly = true)
   public PubDominio encontrarPub(PubDominio pub) {
      return pubdao.findById(pub.getIdpublicacion()).orElse(null);
   }

}
