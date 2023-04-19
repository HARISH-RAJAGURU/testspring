const form = document.getElementById("form")

form.addEventListener("submit",(e)=>{
    e.preventDefault();

    const name = document.getElementById("name").value

    const email = document.getElementById("email").value

    if(name !== "" && !email !== null){
        const data ={
            name : name,
            email : email
        }

        axios.post("http://localhost:8080/post-data",data)
        .then((res) =>console.log(res.data))
        .catch((err)=>console.log(err))
    }
})

const sub = document.getElementById("submission")

sub.addEventListener("click", (e)=>{
    
    window.location.href = "/show"
})