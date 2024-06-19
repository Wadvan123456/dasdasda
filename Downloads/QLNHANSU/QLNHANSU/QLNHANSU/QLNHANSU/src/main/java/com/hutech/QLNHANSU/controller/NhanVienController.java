package com.hutech.QLNHANSU.controller;

import com.hutech.QLNHANSU.model.NhanVien;
import com.hutech.QLNHANSU.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/nhanvien")
public class NhanVienController {

    private final NhanVienService nhanVienService;

    @Autowired
    public NhanVienController(NhanVienService nhanVienService) {
        this.nhanVienService = nhanVienService;
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("nhanVien", new NhanVien());
        return "add-NhanVien"; // View template: add-NhanVien.html
    }

    @PostMapping("/add")
    public String addNhanVien(@ModelAttribute("nhanVien") NhanVien nhanVien) {
        nhanVienService.addNhanVien(nhanVien);
        return "redirect:/nhanvien/list";
    }

    @GetMapping("/list")
    public String getAllNhanVien(Model model) {
        List<NhanVien> nhanVienList = nhanVienService.getAllNhanVien();

        // Duyệt qua danh sách nhân viên và gán đường dẫn hình ảnh dựa vào giới tính
        for (NhanVien nhanVien : nhanVienList) {
            if ("Nữ".equals(nhanVien.getPhai())) {
                nhanVien.setGenderImage("/images/woman.jpg");
            } else if ("Nam".equals(nhanVien.getPhai())) {
                nhanVien.setGenderImage("/images/man.jpg");
            } else {
                // Xử lý khi không có giới tính nữ hoặc nam, ví dụ mặc định
                nhanVien.setGenderImage("/images/default.jpg");
            }
        }

        model.addAttribute("nhanVienList", nhanVienList);
        return "list-NhanVien"; // Tham chiếu đến template: list-NhanVien.html
    }

}
