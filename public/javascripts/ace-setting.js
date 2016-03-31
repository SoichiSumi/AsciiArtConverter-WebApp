/**
 * Created by s-sumi on 2016/04/01.
 */
var editor = ace.edit("editor");
editor.$blockScrolling = Infinity;
editor.setTheme("ace/theme/monokai");
editor.getSession().setMode("ace/mode/text");
$(document).ready(function () {
    var tmp=document.getElementById('aa').textContent;
    if(tmp != ""){
        editor.setValue(tmp);
    }
})

$('#font-size').click(function(e) {
    editor.setFontSize($(e.target).data('size'));
});
$('#save').click(function(e) {
    localStorage.text = editor.getValue();
    alert("保存しました。");
});