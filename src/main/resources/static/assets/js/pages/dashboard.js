//------------- Dashboard.js -------------//
$(document).ready(function() {
	//get object with colros from plugin and store it.
	var objColors = $('body').data('sprFlat').getColors();
	var colours = {
		white: objColors.white,
		dark: objColors.dark,
		red : objColors.red,
		blue: objColors.blue,
		green : objColors.green,
		yellow: objColors.yellow,
		brown: objColors.brown,
		orange : objColors.orange,
		purple : objColors.purple,
		pink : objColors.pink,
		lime : objColors.lime,
		magenta: objColors.magenta,
		teal: objColors.teal,
		textcolor: '#5a5e63',
		gray: objColors.gray
	}
	//------------- Add carouse to tiles -------------//
	$('.carousel-tile').carousel({
		interval:   6000
	});
 	//generate random number for charts
	randNum = function(){
		return (Math.floor( Math.random()* (1+150-50) ) ) + 80;
	}
	//------------- Earnings chart -------------//
	$(function() {


        $.ajax({
            type: "GET",
            url: "/getweek",
            async:false,
            success: function(data){
                for (var i=0;i<data.data.forecast.length;i++){
                    var week= data.data.forecast[i].date.split('日')[1];
                    var showWeek=null;
                    switch (week){
                        case '星期一':
                            showWeek="周一";
                            break;
                        case '星期二':
                            showWeek="周二";
                            break;
                        case '星期三':
                            showWeek="周三";
                            break;
                        case '星期四':
                            showWeek="周四";
                            break;
                        case '星期五':
                            showWeek="周五";
                            break;
                        case '星期六':
                            showWeek="周六";
                            break;
                        case '星期七':
                            showWeek="周天";
                            break;
                    }


                    switch ( data.data.forecast[i].type){
                        case '小雨':
                            if (i==0){
                                $("#title").append(" \n              " +
									"         <p class=\"weather-location\"><strong>"+data.data.forecast[i].high+"--"+data.data.forecast[i].low+"</strong> LuoYang</p>")
                            }
                            //<canvas width="64" height="64" id="forecast-now"></canvas>
                            $("#week"+i).append("<p class=\"weather-day\">"+week+"</p><p class=\"weather-degree\">"+data.data.forecast[i].high+"--"+data.data.forecast[i].low+"</p>")
                            break;
                        case '西北风':
                        case '东北风':
                            if (i==0){
                           // <canvas width='64' height='64' id='forecast-day3'></canvas>
                                $("#title").append(" \n              " +
                                    "         <p class=\"weather-location\"><strong>"+data.data.forecast[i].high+"--"+data.data.forecast[i].low+"</strong> LuoYang</p>")
                            }
                            // <canvas width="64" height="64" id="forecast-day3">
                            $("#week"+i).append("<p class=\"weather-day\">"+week+"</p><p class=\"weather-degree\">"+data.data.forecast[i].high+"-"+data.data.forecast[i].low+"</p>")

                            break;
                        case '多云':
                       // <canvas width='64' height='64' id='forecast-day1'></canvas>
                            if (i==0){
                                $("#title").append("  \n              " +
                                    "         <p class=\"weather-location\"><strong>"+data.data.forecast[i].high+"--"+data.data.forecast[i].low+"</strong> LuoYang</p>")
                            }
                            $("#week"+i).append("<p class=\"weather-day\">"+week+"</p>\n" +
                                "                           \n" +
                                "                           <p class=\"weather-degree\">"+data.data.forecast[i].high+"-"+data.data.forecast[i].low+"</p>")
                            break;
                        case '晴':
                      //  <canvas width='64' height='64' id='forecast-day2'></canvas>
                            if (i==0){
                                $("#title").append(" \n              " +
                                    "         <p class=\"weather-location\"><strong>"+data.data.forecast[i].high+"--"+data.data.forecast[i].low+"</strong> LuoYang</p>")
                            }
                            $("#week"+i).append("<p class=\"weather-day\">"+week+"</p>\n" +
                                "                         \n" +
                                "                           <p class=\"weather-degree\">"+data.data.forecast[i].high+"-"+data.data.forecast[i].low+"</p>")
                            break;
                    }

                }
            }
        });


		//支出
		var d1 = [];
        //收入
        var dl1=[];
		//here we generate randomdata data for chart
        //Ajax调用处理
        $.ajax({
            type: "POST",
            async:false,
            url: "/theMouthStatistics",
            data: "name=garfield&age=18",
            success: function(data){
            for (var i=0;i<data.length;i++){
                if (data[i].financeTypeId==1){
                    //收入
                    dl1.push([new Date(data[i].statisticsCreateTime),data[i].financePrice]);
                } else{
                    //支出
                    d1.push([new Date(data[i].statisticsCreateTime),data[i].financePrice]);
                }
            }
            }
        });

        //
        var chartMinDate = d1[0][0]; //first day
    	// var chartMaxDate = d1[31][0];//last day

    	var tickSize = [1, "day"];
    	var tformat = "%d/%m/%y";

    	var total = 0;
    	//calculate total earnings for this period
    	for (var i = 0; i < d1.length; i++) {
			total = d1[i][1] + total;
        }
        var total1 = 0;
        //calculate total earnings for this period
        for (var i = 0; i < dl1.length; i++) {
            total1 = dl1[i][1] + total1;
        }

        var state=0;
    	var options = {
    		grid: {
				show: true,
			    aboveData: true,
			    color: colours.white ,
			    labelMargin: 20,
			    axisMargin: 0, 
			    borderWidth: 0,
			    borderColor:null,
			    minBorderMargin: 5 ,
			    clickable: true, 
			    hoverable: true,
			    autoHighlight: true,
			    mouseActiveRadius: 100,
			},
			series: {
				grow: {
		            active: true,
		     		duration: 1500
		        },
	            lines: {
            		show: true,
            		fill: false,
            		lineWidth: 2.5
	            },
	            points: {
	            	show:true,
	            	radius: 4,
	            	lineWidth: 2.5,
	            	fill: true,
	            	fillColor: colours.blue
	            }
	        },
	        colors: ['#fcfcfc'],
	        legend: { 
	        	position: "ne", 
	        	margin: [0,-25], 
	        	noColumns: 0,
	        	labelBoxBorderColor: null,
	        	labelFormatter: function(label, series) {
	        	    if (state==0){
                        //计算财务总和
                        state+=1;
                        return '<div style="padding: 10px; font-size:20px;font-weight:bold;">'+ '收入: $'+ total +'</div>';
                    }else{
                        return '<div style="padding: 10px; font-size:20px;font-weight:bold;">'+ '支出: $'+ total1 +'</div>' ;
                    }


				},
				backgroundColor: colours.blue,
    			backgroundOpacity: 0.5,
    			hideSquare: true //hide square color helper 
	    	},
	        shadowSize:0,
	        tooltip: true, //activate tooltip
			tooltipOpts: {
				content: "$%y.0",
				xDateFormat: "%d/%m",
				shifts: {
					x: -30,
					y: -50
				},
				theme: 'dark',
				defaultTheme: false
			},
			yaxis: { 
				min: 0
			},
			xaxis: { 
	        	mode: "time",
	        	minTickSize: tickSize,
	        	timeformat: tformat,
	        	tickLength: 0,
	        }
    	}
			//折线图数据
        var plot = $.plot($("#stats-earnings"),[{
    			label: "Earnings",
    			data: d1,
    		},{
                label: "123123123",
                data: dl1,
            }], options
    	);



	});

	//second bars chart
    $(function () {
    	var data = [ ["JAN", 1500], ["FEB", 1345], ["MAR", 1800], ["APR", 1670], ["MAY", 1780], ["JUN", 1500], ["JUL", 1350], ["AUG", 1700], ["SEP", 1890], ["OCT", 2000], ["NOV", 1950], ["DEC", 2000] ];
    	//Replicate the existing bar data to reproduce bar fill effect
    	var arr= [];
    	for (var i = 0; i <= data.length -1; i++) {
    		arr.push(data[i][1]);
    	};
    	var largest = Math.max.apply(Math, arr) + 50;
    	d1 = [];
    	for (var i = 0; i <= data.length -1; i++) {
    		sum = largest - data[i][1];
    		d1.push([data[i][0],sum]);
    	};
    	var options = {
    		series : {
				stack: true
			},
			bars: {
				show:true,
				barWidth: 0.6,
				fill:1,
				align: "center"
			},
			grid: {
				show:true,
				hoverable: true,
				borderWidth: 0,
			    borderColor:null
			},
	        colors: [colours.green, colours.gray],
	        tooltip: true, //activate tooltip
			tooltipOpts: {
				content: "$%y.0",
				shifts: {
					x: -30,
					y: -50
				}
			},
			yaxis: {
				tickLength: 0,
				show:false
			},
			xaxis: { 
	        	mode: "categories",
				tickLength: 0
	        }
		};
		$.plot($("#stats-earnings-bars"), [data, d1], options);
	});





	//second donut chart
	$(function () {
		var options = {
			series: {
				pie: { 
					show: true,
					innerRadius: 0.55,
					highlight: {
						opacity: 0.1
					},
					radius: 1,
					stroke: {
						width: 10
					},
					startAngle: 2.15
				}					
			},
			legend:{
				show:true,
				labelFormatter: function(label, series) {
				    return '<div style="font-weight:bold;font-size:13px;">'+ label +'</div>'
				},
				labelBoxBorderColor: null,
				margin: 50,
				width: 20,
				padding: 1
			},
			grid: {
	            hoverable: true,
	            clickable: true,
	        },
	        tooltip: true, //activate tooltip
			tooltipOpts: {
				content: "%s : %y.1"+"%",
				shifts: {
					x: -30,
					y: -50
				},
				theme: 'dark',
				defaultTheme: false
			}
		};
        //饼状图
        var data1=null	 ;
        $.ajax({
            type: "POST",
            url: "/getPercentage",
            async:false,
            success: function(data){
                data1= [
                    { label: "收入",  data: data.expend.split('%')[0], color: colours.red},
                    { label: "支出",  data: data.income.split('%')[0], color: colours.green}
                ];
            }
        });
	    $.plot($("#stats-category-earnings"), data1, options);

	});

	//------------- Pageview chart -------------//
	$(function() {

		//visiotrs
		var d1 = [["MON", randNum()], ["TUE", randNum()], ["WED", randNum()], ["THU", randNum()], ["FRI", randNum()], ["SAT", randNum()], ["SUN", randNum()]];
		var d2 = [["MON", randNum()], ["TUE", randNum()], ["WED", randNum()], ["THU", randNum()], ["FRI", randNum()], ["SAT", randNum()], ["SUN", randNum()]];
		
    	var options = {
    		grid: {
				show: true,
			    labelMargin: 20,
			    axisMargin: 40, 
			    borderWidth: 0,
			    borderColor:null,
			    minBorderMargin: 20,
			    clickable: true, 
			    hoverable: true,
			    autoHighlight: true,
			    mouseActiveRadius: 100
			},
			series: {
				grow: {
		            active: true,
		     		duration: 1000
		        },
	            lines: {
            		show: true,
            		fill: false,
            		lineWidth: 2.5
	            },
	            points: {
	            	show:true,
	            	radius: 5,
	            	lineWidth: 3.0,
	            	fill: true,
	            	fillColor: colours.red,
	            	strokeColor: colours.white 
	            }
	        },
	        colors: [colours.dark, colours.blue],
	        legend: { 
	        	show:true,
	        	position: "ne", 
	        	margin: [0,-25], 
	        	noColumns: 0,
	        	labelBoxBorderColor: null,
	        	labelFormatter: function(label, series) {
				    return '&nbsp;'+label+'&nbsp;&nbsp;';
				},
				width: 40,
				height: 1
	    	},
	        shadowSize:0,
	        tooltip: true, //activate tooltip
			tooltipOpts: {
				content: "%y.0",
				shifts: {
					x: -45,
					y: -50
				},
				defaultTheme: false
			},
			yaxis: { 
				show:false
			},
			xaxis: { 
	        	mode: "categories",
	        	tickLength: 0
	        }
    	}

		var plot = $.plot($("#stats-pageviews"),[
			{
    			label: "Visitors", 
    			data: d1
    		},
    		{
    			label: "Return visitors", 
    			data: d2
    		}
    		], options
    	);

	});

	//------------- Weather icons -------------//
	var today = new Skycons({
		"color": colours.white,
		"resizeClear": true
	});
	today.set("weather-now", "rain");
	today.play();
   	//set forecast icons too
   	var forecast = new Skycons({
		"color": colours.dark,
		"resizeClear": true
	});
   	forecast.set("forecast-now", "rain");
   	forecast.set("forecast-day1", "partly-cloudy-day");
   	forecast.set("forecast-day2", "clear-day");
    forecast.set("forecast-day7", "clear-day");
    forecast.set("forecast-day8", "clear-day");
   	forecast.set("forecast-day3", "wind");
   	forecast.play();

   	//------------- Add sortable function to todo -------------//
	$(function() {
	    $( "#today, #tomorrow" ).sortable({
	    	connectWith: ".todo-list",
	    	placeholder: 'placeholder',  
        	forcePlaceholderSize: true, 
	    }).disableSelection();
	});

	//------------- Instagram widget carousel -------------//
	$('#instagram-widget').carousel({
		interval:   4000
	});

	//------------- Full calendar -------------//
	$(function(){
		var date = new Date();
		var d = date.getDate();
		var m = date.getMonth();
		var y = date.getFullYear();
		
		$('#calendar').fullCalendar({
			header: {
				left: 'prev,next today',
				center: 'title',
				right: 'month,agendaWeek,agendaDay'
			},
			buttonText: {
	        	prev: '<i class="en-arrow-left8 s16"></i>',
	        	next: '<i class="en-arrow-right8 s16"></i>',
	        	today:'Today'
	    	},
			editable: true,
			events: [
				{
					title: 'All Day Event',
					start: new Date(y, m, 1),
					backgroundColor: colours.green,
					borderColor: colours.green
				},
				{
					title: 'Long Event',
					start: new Date(y, m, d-5),
					end: new Date(y, m, d-2),
					backgroundColor: colours.red,
					borderColor: colours.red
				},
				{
					id: 999,
					title: 'Repeating Event',
					start: new Date(y, m, d-3, 16, 0),
					allDay: false
				},
				{
					id: 999,
					title: 'Repeating Event',
					start: new Date(y, m, d+4, 16, 0),
					allDay: false
				},
				{
					title: 'Meeting',
					start: new Date(y, m, d, 10, 30),
					allDay: false,
					backgroundColor: colours.orange,
					borderColor: colours.orange
				},
				{
					title: 'Lunch',
					start: new Date(y, m, d, 12, 0),
					end: new Date(y, m, d, 14, 0),
					allDay: false,
					backgroundColor: colours.teal,
					borderColor: colours.teal
				},
				{
					title: 'Birthday Party',
					start: new Date(y, m, d+1, 19, 0),
					end: new Date(y, m, d+1, 22, 30),
					allDay: false,
					backgroundColor: colours.pink,
					borderColor: colours.pink
				},
				{
					title: 'Click for SuggeElson',
					start: new Date(y, m, 28),
					end: new Date(y, m, 29),
					url: 'http://suggeelson.com/',
					backgroundColor: colours.dark,
					borderColor: colours.dark
				}
			]
		});
	});

	//------------- Sparklines -------------//
	$('#usage-sparkline').sparkline([35,46,24,56,68, 35,46,24,56,68], {
		width: '180px',
		height: '30px',
		lineColor: colours.dark,
		fillColor: false,
		spotColor: false,
		minSpotColor: false,
		maxSpotColor: false,
		lineWidth: 2
	});

	$('#cpu-sparkline').sparkline([22,78,43,32,55, 67,83,35,44,56], {
		width: '180px',
		height: '30px',
		lineColor: colours.dark,
		fillColor: false,
		spotColor: false,
		minSpotColor: false,
		maxSpotColor: false,
		lineWidth: 2
	});

	$('#ram-sparkline').sparkline([12,24,32,22,15, 17,8,23,17,14], {
		width: '180px',
		height: '30px',
		lineColor: colours.dark,
		fillColor: false,
		spotColor: false,
		minSpotColor: false,
		maxSpotColor: false,
		lineWidth: 2
	});

    //------------- Init pie charts -------------//
	initPieChart(10,40, 1500, colours);

 	
});

//Setup easy pie charts in sidebar
var initPieChart = function(lineWidth, size, animateTime, colours) {
	$(".pie-chart").easyPieChart({
        barColor: colours.dark,
        borderColor: colours.dark,
        trackColor: '#d9dde2',
        scaleColor: false,
        lineCap: 'butt',
        lineWidth: lineWidth,
        size: size,
        animate: animateTime
    });
}