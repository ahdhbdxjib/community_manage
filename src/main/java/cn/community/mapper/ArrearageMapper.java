package cn.community.mapper;

import com.community.pojo.Arrearage;
import com.community.pojo.ArrearageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArrearageMapper {
    long countByExample(ArrearageExample example);

    int deleteByExample(ArrearageExample example);

    int deleteByPrimaryKey(String arrearageId);

    int insert(Arrearage record);

    int insertSelective(Arrearage record);

    List<Arrearage> selectByExample(ArrearageExample example);

    Arrearage selectByPrimaryKey(String arrearageId);

    int updateByExampleSelective(@Param("record") Arrearage record, @Param("example") ArrearageExample example);

    int updateByExample(@Param("record") Arrearage record, @Param("example") ArrearageExample example);

    int updateByPrimaryKeySelective(Arrearage record);

    int updateByPrimaryKey(Arrearage record);
}