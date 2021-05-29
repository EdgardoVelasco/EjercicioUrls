var lista=["file:///C:/Users/user1/Documents/arch1.jpg",
"file:///C:/Users/user1/Documents/arch2.jpg",
"https://host.mirepositorio.es/arch4.jpg",
"https://host.mirepositorio.es/arch5.jpg",
"https://host.mirepositorio.es/arch6.jpg"
];

function validaUrls(listaE){
    var lista2=[];
     for(const tmp of listaE){
        if(tmp.startsWith("http") ||(tmp.startsWith("https"))){
             console.log(tmp)
        }
     }
}


validaUrls(lista);