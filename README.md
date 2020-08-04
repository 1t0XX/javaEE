# javaEE

/*
. Установить сервер приложений Wildfly 20.0.1.Final.
2. Собрать простейшее веб-приложение JavaEE по инструкции из методички и развернуть его на сервере приложений Wildfly.
*/


/*

1. Сервлеты будут выполнять роль контроллеров в разрабатываемом приложении, поэтому необходимо создать:
a. Сервлет для главной страницы /main;
b. Сервлет для каталога товаров /catalog;
c. Сервлет для товара /product;
d. Сервлет для корзины /cart;
e. Сервлет для оформления заказа /order.

2. В каждый сервлет добавить:
a. Заголовок с именем страницы (товары, товар, корзина и т.д.);
b. Список (навигационное меню), с помощью которого можно перемещаться между созданными сервлетами.

3. Добавить обработку исключений для кодов 404 и 403.
4. Создать фильтр для всех сервлетов, который будет добавлять к заголовку HTTP-ответа кодировку UTF-8.

*/
