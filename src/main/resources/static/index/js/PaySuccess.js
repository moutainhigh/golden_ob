$(function(){
	//分享提示弹层显示
	$('.share-btn').on('click',function(){
		$('.share-layer').show();
	});
	//分享提示弹层隐藏
	$('.share-layer').on('click',function(){
		$('.share-layer').hide();
	});
});