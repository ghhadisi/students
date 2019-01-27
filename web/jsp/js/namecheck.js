
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
    var requset =new XMLHttpRequest();
    requset.open("GET", "/userNameCheckServlet?name="+username,true)
    requset.onreadystatechange=function () {
        if (requset.readyState ==4&& requset.status == 200 ){

            var td = document.getElementById("td_name_hint")
            if (requset.responseText == '1'){
                td.innerHTML = "<p style='color: red'>用户名已使用</p>"

            }else {
                td.innerHTML = "<p style='color: green'>用户名可以用</p>"

            }

        }
    }
    requset.send()

}

function checkNameExistByPost(username) {
    var requset =new XMLHttpRequest();
    requset.open("POST", "/userNameCheckServlet"
        ,true)
    requset.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    requset.onreadystatechange=function () {
        if (requset.readyState ==4&& requset.status == 200 ){

            var td = document.getElementById("td_name_hint")

            if (requset.responseText == '1'){
                td.innerHTML = "<p style='color: red'>用户名已使用</p>"

            }else {
                td.innerHTML = "<p style='color: green'>用户名可以用</p>"

            }
        }
    }
    requset.send("name="+username)

}