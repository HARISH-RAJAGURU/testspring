const newrow = document.getElementById("newrow")

// console.log("hello");
let arr = []
axios.get("http://13.233.83.244:8080/get-all")
.then((res) => {
    arr = res.data
    calling()
}

)

function calling(){
arr.forEach((item)=>{
    newrow.innerHTML += `
    <div>
    <h1>${item.name}</h1>
    <h1>${item.email}</h1>
   </div>
   `
})       
}

