$(function() {
    inituser();

})

function inituser() {
    var user = { "id": 1 }
    sessionStorage.setItem("user", JSON.stringify(user))
}