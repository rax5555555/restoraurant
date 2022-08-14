<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>${menu.dishName}</title>
</head>
<body>
<h3> Название блюда - ${menu.dishName}</h3>
<h3> Описание блюда - ${menu.description}</h3>
<h3> Цена - ${menu.price}</h3>
<h3> Вес блюда (гр.) - ${menu.weight}</h3>
<br>
<form method="post" action="/menu/${menu.id}/update">
    <label>
        Название блюда : <input name="dishName" value="${menu.dishName}">
    </label>
    <label>
        Описание блюда: <input name="description" value="${menu.description}">
    </label>
    <label>
        Цена: <input name="price" value="${menu.price}">
    </label>
    <label>
        Вес блюда (гр.): <input name="weight" value="${menu.weight}">
    </label>
    <input type="submit" value="Сохранить">
</form>
</body>
</html>