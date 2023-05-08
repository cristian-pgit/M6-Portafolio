function inscribeme() {
    swal.fire("VRol", "Inscrit@ Compi", "success", {button: "Gracias!"});
 
}

function averigua() {
    Swal.fire(
	  'VRol Informa:',
	  'Te Contactaremos!',
	  'success'
	)
 
}

$(document).ready(function() {
    $(".close").click(function() {
        $(".alert").alert("close");
    });
});

/*function confirmDelete() {
  return Swal.fire({
    title: 'Estas Seguro?',
    text: "No seras capas de revertir esto!",
    icon: 'warning',
    showCancelButton: true,
    confirmButtonColor: '#3085d6',
    cancelButtonColor: '#d33',
    confirmButtonText: 'Si, borralo!'
  }).then((result) => {
    if (result.isConfirmed) {
      Swal.fire(
        'Eliminado!',
        'El Jugador Inscrito ha sido Eliminado',
        'success'
      );
      return true;
    } else if (result.dismiss === Swal.DismissReason.cancel) {
      return false;
    }
  });
}*/










/*$(document).ready(function() {
	displayFormFields();
});

try {
  function displayFormFields() {
    var perfil = document.getElementById("perfilse").value;
    console.log(perfil);
    if (perfil == "Adm") {
      document.getElementById("formulario-adm").classList.remove("d-none");
      document.getElementById("formulario-dm").classList.add("d-none");
      document.getElementById("formulario-vis").classList.add("d-none");
    } else if (perfil == "master") {
      document.getElementById("formulario-adm").classList.add("d-none");
      document.getElementById("formulario-dm").classList.remove("d-none");
      document.getElementById("formulario-vis").classList.add("d-none");
    } else if (perfil == null || perfil == "") {
      document.getElementById("formulario-adm").classList.add("d-none");
      document.getElementById("formulario-dm").classList.add("d-none");
      document.getElementById("formulario-vis").classList.remove("d-none");
    }
  }
} catch (error) {
  console.log(error);
}*/