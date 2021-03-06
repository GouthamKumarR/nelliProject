$(function() {
	// for handling CSRF token
	var token = $('meta[name="_csrf"]').attr('content');
	var header = $('meta[name="_csrf_header"]').attr('content');

	if ((token != undefined && header != undefined)
			&& (token.length > 0 && header.length > 0)) {
		// set the token header for the ajax request
		$(document).ajaxSend(function(e, xhr, options) {
			xhr.setRequestHeader(header, token);
		});
	}
	// code for jquery dataTable Category
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

										/*
										 * return '<img
										 * src="'+window.contextRoot+'/resources/img/'+
										 * data+'" class="dataTableImg"/>';
										 */
										return '<img src="' + data
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
										/*
										 * str += '<a href="'+
										 * window.contextRoot+ '/show/'+ data+
										 * '/product" class="btn btn-primary"><span
										 * class="glyphicon glyphicon-eye-open"></span></a>
										 * &#160;';
										 */
										str += '<a href="'
												+ window.contextRoot
												+ '/admin/addCategory/'
												+ data
												+ '"><i class="fa fa-edit "></i></a>';
										str += '||';
										str += '<a href="'
												+ window.contextRoot
												+ '/admin/deleteCategory/'
												+ data
												+ '"><i class="fa fa-trash "></i></a>';

										return str;
									}

								} ]
					});

	// code for jquery dataTable Client
	var jsonUrl1 = '';
	jsonUrl1 = window.contextRoot + '/json/data/all/client';

	$('#clientdatatable').DataTable(
					{

						lengthMenu : [
								[ 3, 5, 10, -1 ],
								[ '3 Records', '5 Records', '10 Records', 'ALL' ] ],
						pageLength : 5,
						ajax : {
							url : jsonUrl1,
							dataSrc : ''
						},
						columns : [

								{
									data : 'name'
								},
								{
									data : 'imgUrl',
									bSortable : false,
									mRender : function(data, type, row) {

										return '<img src="' + data
												+ '" class="dataTableImg"/>';

									}
								},
								{
									data : 'details'
								},
								{
									data : 'address'
								},
								{
									data : 'mobile'
								},
								{
									data : 'webSite'
								},
								{
									data : 'status',
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
										/*
										 * str += '<a href="'+
										 * window.contextRoot+ '/show/'+ data+
										 * '/product" class="btn btn-primary"><span
										 * class="glyphicon glyphicon-eye-open"></span></a>
										 * &#160;';
										 */
										str += '<a href="'
												+ window.contextRoot
												+ '/admin/addClient/'
												+ data
												+ '"><i class="fa fa-edit "></i></a>';
										str += '||';
										str += '<a href="'
												+ window.contextRoot
												+ '/admin/deleteClient/'
												+ data
												+ '"><i class="fa fa-trash "></i></a>';

										return str;
									}

								} ]
					});

	// code for jquery dataTable offers
	var jsonUrl2 = '';
	jsonUrl2 = window.contextRoot + '/json/data/all/offers';

	$('#offerdatatable').DataTable(
					{

						lengthMenu : [
								[ 3, 5, 10, -1 ],
								[ '3 Records', '5 Records', '10 Records', 'ALL' ] ],
						pageLength : 5,
						ajax : {
							url : jsonUrl2,
							dataSrc : ''
						},
						columns : [

								{
									data : 'content'
								},
								{
									data : 'offImageUrl',
									bSortable : false,
									mRender : function(data, type, row) {
										return '<img src="' + data
												+ '" class="dataTableImg"/>';

									}
								},
								{
									data : 'startDate'
								},
								{
									data : 'endDate'
								},
								{
									data : 'status',
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
										str += '<a href="'
												+ window.contextRoot
												+ '/admin/addOffers/'
												+ data
												+ '"><i class="fa fa-edit "></i></a>';
										str += '||';
										str += '<a href="'
												+ window.contextRoot
												+ '/admin/deleteOffers/'
												+ data
												+ '"><i class="fa fa-trash "></i></a>';

										return str;
									}

								} ]
					});

});
