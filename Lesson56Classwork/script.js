let data,customers;
function init(){
  $.ajaxSetup({async: false});
  
  let link = "https://raw.githubusercontent.com/PorchettaEP/JSONFILES/refs/heads/main";
  let route= "/customers"
  customers = $.getJSON(link+route).responseJSON;

  generateCards(customers)


}

function generateCards(customers){
  let centerpanel = document.getElementById("centerpanel");

  bld = ""
  customers.forEach(customer => {
    bld += `
    <div class="flip-card">
    <div class="flip-front">
    <h1>Customer ID: ${customer.CustomerId}</h1>
    <p>First Name: ${customer.FirstName}</p>
    <p>Last Name: ${customer.LastName}</p>
    <p>Email: ${customer.Email}</p>
    </div>
    <div class="flip-back">
      <p>Country: ${customer.country}</p>
      <img src="./countries/${customer.country}.PNG" />
    </div>
    </div>
    `
  });

  centerpanel.innerHTML = bld;
    

}

function filter(){
  let country = document.getElementById("country").value;
  console.log(country);

  let customerList = []; //create a list of songs searched for
  
  for(let i=0; i<customers.length;i++){
    let customer = customers[i] //get each sog
    //make sure the list is no
    if( customer.Country == country ) {
          //add to the new list
          customerList.push(customer);
       }
  }
  console.log(`number found ${customerList.length}`)
  generateCards(customerList);
  
}