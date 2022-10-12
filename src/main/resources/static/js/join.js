
$(function(){
document.getElementById("address_kakao").addEventListener("click", function(){ //주소입력칸을 클릭하면
        //카카오 지도 발생
        new daum.Postcode({
            oncomplete: function(data) { //선택시 입력값 세팅
                document.getElementById("address_kakao").value = data.address; // 주소 넣기
                document.querySelector("input[name=address_detail]").focus(); //상세입력 포커싱
                self.close();
            }
        }).open();
    });

    $('input[name=phone_num]').keyup(function(){
	    $(this).val( $(this).val().replace(/[^0-9]/g, "").replace(/(^02|^0505|^1[0-9]{3}|^0[0-9]{2})([0-9]+)?([0-9]{4})$/,"$1-$2-$3").replace("--", "-") );
    });
});


function submitMemRegist()
{

    var regexpPhone = /^01(?:0|1|[6-9])-(?:\d{3}|\d{4})-\d{4}$/;    // 온전한 휴대폰 번호
    var regexpPhone2 = /^01(?:0|1|[6-9])-(?:.{3}|.{4})-.{4}$/;      // 01x로 시작하는지, 하이픈이 들어갔는지 확인용
    var regexpPhone3 = /^010-(?:.{4})-.{4}$/;                       // 010으로 시작하는데 두번쨰가 4자린지 확인용
    var regexpText = /^[0-9|\^-]*$/                                 // 숫자랑 하이픈 이외의 것이 들어갔는지 확인용


    // 휴대폰 번호 정규식 체크
    var phoneVal = $("input[name=phone_num]").val();
    if(phoneVal != '')
    {
        if(phoneVal.match(regexpPhone2) == null || phoneVal.match(regexpPhone2) == ''){
            alert("휴대폰 번호 형식이 올바르지 않습니다.");
            $("input[name=phone_num]").focus();
            return false;
        }else {
            if(!regexpText.test(phoneVal)) {
                alert("숫자만 입력 가능합니다.");
                $("input[name=phone_num]").focus();
                return false;
            }
            if(phoneVal.match(regexpPhone3) == null || phoneVal.match(regexpPhone3) == '') {
                alert("휴대폰 번호 형식이 올바르지 않습니다.");
                $("input[name=phone_num]").focus();
                return false;
            }
        }
    }

    if(phoneVal == '')
    {
      alert("휴대폰 번호를 입력해주세요.");
    }

    //
    var userId_Val = $("input[name=user_id]").val();
    var userName_Val = $("input[name=user_name]").val();
    var userPw_Val = $("input[name=password]").val();
    var userAddress_Val = $("input[name=address_detail]").val();

    if(userId_Val == '')
    {
      alert("아이디를 입력해주세요.");
    }

    if(userName_Val == '')
    {
      alert("이름을 입력해주세요.");
    }
    if(userPw_Val == '')
    {
      alert("비밀번호를 입력해주세요.");
    }
    if(userAddress_Val == '')
    {
       alert("주소를 입력해주세요.");
    }

    phoneVal = phoneVal.replace(/-/gi,'');
    $("#memRegist").submit();
}

function submitMemUpdate()
{

    var regexpPhone = /^01(?:0|1|[6-9])-(?:\d{3}|\d{4})-\d{4}$/;    // 온전한 휴대폰 번호
    var regexpPhone2 = /^01(?:0|1|[6-9])-(?:.{3}|.{4})-.{4}$/;      // 01x로 시작하는지, 하이픈이 들어갔는지 확인용
    var regexpPhone3 = /^010-(?:.{4})-.{4}$/;                       // 010으로 시작하는데 두번쨰가 4자린지 확인용
    var regexpText = /^[0-9|\^-]*$/                                 // 숫자랑 하이픈 이외의 것이 들어갔는지 확인용


    // 휴대폰 번호 정규식 체크
    var phoneVal = $("input[name=phone_num]").val();
    if(phoneVal != '')
    {
        if(phoneVal.match(regexpPhone2) == null || phoneVal.match(regexpPhone2) == ''){
            alert("휴대폰 번호 형식이 올바르지 않습니다.");
            $("input[name=phone_num]").focus();
            return false;
        }else {
            if(!regexpText.test(phoneVal)) {
                alert("숫자만 입력 가능합니다.");
                $("input[name=phone_num]").focus();
                return false;
            }
            if(phoneVal.match(regexpPhone3) == null || phoneVal.match(regexpPhone3) == '') {
                alert("휴대폰 번호 형식이 올바르지 않습니다.");
                $("input[name=phone_num]").focus();
                return false;
            }
        }
    }

    if(phoneVal == '')
    {
      alert("휴대폰 번호를 입력해주세요.");
    }

    //
    var userId_Val = $("input[name=user_id]").val();
    var userName_Val = $("input[name=user_name]").val();
    var userPw_Val = $("input[name=password]").val();
    var userAddress_Val = $("input[name=address_detail]").val();

    if(userId_Val == '')
    {
      alert("아이디를 입력해주세요.");
    }

    if(userName_Val == '')
    {
      alert("이름을 입력해주세요.");
    }
    if(userPw_Val == '')
    {
      alert("비밀번호를 입력해주세요.");
    }
    if(userAddress_Val == '')
    {
       alert("주소를 입력해주세요.");
    }

    phoneVal = phoneVal.replace(/-/gi,'');
    $("#memUpdate").submit();
}