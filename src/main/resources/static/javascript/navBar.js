function loadNavigationBar(pageName) {
    fetch('/path/to/nav.html')
        .then(response => response.text())
        .then(html => {
            document.getElementById('nav-placeholder').innerHTML = html;
            setUserName();
            toggleLogoutDropdown(pageName);
        });
}

function setUserName() {
    // Get the element with id "userName"
    var userNameElement = document.getElementById('userName');

    // Set the text content to WHATEVER U WANT
    userNameElement.textContent = 'John Doe';
}
function toggleLogoutDropdown(pageName) {
    var logoutDropdown = document.getElementById('logoutDropdown');
    if (pageName === 'login') {
        logoutDropdown.style.display = 'none'; // Hide the logout dropdown

    } else {
        logoutDropdown.style.display = 'block'; // Show the logout dropdown
    }
}

// Call the function to load the nav-bar when the page is loaded
window.addEventListener('DOMContentLoaded', function() {
    var pageName = '';
    loadNavigationBar(pageName);
});



