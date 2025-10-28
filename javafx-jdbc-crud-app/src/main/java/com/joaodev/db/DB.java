package com.joaodev.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DB {

	private static Connection conn = null;
	
	public static Connection getConnection() {
		if (conn == null) {
			try {
				Properties props = loadProperties();
				String url = props.getProperty("dburl");
				conn = DriverManager.getConnection(url, props);
			}
			catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
		return conn;
	}
	
	public static void closeConnection() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
	
// Dentro da classe DB
private static Properties loadProperties(){
    // Procura db.properties na raiz de src/main/resources
    try(InputStream input = DB.class.getClassLoader().getResourceAsStream("/com/joaodev/gui/db.properties")){
        if (input == null) {
            throw new DbException("Erro: Não foi possível encontrar o arquivo db.properties no classpath.");
        }
        Properties props = new Properties();
        props.load(input);
        return props;
    }
    catch (IOException e){
        throw new DbException("Erro ao carregar propriedades: " + e.getMessage());
    }
}
	
	public static void closeStatement(Statement st) {
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}

	public static void closeResultSet(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
}
