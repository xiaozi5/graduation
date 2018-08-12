
$(function(){
    $("#firstPage").panel('open');
})

function inituser() {
    var user = { "id": 1 }
    sessionStorage.setItem("user", JSON.stringify(user))
}