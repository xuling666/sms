package com.zju.sms.service;

import com.zju.sms.domain.PhoneLib;

import java.util.List;

public interface IPhoneLibService {
    void save(PhoneLib phoneLib);
    void delete(Integer id);
    void update(PhoneLib phoneLib);
    PhoneLib get(Integer id);
    List<PhoneLib> getAll();
}
