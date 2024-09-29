package com.easyjava.builder;

import com.easyjava.utils.PropertiesUtils;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BuildTable {

    private final  static Logger logger =LoggerFactory.getLogger(BuildTable.class);
    private static final org.slf4j.Logger log = LoggerFactory.getLogger(BuildTable.class);

    private static Connection conn = null;


    private static String SQL_SHOW_TABLE_STATUS = "show table status";

    static {

        String driverName = PropertiesUtils.getString("db.driver.name");

        String url = PropertiesUtils.getString("db.url");
        String username = PropertiesUtils.getString("db.username");
        String password = PropertiesUtils.getString("db.password");


        try {
            Class.forName(driverName);

            conn = DriverManager.getConnection(url,username,password);
        } catch (Exception e) {
            System.out.println("数据库连接失败");
        }




    }


    //获取table表的元素
    public static void getTable(){
        PreparedStatement ps = null;
        ResultSet tableResult = null;

        try {
            ps = conn.prepareStatement(SQL_SHOW_TABLE_STATUS);

            tableResult= ps.executeQuery();

            while (tableResult.next()) {

                String tableName = tableResult.getString("name");
                String comment = tableResult.getString("comment");

                logger.info("tableName:{},comment:{}",tableName,comment);
            }

        }catch (Exception e){
            logger.error("读取表失败",e);
        }finally {


            try{
                if(tableResult != null){
                    tableResult.close();
                }
                if(ps != null){
                    ps.close();
                }
                if(conn != null){
                    conn.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }

        }

    }


}
