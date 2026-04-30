
let employees;
function init(){
  $.ajaxSetup({async: false});
  
  let link = "https://raw.githubusercontent.com/PorchettaEP/JSONFILES/refs/heads/main";
  let route= "/employees"
  employees = $.getJSON(link+route).responseJSON;

  generateCards(employees);

  
}

function generateCards(employees){

  let mainpanel = document.getElementById("centerpanel");
  bld = ""
  employees.forEach(employees => {
    bld += `
    <div class="card">
    <h1>Employee ID: ${employees.EmployeeId}</h1>
    <p>First Name: ${employees.FirstName}</p>
    <p>Last Name: ${employees.LastName}</p>
    <p>City: ${employees.City}</p>
    <img src="./cities/${employees.City}.PNG" />
    </div>
    `
  });
  console.log(bld)

  mainpanel.innerHTML = bld
  
}

function filter(){
  let city = document.getElementById("city").value;
  console.log(city);

  let newEmployees = []; //create a list of songs searched for
  
  for(let i=0; i<employees.length;i++){
    let employee = employees[i] //get each sog
    //make sure the list is no
    if( employee.City == city ) {
          //add to the new list
          newEmployees.push(employee);
       }
  }
  console.log(`number found ${newEmployees.length}`)
  generateCards(newEmployees);
  
}