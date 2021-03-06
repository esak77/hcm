
function find_addr() {
	 	var width = 500;
	 	var height = 600;
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.
            	
                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var fullAddr = ''; // 최종 주소 변수
                var extraAddr = ''; // 조합형 주소 변수

                // 사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    fullAddr = data.roadAddress;

                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    fullAddr = data.jibunAddress;
                }

                // 사용자가 선택한 주소가 도로명 타입일때 조합한다.
                if(data.userSelectedType === 'R'){
                    //법정동명이 있을 경우 추가한다.
                    if(data.bname !== ''){
                        extraAddr += data.bname;
                    }
                    // 건물명이 있을 경우 추가한다.
                    if(data.buildingName !== ''){
                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                    }
                    // 조합형주소의 유무에 따라 양쪽에 괄호를 추가하여 최종 주소를 만든다.
                    fullAddr += (extraAddr !== '' ? ' ('+ extraAddr +')' : '');
                }
            
            	// 우편번호와 주소 정보를 해당 필드에 넣는다.
            	$("#postcode").val(data.zonecode);
            	$("#addr1").val(fullAddr);
            	
                // 커서를 상세주소 필드로 이동한다.
                $('#addr2').focus();
            }
        }).open({
            left: (window.screen.width / 2) - (width / 2),
            top: (window.screen.height / 2) - (height / 2)
        });
    }
 
 
 $(function(){
     
	var now = new Date();
	$(".today").text("Today "+now.getFullYear()+" - "+(now.getMonth()+1 < 10? "0"+(now.getMonth()+1):(now.getMonth()+1))+" - "+(now.getDate() < 10? "0"+now.getDate():now.getDate()));
	 
	var d_day_length = $(".d_day").length;
	
	for(var i=1; i<=d_day_length; i++){
		var idx = $(".d_day_"+i).text();
		if(idx!="대기중"){
			$(".d_day_"+i).text(idx+" 일");
				if(idx <= 100){
					$(".d_day_"+i).css("color","red");
				}
		}
		
		$(".p_f_day_"+i).text($(".p_f_day_"+i).text().substring(0,4)+"-"+$(".p_f_day_"+i).text().substring(4,6)+"-"+$(".p_f_day_"+i).text().substring(6,8));
	}
	
	
	$(".detail .info_wrap input, .detail .info_box input").attr("readonly",true); //인적사항
	$(".detail #sex").attr("disabled", "disabled"); //selectbox
	$(".detail .career_box input").attr("readonly",true); //경력사항
	
	$(".detail #find, .detail .del_column, .detail .add_column, .detail .del_file, .detail .add_file, .detail #file, .detail #btn_submit").css("display","none");
	
	$(".check_all").on("click",function(){
		$("input[type=checkbox]").prop("checked", true);
	})
	$(".check_release").on("click",function(){
		$("input[type=checkbox]").prop("checked", false);
	})
	
 })
 
 
 function back(){
	 $(location).attr('href','/');
 }
 function insert(){
	 $(location).attr('href','/insert');
 } 
 
 function check(){
	 if($("#phone").val()==""){
		 alert("연락처를 입력하세요.");
		 $("#phone").focus();
	 }else if($("#pro_term1").val()=="" || $("#pro_term2").val()==""){
		 alert("프로젝트 기간을 입력하세요.");
		 if($("#pro_term1").val()==""){
			 $("#pro_term1").focus();
		 }else{
			 $("#pro_term2").focus();
		 }
	 }else{
		 var result = txtFieldCheck() == true ? true : false;
		 console.log(result);
	 }
 }
 
 function onlyNumber(obj) {
    $(obj).keyup(function(){
         $(this).val($(this).val().replace(/[^0-9]/g,""));
    }); 
}
 
function add_column(){
	var html = "<tr>";
    html += "<td><input type='text' id='pro_tit' name='pro_tit' placeholder='프로젝트 명'></td>";
    html += "<td><input type='text' id='pro_detail' name='pro_detail' placeholder='상세기술'></td>";
    html += "<td><input type='text' id='pro_term1' name='pro_term1' placeholder='시작 기간'></td>";
    html += "<td><input type='text' id='pro_term2' name='pro_term2' placeholder='종료 기간'></td>";
    html += "<td><input type='text' id='pro_part' name='pro_part' placeholder='역할'></td>";
    html += "<td><input type='text' id='pro_reference' name='pro_reference' placeholder='발주처'></td>";
    html += "<td><input type='text' id='pro_technic' name='pro_technic' placeholder='기술'></td></tr>";
    $(".career_box table tbody").append(html);
}
 
function del_column(){
	 var length = $(".career_box tbody tr").length;
	 if(length == 1){
		 alert("더 이상 삭제할 수 없습니다.");
	 }else{
		 $(".career_box tbody tr:last-child").remove(); 
	 }
}

function del_file(){
	var length = $(".file_box input").length;
	  if(length <= 2){
		  if(length == 1){
			  alert("더 이상 삭제할 수 없습니다.");
		  }else{
			  $(".file_wrap_l input:last-child").remove();
		  }
	  }else{
		 $(".file_wrap_r input:last-child").remove();
	  }
}

function add_file(){
	var length = $(".file_box input").length+1;
	  var html="<input multiple='multiple' type='file' name='file_name'>";
	  
	  if(length <= 2){
		  $(".file_wrap_l").append(html);
	  }else if(length >=2 && length <= 4){
		  $(".file_wrap_r").append(html);
	  }else{
		  alert("더 이상 추가할 수 없습니다.");
	  }
}


function edit(){
	$(".detail .info_wrap input, .detail .info_box input").attr("readonly",false); // 인적사항 활성화
	$(".detail #sex").removeAttr("disabled"); // selectbox활성화
	$(".detail .career_box input").attr("readonly",false); //경력사항 활성화
	$(".detail #find, .detail .del_column, .detail .add_column, .detail .del_file, .detail .add_file, .detail #file, .detail #btn_submit").css("display","");
	$(".detail #btn_edit").hide();
}
 
function txtFieldCheck(){
	// form안의 모든 text type 조회
	var txtEle = $("#hcm input[type=text]");

	for(var i = 0; i < txtEle.length; i ++){

		if("" == $(txtEle[i]).val() || null == $(txtEle[i]).val()){
			$(txtEle[i]).val(" ");
			$("#hcm").submit();
			return true;
		}
	}
}



