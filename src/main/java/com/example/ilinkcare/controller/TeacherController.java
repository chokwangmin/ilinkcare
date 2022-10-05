package com.example.ilinkcare.controller;


import com.example.ilinkcare.domain.CommentDto;
import com.example.ilinkcare.domain.Teacher;
import com.example.ilinkcare.domain.Wishlist;
import com.example.ilinkcare.service.TeacherServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping
@Controller
public class TeacherController {

    @Autowired
    private TeacherServiceImp teacherService;

    //메인
    @GetMapping("/index")
    public String main(ModelMap modelMap){
        List<Teacher> teacherList = teacherService.getTeacherList();
        modelMap.addAttribute("teachers", teacherList );
        return "index";
    }

    @GetMapping("/teacher/{id}") //rearch/5
    public String TeacherInfo(@PathVariable("id") int teacher_no, Model model){
        // 교사정보를 들고 온다.
        Teacher teacher = teacherService.getTeacher(teacher_no);

        // 교사 리뷰 리스트
       List<CommentDto> comments = teacherService.GetReview(teacher_no);

        // View (Model)
        model.addAttribute("teacher", teacher);
        model.addAttribute("comments",comments);

        return "profilview";
    }

    /**
     * 교사가입
     */
    @PostMapping("/teacher")
    public String TeacherJoin(@RequestBody Teacher teacher){

        // Service 교사입력
        teacherService.joinTeacher(teacher);

        return "";
    }
    /**
     * 관심교사 등록
     */

    @PostMapping("/wishlist")
    public String WishListCreate(@RequestBody Wishlist wishlist){
        teacherService.CreateWishlist(wishlist);
        return "";
    }

    /**
     * 관심교사리스트
     *
     */
//
//    @GetMapping("/wishlist")
//


}
