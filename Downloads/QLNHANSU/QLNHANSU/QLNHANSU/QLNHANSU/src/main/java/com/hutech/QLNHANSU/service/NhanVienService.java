package com.hutech.QLNHANSU.service;

import com.hutech.QLNHANSU.model.NhanVien;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NhanVienService {

    private List<NhanVien> nhanVienList = new ArrayList<>();

    public void addNhanVien(NhanVien nhanVien) {
        nhanVienList.add(nhanVien);
    }

    public List<NhanVien> getAllNhanVien() {
        return nhanVienList;
    }

    // Các phương thức khác như sửa, xóa nếu cần

}
