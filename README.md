# TimeProcessing
对各种时间的处理方法集合

# 前端日期传值类型:
http://localhost:10001/timeProcessing/saveEmp

入参:
{
  "ename": "Tom",
  "job": "CLERK",
  "mgr": 7902,
  "hiredate": "2019-07-23",
  "sal": 800,
  "comm": null,
  "deptno": 20
}

# java日期接收类型:

@JsonFormat(pattern = "yyyy-MM-dd")

private Date hiredate ;

# Mybatis配置的类型
 #####{hiredate ,jdbcType=DATE},

# 数据库类型
hiredate DATE,

#emp表建表语句:
CREATE TABLE emp
(   
    empno NUMBER(4) CONSTRAINT PK_EMP PRIMARY KEY,
    ename VARCHAR2(10),
    job VARCHAR2(15),
    mgr NUMBER(4),
    hiredate DATE,
    sal NUMBER(7,2),
    comm NUMBER(7,2),
    deptno NUMBER(2) CONSTRAINT FK_DEPTNO REFERENCES DEPT
 );
 #emp表建表索引:
 --自定义一个序列  
  create sequence emp_sequence
        increment by 1 --每次增加几个，我这里是每次增加1  
        start with 1   --从1开始计数  
        nomaxvalue      --不设置最大值  
        nocycle         --一直累加，不循环  
        nocache        --不建缓冲区  

