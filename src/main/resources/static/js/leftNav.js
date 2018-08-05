$(function(){
    var user=JSON.stringify(sessionStorage.getItem("user")) ;
  
})


function initLeftNav (user){
    $.ajax({
        type: "POST",
        url: common.getPath+"/authority/getLeftNav",
        data: user.id,
        dataType: "application/json",
        success: function (data) {
            console(data);
        }
    });
}