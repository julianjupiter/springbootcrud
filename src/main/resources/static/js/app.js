$(document).ready(function () {
    $("#myModal").modal({
        keyboard: true,
        backdrop: "static",
        show: false
    }).on("show.bs.modal", function (event) {
        var button = $(event.relatedTarget); // button the triggered modal

        if (button.data("action") === "deleteAction") {
            $(this).find(".modal-title").text("Delete Contact");
            var personId = button.data("id"); 
            var lastName = $(event.relatedTarget).closest("tr").find("td:eq(1)").text();
            var firstName = $(event.relatedTarget).closest("tr").find("td:eq(2)").text();
            $(this).find(".modal-body").html($("Are you sure you want to delete this contact?<br /><b>ID: " + personId + "<br>Last Name: " + lastName + "<br>First Name: " + firstName + "</b>"));
            $(this).find(".buttonAction").attr("id", "buttonDeleteContact").text("Delete");
        }
    });
});

