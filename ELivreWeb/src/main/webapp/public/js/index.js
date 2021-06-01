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
