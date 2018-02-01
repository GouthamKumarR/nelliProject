$("#search_class").autocomplete({

	source : function(request, response) {
		$.ajax({
			url : "https://nellaipages.com/home/classifieds_list",
			dataType : "json",
			data : {
				term : request.term,
				locations : $("#city").val(),
				services : $("#services").val(),
			},
			success : function(data) {
				response(data);
			}
		});
	},
	minLength : 1,
	select : function(event, ui) {
		//log( "Selected: " + ui.item.value + " aka " + ui.item.id );
		$('#search-name').val(ui.item.id);
		$('#form-submit').submit();
	}
});

$(function() {
	
	
	 /*$("#active").click(function(){
		 alert($("#active").val());
		 
		 
	    });*/
	 
	 
	// code for jquery dataTable
	var jsonUrl = '';
	jsonUrl = window.contextRoot + '/json/data/all/category';

	$('#datatable')
			.DataTable(
					{

						lengthMenu : [
								[ 3, 5, 10, -1 ],
								[ '3 Records', '5 Records', '10 Records', 'ALL' ] ],
						pageLength : 5,
						ajax : {
							url : jsonUrl,
							dataSrc : ''
						},
						columns : [

								{
									data : 'name'
								},
								{
									data : 'imageURL',
									bSortable : false,
									mRender : function(data, type, row) {

										return '<img src="'
												+ window.contextRoot
												+ '/resources/img/' + data
												+ '" class="dataTableImg"/>';

									}
								},
								{
									data : 'description'
								},
								{
									data : 'active',
									mRender : function(data, type, row) {

										if (data) {
											return '<span style="color:blue">Active</span>';
										} else {
											return '<span style="color:red">UnActive</span>';
										}

										return data;

									}
								},
								{
									data : 'id',
									mRender : function(data, type, row) {
										var str = '';
										/*str += '<a href="'+ window.contextRoot+ '/show/'+ data+ '/product" class="btn btn-primary"><span class="glyphicon glyphicon-eye-open"></span></a> &#160;';*/
										str += '<a href="'+ window.contextRoot
											+ '/admin/addCategory/'
											+ data+'"><i class="fa fa-edit "></i></a>';
										str += '||';
										str += '<a href="admin.php?action=delcategory&amp;id=19"><i class="fa fa-trash "></i></a>';

										return str;
									}

								} ]
					});

});
