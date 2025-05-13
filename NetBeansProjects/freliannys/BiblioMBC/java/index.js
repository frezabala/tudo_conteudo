const btn = document.getElementById("btn1")
const ctn = document.getElementById("ctn")
const img = true;


function trocarAImagem(){
   if(img){
    img = false
    ctn.style.backgroundImage = "url(https://media.giphy.com/media/3ohhwfAa9rbXaZe86c/giphy.gif?cid=ecf05e47dgvay6am96jnlxxgufzhatr3eerke7cyf5mewygw&ep=v1_gifs_related&rid=giphy.gif&ct=g)"
   }else{
    img = true
    ctn.style.backgroundImage = "url(https://media1.giphy.com/media/v1.Y2lkPTc5MGI3NjExOW9sbnZrejNoMHJ5ZWR4cTQ0Y3V5bjk4czBmdTF0MmhvNWRub2s1OSZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/tHIRLHtNwxpjIFqPdV/giphy.gif)"

   }
  

}
btn.addEventListener("clink", trocarAImagem)

function trocartexto(){}