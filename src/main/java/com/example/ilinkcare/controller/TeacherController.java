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

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping
@Controller
public class TeacherController {

    @Autowired
    private TeacherServiceImp teacherService;

    public static int recordSize = 8;

    public static int pageSize = 5;

    @GetMapping("") //index?page=1,
    public String index(ModelMap modelMap){
        return "redirect:/index";
    }

    //메인
    @GetMapping("/index") //index?page=1,
    public String main(ModelMap modelMap, @RequestParam(value = "page" , required = false) String page){
        // 현재 페이지 번호
        int pageNo = page == null ? 1 : Integer.parseInt(page);
        // 페이징 LIMIT 시작 위치 계산
        int limitStart = (pageNo - 1) * recordSize;
        // 교사 리스트를 DB에서 가져오기 위한 페이징번호 (limitStart: 시작번호, limitEnd: 종료번호)
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("limitStart"  , limitStart);
        param.put("limitEnd"    , recordSize);

        // 교사 리스트
        List<Teacher> teacherList = teacherService.getTeacherList(param);
        // 교사 리스트 총 개수
        int totalRecordCount = teacherService.getTeacherListCount(param);
        modelMap.addAttribute("teachers", teacherList );

        // 전체 하단 페이지 개수 계산
        int totalPageCount = ((totalRecordCount - 1) / recordSize) + 1;
        // 현재 페이지 번호가 전체 페이지 수보다 큰 경우, 현재 페이지 번호에 전체 페이지 수 저장
        if (pageNo > totalPageCount) {
            pageNo = totalPageCount;
        }

        // 첫 페이지 번호 계산
        int startPage = ((pageNo - 1) / pageSize) * pageSize + 1;
        // 끝 페이지 번호 계산
        int endPage = startPage + pageSize - 1;
        // 끝 페이지가 전체 페이지 수보다 큰 경우, 끝 페이지 전체 페이지 수 저장
        if (endPage > totalPageCount) {
            endPage = totalPageCount;
        }

        // 이전 페이지 존재 여부 확인
        boolean existPrevPage = startPage != 1;
        // 다음 페이지 존재 여부 확인
        boolean existNextPage = (endPage * recordSize) < totalRecordCount;

        modelMap.put("nowPage"          , pageNo);
        modelMap.put("startPage"        , startPage);
        modelMap.put("endPage"          , endPage);
        modelMap.put("existPrevPage"    , existPrevPage);
        modelMap.put("existNextPage"    , existNextPage);

        int lastPageFirst = 0;
        if (totalPageCount % pageSize == 0) {
            lastPageFirst = (totalPageCount/pageSize-1) * pageSize + 1;
        } else {
            lastPageFirst = (int) (Math.floor(totalPageCount / pageSize) * pageSize + 1);
        }
        // 마지막페이징에서 첫 페이지
        modelMap.put("lastPageFirst"   , lastPageFirst);
        // 이전페이징에서 첫 페이지
        modelMap.put("firstPageFist"   , startPage-pageSize);

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

        return "profileview";
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
