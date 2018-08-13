$(function() {
    var user = JSON.parse(sessionStorage.getItem("user"));
    initLeftNav(user);
})


function initLeftNav(user) {
    $.ajax({
        type: "POST",
        url: common.getPath() + "/authority/getLeftNav",
        data: user,
        dataType: "application/json",
        success: function(data) {
            var ddata = data.data;
            for (var i = 0; i < ddata.length; i++) {
                var contents = '<ul>';
                for (var j = 0; j < ddata[i].authorityList.length; j++) {
                    contents += ('<li><a href=' + ddata[i].authorityList[j].authorityUrl + '>' + ddata[i].authorityList[j].authorityName + '</a></li>');
                }
                contents + '</ul>';
                $("#leftNav").accordion('add', { title: ddata[i].authorityGroupName, content: contents, selected: false })
            }
        }
    });
}