var sProvinceId,
	sCityId,
	sCountyId;
function areaBind(url, schoolId, provinceId, cityId, countyId) {
	sProvinceId = provinceId;
	sCityId = cityId;
	sCountyId = countyId;
	var school = $("#" + schoolId);
	var province = $("#" + provinceId);
	var city = $("#" + cityId);
	var county = $("#" + countyId);
	province.change(function() {
		var provinceVal = province.val();
		if (provinceVal == 0) {
			school.val("");
			school.html("");
		} else {
			$.post(url, {
				province : provinceVal
			}, function(res) {
				if (res.code==0) {
					school.val("");
					school.html("");
				} else {
					var str = "";
					for (var i = 0; i < res.extend.schools.length; i++) {
						str += '<option value="' + res.extend.schools[i].id + '">' + res.extend.schools[i].name + '</option>';
					}
					school.html(str);
				}
			});
		}
	});
	city.change(function() {
		var cityVal = city.val();
		var provinceVal = province.val();
		var data = {
			province : provinceVal,
			city : cityVal
		}
		if (cityVal == 0) {
			data = {
				province : provinceVal
			}
		}
		$.post(url, data, function(res) {
			if (res.code==0) {
				school.val("");
				school.html("");
			} else {
				var str = "";
				for (var i = 0; i < res.extend.schools.length; i++) {
					str += '<option value="' + res.extend.schools[i].id + '">' + res.extend.schools[i].name + '</option>';
				}
				school.html(str);
			}
		});
	});
	county.change(function() {
		var areaVal = county.val();
		var cityVal = city.val();
		var provinceVal = province.val();
		var data = {
			province : provinceVal,
			city : cityVal,
			area : areaVal
		}
		if (areaVal == 0) {
			data = {
				province : provinceVal,
				city : cityVal
			}
		}
		$.post(url, data, function(res) {
			if (res.code==0) {
				school.val("");
				school.html("");
			} else {
				var str = "";
				for (var i = 0; i < res.extend.schools.length; i++) {
					str += '<option value="' + res.extend.schools[i].id + '">' + res.extend.schools[i].name + '</option>';
				}
				school.html(str);
			}
		});
	});
}