package mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import pojo.ObjectA;

@Mapper
public interface ObjAMapper {
    String TABLE_NAME = "object_A";
    @Select("select * from "+TABLE_NAME+" where prop1 = #{id}")
    public ObjectA getObjAbyID(Integer id);

}
