package mapper;

import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;


public interface TimeMapper {

    @Select("SELECT SYSDATE FROM DUAL")
    public String getTime();

    public String getTime2();
}
