
function setErrorValidation(data) {
	
	
	
    $(".text-error").remove();
    $.each(data, function (key, value) {
      const query = "input[name=" + key + "]";
      const parent = $(query);
      const input = $(query);
     
      parent.parent().after(
        '<small id="error-' +
          key +
          '" class="form-text text-danger text-error mb-0 mb-lg-0">' +
          value +
          "</small>"
      );
      input.on("input", function () {
        $("#error-" + key).remove();
      });
    });
    
    $.each(data, function (key, value) {
      const query = "select[name=" + key + "]";
      const parent = $(query);
      const input = $(query);
      
      
      parent.parent().after(
        '<small id="error-' +
          key +
          '" class="form-text text-danger text-error mb-0 mb-lg-0">' +
          value +
          "</small>"
      );
      input.on("change", function () {
        $("#error-" + key).remove();
      });
    });
}
    