package site.sinsauseong.persistence;

import lombok.extern.log4j.Log4j;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Log4j
public class JDBCTests {

    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // File - project Structure - library - ojdbc jar 추가 (SQL Exception의 원인 중 하나)
    // 위 방법으로 하는것 보다 ojdbc 랑 oracle 버전이 서로 맞는 maven을 찾아서 pom.xml에 dependency 추가
    @Test
    public void testConnection() throws SQLException {
        Connection con =  DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:XE",
                "TEST",
                "1234"
        );
        log.info(con);
    }
}
