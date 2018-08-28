jQuery(function($) {
$('.imagen').waypoint(function() {
$(this).toggleClass( 'bounceIn animated' );
},
{
offset: '70%',
triggerOnce: true
});

});

