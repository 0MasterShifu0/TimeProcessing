package com.mon.project.model.timeProcessing.dao;

import com.mon.project.model.timeProcessing.vo.Emp;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeProcessingDao {

    Emp findEmpByEmpno(Integer empno);

    Integer saveEmp(Emp emp);

    Integer updateEmp(Emp emp);

    Integer updateALLEmp(Emp emp);

    Integer deleteEmpByEmpno(Integer empno);
}
