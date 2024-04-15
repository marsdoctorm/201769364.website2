/**

 Created by comp208 on 2024/3/1.
 */
$(function () {
// Add new elements in the following way. If you want to add at the beginning, use 'first' or 'before'.
// $('.table_content:last').after("<tr class='table_content'><td><span>11111</span></td></tr>");
    calSum();
    var which = 0;
    $('.shipping_address').click(function () {
        var id = $(this).attr('id');
        $('.shipping_address').each(function () {
            if ($(this).attr('id') == id) {
                $(this).css({"border-color": "#2f3a4a"});
                which = id;
            } else {
                $(this).css({"border-color": "rgba(0,0,0,0.1)"});
            }
        });
    });
// Minus button, the number cannot be lower than 1
    $('span.minus').click(function () {
        var num = $(this).siblings(".number").html();
        if (num >= 2) {
            num--;
        }
        $(this).siblings(".number").html(num);
        var cost = $(this).parent().siblings(".cost").children("span").html();
        $(this).parent().siblings(".per_sum").children("span").html(returnFloat(cost * num));
        calSum();
    });
    $('span.add').click(function () {
        var num = $(this).siblings(".number").html();
        num++;
        $(this).siblings(".number").html(num);
        var cost = $(this).parent().siblings(".cost").children("span").html();
        $(this).parent().siblings(".per_sum").children("span").html(returnFloat(cost * num));
        calSum();
    });
    $('.table_content td.input_checkbox input').change(function () {
        calSum();
    });
    $('#all').change(function () {
        if ($(this).is(":checked")) {
            $("input[name='checkbox']").attr("checked", "true");
        } else {
            $("input[name='checkbox']").removeAttr("checked");
        }
        calSum();
    });
// Keep two decimal places
    function returnFloat(value) {
        var value = Math.round(parseFloat(value) * 100) / 100;
        var xsd = value.toString().split(".");
        if (xsd.length == 1) {
            value = value.toString() + ".00";
            return value;
        }
        if (xsd.length > 1) {
            if (xsd[1].length < 2) {
                value = value.toString() + "0";
            }
            return value;
        }
    }
// Calculate the total amount
    function calSum() {
        var sum = 0;
        $('.cart_content table tr.table_content').each(function () {
            var isCheck = $(this).children("td.input_checkbox").children("input").is(":checked");
            if (isCheck) {
                sum += parseFloat($(this).children(".per_sum").children("span").html());
            }
        });
        sum = returnFloat(sum);
        $('.end_pay').children(".all_sum").children("span").html(sum);
    }

    $('.deleteShopCar').click(function () {
        var r = confirm('confirm？');
        if (r == true) {
            var id = $(this).attr('value');
            var sid = $(this).parent().siblings(".show_img").children().attr("value");
// alert(sid);
            $.ajax({
                url: 'deleteShopCar.do',
                dataType: 'JSON',
                type: 'post',
                data: {id: id, sid: sid},
                success: function (data) {
                    var result = data.result;
                    if (result == 2) {
                        alert('please login');
                    } else if (result == 1) {
                        alert("success");
                        window.location.href = 'shopping_cart.do?result=error';
                    } else if (result == 0) {
                        alert('error');
                    } else {
                        alert('error');
                    }
                }
            })
        }
    })
});