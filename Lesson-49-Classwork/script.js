
let employees;
async function init(){
  
  let link = "https://sturdy-system-7vv7qq955gqrfpvwr-8300.app.github.dev";
  let route= "/employees"
  info = await fetch(link+route);
  employees = await info.json();

  let output = ""
  let build ="";

   

  


}