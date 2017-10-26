$(function() {
  $(".game-button").click(function() {
    var index = $(this).data("id");
    // Logs the index of the button clicked
    console.log(index);
    $.ajax({
      url: "/api/click?index=" + index,
      success: function(data) {
        $(".game-button").blur();
        if (data.charAt(0) != "n") {
          $(".game-button--" + index).text(data.charAt(1));
          // Checks if there is a winner
          if (data.charAt(0) == "w") {
            $(".gamebox-winbox").addClass("is-active");
            $(".gamebox-wintext").text(
              "Game Over! " + data.charAt(1) + " wins!"
            );
            $(".game-message").text("");
            // Checks if there is a draw
          } else if (data.charAt(0) == "d") {
            $(".gamebox-winbox").addClass("is-active");
            $(".gamebox-wintext").text("Draw!");
            $(".game-message").text("");
          }
          $(".game-message").text(data.charAt(1) + " clicked " + index);
        }
      }
    });
  });

  // Display for the win/draw-box
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
