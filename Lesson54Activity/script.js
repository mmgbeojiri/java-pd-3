
let employees;
function init(){
  $.ajaxSetup({async: false});
  
  let link = "https://raw.githubusercontent.com/PorchettaEP/JSONFILES/refs/heads/main";
  let route= "/genres"
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
    build += `<h3> Genre : ${employee.Name}</h3>`;
    build += `<hr>`;
    build += `</div>`;
  }

  output.innerHTML = build;
  
}

function filter() {
  let link = "https://Lesson48ClassworkDBServer.ernestoporchett.repl.co";
  let route= "/employees"
  employees = $.getJSON(link+route).responseJSON;
  query = document.getElementById("employeeSearch").value;
  newEmployees = [];
  employees.forEach(employee => {
    if (employee.Name == query) {
      newEmployees.push(employee);
    }
  });

  generateCards(newEmployees);
}

