package com.dxkf.ct.web.service;

import com.dxkf.ct.web.bean.Calllog;

import java.util.List;

public interface CalllogService {
    List<Calllog> queryMonthDatas(String tel, String calltime);
}
