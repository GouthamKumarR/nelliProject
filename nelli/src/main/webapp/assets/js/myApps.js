 $( "#search_class" ).autocomplete({
      
      source: function(request, response) {
        $.ajax({
            url: "https://nellaipages.com/home/classifieds_list",
            dataType: "json",
            data: {
                term : request.term,
             locations: $("#city").val(),
             services: $("#services").val(),
            },
            success: function(data) {
                response(data);
            }
        });
    },
      minLength: 1,
      select: function( event, ui ) {
        //log( "Selected: " + ui.item.value + " aka " + ui.item.id );
        $('#search-name').val(ui.item.id);
        $('#form-submit').submit();
      }
    });