console.log("Verificação de Primo.");

function verificarPrimo(n) {

    let ehPrimo = true;

    if (n <= 1) {

        ehPrimo = false;    

    } else {

        for (let i = 2; i <= n / 2; i++) {

            if (n % i === 0) {

                ehPrimo = false;
                break;
            }
        }
    }

    return ehPrimo;
}


document.getElementById("verificar").addEventListener("click", function() {

    let n = parseInt(document.getElementById("numero").value);

    let resultado = verificarPrimo(n);

    if (resultado) {

        document.getElementById("resultado").textContent =
            "O número " + n + " é primo.";

    } else {

        document.getElementById("resultado").textContent =
            "O número " + n + " não é primo.";
    }

});