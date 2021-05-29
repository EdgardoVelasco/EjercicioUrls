listaUrls=["file:///C:/Users/user1/Documents/arch1.jpg",
"file:///C:/Users/user1/Documents/arch2.jpg",
"https://host.mirepositorio.es/arch4.jpg",
"https://host.mirepositorio.es/arch5.jpg",
"https://host.mirepositorio.es/arch6.jpg"
]


def validaUrls(urls:list):
    for tmp in urls:
        if tmp.startswith("http") or tmp.startswith("https"):
            print(tmp)

validaUrls(listaUrls)