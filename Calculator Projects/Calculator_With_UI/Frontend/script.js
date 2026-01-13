async function calculate() {

    const a = document.getElementById("a").value;
    const b = document.getElementById("b").value;
    const operation = document.getElementById("operation").value;

    const response = await fetch("http://localhost:8080/calculate", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            a: Number(a),
            b: Number(b),
            operation: operation
        })
    });

    const data = await response.json();
    document.getElementById("result").innerText = data.result;
}
