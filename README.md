# apache-maven

Создание многомодульного проекта.

### Task 1

Создать проект `multi-modules` с *packaging* `pom`.

### Task 2

Создать и зарегистрировать *module* `dal` c *packaging* `jar`.

### Task 3

Создать *module* `service` c *packaging* `jar` и зависимым от модуля `dal`.

### Task 4

Создать *module* `web` c *packaging* `war` и зависимым от модуля `service`.

### Task 5

Создать в *module* `dal` собственный _class_, убедиться, что *module* `service` может пользоваться этим _class_, а *module* `web` - нет.

### Task 6

Сделать *build* проект и убедиться, что в полученном *artifact* of *module* `web` находятся *artifacts* of *modules*:
* `dal`
* `service`

### Task 7

Загрузить проект в новый *repository* в *source code repository*.