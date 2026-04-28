
let employees;

function init(){
  $.ajaxSetup({async: false});
  let link = "https://raw.githubusercontent.com/PorchettaEP/JSONFILES/refs/heads/main";
  let route= "/employees"
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
    build += `<h3> Customer ID : ${employee.EmployeeId}</h3>`;
    build += `<div> First Name : ${employee.FirstName}</div>`;
    build += `<div> Last Name : ${employee.LastName}</div>`;
    build += `<p> City : ${employee.City}</p>`;
    build += `<hr>`;
    build += `<img src=¨./cities/${employee.City}.PNG¨ />`
    build += `</div>`;
  
  }

  output.innerHTML = build;
  
}

function filter() {

  query = document.getElementById("employeeSearch").value;
  newEmployees = [];
  employees.forEach(employee => {
    if (employee.City == query) {
      newEmployees.push(employee);
    }
  });

  generateCards(newEmployees);
}

