package com.hutech.QLNHANSU.model;

import lombok.Data;

@Data
public class NhanVien {
    private String maNV;
    private String tenNV;
    private String phai; // Thêm trường giới tính
    private String noiSinh;
    private String maPhong;
    private Double luong;
    private String genderImage; // Đường dẫn hình ảnh giới tính
}
