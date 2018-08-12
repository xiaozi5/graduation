
$(function(){
    var user=JSON.stringify(sessionStorage.getItem("user")) ;
    alert(1);
})


function initLeftNav(user) {
    $.ajax({
        type: "POST",

        url: common.getPath+"/authority/getLeftNav",
        data: user,
        dataType: "application/json",
        success: function (data) {
            console(data);
        }
    });
}