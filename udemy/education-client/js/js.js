    var allstudents;
function getstudents(){
    const xhttp=new XMLHttpRequest(); //obyekt yradir
    function myfunction(){  //funksiya teyin olunur
    console.log(this.responseText) //system.out.println in js de alternativi
    const responseText = this.responseText;
    const responseArr = JSON.parse(this.responseText).obj;
    allstudents=responseArr;
    var tr = document.getElementById("tbl-students-body-tr").innerHTML;
    var tblbody="";
    for(var i=0;i<responseArr.length;i++){
    var student=responseArr[i];
    tblbody+=tr
    .replaceAll(":id",student.id)
        .replaceAll(":index",i)
    .replace(":name",student.name)
    .replace(":surname",student.surname)
    .replace(":age",student.age)
    .replace(":email",student.email)
    .replace(":university",student.university.name);
}
    document.getElementById("tbl-students-body").innerHTML= tblbody;
}
    xhttp.onload=myfunction;
    xhttp.open("GET","http://localhost:9091/education/students?"+"name="+val("name")+"&"+"surname="+val("surname")+"&"+"age="+val("age")+"&"+"email="+val("email")+"&"+"university_id="+val("university_id"));
    xhttp.send();}

    function selectforupdate(index){
    var selectedstudent=allstudents[index];
    document.getElementById("update_name").value=selectedstudent.name;
        document.getElementById("update_surname").value=selectedstudent.surname;
        document.getElementById("update_age").value=selectedstudent.age;
        document.getElementById("update_email").value=selectedstudent.email;
        document.getElementById("update_university_id").value=selectedstudent.university.id;
        selectedId=selectedstudent.id;
    }

    function getuniversities(){
        const xhttp=new XMLHttpRequest(); //obyekt yradir
        function myfunction(){  //funksiya teyin olunur
            console.log(this.responseText) //system.out.println in js de alternativi
            const responseArr = JSON.parse(this.responseText);
            var optionsHtml='<option value=""></option>';
            for(var i=0;i<responseArr.length;i++){
                var university=responseArr[i];
optionsHtml+='<option value="'+university.id+'">'+university.name+'</option>'
            }
            document.getElementById("university_id").innerHTML=optionsHtml;
            document.getElementById("create_university_id").innerHTML=optionsHtml;
            document.getElementById("update_university_id").innerHTML=optionsHtml;
        }
        xhttp.onload=myfunction;
        xhttp.open("GET","http://localhost:9091/education/universities");
      xhttp.withCredentials=true; //autorization header,content type vs.credentialslari brauzerden servere gondermek ucun icaze
      xhttp.setRequestHeader("Autorization","Bearer <artoken>");
        xhttp.send();
    }
function val(elementid){
    var value=document.getElementById(elementid).value;
    return value!=null&&value!=="undefined"?value:'';
}
var selectedId;
function select(id){
    selectedId=id;
}
function deletestudent(id){
    const xhttp=new XMLHttpRequest();
    xhttp.onload=function()
    {
        if(xhttp.readyState==4&&xhttp.status==200){
            getstudents();
        }
    }
    xhttp.open("DELETE","http://localhost:9091/education/students?id="+id);
  xhttp.withCredentials=true; //autorization header,content type vs.credentialslari brauzerden servere gondermek ucun icaze
  xhttp.setRequestHeader("Autorization","Bearer <>");
    xhttp.send();
}
    function updatestudents(){
        const xhttp=new XMLHttpRequest();
        xhttp.onload=function()
        {
            if(xhttp.readyState==4&&xhttp.status==200){
                getstudents();
            }
        }
        var student={
            id:selectedId,
        name:document.getElementById("update_name").value,
        surname:document.getElementById("update_surname").value,
        age:document.getElementById("update_age").value,
        email:document.getElementById("update_email").value,
        university:{id: document.getElementById("update_university_id").value}
         };
        xhttp.open("PUT","http://localhost:9091/education/students");
      xhttp.withCredentials=true; //autorization header,content type vs.credentialslari brauzerden servere gondermek ucun icaze
      xhttp.setRequestHeader("Content-Type","application/json");
      xhttp.setRequestHeader("Autorization","Bearer <>");
        xhttp.send(JSON.stringify(student));
    }
    function insertstudents(){
        const xhttp=new XMLHttpRequest();
        xhttp.onload=function()
        {
            if(xhttp.readyState==4&&xhttp.status==200){
                getstudents();
            }
        }
        var student={
            name:document.getElementById("create_name").value,
            surname:document.getElementById("create_surname").value,
            age:document.getElementById("create_age").value,
            email:document.getElementById("create_email").value,
            university:{id: document.getElementById("create_university_id").value}
        };
        xhttp.open("POST","http://localhost:9091/education/students",true);
        xhttp.withCredentials=true; //autorization header,content type vs.credentialslari brauzerden servere gondermek ucun icaze
        xhttp.setRequestHeader("Content-Type","application/json");
      xhttp.setRequestHeader("Autorization","Bearer <>");
        xhttp.send(JSON.stringify(student));
    }
    window.addEventListener('load',getstudents);
window.addEventListener('load',getuniversities);
