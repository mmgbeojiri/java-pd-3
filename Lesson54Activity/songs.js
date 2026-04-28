
let employees;

function init(){
  $.ajaxSetup({async: false});
  let link = "https://raw.githubusercontent.com/PorchettaEP/JSONFILES/refs/heads/main";
  let route= "/songs"
  employees = $.getJSON(link+route).responseJSON;

  console.log(employees)

  generateCards(employees);

  
}

function generateCards(employees){

  let output = document.getElementById("output");
  let build ="";

   
  for(let i=0; i<employees.length; i++){
    let employee = employees[i]
    
    build += `<div class="card" >`
    build += `<h3> Song Name : ${employee.songName}</h3>`;
    build += `<div> Artist Name : ${employee.artistName}</div>`;
    build += `<div> Album Name : ${employee.albumName}</div>`;
    
    build += `</div>`;
  
  }

  output.innerHTML = build;
  
}

function filter() {

  query = document.getElementById("employeeSearch").value;
  newEmployees = [];
  employees.forEach(employee => {
    if (employee.songName == query) {
      newEmployees.push(employee);
    }
  });

  generateCards(newEmployees);
}

