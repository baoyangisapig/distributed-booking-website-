$(function () {
    $('.device-selector > a').click(function(e) {
        e.preventDefault();
        var $this = $(this);
        $this.addClass('chosen').siblings('a').removeClass('chosen');
        var width = $this.data('width');
        var left = (parseInt(width) / 2) * -1;
        var height = $this.data('height');
        $('#demo-frame').animate({ 'width': width, 'left' : left });
    });

    $('.demo-selector > a').click(function(e) {
        e.preventDefault();
        var $this = $(this);
        $this.addClass('chosen').siblings('a').removeClass('chosen');
        var url = $this.data('url');
        $('#demo-frame').attr('src', url);
        $('.demo-desc span').text( $this.data('desc') );
        $('.demo-desc a').attr('href', url);
    });
});