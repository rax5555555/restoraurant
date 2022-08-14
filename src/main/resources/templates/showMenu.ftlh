<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Меню</title>
</head>
<head>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }

    </style>
</head>
<body>
<form method="post" action="/all/search">
    <label>
        Название блюда : <input type="text" name="dishName" >
    </label>
     <button type="submit">Найти</button>
    <br> <br>
</form>
</body>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>Название блюда</th>
        <th>Описание блюда</th>
        <th>Цена</th>
        <th>Вес блюда (гр.)</th>
    </tr>
    <#list menu as allMenu>
        <tr>
            <td>${allMenu.id}</td>
            <td>${allMenu.dishName}</td>
            <td>${allMenu.description}</td>
            <td>${allMenu.price}</td>
            <td>${allMenu.weight}</td>
        </tr>
    </#list>
</table>
</body>
</html>