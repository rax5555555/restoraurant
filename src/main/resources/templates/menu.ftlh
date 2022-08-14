<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <style>
        input[type = "submit"], a {
            font-size: 14px;
            font-family: Arial, sans-serif;
            background-color: rgb(223, 223, 223);
            padding: 2px 4px;
            border-radius: 3px;
        }

        a {
            text-decoration: none;
            border: 1px solid black;
            color: black;
        }
    </style>
    <title>Меню</title>
</head>
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
<body>
<h1>Меню</h1>
<form method="post" action="/menu">
    <label>Название блюда:
        <input name="dishName" placeholder="Название блюда"><br> <br>
    </label>
    <label>Описание блюда:
        <input name="description" placeholder="Описание блюда"> <br> <br>
    </label>
    <label>Цена:
        <input name="price" placeholder="Цена"> <br> <br>
    </label>
    <label>Вес блюда (гр.):
        <input name="weight" placeholder="Вес блюда">
    </label>
     <select name="menuClassification" size="1">
        <#list classifications as classification>
            <option value="${classification.id}">${classification.foodClassification}</option>
        </#list>
    </select>

    <input type="submit" value="Добавить">
    <br> <br>
    <br>
</form>
<table>
    <tr>
        <th>ID</th>
        <th>Название блюда</th>
        <th>Описание блюда</th>
        <th>Цена</th>
        <th>Вес блюда (гр.)</th>
        <th>Действия</th>
    </tr>
    <#list menu as allMenu>
        <tr>
            <td>${allMenu.id}</td>
            <td>${allMenu.dishName}</td>
            <td>${allMenu.description}</td>
            <td>${allMenu.price}</td>
            <td>${allMenu.weight}</td>
            <td>
                <form method="post" action="/menu/${allMenu.id}/delete">
                    <input type="submit" value="Удалить блюдо">
                </form>
                <a href="/menu/${allMenu.id}">Перейти</a>
            </td>
        </tr>
    </#list>
</table>
</body>
</html>