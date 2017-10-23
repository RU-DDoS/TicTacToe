$(function() {
  $(".game-button").click(function() {
    var index = $(this).data("id");
    console.log(index);
    $.ajax({
      url: "/api/click?index=" + index,
      success: function(data) {
        $(".game-button").blur();
        if (data.charAt(0) != "n") {
          $(".game-button--" + index).text(data.charAt(1));
          if (data.charAt(0) == "w") {
            $(".gamebox-winbox").addClass("is-active");
            $(".gamebox-wintext").text(
              "Game Over! " + data.charAt(1) + " wins!"
            );
            $(".game-message").text("");
          } else if (data.charAt(0) == "d") {
            $(".gamebox-winbox").addClass("is-active");
            $(".gamebox-wintext").text("Draw!");
            $(".game-message").text("");
          } else {
            $(".game-message").text(data.charAt(1) + " clicked " + index);
          }
        }
      }
    });
  });

  $(".winbox-button").click(function() {
    $.ajax({
      url: "/api/newgame",
      success: function(data) {
        $(".gamebox-winbox").removeClass("is-active");
        $(".game-button").text("");
        $(".game-message").text("");
      }
    });
  });
});
