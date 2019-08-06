$(document).ready(function () {
    if (store.get("state") == undefined) {
        var megam = ` 
            <h2>Group A</h2>
            <div id="pos-1" class="colombia">
                <span class="flag"></span><span class="name"></span><span class="arrow-down arrow-1"></span><span class="arrow-up arrow-2"></span>
            </div>
            <div id="pos-2" class="poland">
                <span class="flag"></span><span class="name"></span><span class="arrow-down arrow-3"></span><span class="arrow-up arrow-4"></span>
            </div>
            <div id="pos-3" class="senegal">
                <span class="flag"></span><span class="name"></span><span class="arrow-down arrow-5"></span><span class="arrow-up arrow-6"></span>
            </div>
            <div id="pos-4" class="tahiti">
                <span class="flag"></span><span class="name"></span><span class="arrow-down arrow-7"></span><span class="arrow-up arrow-8"></span>
            </div>
        `;
        store.set("state", megam);
        loader();
    }
    else {
        loader();
    }


    function saver() {
        console.log($(".group").html())
        store.set("state", $(".group").html());
    }

    function loader() {
        $(".group").html(store.get("state"))
    }
    function wiper() {
        $(".group").html("")
    }

    $(".arrow-1").click(function () {
        console.log("Clicked one");
        var cls1 = $("#pos-1").attr("class");
        var cls2 = $("#pos-2").attr("class");
        $("#pos-1").attr("class", cls2);
        $("#pos-2").attr("class", cls1);
        saver();
    });
    $(".arrow-3").click(function () {
        var cls1 = $("#pos-2").attr("class");
        var cls2 = $("#pos-3").attr("class");
        $("#pos-2").attr("class", cls2);
        $("#pos-3").attr("class", cls1);
        saver();

    });
    $(".arrow-4").click(function () {
        var cls1 = $("#pos-2").attr("class");
        var cls2 = $("#pos-1").attr("class");
        $("#pos-2").attr("class", cls2);
        $("#pos-1").attr("class", cls1);
        saver();

    });
    $(".arrow-5").click(function () {
        var cls1 = $("#pos-3").attr("class");
        var cls2 = $("#pos-4").attr("class");
        $("#pos-3").attr("class", cls2);
        $("#pos-4").attr("class", cls1);
        saver();

    });
    $(".arrow-6").click(function () {
        var cls1 = $("#pos-3").attr("class");
        var cls2 = $("#pos-2").attr("class");
        $("#pos-3").attr("class", cls2);
        $("#pos-2").attr("class", cls1);
        saver();

    });
    $(".arrow-8").click(function () {
        var cls1 = $("#pos-4").attr("class");
        var cls2 = $("#pos-3").attr("class");
        $("#pos-4").attr("class", cls2);
        $("#pos-3").attr("class", cls1);
        saver();

    });

    //switch classes forht
    // switch classes back

    // function switcher(pos1, pos2){
    //     var cls1 = $("#pos-"+pos1).attr("class");
    //     var cls2 = $("#pos-"+pos2).attr("class");
    //     $("#pos-"+pos1).attr("class", cls2);
    //     $("#pos-"+pos2).attr("class", cls1);
    //     console.log(pos1 + pos2 + cls1 + cls2);
    //     console.log("this");

    // }


});