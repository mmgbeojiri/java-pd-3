
let data;

async function init(){
  let link = "https://sturdy-system-7vv7qq955gqrfpvwr-8080.app.github.dev"
  let route="/songs"
  info = await fetch(link+route);
  data = await info.json();

  //first dump the array to the console and examine 
  //the content
  console.log(data);

}