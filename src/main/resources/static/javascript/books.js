/* function search-box() {
    let input = document.getElementById('fas fa-search').value
    input=input.toLowerCase();
    let x = document.getElementsByClassName('book');
      
    for (i = 0; i < x.length; i++) { 
        if (!x[i].innerHTML.toLowerCase().includes(input)) {
            x[i].style.display="none";
        }
        else {
            x[i].style.display="list-item";                 
        }
    }
}