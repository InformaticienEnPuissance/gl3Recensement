/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Classes.Population;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class PopulationDao extends Dao{
    SimpleDateFormat amj = new SimpleDateFormat("yyyy-MM-dd");
    @Override
    public Population recherche(int id) {
     Population pop = new Population();
        try {
            
            
            ResultSet result = this.connect.createStatement().executeQuery("SELECT * FROM population WHERE idr= "+id);
            if(result.next()){
                pop.setIdr(result.getInt("idr"));
                pop.setPrenom(result.getString("prenom"));
                pop.setNom(result.getString("nom"));
                pop.setDateNais(result.getDate("dateNais"));
                pop.setLieuNais(result.getString("lieuNais"));
                pop.setRegion(result.getString("region"));
                pop.setSexe(result.getString("sexe"));
                pop.setDomicile(result.getString("domicile"));
                pop.setprofession(result.getString("profession"));
                pop.setNomPere(result.getString("nomPere"));
                pop.setDateEnreg(result.getString("dateEnreg"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(PopulationDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pop;   
    }

    public void ajouter(Population obj) {
        try {
            PreparedStatement pst = this.connect.prepareStatement("INSERT INTO population(prenom, nom, dateNais, lieuNais, region, sexe, domicile, profession, nomPere, dateEnreg) VALUES(?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, obj.getPrenom());
            pst.setString(2, obj.getNom());
            pst.setString(3, amj.format(obj.getDateNais()));
            pst.setString(4, obj.getLieuNais());
            pst.setString(5, obj.getRegion());
            pst.setString(6, obj.getSexe());
            pst.setString(7, obj.getDomicile());
            pst.setString(8, obj.getprofession());
            pst.setString(9, obj.getNomPere());
            pst.setString(10, obj.getDateEnreg());
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(PopulationDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modifier(Population obj, int id) {
        try {
            PreparedStatement pst = this.connect.prepareStatement("UPDATE population SET prenom=?, nom=?, dateNais=?, lieuNais=?, region=?, sexe=?, domicile=?, profession=?, nomPere=?, dateEnreg=? WHERE idr="+id);
            pst.setString(1, obj.getPrenom());
            pst.setString(2, obj.getNom());
            pst.setString(3, amj.format(obj.getDateNais()));
            pst.setString(4, obj.getLieuNais());
            pst.setString(5, obj.getRegion());
            pst.setString(6, obj.getSexe());
            pst.setString(7, obj.getDomicile());
            pst.setString(8, obj.getprofession());
            pst.setString(9, obj.getNomPere());        
            pst.setString(10, obj.getDateEnreg());
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(PopulationDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void supprime(int id) {
         try {
            PreparedStatement pst = this.connect.prepareStatement("DELETE FROM population WHERE idr="+id);
            
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(PopulationDao.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    @Override
    public List list() {
        Population pop = new Population();
        List<Population> lp = new ArrayList();
        try {           
            ResultSet result = this.connect.createStatement().executeQuery("SELECT * FROM population");
            while(result.next()){
                pop.setIdr(result.getInt("idr"));
                pop.setPrenom(result.getString("prenom"));
                pop.setNom(result.getString("nom"));
                pop.setDateNais(result.getDate("dateNais"));
                pop.setLieuNais(result.getString("lieuNais"));
                pop.setRegion(result.getString("region"));
                pop.setSexe(result.getString("sexe"));
                pop.setDomicile(result.getString("domicile"));
                pop.setprofession(result.getString("profession"));
                pop.setNomPere(result.getString("nomPere"));
                pop.setDateEnreg(result.getString("dateEnreg"));
                lp.add(pop);
                pop = new Population();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(PopulationDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lp;
    }

    
     public int getIdr() {
        int id = 0;
        try {
            ResultSet result = this.connect.createStatement().executeQuery("SELECT max(idr) as maxid FROM population");
            if (result.next()) {
                id = result.getInt("maxid") + 1;

            }
        } catch (SQLException ex) {
            Logger.getLogger(
                    PopulationDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
     
    @Override
    public void ajouter(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void modifier(Object obj, int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
    
}
