package service.servicelmp;

import entity.Emp;
import service.EmpService;

import java.util.List;

public class EmpServiceImpl implements EmpService {
    @Override
    public Emp selectByEntity(Emp emp) {
        return null;
    }

    @Override
    public Emp selectByName(Emp emp) {
        return null;
    }

    @Override
    public List<Emp> selectById(int id) {
        return null;
    }

    @Override
    public List<Emp> selectAll() {
        return null;
    }

    @Override
    public boolean addEmpInfo(Emp emp) {
        return false;
    }

    @Override
    public boolean updateEmpInfoByName(Emp emp) {
        return false;
    }

    @Override
    public boolean updateEmpInfo(Emp emp) {
        return false;
    }

    @Override
    public boolean deleteEmpInfoById(int emp_id) {
        return false;
    }

    @Override
    public boolean updateEmpJobInfo(Emp emp) {
        return false;
    }

    @Override
    public boolean updateOwn(Emp emp) {
        return false;
    }
}
