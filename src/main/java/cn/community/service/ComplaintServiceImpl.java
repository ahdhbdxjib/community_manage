package cn.community.service;


import cn.community.c_interface.ComplaintService;
import cn.community.mapper.ComplaintMapper;
import cn.community.pojo.Complaint;
import cn.community.pojo.ComplaintExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComplaintServiceImpl implements ComplaintService {
    @Autowired
    ComplaintMapper complaintMapper;

    public Complaint getComplaintByOwnId(Integer ownerId) {
        ComplaintExample complaintExample = new ComplaintExample();
        complaintExample.createCriteria().andOwnerIdEqualTo(ownerId);
        List<Complaint> complaints = complaintMapper.selectByExampleWithBLOBs(complaintExample);
        if (complaints.size() > 0) {
            return complaints.get(0);
        } else {
            return new Complaint();
        }

    }

    @Override
    public List<Complaint> getAllComplaint(Integer ownerId) {
        ComplaintExample complaintExample = new ComplaintExample();
        complaintExample.createCriteria().andOwnerIdEqualTo(ownerId);
        List<Complaint> complaints = complaintMapper.selectByExampleWithBLOBs(complaintExample);
        return complaints;
    }

    @Override
    public void delComplantById(String id) {
        complaintMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void upDataComplantById(String complaintId, String complaintComment) throws Exception {
        complaintMapper.updateByPriMaryKeyAndComment(complaintId, complaintComment);
    }

    @Override
    public void addComplaintComment(Complaint complaint) throws Exception {
        complaintMapper.insert(complaint);
    }
}
