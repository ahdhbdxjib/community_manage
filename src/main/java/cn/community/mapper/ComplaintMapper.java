package cn.community.mapper;

import com.community.pojo.Complaint;
import com.community.pojo.ComplaintExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ComplaintMapper {
    long countByExample(ComplaintExample example);

    int deleteByExample(ComplaintExample example);

    int deleteByPrimaryKey(String complaintId);

    int insert(Complaint record);

    int insertSelective(Complaint record);

    List<Complaint> selectByExampleWithBLOBs(ComplaintExample example);

    List<Complaint> selectByExample(ComplaintExample example);

    Complaint selectByPrimaryKey(String complaintId);

    int updateByExampleSelective(@Param("record") Complaint record, @Param("example") ComplaintExample example);

    int updateByExampleWithBLOBs(@Param("record") Complaint record, @Param("example") ComplaintExample example);

    int updateByExample(@Param("record") Complaint record, @Param("example") ComplaintExample example);

    int updateByPrimaryKeySelective(Complaint record);

    int updateByPrimaryKeyWithBLOBs(Complaint record);

    int updateByPrimaryKey(Complaint record);
}