package com.hutech.QLNHANSU.services;

import com.hutech.QLNHANSU.model.PhongBan;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PhongBanService {

    private List<PhongBan> phongBanList = new ArrayList<>();

    public List<PhongBan> getAllPhongBan() {
        return phongBanList;
    }

    public void addPhongBan(PhongBan phongBan) {
        phongBanList.add(phongBan);
    }
}
