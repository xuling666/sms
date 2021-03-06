package com.zju.sms.service;

import com.zju.sms.domain.SystemConfigure;

import java.util.List;

public interface ISystemConfigureService {
    void save(SystemConfigure systemConfigure);
    void delete(Integer id);
    void update(SystemConfigure systemConfigure);
    SystemConfigure get(Integer id);
    List<SystemConfigure> getAll();
}
