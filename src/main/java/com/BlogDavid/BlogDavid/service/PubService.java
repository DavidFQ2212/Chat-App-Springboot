/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BlogDavid.BlogDavid.service;

import com.BlogDavid.BlogDavid.Dominio.PubDominio;
import java.util.List;

/**
 *
 * @author david
 */
public interface PubService {
   public List<PubDominio> ListarPubs();
    public void guardar(PubDominio pub);
    public void eliminar(PubDominio pub);
    public PubDominio encontrarPub(PubDominio pub);
}
