// --------------------------
// Semana 1 
// --------------------------

const shopContent = document.getElementById("shopContent");

let cart =[]; //Este es el carrito

productos.forEach((product) => {
    const content = document.createElement("div");
    content.innerHTML = `
    <img src="${product.img}">
    <h3>"${product.productName}"</h3>    
    <p>"${product.price}"</p>
    `;
    shopContent.append(content);

    // --------------------------
    //      ↧ Semana 2 ↧
    //      Agustin Gomez A.
    // --------------------------

    const buyButton  = document.createElement("button");
    buyButton.innerText ="Comprar";

    content.append(buyButton);

    buyButton.addEventListener("click", () =>{
        cart.push({
            id: product.id,
            productName: product.productName,
            price: product.price,
            img: product.img,
            quanty: product.quanty,
        })
        console.log(cart)
        })

})

