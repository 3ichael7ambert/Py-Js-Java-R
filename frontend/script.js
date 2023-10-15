// script.js
document.getElementById('getDataButton').addEventListener('click', getDataFromJava);

function getDataFromJava() {
    fetch('/java-api')
        .then(response => response.json())
        .then(data => {
            document.getElementById('javaResponse').textContent = data.data;
        })
        .catch(error => {
            console.error(error);
        });
}
