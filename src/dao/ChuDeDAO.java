/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import configDB_mac.jdbcHelper;
import entity.ChuDe;

/**
 *
 * @author PC
 */
public class ChuDeDAO {
    public static ArrayList<ChuDe> getAll()
    {
        ArrayList<ChuDe> listCD=new ArrayList<ChuDe>();
        ResultSet resultSet;
        jdbcHelper helper=new jdbcHelper();
        String sql="SELECT*FROM ChuDe";
        resultSet=helper.executeQuery(sql);
        try {
            while(resultSet.next())
            {
                ChuDe cd=new ChuDe();
                cd.setMaChuDe(resultSet.getInt(1));
                cd.setTenChuDe(resultSet.getString(2));
                listCD.add(cd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChuDeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        helper.close();
        return listCD;
    }
    public static ChuDe getOneById(String value)
    {
        String sql="SELECT*FROM ChuDe where MaChuDe='"+value+"'";
        jdbcHelper helper=new jdbcHelper();
        ResultSet resultSet=helper.executeQuery(sql);
        ChuDe chude=new ChuDe();
        try {
            while (resultSet.next()) 
            {
                chude.setMaChuDe(resultSet.getInt(1));
                chude.setTenChuDe(resultSet.getString(2));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChuDeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        helper.close();
        return chude;
    }
    public static int insert(String tenChuDe)
    {
        String sql="EXEC SP_InsertOneCategory N'"+tenChuDe+"';";
        jdbcHelper helper=new jdbcHelper();
        int kq=helper.executeUpdate(sql);
        helper.close();
        return kq;
    }
    public static int upDate(String maChuDe, String tenChuDe)
    {
        String sql="update ChuDe set TenChuDe=N'"+tenChuDe+"' where MaChuDe='"+maChuDe+"';";
        jdbcHelper helper=new jdbcHelper();
        int kq=helper.executeUpdate(sql);
        helper.close();
        return kq;
    }
    public static int deleteOneById(String maChuDe)
    {
        String sql="delete ChuDe where MaChuDe='"+maChuDe+"';";
        jdbcHelper helper=new jdbcHelper();
        int kq=helper.executeUpdate(sql);
        helper.close();
        return kq;
    }
    
}
