<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

</head>

<body>
<form action="/table" method="post">
    <style>
        table {
            width: 300px; /* Ширина таблицы */
            /*border: 5px solid green; /* Рамка вокруг таблицы */
            margin: auto; /* Выравниваем таблицу по центру окна  */
        }
        td {
            text-align: center;
        }
    </style>
    <table id="data">
        <tr><td>№</td><td>ФИО</td><td>Дата рождения</td><td>рост</td><td>вес</td><td>пол</td><tr>
    </table>
    <script type="text/javascript">
        $(function(){
            $.getJSON('data.json', function(data) {
                for(var i=0;i<data.length;i++){
                    $('#users').append('<tr><td>' + data.d1 + '</td><td>' + data.d2 +
                        '</td><td>' + data.d3 +
                        '</td><td>' + data.d4 +
                        '</td><td>' + data.d5 +
                        '</td><td>' + data.d6 + '</td><tr>');
                }
            });
        });
    </script>
</form>
</body>
</html>