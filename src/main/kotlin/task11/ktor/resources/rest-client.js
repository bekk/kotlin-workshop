function getText(id) {
    return document.getElementById(id).value
}

document.getElementById("request").addEventListener("submit", function (event) {
    event.preventDefault();
    let url = getText("url");
    let method = getText("method");
    let payload = getText("payload");

    console.log({url, method, payload});

    doRequest(url, method, payload)
        .then(response => {
            document.getElementById("responseStatus").innerText = response.status + " " + response.statusText
            return response;
        })
        .then(response => response.text())
        .then(text => {
            console.log({text})
            document.getElementById("responseBody").innerText = text;
        })
        .catch(err => {
            document.getElementById("responseBody").innerText = err;
        })
});

async function doRequest(url, method, payload) {
    let content = {
        method: method,
        body: method === "POST" || method === "PUT" ? payload : undefined,
        headers: {'Content-Type': 'application/json'},
    }

    document.getElementById("requestInfo").innerText = "Request: " + JSON.stringify({url, ...content});

    return await fetch(url, content);
}
