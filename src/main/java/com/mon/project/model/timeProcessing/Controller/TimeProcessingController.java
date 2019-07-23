package com.mon.project.model.timeProcessing.Controller;

import com.mon.project.model.timeProcessing.dao.TimeProcessingDao;
import com.mon.project.model.timeProcessing.vo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/timeProcessing")
public class TimeProcessingController {

    @Autowired
    private TimeProcessingDao timeProcessingDao;


    @RequestMapping(value = "/findEmpByEmpno/{empno}",method = RequestMethod.GET)
    Emp findEmpByEmpno(@PathVariable("empno") Integer empno){
        if(null == empno){
            return new Emp();
        }
        return timeProcessingDao.findEmpByEmpno(empno);
    }

    @RequestMapping(value = "/saveEmp",method = RequestMethod.POST)
    Integer saveEmp(@RequestBody Emp emp){
        return timeProcessingDao.saveEmp(emp);
    }

    @RequestMapping(value = "/updateEmp",method = RequestMethod.POST)
    Integer updateEmp(@RequestBody Emp emp){
        if(null == emp.getEmpno()){
            return 0;
        }
        return timeProcessingDao.updateEmp(emp);
    }

    @RequestMapping(value = "/updateAllEmp",method = RequestMethod.POST)
    Integer updateAllEmp(@RequestBody Emp emp){
        if(null == emp.getEmpno()){
            return 0;
        }
        return timeProcessingDao.updateALLEmp(emp);
    }

    @RequestMapping(value = "/deleteEmpByEmpno/{empno}",method = RequestMethod.GET)
    Integer deleteEmpByEmpno(@PathVariable("empno")Integer empno){
        if(null==empno){
            return 0;
        }
        return timeProcessingDao.deleteEmpByEmpno(empno);
    }
}
