
let employees;

function init(){
  $.ajaxSetup({async: false});
  let link = "https://raw.githubusercontent.com/PorchettaEP/JSONFILES/refs/heads/main";
  let route= "/customers"
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
    build += `<h3> Customer ID : ${employee.CustomerId}</h3>`;
    build += `<div> First Name : ${employee.FirstName}</div>`;
    build += `<div> Last Name : ${employee.LastName}</div>`;
    build += `<p> Country : ${employee.Country}</p>`;
    build += `<hr>`;
    build += `<img src=¨./countries/${employee.Country}.PNG¨ />`
    build += `</div>`;
  
  }

  output.innerHTML = build;
  
}

function filter() {

  query = document.getElementById("employeeSearch").value;
  newEmployees = [];
  employees.forEach(employee => {
    if (employee.Country == query) {
      newEmployees.push(employee);
    }
  });

  generateCards(newEmployees);
}

