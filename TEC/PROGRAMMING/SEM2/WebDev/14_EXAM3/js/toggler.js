$(document).ready(function () {
    $("#menu").on("click", function () {
        $(".mobile-menu").toggle();
    }
    );

    $("#flight-type").on("click", function () {
        $("#tipo-de-vuelo").toggle();
    }
    );

    $(".tipo-box").on("click", function () {
        $("#flight-type-text").text($(this).text());
        $("#tipo-de-vuelo").toggle();
        $(this).addClass("selected-box");
    }
    );



    $("#passengers").on("click", function () {
        $("#pasajeros").toggle();
    }
    );
    $(".adultsmore").on("click", function () {
        var current = $("#total-adultos").text();
        if (current != 9) {
            var toto = $("#tot-pas").text();
            $("#total-adultos").text(++current);
            $("#tot-pas").text(++toto)
        }
    }
    );
    $(".adultsless").on("click", function () {
        var current = $("#total-adultos").text();
        if (current != 0) {
            var toto = $("#tot-pas").text();
            $("#total-adultos").text(--current);
            $("#tot-pas").text(--toto)
        }
    }
    );

    $(".kidsmore").on("click", function () {
        var current = $("#total-ninos").text();
        if (current != 9) {
            var toto = $("#tot-pas").text();
            $("#total-ninos").text(++current);
            $("#tot-pas").text(++toto)
        }
    }
    );
    $(".kidsless").on("click", function () {
        var current = $("#total-ninos").text();
        if (current != 0) {
            var toto = $("#tot-pas").text();
            $("#total-ninos").text(--current);
            $("#tot-pas").text(--toto)
        }
    }
    );
    $(".infantsmore").on("click", function () {
        var current = $("#total-infantes").text();
        if (current != 9) {
            var toto = $("#tot-pas").text();
            $("#total-infantes").text(++current);
            $("#tot-pas").text(++toto)
        }
    }
    );
    $(".infantsless").on("click", function () {
        var current = $("#total-infants").text();
        if (current != 0) {
            var toto = $("#tot-infants").text();
            $("#total-kids").text(--current);
            $("#tot-pas").text(--toto)
        }
    }
    );
});