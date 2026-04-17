
let data,songs;
function init(){
  $.ajaxSetup({async: false});
  
  link =" https://sturdy-system-7vv7qq955gqrfpvwr-8500.app.github.dev";
  route = "/songs";

  bld = ""
  response = fetch(link + route).then(response => response.json()).then(data => {
    console.log(data);
    data.forEach(element => {
      bld += `<div class="card"><h1>${element.Name}</h1></div>`;
    });

    document.getElementById("output").innerHTML = bld;
  });
 
}




