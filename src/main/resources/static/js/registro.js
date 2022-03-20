const validateForm = async () => {

  let firstName = $("#inputNombre").val();
  if (!firstName) {
    alert("Por favor introduzca un nombre válido.");
    return false;
  }

  let lastName = $("#inputApellido").val();
  if (!lastName) {
    alert("Por favor introduzca un apellido válido.");
    return false;
  }

  let email = $("#inputEmail").val();
  if (!email) {
    alert("Por favor introduzca un correo electrónico válido.");
    return false;
  }

  let user = $("#inputUser").val();
    if (!user) {
      alert("Por favor introduzca un nombre de usuario válido.");
      return false;
    }

  let pass1 = $("#inputPassword1").val();
  if (!pass1) {
    alert("Por favor introduzca una direccion válida.");
    return false;
  }

  let pass2 = $("#inputPassword2").val();
    if (!pass2) {
      alert("Por favor introduzca una direccion válida.");
      return false;
    }

    if(pass1 != pass2) {
        alert("Las contraseñas no coinciden");
        return false;
    }

  let newsletter = "null"
  let newsletterCheck = $("#adsCheck").val();
  if(newsletterCheck) {
    newsletter = "true";
  } else {
    newsletter = "false";
  }

  let request = await fetch("/usuario", {
    method: "POST",
    credentials: "same-origin",
    headers: {
      "Content-type": "application/json"
    },
    body: JSON.stringify({
      firstname: firstName,
      lastname: lastName,
      email: email,
      user: user,
      password: pass1,
      newsletter: newsletter
    }),
    dataType: "json",
  });

  if (request.ok) {
    alert("Datos enviados");
    console.log(request.json());
  }
}

$("#btn-submit").on("click", () => {
  event.preventDefault();
  validateForm();
});