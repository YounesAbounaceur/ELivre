const titreSpans = document.querySelectorAll('h1 span');

window.addEventListener('load', () => {
    const TL = gsap.timeline({paused: true});
    TL.staggerFrom(titreSpans, 1, {top: -75, opacity: 0, ease: "power2.out"}, 0.3)
    TL.play();
})

$(document).on("click", ".browse", function() {
    var file = $(this).parents().find(".file");
    file.trigger("click");
  });
  $('input[type="file"]').change(function(e) {
    var fileName = e.target.files[0].name;
    $("#file").val(fileName);
  
    var reader = new FileReader();
    reader.onload = function(e) {
      document.getElementById("preview").src = e.target.result;
    };
    reader.readAsDataURL(this.files[0]);
  });

$('#myVendeur').on('show.bs.modal', function (event) {
  var button = $(event.relatedTarget) 
  var recipient = button.data('whatever') 
  var info = recipient.split(" ") 
  var modal = $(this)
  modal.find('.modal-body .nom').val(info[0])
  modal.find('.modal-body .prenom').val(info[1])
  modal.find('.modal-body .mail').val(info[2])
  $('#mailbutton').click(function() {
    window.location = "mailto:" + info[2];
  });
})
