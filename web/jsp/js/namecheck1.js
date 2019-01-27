var script=document.createElement("script");
script.type="text/javascript";
script.src="/jsp/js/jquery-1.11.0.js";
document.getElementsByTagName('head')[0].appendChild(script);

function  ajaxFunction(){
    var xmlHttp;
    try{ // Firefox, Opera 8.0+, Safari
        xmlHttp=new XMLHttpRequest();
    }
    catch (e){
        try{// Internet Explorer
            xmlHttp=new ActiveXObject("Msxml2.XMLHTTP");
        }
        catch (e){
            try{
                xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
            }
            catch (e){}
        }
    }

    return xmlHttp;
}


function checkNameExist() {
    var eleName = document.getElementById("username")


    checkNameExistByPost(eleName.value)

}

function checkNameExistByGet(username) {
    $.get("/userNameCheckServlet?name="+username, function(data,status ) {
                if (data == '1'){
                    $("#td_name_hint").html("<p style='color: red'>用户名已使用</p>")

                }else {
                    $("#td_name_hint").html("<p style='color: green'>用户名可以用</p>")
                }
    })

}

function checkNameExistByPost(username) {
    $.post("/userNameCheckServlet",
        {
        "name":username
    },function(data ,status) {
        console.log(status)
            if (data == '1'){
                $("#td_name_hint").html("<p style='color: red'>用户名已使用</p>")

            }else {
                $("#td_name_hint").html("<p style='color: green'>用户名可以用</p>")
            }
    })

}