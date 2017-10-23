$(function() {
  $(".game-button").click(function() {
    var index = $(this).data("id");
    console.log(index);
    $.ajax({
      url: "/api/click?index=" + index,
      success: function(data) {
        $(".game-button--" + data).text(data);
        $(".game-button").blur();
        $(".game-message").text("Nr. " + data + " was clicked");
        $(".gamebox-winbox").addClass("is-active");
      }
    });
  });
});
