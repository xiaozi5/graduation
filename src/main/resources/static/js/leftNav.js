$(function() {
    var user = JSON.parse(sessionStorage.getItem("user"));
    console.log(user, 123)
    initLeftNav(user);
})


function initLeftNav(user) {
    $.ajax({
        type: "POST",
        url: common.getPath() + "/user/info/" + user.id,
        success: function(data) {
            console.log(data, 321);
        }
    });
}