<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="APP_PATH" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
<link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/ums-dialog.css">
</head>
<body>
	<div class="modal fade" id="smartModal" tabindex="-1" role="dialog" aria-hidden="true">
		<div class="shortModalbg">
			<!-- 系统提示  shortModalbg longModalbg-->
			<div class="modalHeaderbg">
				<div class="modalHeaderTitle">系统提示</div>
				<div class="modalClosebg">
					<button type="button" class="btn close" data-dismiss="modal" aria-hidden="true">
						<img alt="X" src="${APP_PATH}/static/img/dialog/close.png">
					</button>
				</div>
			</div>
			<div class="modalContentbg">
				<div class="modalContent" id="modalContent">确定进行操作吗？</div>
			</div>
			<div class="modalFooterbg">
				<button type="button" class="btn okBtn" id="dialogOk"></button>
				<button type="button" class="btn cancleBtn" data-dismiss="modal"></button>
			</div>
		</div>
	</div>
	<div class="modal fade" id="alertModal" tabindex="-1" role="dialog" aria-hidden="true">
		<div class="shortModalbg">
			<div class="modalHeaderbg">
				<div class="modalHeaderTitle">系统提示</div>
				<div class="modalClosebg">
					<button type="button" class="btn close" data-dismiss="modal" aria-hidden="true">
						<img alt="X" src="${APP_PATH}/static/img/dialog/close.png">
					</button>
				</div>
			</div>
			<div class="modalContentbg">
				<div class="modalContent" id="alertContent"></div>
			</div>
			<div class="modalFooterbg">
				<button type="button" class="btn okBtn" data-dismiss="modal"></button>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		var msg = "确定进行操作吗？";
		function dialogShow() {
			$("#smartModal").modal("show");
			$("#modalContent").html(msg);
		}
		function dialogShow(message) {
			$("#smartModal").modal("show");
			$("#modalContent").html(message);
		}
		function dialogHide() {
			$("#smartModal").modal("hide");
		}
		function alertShow() {
			$("#alertModal").modal("show");
			$("#alertContent").html(msg);
		}
		function alertShow(message) {
			$("#alertModal").modal("show");
			$("#alertContent").html(message);
		}
	</script>
</body>
</html>