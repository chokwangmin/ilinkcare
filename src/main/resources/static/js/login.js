//교사 프로필 팝업
function showPopUp(teacherNo) {
	//창 크기 지정
	var width = 1000;
	var height = 800;

	//pc화면기준 가운데 정렬
	var left = (window.screen.width / 2) - (width/2);
	var top = (window.screen.height / 4);

    	//윈도우 속성 지정
	var windowStatus = 'width='+width+', height='+height+', left='+left+', top='+top+', scrollbars=yes, status=yes, resizable=yes, titlebar=yes';

    	//연결하고싶은url
    	const url = "/teacher/" + teacherNo;

	//등록된 url 및 window 속성 기준으로 팝업창을 연다.
	window.open(url, "hello popup", windowStatus);
}

function registInterest(teacherNo) {
    $.ajax({
        url : "/registInterest",
        data: {"teacherNo" : teacherNo},
        success : function(result) {
        console.log(result);
            alert(result);
        },
        error:function(request, status, ferror){
            console.log(request);
            alert("관심등록 중 오류가 발생하였습니다.");
        }
    });
}

//  프로필 모달팝업
$(function(){

//  $("#wishlist").click(function(){
//    $(".modal").fadeIn();
//  });

  $(".modal-close").click(function(){
    $(".modal").fadeOut();
  });

  //리뷰작성 모달팝업
  $("#reviewcreat").click(function(){
      $("#modal2").fadeIn();
  });

    $("#order").click(function(){
        $("#modal").fadeIn();
    });

  //달력

   $(document).ready(function(){

       $('.input-daterange').datepicker({
           format: 'yyyy-mm-dd',
           autoclose: true
       });

       });



//  $("#wishlist").click(function(){
//    $(".modal").fadeIn();
//  });
//
//  $(".modal_content").click(function(){
//    $(".modal").fadeOut();
//  });
//
//  //리뷰작성 모달팝업
//  $("#reviewcreat").click(function(){
//      $("#modal2").fadeIn();
//  });


/*
  $(".modal_content").click(function(){
      $("#modal").fadeOut();
  });
*/
});
